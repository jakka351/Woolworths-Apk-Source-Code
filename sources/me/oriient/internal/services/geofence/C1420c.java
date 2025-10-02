package me.oriient.internal.services.geofence;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.locationManager.SystemLocationManager;

/* renamed from: me.oriient.internal.services.geofence.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1420c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BuildingGeofenceManagerImpl f25478a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420c(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25478a = buildingGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1420c(this.f25478a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1420c(this.f25478a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25478a.circularStrategyRequesters.clear();
        this.f25478a.disableCircleStrategy();
        this.f25478a.polygonalStrategyRequesters.clear();
        this.f25478a.disablePolygonalStrategy();
        this.f25478a.circularLiveUpdateRequesters.clear();
        me.oriient.internal.services.geofence.strategy.p pVar = (me.oriient.internal.services.geofence.strategy.p) this.f25478a.getCircleGeofenceStrategy();
        ((SystemLocationManager) pVar.j.getD()).stopLocationUpdates();
        Job job = pVar.m;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        pVar.m = null;
        me.oriient.internal.services.geofence.strategy.p pVar2 = (me.oriient.internal.services.geofence.strategy.p) this.f25478a.getCircleGeofenceStrategy();
        pVar2.b();
        pVar2.k = EmptyMap.d;
        this.f25478a.getPolygonalGeofenceStrategy().clean();
        return Unit.f24250a;
    }
}
