package me.oriient.internal.services.geofence;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.locationManager.L;
import me.oriient.internal.infra.locationManager.M;
import me.oriient.internal.infra.locationManager.SystemLocationManager;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.auth.AuthManager;
import me.oriient.internal.services.auth.Credentials;
import me.oriient.internal.services.config.InternalConfig;
import me.oriient.internal.services.config.InternalConfigManager;

/* loaded from: classes7.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25484a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f25484a = buildingGeofenceManagerImpl;
        this.b = str;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25484a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String spaceId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        boolean zIsCircularGeofenceLiveUpdatesEnabledImpl = this.f25484a.isCircularGeofenceLiveUpdatesEnabledImpl();
        this.f25484a.circularLiveUpdateRequesters.put(this.b, Boolean.valueOf(this.c));
        boolean zIsCircularGeofenceLiveUpdatesEnabledImpl2 = this.f25484a.isCircularGeofenceLiveUpdatesEnabledImpl();
        Unit unit = Unit.f24250a;
        if (zIsCircularGeofenceLiveUpdatesEnabledImpl2 != zIsCircularGeofenceLiveUpdatesEnabledImpl) {
            this.f25484a.isLiveCircularStrategyEnabled().setValue(Boolean.valueOf(zIsCircularGeofenceLiveUpdatesEnabledImpl2));
            if (zIsCircularGeofenceLiveUpdatesEnabledImpl2) {
                me.oriient.internal.services.geofence.strategy.p pVar = (me.oriient.internal.services.geofence.strategy.p) this.f25484a.getCircleGeofenceStrategy();
                Credentials credentials = (Credentials) ((AuthManager) pVar.f.getD()).getCredentials().getValue();
                if (credentials == null || (spaceId = credentials.getSpaceId()) == null) {
                    ((Logger) pVar.h.getD()).w("CircleBasedGeofenceStrategy", "Couldn't start circle geofencing service without spaceId");
                    return unit;
                }
                Job jobC = BuildersKt.c(pVar.f25511a, null, null, new me.oriient.internal.services.geofence.strategy.j(pVar, spaceId, null), 3);
                Job job = pVar.m;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
                pVar.m = jobC;
                ((SystemLocationManager) pVar.j.getD()).startLocationUpdates(((InternalConfig) ((InternalConfigManager) pVar.c.getD()).getConfig().getValue()).getGeofenceConfig().getGeofencingRequiresHighAccuracy() ? new L() : new M());
                return unit;
            }
            if (!zIsCircularGeofenceLiveUpdatesEnabledImpl2) {
                me.oriient.internal.services.geofence.strategy.p pVar2 = (me.oriient.internal.services.geofence.strategy.p) this.f25484a.getCircleGeofenceStrategy();
                ((SystemLocationManager) pVar2.j.getD()).stopLocationUpdates();
                Job job2 = pVar2.m;
                if (job2 != null) {
                    job2.cancel((CancellationException) null);
                }
                pVar2.m = null;
            }
        }
        return unit;
    }
}
