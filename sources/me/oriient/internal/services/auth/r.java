package me.oriient.internal.services.auth;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.ApiKeySuspendedError;
import me.oriient.internal.infra.utils.core.AuthError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25039a;

    public r(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(continuation);
        rVar.f25039a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        r rVar = new r((Continuation) obj2);
        rVar.f25039a = (me.oriient.internal.services.auth.rest.l) obj;
        return rVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        me.oriient.internal.services.auth.rest.l lVar = (me.oriient.internal.services.auth.rest.l) this.f25039a;
        return lVar.f25053a ? new Outcome.Failure(new ApiKeySuspendedError()) : lVar.c.isEmpty() ? new Outcome.Failure(new AuthError()) : new Outcome.Success(lVar);
    }
}
