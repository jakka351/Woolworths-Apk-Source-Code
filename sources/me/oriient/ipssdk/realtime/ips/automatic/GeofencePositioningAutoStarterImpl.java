package me.oriient.ipssdk.realtime.ips.automatic;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
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
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ofs.C1621b2;
import me.oriient.ipssdk.realtime.ofs.C1645f2;
import me.oriient.ipssdk.realtime.ofs.C1651g2;
import me.oriient.ipssdk.realtime.ofs.C1657h2;
import me.oriient.ipssdk.realtime.ofs.C1663i2;
import me.oriient.ipssdk.realtime.ofs.C1669j2;
import me.oriient.ipssdk.realtime.ofs.C1675k2;
import me.oriient.ipssdk.realtime.ofs.C1681l2;
import me.oriient.ipssdk.realtime.ofs.C1687m2;
import me.oriient.ipssdk.realtime.ofs.X1;
import me.oriient.ipssdk.realtime.ofs.Z1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB?\u0012.\u0010\t\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/automatic/GeofencePositioningAutoStarterImpl;", "Lme/oriient/ipssdk/realtime/ips/automatic/GeofencePositioningAutoStarter;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lme/oriient/internal/infra/utils/core/Outcome;", "", "Lme/oriient/ipssdk/base/utils/SdkError;", "", "startPositioningClosure", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CoroutineScope;)V", "", "enabled", "setFeatureEnabled", "(Z)V", "", "state", "setPositioningState", "(I)V", "onPositioningStoppedByClient", "()V", "onPositioningStartedByClient", "onPositioningAutoStopped", "onPositioningSessionError", "Companion", "me/oriient/ipssdk/realtime/ofs/X1", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GeofencePositioningAutoStarterImpl implements GeofencePositioningAutoStarter {

    @Deprecated
    @NotNull
    public static final String GEOFENCE_REQUEST_ID = "geo-auto-start-positioning";

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f25870a;
    private final CoroutineScope b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;
    private final Lazy h;
    private final MutableStateFlow i;
    private final MutableStateFlow j;
    private final MutableStateFlow k;
    private final ArrayList l;
    private boolean m;

    @NotNull
    private static final X1 Companion = new X1();
    private static final long n = TimeUnit.SECONDS.toMillis(1);

    public GeofencePositioningAutoStarterImpl(@NotNull Function2<? super String, ? super Continuation<? super Outcome<Unit, SdkError>>, ? extends Object> startPositioningClosure, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.h(startPositioningClosure, "startPositioningClosure");
        Intrinsics.h(coroutineScope, "coroutineScope");
        this.f25870a = startPositioningClosure;
        this.b = coroutineScope;
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(Logger.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.g = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.h = DependencyInjectionKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.i = StateFlowKt.a(0);
        this.j = StateFlowKt.a(null);
        this.k = StateFlowKt.a(Boolean.FALSE);
        this.l = new ArrayList();
    }

    public static final void access$activateFeature(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        Job jobC = BuildersKt.c(geofencePositioningAutoStarterImpl.b, null, null, new Z1(geofencePositioningAutoStarterImpl, null), 3);
        Job jobC2 = BuildersKt.c(geofencePositioningAutoStarterImpl.b, null, null, new C1621b2(geofencePositioningAutoStarterImpl, null), 3);
        Job jobC3 = BuildersKt.c(geofencePositioningAutoStarterImpl.b, null, null, new C1645f2(geofencePositioningAutoStarterImpl, null), 3);
        geofencePositioningAutoStarterImpl.l.add(jobC);
        geofencePositioningAutoStarterImpl.l.add(jobC2);
        geofencePositioningAutoStarterImpl.l.add(jobC3);
    }

    public static final AppStateProvider access$getAppStateProvider(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (AppStateProvider) geofencePositioningAutoStarterImpl.h.getD();
    }

    public static final BuildingGeofenceManager access$getBuildingGeofenceManager(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (BuildingGeofenceManager) geofencePositioningAutoStarterImpl.f.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (RemoteConfigManager) geofencePositioningAutoStarterImpl.g.getD();
    }

    public static final ELog access$getELog(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (ELog) geofencePositioningAutoStarterImpl.d.getD();
    }

    public static final Logger access$getLogger(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (Logger) geofencePositioningAutoStarterImpl.c.getD();
    }

    public static final TimeProvider access$getTimeProvider(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl) {
        return (TimeProvider) geofencePositioningAutoStarterImpl.e.getD();
    }

    public static final boolean access$isAutoStartCandidate(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, BuildingGeofenceStatus buildingGeofenceStatus, RemoteConfig remoteConfig) {
        geofencePositioningAutoStarterImpl.getClass();
        if (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Inside) {
            if (Math.abs(((TimeProvider) geofencePositioningAutoStarterImpl.e.getD()).timeIntervalSinceNow(buildingGeofenceStatus.getSinceTimestampMillis())) < remoteConfig.getRealTime().getGeofence().getGeofenceStabilityTimeLimitMillis()) {
                return false;
            }
            BuildingGeofenceStatus.Inside inside = (BuildingGeofenceStatus.Inside) buildingGeofenceStatus;
            return inside.getLocation().getHorizontalAccuracy() < remoteConfig.getRealTime().getPositioning().getMaximumLocationAccuracyToAutoStartMeters() && Math.abs(((TimeProvider) geofencePositioningAutoStarterImpl.e.getD()).timeIntervalSinceNow(inside.getLocation().getTimestampMs())) <= remoteConfig.getRealTime().getGeofence().getGeofenceFreshnessTimeLimitMillis();
        }
        if ((buildingGeofenceStatus instanceof BuildingGeofenceStatus.Outside) || (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Undefined)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Flow access$tickerFlow(GeofencePositioningAutoStarterImpl geofencePositioningAutoStarterImpl, long j) {
        geofencePositioningAutoStarterImpl.getClass();
        return FlowKt.B(new C1687m2(j, null));
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void onPositioningAutoStopped() {
        BuildersKt.c(this.b, null, null, new C1651g2(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void onPositioningSessionError() {
        BuildersKt.c(this.b, null, null, new C1657h2(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void onPositioningStartedByClient() {
        BuildersKt.c(this.b, null, null, new C1663i2(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void onPositioningStoppedByClient() {
        BuildersKt.c(this.b, null, null, new C1669j2(this, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void setFeatureEnabled(boolean enabled) {
        BuildersKt.c(this.b, null, null, new C1675k2(this, enabled, null), 3);
    }

    @Override // me.oriient.ipssdk.realtime.ips.automatic.GeofencePositioningAutoStarter
    public void setPositioningState(int state) {
        BuildersKt.c(this.b, null, null, new C1681l2(this, state, null), 3);
    }
}
