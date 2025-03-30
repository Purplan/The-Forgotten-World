
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.minecrafttheforgottenworld.block.entity.TimeMachineBlockEntity;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MinecraftTheForgottenWorldModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TIME_MACHINE = register("time_machine", MinecraftTheForgottenWorldModBlocks.TIME_MACHINE, TimeMachineBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TIME_MACHINE.get(), (blockEntity, side) -> ((TimeMachineBlockEntity) blockEntity).getItemHandler());
	}
}
