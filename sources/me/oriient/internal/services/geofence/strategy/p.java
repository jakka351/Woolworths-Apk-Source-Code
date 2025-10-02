package me.oriient.internal.services.geofence.strategy;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;
import me.oriient.internal.infra.utils.android.appState.AppStateProvider;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.dataManager.common.WorldCoordinateKt;
import me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class p implements r {

    @NotNull
    private static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f25511a;
    public final MutableSharedFlow b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public Map k;
    public Job l;
    public Job m;
    public Job n;
    public Job o;

    public p(CoroutineScope geofenceCoroutineScope) {
        Intrinsics.h(geofenceCoroutineScope, "geofenceCoroutineScope");
        this.f25511a = geofenceCoroutineScope;
        this.b = UtilsKt.EventFlow();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(InternalConfigManager.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        this.g = InternalDiKt.getDi().inject(reflectionFactory.b(AppStateProvider.class));
        this.h = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.i = InternalDiKt.getDi().inject(reflectionFactory.b(SystemLocationManagerFactory.class));
        this.j = LazyKt.b(new f(this));
        this.k = EmptyMap.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r10.a(r11, r12, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (r10.a(r11, r12, r7) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.geofence.strategy.p r10, java.lang.String r11, me.oriient.internal.infra.locationManager.SystemLocation r12, kotlin.coroutines.Continuation r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof me.oriient.internal.services.geofence.strategy.g
            if (r0 == 0) goto L17
            r0 = r13
            me.oriient.internal.services.geofence.strategy.g r0 = (me.oriient.internal.services.geofence.strategy.g) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.e = r1
        L15:
            r7 = r0
            goto L1d
        L17:
            me.oriient.internal.services.geofence.strategy.g r0 = new me.oriient.internal.services.geofence.strategy.g
            r0.<init>(r10, r13)
            goto L15
        L1d:
            java.lang.Object r13 = r7.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.e
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L3c
            if (r1 == r9) goto L37
            if (r1 != r8) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            kotlin.ResultKt.b(r13)
            goto Lc8
        L3c:
            me.oriient.internal.infra.locationManager.SystemLocation r12 = r7.b
            me.oriient.internal.services.geofence.strategy.p r10 = r7.f25502a
            kotlin.ResultKt.b(r13)
            goto L76
        L44:
            kotlin.ResultKt.b(r13)
            me.oriient.internal.services.dataManager.common.WorldCoordinate r3 = me.oriient.internal.services.dataManager.common.WorldCoordinateKt.toWorldCoordinate(r12)
            kotlin.Lazy r13 = r10.d
            java.lang.Object r13 = r13.getD()
            r1 = r13
            me.oriient.internal.services.dataManager.building.BuildingRepository r1 = (me.oriient.internal.services.dataManager.building.BuildingRepository) r1
            me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig r13 = r10.d()
            double r4 = r13.getSearchRadiusMeters()
            float r4 = (float) r4
            me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig r13 = r10.d()
            double r5 = r13.getFetchRadiusMeters()
            float r5 = (float) r5
            r7.f25502a = r10
            r7.b = r12
            r7.e = r2
            java.lang.String r6 = "geofencing"
            r2 = r11
            java.lang.Object r13 = r1.searchBuildings(r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L76
            goto Lc7
        L76:
            me.oriient.internal.infra.utils.core.Outcome r13 = (me.oriient.internal.infra.utils.core.Outcome) r13
            me.oriient.internal.services.geofence.strategy.h r11 = me.oriient.internal.services.geofence.strategy.h.f25503a
            me.oriient.internal.infra.utils.core.Outcome r11 = r13.map(r11)
            boolean r13 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            r1 = 0
            if (r13 == 0) goto Laf
            kotlin.Lazy r13 = r10.h
            java.lang.Object r13 = r13.getD()
            me.oriient.internal.infra.utils.core.Logger r13 = (me.oriient.internal.infra.utils.core.Logger) r13
            me.oriient.internal.infra.utils.core.Outcome$Failure r11 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r11
            java.lang.Exception r11 = r11.getValue()
            java.lang.String r2 = "CircleBasedGeofenceStrategy"
            java.lang.String r3 = "Failed to load buildings."
            r13.e(r2, r3, r11)
            java.util.Map r11 = r10.k
            java.util.Set r11 = r11.keySet()
            java.util.List r11 = kotlin.collections.CollectionsKt.G0(r11)
            r7.f25502a = r1
            r7.b = r1
            r7.e = r9
            java.lang.Object r10 = r10.a(r11, r12, r7)
            if (r10 != r0) goto Lc8
            goto Lc7
        Laf:
            boolean r13 = r11 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r13 == 0) goto Lc8
            me.oriient.internal.infra.utils.core.Outcome$Success r11 = (me.oriient.internal.infra.utils.core.Outcome.Success) r11
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            r7.f25502a = r1
            r7.b = r1
            r7.e = r8
            java.lang.Object r10 = r10.a(r11, r12, r7)
            if (r10 != r0) goto Lc8
        Lc7:
            return r0
        Lc8:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.strategy.p.a(me.oriient.internal.services.geofence.strategy.p, java.lang.String, me.oriient.internal.infra.locationManager.SystemLocation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void b() {
        BuildersKt.c(this.f25511a, null, null, new b(this, null), 3);
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void c() {
        String spaceId;
        Credentials credentials = (Credentials) ((AuthManager) this.f.getD()).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            ((Logger) this.h.getD()).w("CircleBasedGeofenceStrategy", "Couldn't start circle geofencing service without spaceId");
            return;
        }
        Job jobC = BuildersKt.c(this.f25511a, null, null, new l(this, spaceId, null), 3);
        Job job = this.l;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.l = jobC;
        Job jobC2 = BuildersKt.c(this.f25511a, null, null, new c(this, null), 3);
        Job job2 = this.n;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        this.n = jobC2;
        if (d().getShouldMonitorAppStateForGeofencing()) {
            Job jobC3 = BuildersKt.c(this.f25511a, null, null, new e(this, null), 3);
            Job job3 = this.o;
            if (job3 != null) {
                job3.cancel((CancellationException) null);
            }
            this.o = jobC3;
        }
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void clean() {
        b();
        this.k = EmptyMap.d;
    }

    public final CircleBasedStrategyConfig d() {
        return ((InternalConfig) ((InternalConfigManager) this.c.getD()).getConfig().getValue()).getGeofenceConfig().getCircleConfig();
    }

    public final BuildingGeofenceStatus b(GeofenceBuilding geofenceBuilding, SystemLocation systemLocation) {
        return geofenceBuilding.isInsideRadius$internal_publishRelease(WorldCoordinateKt.toWorldCoordinate(systemLocation), systemLocation.getHorizontalAccuracy() + geofenceBuilding.getGeofenceRadiusMeters()) ? new BuildingGeofenceStatus.Inside(((TimeProvider) this.e.getD()).getCurrentTimeMillis(), systemLocation) : new BuildingGeofenceStatus.Outside(((TimeProvider) this.e.getD()).getCurrentTimeMillis(), systemLocation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (kotlinx.coroutines.CoroutineScopeKt.c(r10, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.geofence.strategy.p r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof me.oriient.internal.services.geofence.strategy.m
            if (r0 == 0) goto L16
            r0 = r10
            me.oriient.internal.services.geofence.strategy.m r0 = (me.oriient.internal.services.geofence.strategy.m) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.d = r1
            goto L1b
        L16:
            me.oriient.internal.services.geofence.strategy.m r0 = new me.oriient.internal.services.geofence.strategy.m
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r10)
            goto La0
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            me.oriient.internal.services.geofence.strategy.p r9 = r0.f25508a
            kotlin.ResultKt.b(r10)
            goto L8f
        L3b:
            kotlin.ResultKt.b(r10)
            kotlin.Lazy r10 = r9.j
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.infra.locationManager.SystemLocationManager r10 = (me.oriient.internal.infra.locationManager.SystemLocationManager) r10
            r10.requestSingleUpdate()
            kotlin.Lazy r10 = r9.h
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.infra.utils.core.Logger r10 = (me.oriient.internal.infra.utils.core.Logger) r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "request update called. next in: "
            r2.<init>(r5)
            me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig r5 = r9.d()
            double r5 = r5.getPeriodicGeofenceCheckIntervalSeconds()
            r2.append(r5)
            java.lang.String r5 = " seconds"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "CircleBasedGeofenceStrategy"
            r10.d(r5, r2)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 1
            long r5 = r10.toMillis(r5)
            double r5 = (double) r5
            me.oriient.internal.services.dataModel.geofence.CircleBasedStrategyConfig r10 = r9.d()
            double r7 = r10.getPeriodicGeofenceCheckIntervalSeconds()
            double r7 = r7 * r5
            long r5 = (long) r7
            r0.f25508a = r9
            r0.d = r4
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.b(r5, r0)
            if (r10 != r1) goto L8f
            goto L9f
        L8f:
            me.oriient.internal.services.geofence.strategy.o r10 = new me.oriient.internal.services.geofence.strategy.o
            r2 = 0
            r10.<init>(r9, r2)
            r0.f25508a = r2
            r0.d = r3
            java.lang.Object r9 = kotlinx.coroutines.CoroutineScopeKt.c(r10, r0)
            if (r9 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.strategy.p.a(me.oriient.internal.services.geofence.strategy.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final MutableSharedFlow a() {
        return this.b;
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding) {
        SystemLocation lastKnownLocation = ((SystemLocationManager) this.j.getD()).get_lastKnownLocation();
        if (lastKnownLocation == null) {
            return new BuildingGeofenceStatus.Undefined(((TimeProvider) this.e.getD()).getCurrentTimeMillis());
        }
        return b(geofenceBuilding, lastKnownLocation);
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding, SystemLocation systemLocation) {
        return b(geofenceBuilding, systemLocation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r12, me.oriient.internal.infra.locationManager.SystemLocation r13, me.oriient.internal.services.geofence.strategy.g r14) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.strategy.p.a(java.util.List, me.oriient.internal.infra.locationManager.SystemLocation, me.oriient.internal.services.geofence.strategy.g):java.lang.Object");
    }
}
