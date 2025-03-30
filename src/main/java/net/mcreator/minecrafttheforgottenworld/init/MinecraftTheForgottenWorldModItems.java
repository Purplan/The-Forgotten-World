
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrafttheforgottenworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecrafttheforgottenworld.item.UraniumIngotItem;
import net.mcreator.minecrafttheforgottenworld.item.TechnobladeItem;
import net.mcreator.minecrafttheforgottenworld.item.RubberNuggetItemItem;
import net.mcreator.minecrafttheforgottenworld.item.RubberItemItem;
import net.mcreator.minecrafttheforgottenworld.item.RadioactiveWaterItem;
import net.mcreator.minecrafttheforgottenworld.item.RadioactiveSwordItem;
import net.mcreator.minecrafttheforgottenworld.item.NukeTier1Item;
import net.mcreator.minecrafttheforgottenworld.item.HazmatSuitArmorItem;
import net.mcreator.minecrafttheforgottenworld.item.BucketOfRadioactiveMassItem;
import net.mcreator.minecrafttheforgottenworld.item.BucketOfGunpowderItem;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

public class MinecraftTheForgottenWorldModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinecraftTheForgottenWorldMod.MODID);
	public static final DeferredItem<Item> RADIOACTIVE_WATER_BUCKET = REGISTRY.register("radioactive_water_bucket", RadioactiveWaterItem::new);
	public static final DeferredItem<Item> BUCKET_OF_RADIOACTIVE_MASS = REGISTRY.register("bucket_of_radioactive_mass", BucketOfRadioactiveMassItem::new);
	public static final DeferredItem<Item> RADIOACTIVE_SWORD = REGISTRY.register("radioactive_sword", RadioactiveSwordItem::new);
	public static final DeferredItem<Item> TECHNOBLADE = REGISTRY.register("technoblade", TechnobladeItem::new);
	public static final DeferredItem<Item> TIME_MACHINE = block(MinecraftTheForgottenWorldModBlocks.TIME_MACHINE);
	public static final DeferredItem<Item> POLICEGUARD_SPAWN_EGG = REGISTRY.register("policeguard_spawn_egg", () -> new DeferredSpawnEggItem(MinecraftTheForgottenWorldModEntities.POLICEGUARD, -13421569, -13408513, new Item.Properties()));
	public static final DeferredItem<Item> USA_FLAG = block(MinecraftTheForgottenWorldModBlocks.USA_FLAG);
	public static final DeferredItem<Item> URANIUM = block(MinecraftTheForgottenWorldModBlocks.URANIUM);
	public static final DeferredItem<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", UraniumIngotItem::new);
	public static final DeferredItem<Item> BRITISH_AC_74_BOMB = block(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_74_BOMB);
	public static final DeferredItem<Item> BRITISH_AC_79_LAND_MINE = block(MinecraftTheForgottenWorldModBlocks.BRITISH_AC_79_LAND_MINE);
	public static final DeferredItem<Item> BUCKET_OF_GUNPOWDER = REGISTRY.register("bucket_of_gunpowder", BucketOfGunpowderItem::new);
	public static final DeferredItem<Item> UK_FLAG = block(MinecraftTheForgottenWorldModBlocks.UK_FLAG);
	public static final DeferredItem<Item> HAZMAT_SUIT_ARMOR_HELMET = REGISTRY.register("hazmat_suit_armor_helmet", HazmatSuitArmorItem.Helmet::new);
	public static final DeferredItem<Item> HAZMAT_SUIT_ARMOR_CHESTPLATE = REGISTRY.register("hazmat_suit_armor_chestplate", HazmatSuitArmorItem.Chestplate::new);
	public static final DeferredItem<Item> HAZMAT_SUIT_ARMOR_LEGGINGS = REGISTRY.register("hazmat_suit_armor_leggings", HazmatSuitArmorItem.Leggings::new);
	public static final DeferredItem<Item> HAZMAT_SUIT_ARMOR_BOOTS = REGISTRY.register("hazmat_suit_armor_boots", HazmatSuitArmorItem.Boots::new);
	public static final DeferredItem<Item> RUBBER_FIG_PLANT = block(MinecraftTheForgottenWorldModBlocks.RUBBER_FIG_PLANT);
	public static final DeferredItem<Item> RUBBER_NUGGET_ITEM = REGISTRY.register("rubber_nugget_item", RubberNuggetItemItem::new);
	public static final DeferredItem<Item> RUBBER_ITEM = REGISTRY.register("rubber_item", RubberItemItem::new);
	public static final DeferredItem<Item> NUKE_TIER_1 = REGISTRY.register("nuke_tier_1", NukeTier1Item::new);
	public static final DeferredItem<Item> NUKE_1_ANIMATION = block(MinecraftTheForgottenWorldModBlocks.NUKE_1_ANIMATION);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
