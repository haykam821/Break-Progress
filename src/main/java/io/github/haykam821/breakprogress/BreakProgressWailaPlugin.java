package io.github.haykam821.breakprogress;

import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import net.minecraft.block.Block;

@SuppressWarnings("deprecation")
public class BreakProgressWailaPlugin implements IWailaPlugin {
	@Override
    public void register(IRegistrar registrar) {
		registrar.registerComponentProvider(new BreakProgressComponentProvider(), TooltipPosition.TAIL, Block.class);
	}
}