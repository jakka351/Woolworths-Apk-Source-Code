package me.oriient.ipssdk.realtime.ips.automatic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.region.BuildingExitRegion;
import me.oriient.internal.services.dataManager.region.RegionRepository;
import me.oriient.internal.services.dataManager.region.RegionShape;
import me.oriient.internal.services.dataModel.positioning.PositioningConfig;
import me.oriient.internal.services.elog.ELog;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.ips.IPSLocalProximityEventRepetitionStrategy;
import me.oriient.ipssdk.ips.IPSLocalProximityEventTrigger;
import me.oriient.ipssdk.ips.IPSLocalProximityLocationDefinition;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import me.oriient.ipssdk.realtime.ofs.C1612a;
import me.oriient.ipssdk.realtime.ofs.C1618b;
import me.oriient.ipssdk.realtime.ofs.C1636e;
import me.oriient.ipssdk.realtime.utils.models.CoordinateKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticLockedSessionStopper;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;Lkotlinx/coroutines/CoroutineScope;)V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "", "start", "(Lme/oriient/internal/services/dataManager/building/Building;)V", "stop", "()V", "Companion", "me/oriient/ipssdk/realtime/ofs/a", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AutomaticLockedSessionStopper implements AutomaticSessionStopper {

    @NotNull
    private static final C1612a Companion = new C1612a();

    /* renamed from: a, reason: collision with root package name */
    private final AutomaticSessionStopper.Delegate f25866a;
    private final CoroutineScope b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private Job h;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositioningConfig.AutoStop.ExitRegionTriggerType.values().length];
            try {
                iArr[PositioningConfig.AutoStop.ExitRegionTriggerType.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositioningConfig.AutoStop.ExitRegionTriggerType.DWELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PositioningConfig.AutoStop.ExitRegionTriggerType.EXIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AutomaticLockedSessionStopper(@NotNull AutomaticSessionStopper.Delegate delegate, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.f25866a = delegate;
        this.b = coroutineScope;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RegionRepository.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ProximityEventManager.class), "EXIT_REGION");
    }

    public static final ELog access$getELog(AutomaticLockedSessionStopper automaticLockedSessionStopper) {
        return (ELog) automaticLockedSessionStopper.d.getD();
    }

    public static final Logger access$getLogger(AutomaticLockedSessionStopper automaticLockedSessionStopper) {
        return (Logger) automaticLockedSessionStopper.c.getD();
    }

    public static final RegionRepository access$getRegionRepository(AutomaticLockedSessionStopper automaticLockedSessionStopper) {
        return (RegionRepository) automaticLockedSessionStopper.f.getD();
    }

    public static final void access$onNewExitRegions(AutomaticLockedSessionStopper automaticLockedSessionStopper, List list) {
        IPSLocalProximityEventTrigger iPSLocalProximityEventTriggerOnEnter;
        BuildingExitRegion buildingExitRegion;
        char c;
        IPSLocalProximityLocationDefinition iPSLocalProximityLocationDefinitionAreaRectangle;
        IPSLocalProximityLocationDefinition iPSLocalProximityLocationDefinitionAreaCircle;
        ((Logger) automaticLockedSessionStopper.c.getD()).d("AutomaticLockedSessionS", "onNewExitRegions() called with: exitRegions = " + list);
        ProximityEventManager proximityEventManager = (ProximityEventManager) automaticLockedSessionStopper.g.getD();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BuildingExitRegion buildingExitRegion2 = (BuildingExitRegion) it.next();
            int i = WhenMappings.$EnumSwitchMapping$0[((RemoteConfigManager) automaticLockedSessionStopper.e.getD()).getRealTimeConfig().getPositioning().getAutoStop().getExitRegionTriggerType().ordinal()];
            if (i == 1) {
                iPSLocalProximityEventTriggerOnEnter = IPSLocalProximityEventTrigger.INSTANCE.onEnter();
            } else if (i == 2) {
                iPSLocalProximityEventTriggerOnEnter = IPSLocalProximityEventTrigger.INSTANCE.onDwell(r6.getExitRegionDwellTimeMillis() / TimeUnit.SECONDS.toMillis(1L));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                iPSLocalProximityEventTriggerOnEnter = IPSLocalProximityEventTrigger.INSTANCE.onExit();
            }
            IPSLocalProximityEventTrigger iPSLocalProximityEventTrigger = iPSLocalProximityEventTriggerOnEnter;
            double exitRegionCooldownTimeMillis = r6.getExitRegionCooldownTimeMillis() / TimeUnit.SECONDS.toMillis(1L);
            String buildingId = buildingExitRegion2.getBuildingId();
            int floorOrder = buildingExitRegion2.getFloorOrder();
            RegionShape shape = buildingExitRegion2.getShape();
            if (shape instanceof RegionShape.Circle) {
                RegionShape.Circle circle = (RegionShape.Circle) shape;
                buildingExitRegion = buildingExitRegion2;
                iPSLocalProximityLocationDefinitionAreaCircle = IPSLocalProximityLocationDefinition.INSTANCE.areaCircle(CoordinateKt.toCoordinate(circle.getCenter()), circle.getRadiusMeters());
                c = '\n';
            } else {
                buildingExitRegion = buildingExitRegion2;
                if (shape instanceof RegionShape.Polygon) {
                    IPSLocalProximityLocationDefinition.Companion companion = IPSLocalProximityLocationDefinition.INSTANCE;
                    List<IndoorCoordinate> vertices = ((RegionShape.Polygon) shape).getVertices();
                    c = '\n';
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.s(vertices, 10));
                    Iterator<T> it2 = vertices.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(CoordinateKt.toCoordinate((IndoorCoordinate) it2.next()));
                    }
                    iPSLocalProximityLocationDefinitionAreaRectangle = companion.areaPolygon(arrayList2);
                } else {
                    c = '\n';
                    if (!(shape instanceof RegionShape.Rectangle)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RegionShape.Rectangle rectangle = (RegionShape.Rectangle) shape;
                    iPSLocalProximityLocationDefinitionAreaRectangle = IPSLocalProximityLocationDefinition.INSTANCE.areaRectangle(CoordinateKt.toCoordinate(rectangle.getTopRight()), CoordinateKt.toCoordinate(rectangle.getBottomLeft()));
                }
                iPSLocalProximityLocationDefinitionAreaCircle = iPSLocalProximityLocationDefinitionAreaRectangle;
            }
            arrayList.add(new IPSLocalProximityEvent(null, buildingId, floorOrder, iPSLocalProximityEventTrigger, iPSLocalProximityLocationDefinitionAreaCircle, IPSLocalProximityEventRepetitionStrategy.INSTANCE.infinite(exitRegionCooldownTimeMillis), ProximityEventOrigin.EXIT_REGION, new C1618b(automaticLockedSessionStopper, buildingExitRegion)));
        }
        proximityEventManager.setProximityEvents(arrayList);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void start(@NotNull Building building) {
        Intrinsics.h(building, "building");
        ((Logger) this.c.getD()).d("AutomaticLockedSessionS", "start() called");
        Job jobC = BuildersKt.c(this.b, null, null, new C1636e(this, building, null), 3);
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.h = jobC;
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void stop() {
        ((Logger) this.c.getD()).d("AutomaticLockedSessionS", "stop() called");
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.h = null;
        ((ProximityEventManager) this.g.getD()).removeAllProximityEvents();
    }
}
