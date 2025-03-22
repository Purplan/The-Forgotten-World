
package net.mcreator.minecrafttheforgottenworld.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TimeMachineGUIButtonMessage {

	private final int buttonID, x, y, z;

	public TimeMachineGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TimeMachineGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TimeMachineGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TimeMachineGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;

			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
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
		MinecraftTheForgottenWorldMod.addNetworkMessage(TimeMachineGUIButtonMessage.class, TimeMachineGUIButtonMessage::buffer, TimeMachineGUIButtonMessage::new, TimeMachineGUIButtonMessage::handler);
	}

}
