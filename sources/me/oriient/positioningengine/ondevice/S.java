package me.oriient.positioningengine.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class S extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26404a;
    public final /* synthetic */ X b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(X x, Continuation continuation) {
        super(2, continuation);
        this.b = x;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        S s = new S(this.b, continuation);
        s.f26404a = obj;
        return s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        S s = new S(this.b, (Continuation) obj2);
        s.f26404a = (CoroutineScope) obj;
        return s.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return BuildersKt.c((CoroutineScope) this.f26404a, null, null, new Q(this.b, null), 3);
    }
}
