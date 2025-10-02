package me.oriient.positioningengine.ondevice.util.locationReporter;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.DeviceIdProvider;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.engine.EngineConfig;
import me.oriient.internal.services.eventManager.EventManagerFactory;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterFactoryImpl;", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterFactory;", "()V", "create", "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporter;", "oriientApiProvider", "Lme/oriient/internal/infra/rest/OriientApiProvider;", "engine", "Lme/oriient/positioningengine/common/PositioningEngine;", MlModel.MODEL_FILE_SUFFIX, "Lme/oriient/positioningengine/ondevice/util/locationReporter/LocationReporterConfig;", "credentials", "Lme/oriient/positioningengine/support/engineManager/PositioningEngineCredentials;", "engineConfig", "Lme/oriient/internal/services/dataModel/engine/EngineConfig;", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LocationReporterFactoryImpl implements LocationReporterFactory {
    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporterFactory
    @NotNull
    public LocationReporter create(@NotNull OriientApiProvider oriientApiProvider, @NotNull PositioningEngine engine, @NotNull PositioningEngineCredentials credentials, @NotNull EngineConfig engineConfig) {
        Intrinsics.h(oriientApiProvider, "oriientApiProvider");
        Intrinsics.h(engine, "engine");
        Intrinsics.h(credentials, "credentials");
        Intrinsics.h(engineConfig, "engineConfig");
        double locationReportingIntervalSeconds = engineConfig.getLocationReportingIntervalSeconds();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LocationReporterConfig locationReporterConfig = new LocationReporterConfig(credentials.getApiKey(), credentials.getSpaceId(), (long) (locationReportingIntervalSeconds * timeUnit.toMillis(1L)), (long) (engineConfig.getLocationReportingTimeoutSeconds() * timeUnit.toMillis(1L)), engineConfig.getLocationReportingTimeoutsToFail(), engineConfig.getLocationReportingQueueLimit(), engineConfig.getLocationReportingConnectionRetryInitialIntervalMillis(), engineConfig.getLocationReportingConnectionRetryMaxIntervalMillis());
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        h hVar = new h(engine, locationReporterConfig, (EventManagerFactory) di.get(reflectionFactory.b(EventManagerFactory.class), null), (DeviceIdProvider) DiKt.getDi().get(reflectionFactory.b(DeviceIdProvider.class), null), (TimeProvider) DiKt.getDi().get(reflectionFactory.b(TimeProvider.class), null), oriientApiProvider, (CoroutineContextProvider) DiKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class), null));
        hVar.setUserId(credentials.getUserId());
        hVar.setEnabled(engineConfig.getEnableLocationReporting());
        return hVar;
    }

    @Override // me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporterFactory
    @NotNull
    public LocationReporter create(@NotNull OriientApiProvider oriientApiProvider, @NotNull PositioningEngine engine, @NotNull LocationReporterConfig config) {
        Intrinsics.h(oriientApiProvider, "oriientApiProvider");
        Intrinsics.h(engine, "engine");
        Intrinsics.h(config, "config");
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new h(engine, config, (EventManagerFactory) di.get(reflectionFactory.b(EventManagerFactory.class), null), (DeviceIdProvider) DiKt.getDi().get(reflectionFactory.b(DeviceIdProvider.class), null), (TimeProvider) DiKt.getDi().get(reflectionFactory.b(TimeProvider.class), null), oriientApiProvider, (CoroutineContextProvider) DiKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class), null));
    }
}
