
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.world.inventory.TimeMachineGUIMenu;
import net.mcreator.minecrafttheforgottenworld.world.inventory.NukeLaunchPadGUIMenu;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TimeMachineGUIMenu>> TIME_MACHINE_GUI = REGISTRY.register("time_machine_gui", () -> IMenuTypeExtension.create(TimeMachineGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NukeLaunchPadGUIMenu>> NUKE_LAUNCH_PAD_GUI = REGISTRY.register("nuke_launch_pad_gui", () -> IMenuTypeExtension.create(NukeLaunchPadGUIMenu::new));
}
