package me.oriient.ipssdk.realtime.ips.automatic;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.common.WorldCoordinate;
import me.oriient.internal.services.dataManager.common.WorldCoordinateKt;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper;
import me.oriient.ipssdk.realtime.ofs.C1654h;
import me.oriient.ipssdk.realtime.ofs.C1660i;
import me.oriient.ipssdk.realtime.ofs.C1666j;
import me.oriient.ipssdk.realtime.ofs.C1678l;
import me.oriient.ipssdk.realtime.ofs.C1684m;
import me.oriient.ipssdk.realtime.ofs.C1708q;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopperImpl;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper;", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticSessionStopper$Delegate;Lkotlinx/coroutines/CoroutineScope;)V", "Lme/oriient/internal/services/dataManager/building/Building;", "building", "", "start", "(Lme/oriient/internal/services/dataManager/building/Building;)V", "stop", "()V", "Companion", "me/oriient/ipssdk/realtime/ofs/h", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class AutomaticSessionStopperImpl implements AutomaticSessionStopper {

    @Deprecated
    @NotNull
    public static final String GEOFENCE_REQUEST_ID = "auto-stop-session";

    /* renamed from: a, reason: collision with root package name */
    private final AutomaticSessionStopper.Delegate f25868a;
    private final CoroutineScope b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private Job h;
    private Building i;

    @NotNull
    private static final C1654h Companion = new C1654h();
    private static final long j = TimeUnit.SECONDS.toMillis(1);

    public AutomaticSessionStopperImpl(@NotNull AutomaticSessionStopper.Delegate delegate, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(delegate, "delegate");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.f25868a = delegate;
        this.b = coroutineScope;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
    }

    public static final BuildingGeofenceManager access$getBuildingGeofenceManager(AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        return (BuildingGeofenceManager) automaticSessionStopperImpl.f.getD();
    }

    public static final Logger access$getLogger(AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        return (Logger) automaticSessionStopperImpl.c.getD();
    }

    public static final boolean access$isActive(AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        return automaticSessionStopperImpl.h != null;
    }

    public static final Object access$observeGeofence(AutomaticSessionStopperImpl automaticSessionStopperImpl, Continuation continuation) {
        Object objCollect = FlowKt.l(((BuildingGeofenceManager) automaticSessionStopperImpl.f.getD()).getCircularStatus(), FlowKt.B(new C1708q(j, null)), new C1660i(automaticSessionStopperImpl, null)).collect(new C1666j(automaticSessionStopperImpl), continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }

    public static final void access$setGeofenceJob(AutomaticSessionStopperImpl automaticSessionStopperImpl, Job job) {
        Job job2 = automaticSessionStopperImpl.h;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        automaticSessionStopperImpl.h = job;
    }

    public static final boolean access$shouldStopPositioning(AutomaticSessionStopperImpl automaticSessionStopperImpl, Map map) {
        Building building;
        Object next;
        BuildingGeofenceStatus buildingGeofenceStatus;
        if (automaticSessionStopperImpl.f25868a.getPositioningEngineState() == 0 || (building = automaticSessionStopperImpl.i) == null) {
            return false;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((GeofenceBuilding) ((Map.Entry) next).getKey()).getId(), building.getId())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (buildingGeofenceStatus = (BuildingGeofenceStatus) entry.getValue()) == null || !(buildingGeofenceStatus instanceof BuildingGeofenceStatus.Outside)) {
            return false;
        }
        SystemLocation location = ((BuildingGeofenceStatus.Outside) buildingGeofenceStatus).getLocation();
        WorldCoordinate worldCoordinate = location != null ? WorldCoordinateKt.toWorldCoordinate(location) : null;
        return worldCoordinate != null && Math.abs(((TimeProvider) automaticSessionStopperImpl.d.getD()).timeIntervalSinceNow(buildingGeofenceStatus.getSinceTimestampMillis())) >= ((RemoteConfigManager) automaticSessionStopperImpl.g.getD()).getRealTimeConfig().getGeofence().getGeofenceStabilityTimeLimitMillis() && worldCoordinate.distanceTo(building.getGeofenceOrigin().getLatitude(), building.getGeofenceOrigin().getLongitude()) > ((RemoteConfigManager) automaticSessionStopperImpl.g.getD()).getRealTimeConfig().getPositioning().getAutoStop().getGeofenceMaxDistanceMeters();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$stopPositioning(me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl r4, kotlin.coroutines.Continuation r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof me.oriient.ipssdk.realtime.ofs.C1690n
            if (r0 == 0) goto L16
            r0 = r5
            me.oriient.ipssdk.realtime.ofs.n r0 = (me.oriient.ipssdk.realtime.ofs.C1690n) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.realtime.ofs.n r0 = new me.oriient.ipssdk.realtime.ofs.n
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl r4 = r0.f26113a
            kotlin.ResultKt.b(r5)
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.ResultKt.b(r5)
            me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper$Delegate r5 = r4.f25868a
            me.oriient.positioningengine.common.EngineStopReason$OutOfGeofenceAutoStop r2 = new me.oriient.positioningengine.common.EngineStopReason$OutOfGeofenceAutoStop
            r2.<init>()
            r0.f26113a = r4
            r0.d = r3
            java.lang.Object r5 = r5.stopSession(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            me.oriient.internal.infra.utils.core.Outcome r5 = (me.oriient.internal.infra.utils.core.Outcome) r5
            boolean r0 = r5 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            java.lang.String r1 = "AutomaticSessionStopper"
            if (r0 == 0) goto L6f
            r0 = r5
            me.oriient.internal.infra.utils.core.Outcome$Success r0 = (me.oriient.internal.infra.utils.core.Outcome.Success) r0
            java.lang.Object r0 = r0.getValue()
            kotlin.Unit r0 = (kotlin.Unit) r0
            r4.stop()
            kotlin.Lazy r0 = r4.e
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            me.oriient.ipssdk.realtime.ofs.o r2 = new me.oriient.ipssdk.realtime.ofs.o
            r2.<init>(r4)
            java.lang.String r3 = "Auto-stop session"
            r0.i(r1, r3, r2)
        L6f:
            boolean r0 = r5 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r0 == 0) goto L8d
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r5
            java.lang.Exception r5 = r5.getValue()
            me.oriient.ipssdk.base.utils.SdkError r5 = (me.oriient.ipssdk.base.utils.SdkError) r5
            kotlin.Lazy r0 = r4.e
            java.lang.Object r0 = r0.getD()
            me.oriient.internal.services.elog.ELog r0 = (me.oriient.internal.services.elog.ELog) r0
            me.oriient.ipssdk.realtime.ofs.p r2 = new me.oriient.ipssdk.realtime.ofs.p
            r2.<init>(r5, r4)
            java.lang.String r4 = "Failed to auto-stop session"
            r0.e(r1, r4, r2)
        L8d:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl.access$stopPositioning(me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void start(@NotNull Building building) {
        Intrinsics.h(building, "building");
        BuildersKt.c(this.b, null, null, new C1678l(this, building, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopper
    public void stop() {
        BuildersKt.c(this.b, null, null, new C1684m(this, null), 3);
    }
}
