
package net.mcreator.minecrafttheforgottenworld.recipe.brewing;

import net.neoforged.neoforge.event.brewing.RegisterBrewingRecipesEvent;
import net.neoforged.neoforge.common.brewing.IBrewingRecipe;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModPotions;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;

@EventBusSubscriber
public class RadioActivePotionRecipeBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(RegisterBrewingRecipesEvent event) {
		event.getBuilder().addRecipe(new RadioActivePotionRecipeBrewingRecipe());
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(new ItemStack(Blocks.MAGMA_BLOCK)).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(new ItemStack(MinecraftTheForgottenWorldModItems.RADIOACTIVE_WATER_BUCKET.get())).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return PotionContents.createItemStack(Items.POTION, MinecraftTheForgottenWorldModPotions.RADIOACTIVE_POTION);
		}
		return ItemStack.EMPTY;
	}
}
