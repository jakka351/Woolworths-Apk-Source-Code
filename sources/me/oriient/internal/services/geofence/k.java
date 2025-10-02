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
public final class k extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25489a;
    public final /* synthetic */ BuildingGeofenceManagerImpl b;
    public final /* synthetic */ GeofenceBuilding c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, GeofenceBuilding geofenceBuilding, Continuation continuation) {
        super(2, continuation);
        this.b = buildingGeofenceManagerImpl;
        this.c = geofenceBuilding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25489a;
        if (i == 0) {
            ResultKt.b(obj);
            BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) ((Map) this.b.getCircularStatus().getValue()).get(this.c);
            if (buildingGeofenceStatus != null) {
                return buildingGeofenceStatus;
            }
            me.oriient.internal.services.geofence.strategy.r circleGeofenceStrategy = this.b.getCircleGeofenceStrategy();
            GeofenceBuilding geofenceBuilding = this.c;
            this.f25489a = 1;
            obj = ((me.oriient.internal.services.geofence.strategy.p) circleGeofenceStrategy).a(geofenceBuilding);
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
