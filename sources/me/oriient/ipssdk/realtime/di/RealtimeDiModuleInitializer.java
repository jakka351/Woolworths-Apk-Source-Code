package me.oriient.ipssdk.realtime.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.internal.services.dataModel.geofence.GeofenceMetadataProvider;
import me.oriient.internal.services.dataModel.navigation.NavigationMetadataProvider;
import me.oriient.internal.services.dataModel.positioning.PositioningMetadataProvider;
import me.oriient.internal.services.dataModel.proximity.ProximityMetadataProvider;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender;
import me.oriient.internal.services.systemStateManager.SystemStateManager;
import me.oriient.internal.services.systemStateManager.SystemStateProvider;
import me.oriient.ipssdk.base.di.DiModuleInitializer;
import me.oriient.ipssdk.common.services.elog.EngineSessionDataProvider;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManager;
import me.oriient.ipssdk.realtime.ips.OnDeviceEngineAutoStopDetector;
import me.oriient.ipssdk.realtime.ips.SdkNavigationPositioningProvider;
import me.oriient.ipssdk.realtime.ips.positioning.ManualPositioningGeofenceChecker;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityLocationResolverFactory;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import me.oriient.ipssdk.realtime.ofs.A4;
import me.oriient.ipssdk.realtime.ofs.B4;
import me.oriient.ipssdk.realtime.ofs.C1623b4;
import me.oriient.ipssdk.realtime.ofs.C1629c4;
import me.oriient.ipssdk.realtime.ofs.C1635d4;
import me.oriient.ipssdk.realtime.ofs.C1641e4;
import me.oriient.ipssdk.realtime.ofs.C1647f4;
import me.oriient.ipssdk.realtime.ofs.C1653g4;
import me.oriient.ipssdk.realtime.ofs.C1659h4;
import me.oriient.ipssdk.realtime.ofs.C1665i4;
import me.oriient.ipssdk.realtime.ofs.C1671j4;
import me.oriient.ipssdk.realtime.ofs.C1677k4;
import me.oriient.ipssdk.realtime.ofs.C1683l4;
import me.oriient.ipssdk.realtime.ofs.C1689m4;
import me.oriient.ipssdk.realtime.ofs.C1695n4;
import me.oriient.ipssdk.realtime.ofs.C1701o4;
import me.oriient.ipssdk.realtime.ofs.C1707p4;
import me.oriient.ipssdk.realtime.ofs.C1713q4;
import me.oriient.ipssdk.realtime.ofs.C1718r4;
import me.oriient.ipssdk.realtime.ofs.C1724s4;
import me.oriient.ipssdk.realtime.ofs.C4;
import me.oriient.ipssdk.realtime.ofs.D4;
import me.oriient.ipssdk.realtime.ofs.E4;
import me.oriient.ipssdk.realtime.ofs.F4;
import me.oriient.ipssdk.realtime.ofs.G4;
import me.oriient.ipssdk.realtime.ofs.H4;
import me.oriient.ipssdk.realtime.ofs.I4;
import me.oriient.ipssdk.realtime.ofs.t4;
import me.oriient.ipssdk.realtime.ofs.u4;
import me.oriient.ipssdk.realtime.ofs.v4;
import me.oriient.ipssdk.realtime.ofs.w4;
import me.oriient.ipssdk.realtime.ofs.x4;
import me.oriient.ipssdk.realtime.ofs.y4;
import me.oriient.ipssdk.realtime.ofs.z4;
import me.oriient.ipssdk.realtime.services.rest.ContentRestService;
import me.oriient.ipssdk.realtime.services.rest.MapsRestService;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabase;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManager;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestService;
import me.oriient.ipssdk.realtime.utils.RealtimeBuildData;
import me.oriient.ipssdk.realtime.wrappers.PositioningWrapper;
import me.oriient.ipssdk.realtime.wrappers.ProximityWrapper;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.navigation.common.NavigationPositionProvider;
import me.oriient.navigation.turnByTurn.TurnByTurnNavigationManager;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.ondevice.util.locationReporter.LocationReporterFactory;
import me.oriient.positioningengine.support.engineManager.SupportEngineUploadManager;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/di/RealtimeDiModuleInitializer;", "Lme/oriient/ipssdk/base/di/DiModuleInitializer;", "()V", "initialize", "", "di", "Lme/oriient/internal/infra/di/DependencyInjection;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealtimeDiModuleInitializer extends DiModuleInitializer {
    public RealtimeDiModuleInitializer() {
        super("RealtimeDiModuleInitializer");
    }

    @Override // me.oriient.ipssdk.base.di.DiModuleInitializer
    public void initialize(@NotNull DependencyInjection di) {
        Intrinsics.h(di, "di");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SystemLocationManagerFactory.class), null, C1683l4.f26107a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(EngineSessionDataProvider.class), null, w4.f26169a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(RealtimeBuildData.class), null, C4.f25922a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ContentRestService.class), null, D4.f25928a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(MapsRestService.class), null, E4.f25934a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ForegroundServiceMonitor.class), null, F4.f25940a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SystemStateManager.class), null, G4.f25946a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SystemStateProvider.class), null, H4.f25952a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SupportEngineUploadManager.class), null, I4.f25958a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SensorIssuesELogSender.class), null, C1623b4.f26050a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SupportPositioningEngineManager.class), null, C1629c4.f26056a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(PowerManager.class), null, C1635d4.f26062a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(LocationReporterFactory.class), null, C1641e4.f26068a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(EventTaggingRestService.class), null, C1647f4.f26073a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(EventTaggingDatabase.class), null, C1653g4.f26079a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(EventTaggingManager.class), null, C1659h4.f26084a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(BuildingGeofenceManager.class), null, C1665i4.f26089a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(GeofenceMetadataProvider.class), null, C1671j4.f26095a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(PositioningMetadataProvider.class), null, C1677k4.f26101a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(DataPreloadingManager.class), null, C1689m4.f26112a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(NavigationManager.class), null, C1695n4.f26117a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(NavigationMetadataProvider.class), null, C1701o4.f26123a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(TurnByTurnNavigationManager.class), null, C1707p4.f26129a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(SdkNavigationPositioningProvider.class), null, C1713q4.f26135a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(NavigationPositionProvider.class), null, C1718r4.f26140a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory.b(ManualPositioningGeofenceChecker.class), null, C1724s4.f26146a, 2, null);
        for (ProximityEventOrigin proximityEventOrigin : ProximityEventOrigin.values()) {
            di.registerSingleton(Reflection.f24268a.b(ProximityEventManager.class), proximityEventOrigin.name(), new t4(proximityEventOrigin));
        }
        ReflectionFactory reflectionFactory2 = Reflection.f24268a;
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(LocalProximityLocationResolverFactory.class), null, u4.f26157a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(PositioningWrapper.class), null, v4.f26163a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(ProximityWrapper.class), null, x4.f26174a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(ProximityStatsManager.class), null, y4.f26180a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(ProximityMetadataProvider.class), null, z4.f26186a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(OnDeviceEngineAutoStopDetector.class), null, A4.f25911a, 2, null);
        DependencyInjection.DefaultImpls.registerSingleton$default(di, reflectionFactory2.b(DebugInfoManager.class), null, B4.f25917a, 2, null);
        InternalDiKt.initializeInternalDi$default(di, null, 2, null);
        DiKt.initializePositioningEngineDi(di);
        me.oriient.navigation.common.DiKt.initializeNavigationDi(di);
        super.initialize(di);
    }
}
