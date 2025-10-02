package me.oriient.internal.infra.locationManager;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24961a;
    public final /* synthetic */ LocationManagerAndroid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LocationManagerAndroid locationManagerAndroid, Continuation continuation) {
        super(2, continuation);
        this.b = locationManagerAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24961a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<Boolean> stateFlowIsLocationPermissionGranted = this.b.getPermissionManager().isLocationPermissionGranted();
            v vVar = new v(this.b);
            this.f24961a = 1;
            if (stateFlowIsLocationPermissionGranted.collect(vVar, this) == coroutineSingletons) {
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
