package me.oriient.ipssdk.common.ofs;

import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.common.services.geofencing.LiveGeofenceManagerImpl;

/* loaded from: classes2.dex */
public final class W extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25734a;
    public final /* synthetic */ LiveGeofenceManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(LiveGeofenceManagerImpl liveGeofenceManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = liveGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new W(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25734a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> stableGeofences = LiveGeofenceManagerImpl.access$getGeofenceStabilizer(this.b).getStableGeofences();
            V v = new V(this.b);
            this.f25734a = 1;
            if (stableGeofences.collect(v, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
