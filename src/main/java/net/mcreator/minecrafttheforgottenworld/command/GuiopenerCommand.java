
package net.mcreator.minecrafttheforgottenworld.command;

@Mod.EventBusSubscriber
public class GuiopenerCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("opengui").requires(s -> s.hasPermission(3))

		);
	}

}
