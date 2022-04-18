package io.github.haykam821.breakprogress;

import java.util.List;

import io.github.haykam821.breakprogress.mixin.ClientPlayerInteractionManagerMixin;
import mcp.mobius.waila.api.IComponentProvider;
import mcp.mobius.waila.api.IDataAccessor;
import mcp.mobius.waila.api.IPluginConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

@SuppressWarnings("deprecation")
public class BreakProgressComponentProvider implements IComponentProvider {
	private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

	@Override
	public void appendTail(List<Text> tooltip, IDataAccessor accessor, IPluginConfig config) {
		int progress = (int) (((ClientPlayerInteractionManagerMixin) CLIENT.interactionManager).getCurrentBreakingProgress() * 100);
		if (progress > 0) {
			tooltip.add(new TranslatableText("text.breakprogress.tooltip", progress));
		}
	}
}
