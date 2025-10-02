package me.oriient.ipssdk.realtime.ips.automatic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.building.ExternalRegion;
import me.oriient.internal.services.dataManager.building.ExternalRegionPlacement;
import me.oriient.internal.services.dataManager.building.PolygonalExternalRegionPlacement;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ips.OnDeviceEngineAutoStopDetector;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.ipssdk.realtime.ofs.C1642f;
import me.oriient.ipssdk.realtime.ofs.C1648g;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticNotLockedSessionStopper;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;Lkotlinx/coroutines/CoroutineScope;)V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "", "start", "(Lme/oriient/internal/services/dataManager/building/Building;)V", "stop", "()V", "Companion", "me/oriient/ipssdk/realtime/ofs/f", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AutomaticNotLockedSessionStopper implements AutomaticSessionStopper {

    @NotNull
    private static final C1642f Companion = new C1642f();

    /* renamed from: a, reason: collision with root package name */
    private final AutomaticSessionStopper.Delegate f25867a;
    private final CoroutineScope b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private Job h;

    public AutomaticNotLockedSessionStopper(@NotNull AutomaticSessionStopper.Delegate delegate, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.f25867a = delegate;
        this.b = coroutineScope;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(OnDeviceEngineAutoStopDetector.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(GlobalCoordinatesConverter.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
    }

    public static final Logger access$getLogger(AutomaticNotLockedSessionStopper automaticNotLockedSessionStopper) {
        return (Logger) automaticNotLockedSessionStopper.c.getD();
    }

    public static final OnDeviceEngineAutoStopDetector access$getOnDeviceEngineAutoStopDetector(AutomaticNotLockedSessionStopper automaticNotLockedSessionStopper) {
        return (OnDeviceEngineAutoStopDetector) automaticNotLockedSessionStopper.d.getD();
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void start(@NotNull Building building) {
        Object next;
        Intrinsics.h(building, "building");
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.h = null;
        List<ExternalRegion> externalRegions = building.getExternalRegions();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = externalRegions.iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((ExternalRegion) it.next()).getPlacements().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((ExternalRegionPlacement) next).getPlacementFeatures().getCanStopPositioning()) {
                        break;
                    }
                }
            }
            ExternalRegionPlacement externalRegionPlacement = (ExternalRegionPlacement) next;
            if (externalRegionPlacement != null) {
                arrayList.add(externalRegionPlacement);
            }
        }
        Object objF = CollectionsKt.F(arrayList);
        PolygonalExternalRegionPlacement polygonalExternalRegionPlacement = objF instanceof PolygonalExternalRegionPlacement ? (PolygonalExternalRegionPlacement) objF : null;
        if (polygonalExternalRegionPlacement == null) {
            ((Logger) this.c.getD()).d("AutomaticNotLockedSessi", "start: no autoStopPlacement");
            return;
        }
        PositioningEngine positioningEngine = (PositioningEngine) ((SupportPositioningEngineManager) this.e.getD()).getEngine().getValue();
        if (positioningEngine == null) {
            ((Logger) this.c.getD()).d("AutomaticNotLockedSessi", "start: no engine");
            return;
        }
        WorldCoordinate buildingOrigin = building.getBuildingOrigin();
        PositioningConfig.AutoStop autoStop = ((RemoteConfigManager) this.g.getD()).getRealTimeConfig().getPositioning().getAutoStop();
        OnDeviceEngineAutoStopDetector onDeviceEngineAutoStopDetector = (OnDeviceEngineAutoStopDetector) this.d.getD();
        List<WorldCoordinate> placementVertices = polygonalExternalRegionPlacement.getPlacementVertices();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(placementVertices, 10));
        Iterator<T> it3 = placementVertices.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((GlobalCoordinatesConverter) this.f.getD()).convertGlobalCoordinateToBuilding((WorldCoordinate) it3.next(), buildingOrigin, building.getRotationToEnu()));
        }
        onDeviceEngineAutoStopDetector.configure(arrayList2, autoStop.getExternalRegionSlidingWindowSize(), autoStop.getExternalMaxDistanceFromBuildingMeters(), autoStop.getExternalRequiredConsistentAttemptsToStop());
        ((Logger) this.c.getD()).d("AutomaticNotLockedSessi", "start: configured");
        Job jobC = BuildersKt.c(this.b, null, null, new C1648g(this, positioningEngine, null), 3);
        Job job2 = this.h;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.h = jobC;
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void stop() {
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.h = null;
    }
}
