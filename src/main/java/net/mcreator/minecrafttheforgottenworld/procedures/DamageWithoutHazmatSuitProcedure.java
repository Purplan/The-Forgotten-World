package net.mcreator.minecrafttheforgottenworld.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@EventBusSubscriber
public class DamageWithoutHazmatSuitProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("minecraft_the_forgotten_world:radioactive_oak_biome"))
				&& !(entity.getData(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES).is_wearing_hazmat_suit || entity.getData(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES).has_radioactivity_protection)) {
			if (Calendar.getInstance().get(Calendar.SECOND) % 3 == 0) {
				entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft_the_forgotten_world:radioactive_water_damage")))), 2);
			}
		}
	}
}
