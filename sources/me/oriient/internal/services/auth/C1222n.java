package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.auth.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1222n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25035a;
    public /* synthetic */ Object b;
    public final /* synthetic */ D c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222n(D d, Continuation continuation) {
        super(2, continuation);
        this.c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1222n c1222n = new C1222n(this.c, continuation);
        c1222n.b = obj;
        return c1222n;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1222n c1222n = new C1222n(this.c, (Continuation) obj2);
        c1222n.b = (String) obj;
        return c1222n.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25035a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        String str = (String) this.b;
        D d = this.c;
        this.f25035a = 1;
        Object objA = D.a(d, str, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
