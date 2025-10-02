package me.oriient.ipssdk.common.services.geofencing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.common.ofs.b0;
import me.oriient.ipssdk.common.ofs.c0;
import me.oriient.ipssdk.common.ofs.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizerImpl;", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizer;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "stabilityTimeLimitMillis", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "rawGeofences", "<init>", "(Lkotlinx/coroutines/CoroutineScope;JLkotlinx/coroutines/flow/StateFlow;)V", "", "start", "()V", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "J", "getStabilityTimeLimitMillis", "()J", "setStabilityTimeLimitMillis", "(J)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getStableGeofences", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "stableGeofences", "Companion", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LiveGeofenceStabilizerImpl implements LiveGeofenceStabilizer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineScope f25778a;

    /* renamed from: b, reason: from kotlin metadata */
    private long stabilityTimeLimitMillis;
    private final StateFlow c;

    /* renamed from: d, reason: from kotlin metadata */
    private final MutableStateFlow stableGeofences;
    private final Lazy e;
    private final Lazy f;
    private Job g;
    private final Flow h;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizerImpl$Companion;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "stabilityTimeLimitMillis", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lme/oriient/internal/services/geofence/models/GeofenceBuilding;", "Lme/oriient/internal/services/geofence/models/BuildingGeofenceStatus;", "rawGeofences", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizer;", "newInstance", "(Lkotlinx/coroutines/CoroutineScope;JLkotlinx/coroutines/flow/StateFlow;)Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceStabilizer;", "LIVE_GEOFENCE_TICKER_PERIOD_MILLIS", "J", "", "TAG", "Ljava/lang/String;", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final LiveGeofenceStabilizer newInstance(@NotNull CoroutineScope coroutineScope, long stabilityTimeLimitMillis, @NotNull StateFlow<? extends Map<GeofenceBuilding, ? extends BuildingGeofenceStatus>> rawGeofences) {
            Intrinsics.h(coroutineScope, "coroutineScope");
            Intrinsics.h(rawGeofences, "rawGeofences");
            return new LiveGeofenceStabilizerImpl(coroutineScope, stabilityTimeLimitMillis, rawGeofences);
        }
    }

    public LiveGeofenceStabilizerImpl(@NotNull CoroutineScope coroutineScope, long j, @NotNull StateFlow<? extends Map<GeofenceBuilding, ? extends BuildingGeofenceStatus>> rawGeofences) {
        Intrinsics.h(coroutineScope, "coroutineScope");
        Intrinsics.h(rawGeofences, "rawGeofences");
        this.f25778a = coroutineScope;
        this.stabilityTimeLimitMillis = j;
        this.c = rawGeofences;
        this.stableGeofences = StateFlowKt.a(EmptyMap.d);
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.e = di.inject(reflectionFactory.b(Logger.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.h = FlowKt.B(new d0(null));
    }

    public static final Logger access$getLogger(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl) {
        return (Logger) liveGeofenceStabilizerImpl.e.getD();
    }

    public static final void access$onNewGeofences(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl, Map map) {
        Map map2 = (Map) liveGeofenceStabilizerImpl.getStableGeofences().getValue();
        LinkedHashMap linkedHashMapS = MapsKt.s((Map) liveGeofenceStabilizerImpl.getStableGeofences().getValue());
        boolean z = false;
        for (Map.Entry entry : map.entrySet()) {
            GeofenceBuilding geofenceBuilding = (GeofenceBuilding) entry.getKey();
            BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) entry.getValue();
            BuildingGeofenceStatus buildingGeofenceStatus2 = (BuildingGeofenceStatus) map2.get(geofenceBuilding);
            if (Math.abs(((TimeProvider) liveGeofenceStabilizerImpl.f.getD()).timeIntervalSinceNow(buildingGeofenceStatus.getSinceTimestampMillis())) >= liveGeofenceStabilizerImpl.getStabilityTimeLimitMillis() && (buildingGeofenceStatus2 == null || !buildingGeofenceStatus2.isSameStatus(buildingGeofenceStatus))) {
                linkedHashMapS.put(geofenceBuilding, buildingGeofenceStatus);
                z = true;
            }
        }
        for (GeofenceBuilding geofenceBuilding2 : map2.keySet()) {
            if (map.get(geofenceBuilding2) == null) {
                linkedHashMapS.remove(geofenceBuilding2);
                z = true;
            }
        }
        if (z) {
            liveGeofenceStabilizerImpl.getStableGeofences().setValue(linkedHashMapS);
        }
    }

    public static final void access$setJob(LiveGeofenceStabilizerImpl liveGeofenceStabilizerImpl, Job job) {
        Job job2 = liveGeofenceStabilizerImpl.g;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        liveGeofenceStabilizerImpl.g = job;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizer
    public long getStabilityTimeLimitMillis() {
        return this.stabilityTimeLimitMillis;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizer
    public void setStabilityTimeLimitMillis(long j) {
        this.stabilityTimeLimitMillis = j;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizer
    public void start() {
        Job job = this.g;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        Job jobC = BuildersKt.c(this.f25778a, null, null, new b0(this, null), 3);
        Job job2 = this.g;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.g = jobC;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizer
    @Nullable
    public Object stop(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objF = BuildersKt.f(this.f25778a.getE(), new c0(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceStabilizer
    @NotNull
    public MutableStateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> getStableGeofences() {
        return this.stableGeofences;
    }
}
