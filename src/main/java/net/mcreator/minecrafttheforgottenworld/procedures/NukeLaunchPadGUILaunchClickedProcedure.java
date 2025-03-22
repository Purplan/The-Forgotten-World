package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NukeLaunchPadGUILaunchClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem() == MinecraftTheForgottenWorldModItems.NUKE_TIER_1.get()) {
			if (entity instanceof Player _player)
				_player.closeContainer();
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
			world.setBlock(BlockPos.containing(x, y + 50, z), MinecraftTheForgottenWorldModBlocks.NUKE_1_ANIMATION.get().defaultBlockState(), 3);
		}
	}
}
