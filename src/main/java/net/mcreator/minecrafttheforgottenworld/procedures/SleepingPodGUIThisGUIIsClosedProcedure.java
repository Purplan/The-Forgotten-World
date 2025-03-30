package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;

public class SleepingPodGUIThisGUIIsClosedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MinecraftTheForgottenWorldModVariables.PlayerVariables _vars = entity.getData(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES);
			_vars.has_radioactivity_protection = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
