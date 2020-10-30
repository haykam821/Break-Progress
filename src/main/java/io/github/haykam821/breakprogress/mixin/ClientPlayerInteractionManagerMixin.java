package io.github.haykam821.breakprogress.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.network.ClientPlayerInteractionManager;

@Mixin(ClientPlayerInteractionManager.class)
public interface ClientPlayerInteractionManagerMixin {
	@Accessor(value = "currentBreakingProgress")
	public float getCurrentBreakingProgress();
}
