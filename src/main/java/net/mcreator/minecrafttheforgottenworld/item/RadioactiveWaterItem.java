
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.network.chat.Component;

public class RadioactiveWaterItem extends BucketItem {

	public RadioactiveWaterItem() {
		super(MinecraftTheForgottenWorldModFluids.RADIOACTIVE_WATER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

}
