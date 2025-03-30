
package net.mcreator.minecrafttheforgottenworld.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.minecrafttheforgottenworld.world.inventory.TimeMachineGUIMenu;
import net.mcreator.minecrafttheforgottenworld.procedures.TimeMachineSourceTPProcedure;
import net.mcreator.minecrafttheforgottenworld.procedures.TimeMachineGUITheAmericanWarPressProcedure;
import net.mcreator.minecrafttheforgottenworld.procedures.TimeMachineGUISelfDestructPressProcedure;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record TimeMachineGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<TimeMachineGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MinecraftTheForgottenWorldMod.MODID, "time_machine_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, TimeMachineGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TimeMachineGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new TimeMachineGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<TimeMachineGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final TimeMachineGUIButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = TimeMachineGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TimeMachineGUITheAmericanWarPressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			TimeMachineGUISelfDestructPressProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TimeMachineSourceTPProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MinecraftTheForgottenWorldMod.addNetworkMessage(TimeMachineGUIButtonMessage.TYPE, TimeMachineGUIButtonMessage.STREAM_CODEC, TimeMachineGUIButtonMessage::handleData);
	}
}
