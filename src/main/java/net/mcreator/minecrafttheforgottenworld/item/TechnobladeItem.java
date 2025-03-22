
package net.mcreator.minecrafttheforgottenworld.item;

import net.minecraft.network.chat.Component;

public class TechnobladeItem extends RecordItem {

	public TechnobladeItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("minecraft_the_forgotten_world:technoblade")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 1980);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TechnobladeRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}

}
