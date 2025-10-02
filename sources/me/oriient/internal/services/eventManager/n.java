package me.oriient.internal.services.eventManager;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import me.oriient.internal.infra.serializerJson.JsonSerializationKt;
import me.oriient.internal.services.eventManager.model.AcknowledgmentMessage;
import me.oriient.internal.services.eventManager.model.ErrorMessage;
import me.oriient.internal.services.eventManager.model.EventMessage;
import me.oriient.internal.services.eventManager.model.IncomingMessage;

/* loaded from: classes7.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25464a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f25464a = wVar;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f25464a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.f25464a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object asJson;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25464a.m = 0;
        Unit unit = null;
        try {
            asJson = JsonSerializationKt.parseAsJson(this.b, Reflection.b(IncomingMessage.class));
        } catch (Throwable unused) {
            asJson = null;
        }
        IncomingMessage incomingMessage = (IncomingMessage) asJson;
        w.a(this.f25464a).d("EventManager", "Socket received a message: " + incomingMessage);
        boolean z = incomingMessage instanceof AcknowledgmentMessage;
        Unit unit2 = Unit.f24250a;
        if (z) {
            String requestId = ((AcknowledgmentMessage) incomingMessage).getRequestId();
            if (requestId != null) {
                w.a(this.f25464a, requestId);
                unit = unit2;
            }
            if (unit == null) {
                this.f25464a.d.w("EventManager", "Received Ack without requestId");
            }
        } else if (incomingMessage instanceof EventMessage) {
            EventMessage eventMessage = (EventMessage) incomingMessage;
            if (eventMessage.getTopic() == null) {
                this.f25464a.d.d("EventManager", "Failed to parse event: Missing topic");
                return unit2;
            }
            if (Intrinsics.c(eventMessage.getSenderId(), this.f25464a.f25473a.getSenderId())) {
                w.a(this.f25464a).d("EventManager", "Filtered out own event " + eventMessage.getTopic());
                return unit2;
            }
        } else if (incomingMessage instanceof ErrorMessage) {
            ErrorMessage errorMessage = (ErrorMessage) incomingMessage;
            this.f25464a.d.e("EventManager", "Events server error", MapsKt.i(new Pair("errorMessage", errorMessage.getMessage())));
            String requestId2 = errorMessage.getRequestId();
            if (requestId2 != null) {
                w.a(this.f25464a, requestId2);
                unit = unit2;
            }
            if (unit == null) {
                this.f25464a.d.e("EventManager", "Received error without requestId");
            }
        } else {
            w.a(this.f25464a).d("EventManager", "Received an unknown response");
        }
        return unit2;
    }
}
