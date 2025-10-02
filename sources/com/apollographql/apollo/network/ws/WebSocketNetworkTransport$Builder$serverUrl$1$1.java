package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$Builder$serverUrl$1$1", f = "WebSocketNetworkTransport.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WebSocketNetworkTransport$Builder$serverUrl$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$Builder$serverUrl$1$1(String str, Continuation continuation) {
        super(1, continuation);
        this.p = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WebSocketNetworkTransport$Builder$serverUrl$1$1(this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((WebSocketNetworkTransport$Builder$serverUrl$1$1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.p;
    }
}
