package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.minecrafttheforgottenworld.network.MinecraftTheForgottenWorldModVariables;

import java.util.HashMap;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			MinecraftTheForgottenWorldModVariables.PlayerVariables _vars = entity.getData(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES);
			_vars.has_radioactivity_protection = guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected();
			_vars.syncPlayerVariables(entity);
		}
	}
}
