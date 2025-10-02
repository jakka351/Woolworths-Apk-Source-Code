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
import me.oriient.internal.infra.locationManager.L;
import me.oriient.internal.infra.locationManager.M;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.locationManager.SystemLocationManagerFactory;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;
import me.oriient.internal.services.dataManager.building.BuildingRepository;
import me.oriient.internal.services.geofence.C;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class z implements q {

    @NotNull
    private static final s Companion = new s();

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f25518a;
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

    public z(CoroutineScope geofenceCoroutineScope) {
        Intrinsics.h(geofenceCoroutineScope, "geofenceCoroutineScope");
        this.f25518a = geofenceCoroutineScope;
        this.b = UtilsKt.EventFlow();
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.c = di.inject(reflectionFactory.b(InternalConfigManager.class));
        this.d = InternalDiKt.getDi().inject(reflectionFactory.b(BuildingRepository.class));
        this.e = InternalDiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.f = InternalDiKt.getDi().inject(reflectionFactory.b(AuthManager.class));
        this.g = InternalDiKt.getDi().inject(reflectionFactory.b(Logger.class));
        this.h = InternalDiKt.getDi().inject(reflectionFactory.b(SystemLocationManagerFactory.class));
        this.i = InternalDiKt.getDi().inject(reflectionFactory.b(me.oriient.internal.services.geofence.y.class));
        this.j = LazyKt.b(new w(this));
        this.k = EmptyMap.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0203 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.internal.services.geofence.strategy.z r21, java.lang.String r22, me.oriient.internal.infra.locationManager.SystemLocation r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.geofence.strategy.z.a(me.oriient.internal.services.geofence.strategy.z, java.lang.String, me.oriient.internal.infra.locationManager.SystemLocation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void b() {
        BuildersKt.c(this.f25518a, null, null, new t(this, null), 3);
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void c() {
        String spaceId;
        Credentials credentials = (Credentials) ((AuthManager) this.f.getD()).getCredentials().getValue();
        if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
            ((Logger) this.g.getD()).w("PolygonalBasedGeofenceStrategy", "Couldn't start circle geofencing service without spaceId");
            return;
        }
        Job jobC = BuildersKt.c(this.f25518a, null, null, new y(this, spaceId, null), 3);
        Job job = this.l;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.l = jobC;
        ((SystemLocationManager) this.j.getD()).startLocationUpdates(((InternalConfig) ((InternalConfigManager) this.c.getD()).getConfig().getValue()).getGeofenceConfig().getGeofencingRequiresHighAccuracy() ? new L() : new M());
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final void clean() {
        b();
        this.k = EmptyMap.d;
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final MutableSharedFlow a() {
        return this.b;
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding, SystemLocation systemLocation) {
        return ((C) ((me.oriient.internal.services.geofence.y) this.i.getD())).a(geofenceBuilding, systemLocation);
    }

    @Override // me.oriient.internal.services.geofence.strategy.q
    public final BuildingGeofenceStatus a(GeofenceBuilding geofenceBuilding) {
        SystemLocation systemLocation = ((SystemLocationManager) this.j.getD()).get_lastKnownLocation();
        if (systemLocation == null) {
            return new BuildingGeofenceStatus.Undefined(((TimeProvider) this.e.getD()).getCurrentTimeMillis());
        }
        return ((C) ((me.oriient.internal.services.geofence.y) this.i.getD())).a(geofenceBuilding, systemLocation);
    }
}
