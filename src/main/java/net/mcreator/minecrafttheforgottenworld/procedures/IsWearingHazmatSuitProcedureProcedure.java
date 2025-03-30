package net.mcreator.minecrafttheforgottenworld.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class IsWearingHazmatSuitProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			MinecraftTheForgottenWorldModVariables.PlayerVariables _vars = entity.getData(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES);
			_vars.is_wearing_hazmat_suit = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_BOOTS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_LEGGINGS.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_CHESTPLATE.get()
					&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == MinecraftTheForgottenWorldModItems.HAZMAT_SUIT_ARMOR_HELMET.get();
			_vars.syncPlayerVariables(entity);
		}
	}
}
