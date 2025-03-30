
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecrafttheforgottenworld.block.UraniumBlock;
import net.mcreator.minecrafttheforgottenworld.block.USAFlagBlock;
import net.mcreator.minecrafttheforgottenworld.block.UKFlagBlock;
import net.mcreator.minecrafttheforgottenworld.block.TimeMachineBlock;
import net.mcreator.minecrafttheforgottenworld.block.RubberFigPlantBlock;
import net.mcreator.minecrafttheforgottenworld.block.RadioactiveWaterBlock;
import net.mcreator.minecrafttheforgottenworld.block.Nuke1AnimationBlock;
import net.mcreator.minecrafttheforgottenworld.block.BritishAC79LandMineBlock;
import net.mcreator.minecrafttheforgottenworld.block.BritishAC74BombBlock;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredBlock<Block> RADIOACTIVE_WATER = REGISTRY.register("radioactive_water", RadioactiveWaterBlock::new);
	public static final DeferredBlock<Block> TIME_MACHINE = REGISTRY.register("time_machine", TimeMachineBlock::new);
	public static final DeferredBlock<Block> USA_FLAG = REGISTRY.register("usa_flag", USAFlagBlock::new);
	public static final DeferredBlock<Block> URANIUM = REGISTRY.register("uranium", UraniumBlock::new);
	public static final DeferredBlock<Block> BRITISH_AC_74_BOMB = REGISTRY.register("british_ac_74_bomb", BritishAC74BombBlock::new);
	public static final DeferredBlock<Block> BRITISH_AC_79_LAND_MINE = REGISTRY.register("british_ac_79_land_mine", BritishAC79LandMineBlock::new);
	public static final DeferredBlock<Block> UK_FLAG = REGISTRY.register("uk_flag", UKFlagBlock::new);
	public static final DeferredBlock<Block> RUBBER_FIG_PLANT = REGISTRY.register("rubber_fig_plant", RubberFigPlantBlock::new);
	public static final DeferredBlock<Block> NUKE_1_ANIMATION = REGISTRY.register("nuke_1_animation", Nuke1AnimationBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
