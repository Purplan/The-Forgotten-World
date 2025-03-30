
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.minecrafttheforgottenworld.client.gui.TimeMachineGUIScreen;
import net.mcreator.minecrafttheforgottenworld.client.gui.NukeLaunchPadGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftTheForgottenWorldModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MinecraftTheForgottenWorldModMenus.TIME_MACHINE_GUI.get(), TimeMachineGUIScreen::new);
		event.register(MinecraftTheForgottenWorldModMenus.NUKE_LAUNCH_PAD_GUI.get(), NukeLaunchPadGUIScreen::new);
	}
}
