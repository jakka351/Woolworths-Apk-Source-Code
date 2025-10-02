package me.oriient.internal.services.geofence;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes7.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25488a;
    public final /* synthetic */ BuildingGeofenceManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BuildingGeofenceManagerImpl buildingGeofenceManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = buildingGeofenceManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25488a;
        if (i == 0) {
            ResultKt.b(obj);
            MutableSharedFlow mutableSharedFlowA = this.b.getPolygonalGeofenceStrategy().a();
            i iVar = new i(this.b);
            this.f25488a = 1;
            if (mutableSharedFlowA.collect(iVar, this) == coroutineSingletons) {
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
