package me.oriient.internal.services.eventManager;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.eventManager.model.EventError;
import me.oriient.internal.services.eventManager.model.PublishMessage;

/* loaded from: classes7.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f25455a;
    public final /* synthetic */ PublishMessage b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Map.Entry entry, PublishMessage publishMessage, Continuation continuation) {
        super(2, continuation);
        this.f25455a = entry;
        this.b = publishMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f25455a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f25455a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((me.oriient.internal.services.eventManager.model.c) this.f25455a.getKey()).c.invoke(this.b.getTopic(), this.b.getRequestId(), new EventError.Timeout(null, 1, null));
        return Unit.f24250a;
    }
}
