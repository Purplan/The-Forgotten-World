
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.minecrafttheforgottenworld.fluid.types.RadioactiveWaterFluidType;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> RADIOACTIVE_WATER_TYPE = REGISTRY.register("radioactive_water", () -> new RadioactiveWaterFluidType());
}
