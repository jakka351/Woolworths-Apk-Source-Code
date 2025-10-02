package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.auth.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1225q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25038a;
    public final /* synthetic */ D b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225q(D d, String str, Continuation continuation) {
        super(2, continuation);
        this.b = d;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1225q(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1225q(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25038a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        me.oriient.internal.services.auth.rest.a aVar = (me.oriient.internal.services.auth.rest.a) this.b.e.getD();
        String str = this.c;
        this.f25038a = 1;
        Object objLogin = ((me.oriient.internal.services.auth.rest.k) aVar).login(str, this);
        return objLogin == coroutineSingletons ? coroutineSingletons : objLogin;
    }
}
