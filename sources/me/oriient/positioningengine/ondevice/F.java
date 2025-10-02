package me.oriient.positioningengine.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.positioningengine.common.EngineStopReason;

/* loaded from: classes8.dex */
public final class F extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26398a;
    public final /* synthetic */ I b;
    public final /* synthetic */ EngineStopReason c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I i, EngineStopReason engineStopReason, Continuation continuation) {
        super(2, continuation);
        this.b = i;
        this.c = engineStopReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new F(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new F(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26398a;
        if (i == 0) {
            ResultKt.b(obj);
            I i2 = this.b;
            EngineStopReason engineStopReason = this.c;
            this.f26398a = 1;
            if (i2.a(engineStopReason, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
