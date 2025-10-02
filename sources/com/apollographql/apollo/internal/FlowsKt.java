package com.apollographql.apollo.internal;

import com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlowsKt {
    public static final Flow a(WebSocketNetworkTransport$execute$$inlined$filter$1 webSocketNetworkTransport$execute$$inlined$filter$1, Function3 function3) {
        return FlowKt.B(new FlowsKt$transformWhile$1(webSocketNetworkTransport$execute$$inlined$filter$1, function3, null));
    }
}
