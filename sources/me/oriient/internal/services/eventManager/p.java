package me.oriient.internal.services.eventManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.eventManager.model.PublishMessage;

/* loaded from: classes7.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me.oriient.internal.services.eventManager.model.c f25466a;
    public final /* synthetic */ PublishMessage b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(me.oriient.internal.services.eventManager.model.c cVar, PublishMessage publishMessage, Continuation continuation) {
        super(2, continuation);
        this.f25466a = cVar;
        this.b = publishMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f25466a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p(this.f25466a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25466a.b.invoke(this.b.getTopic(), this.b.getRequestId());
        return Unit.f24250a;
    }
}
