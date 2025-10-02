package me.oriient.internal.services.eventManager;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25465a;
    public final /* synthetic */ me.oriient.internal.services.websocket.e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, me.oriient.internal.services.websocket.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f25465a = wVar;
        this.b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f25465a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o(this.f25465a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25465a.d.d("EventManager", "Events manager -- socket opened");
        w.a(this.f25465a).d("EventManager", "Socket was opened");
        w wVar = this.f25465a;
        wVar.a(wVar.f, EventManagerState.ONLINE);
        w wVar2 = this.f25465a;
        wVar2.m = 0;
        wVar2.r = 0;
        wVar2.g = this.b;
        wVar2.a();
        Job job = this.f25465a.t;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        w.b(this.f25465a);
        return Unit.f24250a;
    }
}
