package me.oriient.internal.services.auth;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class x extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25059a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(D d, Continuation continuation) {
        super(2, continuation);
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        x xVar = new x(this.c, continuation);
        xVar.b = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = new x(this.c, (Continuation) obj2);
        xVar.b = (Pair) obj;
        return xVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25059a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Pair pair = (Pair) this.b;
        D d = this.c;
        Credentials credentials = (Credentials) pair.d;
        V v = (V) pair.e;
        this.f25059a = 1;
        Object objA = D.a(d, credentials, v, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
