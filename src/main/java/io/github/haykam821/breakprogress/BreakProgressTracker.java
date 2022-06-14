package io.github.haykam821.breakprogress;

public interface BreakProgressTracker {
	public float getBreakProgress(float tickDelta);

	public default int getBreakProgressPercent(float tickDelta) {
		return (int) (this.getBreakProgress(tickDelta) * 100);
	}
}
