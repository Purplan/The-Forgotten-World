
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

import net.mcreator.minecrafttheforgottenworld.world.inventory.NukeLaunchPadGUIMenu;
import net.mcreator.minecrafttheforgottenworld.procedures.NukeLaunchPadGUILaunchClickedProcedure;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record NukeLaunchPadGUIButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<NukeLaunchPadGUIButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(MinecraftTheForgottenWorldMod.MODID, "nuke_launch_pad_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, NukeLaunchPadGUIButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, NukeLaunchPadGUIButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new NukeLaunchPadGUIButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<NukeLaunchPadGUIButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final NukeLaunchPadGUIButtonMessage message, final IPayloadContext context) {
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
		HashMap guistate = NukeLaunchPadGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			NukeLaunchPadGUILaunchClickedProcedure.execute(world, x, y, z, entity, guistate);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		MinecraftTheForgottenWorldMod.addNetworkMessage(NukeLaunchPadGUIButtonMessage.TYPE, NukeLaunchPadGUIButtonMessage.STREAM_CODEC, NukeLaunchPadGUIButtonMessage::handleData);
	}
}
