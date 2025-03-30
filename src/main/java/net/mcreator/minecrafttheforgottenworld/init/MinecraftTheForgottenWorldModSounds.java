
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LOG1 = REGISTRY.register("log1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_the_forgotten_world", "log1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TECHNOBLADE = REGISTRY.register("technoblade", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_the_forgotten_world", "technoblade")));
}
