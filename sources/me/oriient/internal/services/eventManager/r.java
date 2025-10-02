package me.oriient.internal.services.eventManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.services.eventManager.model.EventError;
import me.oriient.internal.services.eventManager.model.PublishMessage;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me.oriient.internal.services.eventManager.model.c f25468a;
    public final /* synthetic */ PublishMessage b;
    public final /* synthetic */ Exception c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(me.oriient.internal.services.eventManager.model.c cVar, PublishMessage publishMessage, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f25468a = cVar;
        this.b = publishMessage;
        this.c = exc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f25468a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25468a.c.invoke(this.b.getTopic(), this.b.getRequestId(), new EventError.InvalidInput(this.c.getLocalizedMessage()));
        return Unit.f24250a;
    }
}
