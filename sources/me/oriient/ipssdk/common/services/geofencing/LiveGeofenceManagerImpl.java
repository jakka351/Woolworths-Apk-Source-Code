package me.oriient.ipssdk.common.services.geofencing;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.geofence.BuildingGeofenceManager;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.api.listeners.IPSLiveGeofenceListener;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfigManager;
import me.oriient.ipssdk.common.ofs.N;
import me.oriient.ipssdk.common.ofs.O;
import me.oriient.ipssdk.common.ofs.Q;
import me.oriient.ipssdk.common.ofs.S;
import me.oriient.ipssdk.common.ofs.U;
import me.oriient.ipssdk.common.ofs.W;
import me.oriient.ipssdk.common.ofs.X;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceManagerImpl;", "Lme/oriient/ipssdk/common/services/geofencing/LiveGeofenceManager;", "<init>", "()V", "", "buildingId", "Lme/oriient/ipssdk/api/listeners/IPSLiveGeofenceListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addListener", "(Ljava/lang/String;Lme/oriient/ipssdk/api/listeners/IPSLiveGeofenceListener;)V", "removeListener", "clearListeners", "", "getBuildingIdsInside", "()Ljava/util/List;", "Companion", "me/oriient/ipssdk/common/ofs/O", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LiveGeofenceManagerImpl implements LiveGeofenceManager {

    @NotNull
    private static final O Companion = new O();

    @Deprecated
    @NotNull
    public static final String GEOFENCE_REQUEST_ID = "live-geofence";

    @Deprecated
    @NotNull
    public static final String STABLE_STATUS_CHANGED_ELOG_MESSAGE = "Live Geofencing - Update";

    @Deprecated
    @NotNull
    public static final String TAG = "NewLiveGeofenceManager";

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f25777a;
    private final Lazy b;
    private final Lazy c;
    private final Lazy d;
    private final Lazy e;
    private final Lazy f;
    private final CoroutineScope g;
    private final Lazy h;
    private final Lazy i;
    private final Object j;
    private final ArrayList k;
    private final LinkedHashMap l;
    private Job m;

    public LiveGeofenceManagerImpl() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f25777a = di.inject(reflectionFactory.b(BuildingGeofenceManager.class));
        this.b = DependencyInjectionKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        this.c = DependencyInjectionKt.getDi().inject(reflectionFactory.b(RemoteConfigManager.class));
        this.d = DependencyInjectionKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.e = DependencyInjectionKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.f = DependencyInjectionKt.getDi().inject(reflectionFactory.b(ELog.class));
        ContextScope contextScopeA = CoroutineScopeKt.a(((CoroutineContextProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(CoroutineContextProvider.class))).newSingleThreadCoroutineContext());
        this.g = contextScopeA;
        this.h = LazyKt.b(new b(this));
        this.i = LazyKt.b(new a(this));
        this.j = new Object();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        BuildersKt.c(contextScopeA, null, null, new N(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, GeofenceBuilding geofenceBuilding, BuildingGeofenceStatus buildingGeofenceStatus) {
        ((Logger) this.e.getD()).d(TAG, "Building " + geofenceBuilding.getId() + " geofence state changed, " + buildingGeofenceStatus.toShortDescription());
        ((ELog) this.f.getD()).i(TAG, str, new U(geofenceBuilding, this, buildingGeofenceStatus));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$enableCorrectStrategyIfNeeded(me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl r6, boolean r7, kotlin.coroutines.Continuation r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof me.oriient.ipssdk.common.ofs.T
            if (r0 == 0) goto L16
            r0 = r8
            me.oriient.ipssdk.common.ofs.T r0 = (me.oriient.ipssdk.common.ofs.T) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.ipssdk.common.ofs.T r0 = new me.oriient.ipssdk.common.ofs.T
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            java.lang.String r4 = "live-geofence"
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl r6 = r0.f25731a
            kotlin.ResultKt.b(r8)
            goto L7e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl r6 = r0.f25731a
            kotlin.ResultKt.b(r8)
            goto L57
        L3f:
            kotlin.ResultKt.b(r8)
            if (r7 == 0) goto L6b
            kotlin.Lazy r7 = r6.f25777a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.geofence.BuildingGeofenceManager r7 = (me.oriient.internal.services.geofence.BuildingGeofenceManager) r7
            r0.f25731a = r6
            r0.d = r5
            java.lang.Object r8 = r7.isPolygonalStrategyEnabled(r4, r0)
            if (r8 != r1) goto L57
            goto L7d
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L9c
            kotlin.Lazy r6 = r6.f25777a
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.services.geofence.BuildingGeofenceManager r6 = (me.oriient.internal.services.geofence.BuildingGeofenceManager) r6
            r6.enablePolygonalStrategy(r5, r4)
            goto L9c
        L6b:
            kotlin.Lazy r7 = r6.f25777a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.geofence.BuildingGeofenceManager r7 = (me.oriient.internal.services.geofence.BuildingGeofenceManager) r7
            r0.f25731a = r6
            r0.d = r3
            java.lang.Object r8 = r7.isCircularStrategyEnabled(r4, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L9c
            kotlin.Lazy r7 = r6.f25777a
            java.lang.Object r7 = r7.getD()
            me.oriient.internal.services.geofence.BuildingGeofenceManager r7 = (me.oriient.internal.services.geofence.BuildingGeofenceManager) r7
            r7.enableCircularStrategy(r5, r4)
            kotlin.Lazy r6 = r6.f25777a
            java.lang.Object r6 = r6.getD()
            me.oriient.internal.services.geofence.BuildingGeofenceManager r6 = (me.oriient.internal.services.geofence.BuildingGeofenceManager) r6
            r6.enableCircularLiveGeofence(r5, r4)
        L9c:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl.access$enableCorrectStrategyIfNeeded(me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final BuildingRepository access$getBuildingRepository(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (BuildingRepository) liveGeofenceManagerImpl.b.getD();
    }

    public static final RemoteConfigManager access$getConfigManager(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (RemoteConfigManager) liveGeofenceManagerImpl.c.getD();
    }

    public static final ELog access$getELog(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (ELog) liveGeofenceManagerImpl.f.getD();
    }

    public static final BuildingGeofenceManager access$getGeofenceManager(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (BuildingGeofenceManager) liveGeofenceManagerImpl.f25777a.getD();
    }

    public static final LiveGeofenceStabilizer access$getGeofenceStabilizer(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (LiveGeofenceStabilizer) liveGeofenceManagerImpl.i.getD();
    }

    public static final LiveGeofenceStatusesProvider access$getGeofenceStatusesProvider(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (LiveGeofenceStatusesProvider) liveGeofenceManagerImpl.h.getD();
    }

    public static final Logger access$getLogger(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (Logger) liveGeofenceManagerImpl.e.getD();
    }

    public static final TimeProvider access$getTimeProvider(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        return (TimeProvider) liveGeofenceManagerImpl.d.getD();
    }

    public static final void access$observeStableStatuses(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        Job jobC = BuildersKt.c(liveGeofenceManagerImpl.g, null, null, new W(liveGeofenceManagerImpl, null), 3);
        Job job = liveGeofenceManagerImpl.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        liveGeofenceManagerImpl.m = jobC;
    }

    public static final void access$onNewStableGeofences(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Map map) {
        synchronized (liveGeofenceManagerImpl.j) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    GeofenceBuilding geofenceBuilding = (GeofenceBuilding) entry.getKey();
                    BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) entry.getValue();
                    String id = geofenceBuilding.getId();
                    if (!liveGeofenceManagerImpl.k.contains(id) || !(buildingGeofenceStatus instanceof BuildingGeofenceStatus.Inside)) {
                        if (liveGeofenceManagerImpl.k.contains(id) || (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Inside)) {
                            if (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Inside) {
                                liveGeofenceManagerImpl.a(STABLE_STATUS_CHANGED_ELOG_MESSAGE, geofenceBuilding, buildingGeofenceStatus);
                                liveGeofenceManagerImpl.k.add(id);
                                List list = (List) liveGeofenceManagerImpl.l.get(id);
                                if (list != null) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ((IPSLiveGeofenceListener) it.next()).onEnterGeofence();
                                    }
                                }
                            } else if (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Outside ? true : buildingGeofenceStatus instanceof BuildingGeofenceStatus.Undefined) {
                                liveGeofenceManagerImpl.a(STABLE_STATUS_CHANGED_ELOG_MESSAGE, geofenceBuilding, buildingGeofenceStatus);
                                liveGeofenceManagerImpl.k.remove(id);
                                List list2 = (List) liveGeofenceManagerImpl.l.get(id);
                                if (list2 != null) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        ((IPSLiveGeofenceListener) it2.next()).onExitGeofence();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void access$setStableGeofenceSubscriptionJob(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Job job) {
        Job job2 = liveGeofenceManagerImpl.m;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        liveGeofenceManagerImpl.m = job;
    }

    public static final boolean access$shouldUsePolygonalGeofence(LiveGeofenceManagerImpl liveGeofenceManagerImpl, GeofenceBuilding geofenceBuilding) {
        liveGeofenceManagerImpl.getClass();
        return geofenceBuilding.hasPositioningFeature() && ((RemoteConfig) ((RemoteConfigManager) liveGeofenceManagerImpl.c.getD()).getConfig().getValue()).getRealTime().getGeofence().getUsePolygonalGeofence();
    }

    public static final void access$turnOffGeofenceUpdates(LiveGeofenceManagerImpl liveGeofenceManagerImpl) {
        ((BuildingGeofenceManager) liveGeofenceManagerImpl.f25777a.getD()).enablePolygonalStrategy(false, GEOFENCE_REQUEST_ID);
        ((BuildingGeofenceManager) liveGeofenceManagerImpl.f25777a.getD()).enableCircularStrategy(false, GEOFENCE_REQUEST_ID);
        ((BuildingGeofenceManager) liveGeofenceManagerImpl.f25777a.getD()).enableCircularLiveGeofence(false, GEOFENCE_REQUEST_ID);
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager
    public void addListener(@NotNull String buildingId, @NotNull IPSLiveGeofenceListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        ((Logger) this.e.getD()).d(TAG, "addListener() called with: buildingId = " + buildingId + ", listener = " + listener);
        BuildersKt.c(this.g, null, null, new Q(this, buildingId, listener, null), 3);
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager
    public void clearListeners() {
        BuildersKt.c(this.g, null, null, new S(this, null), 3);
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager
    @Deprecated
    @NotNull
    public List<String> getBuildingIdsInside() {
        List<String> listG0;
        synchronized (this.j) {
            listG0 = CollectionsKt.G0(this.k);
        }
        return listG0;
    }

    @Override // me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManager
    public void removeListener(@NotNull String buildingId, @NotNull IPSLiveGeofenceListener listener) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(listener, "listener");
        BuildersKt.c(this.g, null, null, new X(this, buildingId, listener, null), 3);
    }
}
