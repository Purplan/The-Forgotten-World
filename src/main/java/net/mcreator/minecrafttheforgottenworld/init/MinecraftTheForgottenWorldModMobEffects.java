
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.potion.RadioactiveEffectMobEffect;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> RADIOACTIVE_EFFECT = REGISTRY.register("radioactive_effect", () -> new RadioactiveEffectMobEffect());
}
