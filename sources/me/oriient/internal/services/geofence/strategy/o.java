package me.oriient.internal.services.geofence.strategy;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25510a;
    public final /* synthetic */ p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(2, continuation);
        this.b = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        o oVar = new o(this.b, continuation);
        oVar.f25510a = obj;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        o oVar = new o(this.b, (Continuation) obj2);
        oVar.f25510a = (CoroutineScope) obj;
        return oVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return BuildersKt.c((CoroutineScope) this.f25510a, null, null, new n(this.b, null), 3);
    }
}
