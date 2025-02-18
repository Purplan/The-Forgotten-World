package net.mcreator.minecrafttheforgottenworld.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;

import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModMobEffects;
import net.mcreator.minecrafttheforgottenworld.init.MinecraftTheForgottenWorldModItems;
import net.mcreator.minecrafttheforgottenworld.MinecraftTheForgottenWorldMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;

public class NukeLaunchPadGUILaunchClickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem() == MinecraftTheForgottenWorldModItems.NUKE_TIER_1.get()) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(new Object() {
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
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "")), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") + 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") + 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") - 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") + 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") - 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") - 0), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") + 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") + 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 0)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") + 0), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 16)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputX") ? ((EditBox) guistate.get("text:NukeLaunchPadInputX")).getValue() : "") - 16), new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputY") ? ((EditBox) guistate.get("text:NukeLaunchPadInputY")).getValue() : ""), (new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : "") - 0)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
						.withSuppressedOutput(), "forceload add ~ ~ ~");
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Nuke incoming!"), true);
			MinecraftTheForgottenWorldMod.queueServerWork(60, () -> {
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
					}.convert(guistate.containsKey("text:NukeLaunchPadInputZ") ? ((EditBox) guistate.get("text:NukeLaunchPadInputZ")).getValue() : ""), 50, Level.ExplosionInteraction.TNT);
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
					}
				}
			});
		}
	}
}
