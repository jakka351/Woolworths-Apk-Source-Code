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
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24938a;
    public final /* synthetic */ ProxyLocationManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(ProxyLocationManager proxyLocationManager, Continuation continuation) {
        super(2, continuation);
        this.b = proxyLocationManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f24938a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<Boolean> stateFlowIsActive = this.b.currentLocationManager.isActive();
            H h = new H(this.b);
            this.f24938a = 1;
            if (stateFlowIsActive.collect(h, this) == coroutineSingletons) {
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
