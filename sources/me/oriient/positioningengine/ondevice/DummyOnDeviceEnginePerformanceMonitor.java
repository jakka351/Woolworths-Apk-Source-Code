package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.models.EnginePerformanceReport;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016¨\u0006\u0011"}, d2 = {"Lme/oriient/positioningengine/ondevice/DummyOnDeviceEnginePerformanceMonitor;", "Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitor;", "()V", "getPerformanceReport", "Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "handlePositionUpdate", "", "position", "Lme/oriient/positioningengine/common/PositioningUpdate;", "handleProcessing", "processingStartTimeMillis", "", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "initialize", "sessionStartTimeMillis", "reset", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DummyOnDeviceEnginePerformanceMonitor implements OnDeviceEnginePerformanceMonitor {
    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    @NotNull
    public EnginePerformanceReport getPerformanceReport() {
        return new me.oriient.positioningengine.ondevice.models.a();
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void handlePositionUpdate(@NotNull PositioningUpdate position) {
        Intrinsics.h(position, "position");
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void handleProcessing(long processingStartTimeMillis, @NotNull SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void initialize(long sessionStartTimeMillis) {
    }

    @Override // me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor
    public void reset() {
    }
}
