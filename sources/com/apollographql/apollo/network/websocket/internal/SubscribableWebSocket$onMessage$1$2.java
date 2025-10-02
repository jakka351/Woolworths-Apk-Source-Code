package com.apollographql.apollo.network.websocket.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.internal.SubscribableWebSocket$onMessage$1$2", f = "SubscribableWebSocket.kt", l = {190}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubscribableWebSocket$onMessage$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SubscribableWebSocket p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribableWebSocket$onMessage$1$2(SubscribableWebSocket subscribableWebSocket, Continuation continuation) {
        super(2, continuation);
        this.p = subscribableWebSocket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubscribableWebSocket$onMessage$1$2(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SubscribableWebSocket$onMessage$1$2 subscribableWebSocket$onMessage$1$2 = (SubscribableWebSocket$onMessage$1$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        subscribableWebSocket$onMessage$1$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        throw null;
    }
}
