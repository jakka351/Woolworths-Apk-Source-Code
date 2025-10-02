package me.oriient.internal.services.geofence;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* loaded from: classes7.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25492a;
    public final /* synthetic */ BuildingGeofenceManagerImpl b;
    public final /* synthetic */ GeofenceBuilding c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, GeofenceBuilding geofenceBuilding, Continuation continuation) {
        super(2, continuation);
        this.b = buildingGeofenceManagerImpl;
        this.c = geofenceBuilding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25492a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) ((Map) this.b.getPolygonalStatus().getValue()).get(this.c);
            if (buildingGeofenceStatus != null) {
                return buildingGeofenceStatus;
            }
            me.oriient.internal.services.geofence.strategy.q polygonalGeofenceStrategy = this.b.getPolygonalGeofenceStrategy();
            GeofenceBuilding geofenceBuilding = this.c;
            this.f25492a = 1;
            obj = polygonalGeofenceStrategy.a(geofenceBuilding);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (BuildingGeofenceStatus) obj;
    }
}
