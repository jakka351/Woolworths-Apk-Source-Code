package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.annotations.ApolloExperimental;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.NetworkTransport;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@ApolloExperimental
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "Builder", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebSocketNetworkTransport implements NetworkTransport {

    @ApolloExperimental
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/websocket/WebSocketNetworkTransport$Builder;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final Flow a(ApolloRequest apolloRequest) {
        return FlowKt.c(FlowKt.d(new WebSocketNetworkTransport$execute$flow$1(new Ref.BooleanRef(), apolloRequest, this, null)), Integer.MAX_VALUE);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        throw null;
    }
}
