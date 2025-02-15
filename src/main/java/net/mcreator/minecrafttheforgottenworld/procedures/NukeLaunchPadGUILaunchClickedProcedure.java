package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NukeLaunchPadGUILaunchClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		double x_coordinate = 0;
		double y_coordinate = 0;
		double z_coordinate = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DIRT.asItem()) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Nuke incoming!"), true);
			MinecraftTheForgottenWorldMod.queueServerWork(60, () -> {
				{
					final Vec3 _center = new Vec3(new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : ""), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : ""));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(75 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MinecraftTheForgottenWorldModMobEffects.RADIOACTIVE_EFFECT.get(), 3600, 1, false, false));
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : ""), new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : ""), 100, Level.ExplosionInteraction.TNT);
					}
				}
			});
		}
	}
}
