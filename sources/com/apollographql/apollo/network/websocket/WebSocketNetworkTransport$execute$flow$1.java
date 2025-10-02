package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.WebSocketNetworkTransport$execute$flow$1", f = "WebSocketNetworkTransport.kt", l = {84}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class WebSocketNetworkTransport$execute$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super ApolloResponse<Operation.Data>>, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ Ref.BooleanRef q;
    public final /* synthetic */ ApolloRequest r;
    public final /* synthetic */ WebSocketNetworkTransport s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$flow$1(Ref.BooleanRef booleanRef, ApolloRequest apolloRequest, WebSocketNetworkTransport webSocketNetworkTransport, Continuation continuation) {
        super(2, continuation);
        this.q = booleanRef;
        this.r = apolloRequest;
        this.s = webSocketNetworkTransport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebSocketNetworkTransport$execute$flow$1 webSocketNetworkTransport$execute$flow$1 = new WebSocketNetworkTransport$execute$flow$1(this.q, this.r, this.s, continuation);
        webSocketNetworkTransport$execute$flow$1.p = obj;
        return webSocketNetworkTransport$execute$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((WebSocketNetworkTransport$execute$flow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Ref.BooleanRef booleanRef = this.q;
        if (booleanRef.d) {
            ApolloRequest.Builder builderA = this.r.a();
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
            builderA.e = uuidRandomUUID;
            builderA.b();
        }
        booleanRef.d = true;
        throw null;
    }
}
