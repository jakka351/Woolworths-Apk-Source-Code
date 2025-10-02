package me.oriient.internal.services.geofence;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.locationManager.SystemLocation;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* loaded from: classes7.dex */
public final class m extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25491a;
    public final /* synthetic */ BuildingGeofenceManagerImpl b;
    public final /* synthetic */ GeofenceBuilding c;
    public final /* synthetic */ SystemLocation d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, GeofenceBuilding geofenceBuilding, SystemLocation systemLocation, Continuation continuation) {
        super(2, continuation);
        this.b = buildingGeofenceManagerImpl;
        this.c = geofenceBuilding;
        this.d = systemLocation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25491a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        me.oriient.internal.services.geofence.strategy.q polygonalGeofenceStrategy = this.b.getPolygonalGeofenceStrategy();
        GeofenceBuilding geofenceBuilding = this.c;
        SystemLocation systemLocation = this.d;
        this.f25491a = 1;
        BuildingGeofenceStatus buildingGeofenceStatusA = polygonalGeofenceStrategy.a(geofenceBuilding, systemLocation);
        return buildingGeofenceStatusA == coroutineSingletons ? coroutineSingletons : buildingGeofenceStatusA;
    }
}
