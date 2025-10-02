package me.oriient.positioningengine.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.SensorManagerError;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"toEngineStopReason", "Lme/oriient/positioningengine/common/EngineStopReason;", "Lme/oriient/internal/services/sensorsManager/SensorManagerError;", "service-positioning-engine_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EngineStopReasonKt {
    @Keep
    @NotNull
    public static final EngineStopReason toEngineStopReason(@NotNull SensorManagerError sensorManagerError) {
        String str;
        Intrinsics.h(sensorManagerError, "<this>");
        if (sensorManagerError instanceof SensorManagerError.InsufficientHardware) {
            str = "InsufficientHardware";
        } else if (sensorManagerError instanceof SensorManagerError.SensorsFailedToStart) {
            str = "SensorsFailedToStart";
        } else if (sensorManagerError instanceof SensorManagerError.EmptySensorFrame) {
            str = "EmptySensorFrame";
        } else if (sensorManagerError instanceof SensorManagerError.NaNSensorFrame) {
            str = "NaNSensorFrame";
        } else if (sensorManagerError instanceof SensorManagerError.SensorsStuck) {
            str = "SensorsStuck";
        } else {
            if (!(sensorManagerError instanceof SensorManagerError.SensorsFailedToRestart)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SensorsFailedToRestart";
        }
        return new EngineStopReason.SensorFailure(str);
    }
}
