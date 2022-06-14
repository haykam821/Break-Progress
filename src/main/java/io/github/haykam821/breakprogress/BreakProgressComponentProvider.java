package io.github.haykam821.breakprogress;

import io.github.haykam821.breakprogress.mixin.ClientPlayerInteractionManagerMixin;
import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;

public class BreakProgressComponentProvider implements IBlockComponentProvider {
	private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

	@Override
	public void appendTail(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
		int progress = (int) (((ClientPlayerInteractionManagerMixin) CLIENT.interactionManager).getCurrentBreakingProgress() * 100);
		if (progress > 0) {
			tooltip.addLine(Text.translatable("text.breakprogress.tooltip", progress));
		}
	}
}
