package me.oriient.positioningengine.ondevice.ml;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class m extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f26459a;
    public final /* synthetic */ o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Continuation continuation) {
        super(1, continuation);
        this.b = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new m(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new m(this.b, (Continuation) obj).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26459a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        o oVar = this.b;
        this.f26459a = 1;
        Object objA = o.a(oVar, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
