package me.oriient.positioningengine.common.config;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataModel.engine.EngineConfig;

/* loaded from: classes8.dex */
public abstract class b {
    public static final a a(EngineConfig engineConfig) {
        Intrinsics.h(engineConfig, "<this>");
        return new a(engineConfig.getSpecificConfig().getCalibrationExpirationTimeMinutes() * TimeUnit.MINUTES.toMillis(1L), engineConfig.getModelFetchRetryCount(), engineConfig.getEngineSessionFetchRetryCount(), (long) (engineConfig.getEngineSessionFetchRetryIntervalSeconds() * TimeUnit.SECONDS.toMillis(1L)), engineConfig.getEngineSessionRefreshIntervalBeforeExpirationSeconds(), engineConfig.getMainOrientationCalculator(), engineConfig.isSmartCartMode());
    }
}
