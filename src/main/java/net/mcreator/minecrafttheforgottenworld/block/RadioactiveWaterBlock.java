
package net.mcreator.minecrafttheforgottenworld.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RadioactiveWaterBlock extends LiquidBlock {
	public RadioactiveWaterBlock() {
		super(() -> MinecraftTheForgottenWorldModFluids.RADIOACTIVE_WATER.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		RadioactiveWaterMobplayerCollidesBlockProcedure.execute(world, entity);
	}
}