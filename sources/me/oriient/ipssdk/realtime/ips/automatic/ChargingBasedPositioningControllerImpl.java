package me.oriient.ipssdk.realtime.ips.automatic;

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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.realtime.ofs.A;
import me.oriient.ipssdk.realtime.ofs.C1745x;
import me.oriient.ipssdk.realtime.ofs.C1750y;
import me.oriient.ipssdk.realtime.ofs.C1755z;
import me.oriient.ipssdk.realtime.ofs.D;
import me.oriient.ipssdk.realtime.ofs.r;
import me.oriient.positioningengine.common.EngineStopReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/ChargingBasedPositioningControllerImpl;", "Lme/oriient/ipssdk/realtime/ips/automatic/ChargingBasedPositioningController;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticPositioningStarterDelegate;", "startingDelegate", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lme/oriient/ipssdk/realtime/ips/automatic/AutomaticPositioningStarterDelegate;)V", "", "activate", "()V", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "building", "manuallyDefineBuilding", "(Lme/oriient/internal/services/geofence/models/GeofenceBuilding;)V", "pauseTillNextCharging", "deactivate", "Companion", "me/oriient/ipssdk/realtime/ofs/r", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ChargingBasedPositioningControllerImpl implements ChargingBasedPositioningController {

    @Deprecated
    @NotNull
    public static final String GEOFENCE_REQUEST_ID = "charger-based-auto-start";

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineScope f25869a;
    private final AutomaticPositioningStarterDelegate b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private final MutableStateFlow j;
    private Long k;
    private Job l;
    private Job m;
    private boolean n;

    @NotNull
    private static final r Companion = new r();
    private static final long o = TimeUnit.SECONDS.toMillis(1);

    public ChargingBasedPositioningControllerImpl(@NotNull CoroutineScope coroutineScope, @NotNull AutomaticPositioningStarterDelegate startingDelegate) {
        Intrinsics.h(coroutineScope, "coroutineScope");
        Intrinsics.h(startingDelegate, "startingDelegate");
        this.f25869a = coroutineScope;
        this.b = startingDelegate;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(PowerManager.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.i = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.j = StateFlowKt.a(null);
    }

    public static final AppStateProvider access$getAppStateProvider(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        return (AppStateProvider) chargingBasedPositioningControllerImpl.g.getD();
    }

    public static final BuildingGeofenceManager access$getBuildingGeofenceManager(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        return (BuildingGeofenceManager) chargingBasedPositioningControllerImpl.h.getD();
    }

    public static final Logger access$getLogger(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        return (Logger) chargingBasedPositioningControllerImpl.c.getD();
    }

    public static final PowerManager access$getPowerManager(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        return (PowerManager) chargingBasedPositioningControllerImpl.f.getD();
    }

    public static final TimeProvider access$getTimeProvider(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl) {
        return (TimeProvider) chargingBasedPositioningControllerImpl.e.getD();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        if (r0 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$startPositioningIfNeeded(me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl r12, me.oriient.internal.services.geofence.models.GeofenceBuilding r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl.access$startPositioningIfNeeded(me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningControllerImpl, me.oriient.internal.services.geofence.models.GeofenceBuilding, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object access$stopPositioningIfNeeded(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, Continuation continuation) {
        boolean useCharging = ((RemoteConfigManager) chargingBasedPositioningControllerImpl.i.getD()).getRealTimeConfig().getPositioning().getAutoStop().getUseCharging();
        Unit unit = Unit.f24250a;
        if (!useCharging || chargingBasedPositioningControllerImpl.b.getPositioningEngineState() != 2) {
            return unit;
        }
        ((Logger) chargingBasedPositioningControllerImpl.c.getD()).d("ChargingBasedPositioning", "Stopping");
        Object objStopPositioning = chargingBasedPositioningControllerImpl.b.stopPositioning(new EngineStopReason.ChargingAutoStop(), continuation);
        return objStopPositioning == CoroutineSingletons.d ? objStopPositioning : unit;
    }

    public static final Flow access$tickerFlow(ChargingBasedPositioningControllerImpl chargingBasedPositioningControllerImpl, long j) {
        chargingBasedPositioningControllerImpl.getClass();
        return FlowKt.B(new D(j, null));
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController
    public void activate() {
        BuildersKt.c(this.f25869a, null, null, new C1745x(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController
    public void deactivate() {
        BuildersKt.c(this.f25869a, null, null, new C1750y(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController
    public void manuallyDefineBuilding(@Nullable GeofenceBuilding building) {
        BuildersKt.c(this.f25869a, null, null, new C1755z(this, building, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.ChargingBasedPositioningController
    public void pauseTillNextCharging() {
        BuildersKt.c(this.f25869a, null, null, new A(this, null), 3);
    }
}
