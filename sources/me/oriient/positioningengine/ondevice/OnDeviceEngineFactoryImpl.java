package me.oriient.positioningengine.ondevice;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.persistentStorage.PersistentStorage;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lme/oriient/positioningengine/ondevice/OnDeviceEngineFactoryImpl;", "Lme/oriient/positioningengine/ondevice/OnDeviceEngineFactory;", "()V", "createOnDeviceEngine", "Lme/oriient/positioningengine/common/PositioningEngine;", "spaceId", "", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/positioningengine/ondevice/OnDeviceEngineConfig;", "userSessionId", "predefinedDataShift", "Lme/oriient/positioningengine/support/device_data/model/PredefinedDataShift;", "performanceMonitor", "Lme/oriient/positioningengine/ondevice/OnDeviceEnginePerformanceMonitor;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class OnDeviceEngineFactoryImpl implements OnDeviceEngineFactory {
    @Override // me.oriient.positioningengine.ondevice.OnDeviceEngineFactory
    @NotNull
    public PositioningEngine createOnDeviceEngine(@NotNull String spaceId, @NotNull OnDeviceEngineConfig config, @NotNull String userSessionId, @Nullable PredefinedDataShift predefinedDataShift, @NotNull OnDeviceEnginePerformanceMonitor performanceMonitor) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(config, "config");
        Intrinsics.h(userSessionId, "userSessionId");
        Intrinsics.h(performanceMonitor, "performanceMonitor");
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        CoroutineContext coroutineContextNewSingleThreadCoroutineContext = ((CoroutineContextProvider) di.get(reflectionFactory.b(CoroutineContextProvider.class), null)).newSingleThreadCoroutineContext();
        me.oriient.positioningengine.ondevice.calibration.e eVar = new me.oriient.positioningengine.ondevice.calibration.e(me.oriient.positioningengine.ondevice.models.calibration.c.NORMAL, (PersistentStorage) DiKt.getDi().get(reflectionFactory.b(PersistentStorage.class), null), coroutineContextNewSingleThreadCoroutineContext, (CoroutineContextProvider) DiKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class), null));
        return new I(spaceId, config.getEngineUpdatesBufferSize(), config.getSessionProgressLogsIntervalMillis(), eVar, coroutineContextNewSingleThreadCoroutineContext, config.isSmartCartMode(), predefinedDataShift, config.getCoreConfigProvider(), performanceMonitor, config.isPositioningDebuggingEnabled() ? (PositioningDebuggingManager) DiKt.getDi().get(reflectionFactory.b(PositioningDebuggingManager.class), null) : null);
    }
}
