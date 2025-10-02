package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.ws.internal.Event;
import com.apollographql.apollo.network.ws.internal.StartOperation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/network/ws/internal/Event;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$1", f = "WebSocketNetworkTransport.kt", l = {269}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebSocketNetworkTransport$execute$1 extends SuspendLambda implements Function2<FlowCollector<? super Event>, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ WebSocketNetworkTransport q;
    public final /* synthetic */ ApolloRequest r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$1(WebSocketNetworkTransport webSocketNetworkTransport, ApolloRequest apolloRequest, Continuation continuation) {
        super(2, continuation);
        this.q = webSocketNetworkTransport;
        this.r = apolloRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebSocketNetworkTransport$execute$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WebSocketNetworkTransport$execute$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            BufferedChannel bufferedChannel = this.q.f;
            StartOperation startOperation = new StartOperation(this.r);
            this.p = 1;
            if (bufferedChannel.z(startOperation, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
