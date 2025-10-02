package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/SubscriptionWsProtocolAdapter;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class SubscriptionWsProtocolAdapter extends WsProtocol {
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final Object b(Continuation continuation) {
        throw null;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void c(Map messageMap) {
        Intrinsics.h(messageMap, "messageMap");
        throw null;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void i(ApolloRequest request) {
        Intrinsics.h(request, "request");
        throw null;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void j(ApolloRequest request) {
        Intrinsics.h(request, "request");
        throw null;
    }
}
