package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.models.EnginePerformanceReport;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitor;", "", "getPerformanceReport", "Lme/oriient/positioningengine/ondevice/models/EnginePerformanceReport;", "handlePositionUpdate", "", "position", "Lme/oriient/positioningengine/common/PositioningUpdate;", "handleProcessing", "processingStartTimeMillis", "", "sample", "Lme/oriient/internal/services/sensorsManager/sensors/SensorsDataSample;", "initialize", "sessionStartTimeMillis", "reset", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface OnDeviceEnginePerformanceMonitor {
    @NotNull
    EnginePerformanceReport getPerformanceReport();

    void handlePositionUpdate(@NotNull PositioningUpdate position);

    void handleProcessing(long processingStartTimeMillis, @NotNull SensorsDataSample sample);

    void initialize(long sessionStartTimeMillis);

    void reset();
}
