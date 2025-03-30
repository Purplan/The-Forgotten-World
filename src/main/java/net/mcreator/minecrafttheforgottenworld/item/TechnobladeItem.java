
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrafttheforgottenworld.procedures.TechnobladeRightclickedOnBlockProcedure;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class TechnobladeItem extends Item {
	public TechnobladeItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MinecraftTheForgottenWorldMod.MODID, "technoblade"))));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TechnobladeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}
