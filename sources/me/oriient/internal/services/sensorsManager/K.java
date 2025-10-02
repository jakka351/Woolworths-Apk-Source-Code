package me.oriient.internal.services.sensorsManager;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.sensors.SensorConfig;

/* loaded from: classes7.dex */
public abstract class K {
    public static final SensorSettings a(SensorConfig sensorConfig) {
        Intrinsics.h(sensorConfig, "<this>");
        Boolean forceCriticalPriority = sensorConfig.getForceCriticalPriority();
        double timeJumpCorrectionThresholdsSec = sensorConfig.getTimeJumpCorrectionThresholdsSec();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new SensorSettings(forceCriticalPriority, (long) (timeJumpCorrectionThresholdsSec * timeUnit.toMillis(1L)), (long) (sensorConfig.getTimeJumpWarningThresholdsSec() * timeUnit.toMillis(1L)), (long) (sensorConfig.getSameValueThresholdSec() * timeUnit.toMillis(1L)), sensorConfig.getMaxReportLatencyMicroSec());
    }
}
