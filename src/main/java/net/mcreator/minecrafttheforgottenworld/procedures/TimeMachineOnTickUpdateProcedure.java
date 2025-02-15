package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class TimeMachineOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double ticksLeft = 0;
		if (blockstate.getBlock().getStateDefinition().getProperty("self_destruct_activated") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) {
			ticksLeft = blockstate.getBlock().getStateDefinition().getProperty("ticks_until_self_destruct") instanceof IntegerProperty _getip3 ? blockstate.getValue(_getip3) : -1;
			if (ticksLeft == 0) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.TNT);
			} else {
				{
					int _value = (int) (ticksLeft - 100);
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("ticks_until_self_destruct") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Time Machine will self destruct in " + Math.round(ticksLeft) / 20 + " seconds!")), true);
					}
				}
			}
		}
	}
}
