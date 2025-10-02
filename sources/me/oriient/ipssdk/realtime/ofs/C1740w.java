package me.oriient.ipssdk.realtime.ofs;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;

/* renamed from: me.oriient.ipssdk.realtime.ofs.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1740w extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ GeofenceBuilding f26164a;
    public /* synthetic */ Map b;

    public C1740w(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C1740w c1740w = new C1740w((Continuation) obj3);
        c1740w.f26164a = (GeofenceBuilding) obj;
        c1740w.b = (Map) obj2;
        return c1740w.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        GeofenceBuilding geofenceBuilding = this.f26164a;
        Map map = this.b;
        if (geofenceBuilding != null) {
            return geofenceBuilding;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            BuildingGeofenceStatus buildingGeofenceStatus = (BuildingGeofenceStatus) entry.getValue();
            if (buildingGeofenceStatus instanceof BuildingGeofenceStatus.Inside) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            } else if (!(buildingGeofenceStatus instanceof BuildingGeofenceStatus.Outside) && !(buildingGeofenceStatus instanceof BuildingGeofenceStatus.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CollectionsKt.E(linkedHashMap.keySet());
    }
}
