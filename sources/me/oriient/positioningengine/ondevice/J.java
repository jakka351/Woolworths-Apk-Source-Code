package me.oriient.positioningengine.ondevice;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* loaded from: classes8.dex */
public final class J {
    public static OnDeviceEngineConfig a(EngineConfig config, SpecificEngineConfig onDeviceConfig) {
        Intrinsics.h(config, "config");
        Intrinsics.h(onDeviceConfig, "onDeviceConfig");
        return new OnDeviceEngineConfig(onDeviceConfig.getCalibrationExpirationTimeMinutes() * TimeUnit.MINUTES.toMillis(1L), onDeviceConfig.getSessionProgressLogsIntervalSeconds() * TimeUnit.SECONDS.toMillis(1L), onDeviceConfig.getEngineUpdatesBufferSize(), config.isSmartCartMode(), null, null, null, null, null, onDeviceConfig.getCoreConfigProvider(), config.isPositioningDebuggingEnabled(), 496, null);
    }
}
