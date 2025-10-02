package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: me.oriient.ipssdk.realtime.ofs.t2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1728t2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26150a;

    public C1728t2(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1728t2 c1728t2 = new C1728t2(continuation);
        c1728t2.f26150a = obj;
        return c1728t2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1728t2 c1728t2 = new C1728t2((Continuation) obj2);
        c1728t2.f26150a = (CoroutineScope) obj;
        return c1728t2.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BuildersKt.c((CoroutineScope) this.f26150a, null, null, new C1722s2(null), 3);
        return Unit.f24250a;
    }
}
