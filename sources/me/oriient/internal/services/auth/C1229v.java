package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.auth.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1229v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25057a;
    public final /* synthetic */ D b;
    public final /* synthetic */ V c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229v(D d, V v, Continuation continuation) {
        super(2, continuation);
        this.b = d;
        this.c = v;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1229v(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1229v(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25057a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        me.oriient.internal.services.auth.rest.a aVar = (me.oriient.internal.services.auth.rest.a) this.b.e.getD();
        V v = this.c;
        this.f25057a = 1;
        Object objA = ((me.oriient.internal.services.auth.rest.k) aVar).a(v, this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
