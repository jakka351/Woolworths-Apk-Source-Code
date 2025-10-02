package me.oriient.positioningengine.ondevice.debugging;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.GlobalCoordinatesConverter;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.PositioningUpdate;
import me.oriient.positioningengine.ondevice.C1821h;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.support.engineManager.SupportPositioningEngineManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n implements PositioningDebuggingManager, o {

    @NotNull
    public static final j Companion = new j();
    public static final long q = TimeUnit.SECONDS.toMillis(1) / 5;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26428a;
    public PositioningDebuggingWalk b;
    public List c;
    public Long d;
    public PositioningUpdate e;
    public MappingData.Building f;
    public MappingData.Building.BuildingInfo.FloorMetadata g;
    public PositioningUpdate h;
    public final Lazy i;
    public final MutableStateFlow j;
    public final Flow k;
    public boolean l;
    public final CoroutineScope m;
    public C1821h n;
    public Job o;
    public boolean p;

    public n() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26428a = di.inject(reflectionFactory.b(TimeProvider.class));
        Lazy lazyInject = DiKt.getDi().inject(reflectionFactory.b(SupportPositioningEngineManager.class));
        this.i = DiKt.getDi().inject(reflectionFactory.b(GlobalCoordinatesConverter.class));
        this.j = StateFlowKt.a(null);
        this.k = FlowKt.Q(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(((SupportPositioningEngineManager) lazyInject.getD()).getEngine()), new l(null));
        this.l = true;
        ContextScope contextScopeA = CoroutineScopeKt.a(SupervisorKt.b());
        this.m = contextScopeA;
        BuildersKt.c(contextScopeA, null, null, new f(this, null), 3);
        BuildersKt.c(contextScopeA, null, null, new i(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.positioningengine.ondevice.debugging.n r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof me.oriient.positioningengine.ondevice.debugging.k
            if (r0 == 0) goto L16
            r0 = r8
            me.oriient.positioningengine.ondevice.debugging.k r0 = (me.oriient.positioningengine.ondevice.debugging.k) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            me.oriient.positioningengine.ondevice.debugging.k r0 = new me.oriient.positioningengine.ondevice.debugging.k
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.b
            me.oriient.positioningengine.ondevice.debugging.n r6 = r0.f26425a
            kotlin.ResultKt.b(r8)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r8)
            me.oriient.positioningengine.ondevice.h r8 = r6.n
            if (r8 == 0) goto L56
            me.oriient.positioningengine.common.CalibrationUpdate r2 = new me.oriient.positioningengine.common.CalibrationUpdate
            if (r7 == 0) goto L44
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            goto L46
        L44:
            r4 = 0
        L46:
            r2.<init>(r4)
            r0.f26425a = r6
            r0.b = r7
            r0.e = r3
            kotlin.Unit r8 = r8.a(r2)
            if (r8 != r1) goto L56
            return r1
        L56:
            if (r7 != 0) goto L6c
            me.oriient.positioningengine.ondevice.h r6 = r6.n
            if (r6 == 0) goto L6c
            me.oriient.positioningengine.common.models.CalibrationNeeded r7 = new me.oriient.positioningengine.common.models.CalibrationNeeded
            me.oriient.positioningengine.common.models.CalibrationNeeded$Reason r8 = me.oriient.positioningengine.common.models.CalibrationNeeded.Reason.TIMEOUT
            r0 = 2
            r1 = 0
            r7.<init>(r8, r1, r0, r1)
            me.oriient.positioningengine.ondevice.I r6 = r6.f26432a
            me.oriient.positioningengine.ondevice.calibration.e r6 = r6.b
            r6.a(r7)
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.debugging.n.a(me.oriient.positioningengine.ondevice.debugging.n, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final boolean getActive() {
        return this.p;
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final PositioningDebuggingWalk getWalk() {
        return this.b;
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final void setActive(boolean z) {
        this.p = z;
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final void setWalk(PositioningDebuggingWalk positioningDebuggingWalk) {
        this.b = positioningDebuggingWalk;
        a();
        this.j.setValue(positioningDebuggingWalk);
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final void startPositioning(MappingData.Building building, MappingData.Building.BuildingInfo.FloorMetadata floorMetadata) {
        Intrinsics.h(building, "building");
        this.f = building;
        if (floorMetadata == null) {
            MappingData.Building.BuildingInfo.FloorMetadata[] floors = building.getBuildingInfo().getFloors();
            int length = floors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    floorMetadata = null;
                    break;
                }
                MappingData.Building.BuildingInfo.FloorMetadata floorMetadata2 = floors[i];
                if (Intrinsics.c(floorMetadata2.getFloorId(), building.getBuildingInfo().getPrimaryFloorId())) {
                    floorMetadata = floorMetadata2;
                    break;
                }
                i++;
            }
        }
        this.g = floorMetadata;
    }

    @Override // me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager
    public final void stop() {
        a();
    }

    public final void a() {
        Job job = this.o;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        PositioningDebuggingWalk positioningDebuggingWalk = this.b;
        this.c = positioningDebuggingWalk != null ? positioningDebuggingWalk.getSegments() : null;
        PositioningDebuggingWalk positioningDebuggingWalk2 = this.b;
        this.l = positioningDebuggingWalk2 != null ? positioningDebuggingWalk2.getStartCalibrated() : true;
        this.d = null;
        this.e = null;
        this.h = null;
    }

    public static final void a(List list, n nVar) {
        list.remove(0);
        nVar.d = null;
        nVar.h = null;
        if (list.isEmpty()) {
            PositioningDebuggingWalk positioningDebuggingWalk = nVar.b;
            nVar.c = positioningDebuggingWalk != null ? positioningDebuggingWalk.getSegments() : null;
        } else {
            nVar.c = list;
        }
    }

    public final PositioningUpdate a(PositioningUpdate positioningUpdate) {
        MappingData.Building building = this.f;
        if (building != null) {
            WorldCoordinate worldCoordinateConvertBuildingCoordinateToGlobal = ((GlobalCoordinatesConverter) this.i.getD()).convertBuildingCoordinateToGlobal(new IndoorCoordinate(positioningUpdate.getX(), positioningUpdate.getY(), 0.0d, 4, (DefaultConstructorMarker) null), new WorldCoordinate(building.getBuildingInfo().getBuildingOrigin().getLatitude(), building.getBuildingInfo().getBuildingOrigin().getLongitude(), 0.0d, 4, (DefaultConstructorMarker) null), building.getBuildingInfo().getBuildingToEnuRotation());
            PositioningUpdate positioningUpdateCopy$default = PositioningUpdate.copy$default(positioningUpdate, 0.0d, 0.0d, null, 0.0d, worldCoordinateConvertBuildingCoordinateToGlobal.getLongitude(), worldCoordinateConvertBuildingCoordinateToGlobal.getLatitude(), null, ((GlobalCoordinatesConverter) this.i.getD()).convertHeadingToAzimuth(positioningUpdate.getHeading().getX(), positioningUpdate.getHeading().getY(), building.getBuildingInfo().getBuildingToEnuRotation()), 0.0d, 0L, 0.0d, 0.0d, 0.0d, null, null, null, null, null, 0L, 0.0d, 0.0d, null, false, null, null, 33554255, null);
            if (positioningUpdateCopy$default != null) {
                return positioningUpdateCopy$default;
            }
        }
        return positioningUpdate;
    }
}
