package net.mcreator.minecrafttheforgottenworld.procedures;

import net.minecraftforge.eventbus.api.Event;

public class SleepingPodGUIWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			boolean _setval = guistate.containsKey("checkbox:SleepingPodRadioactiveProtection") && ((Checkbox) guistate.get("checkbox:SleepingPodRadioactiveProtection")).selected();
			entity.getCapability(MinecraftTheForgottenWorldModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.has_radioactivity_protection = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
