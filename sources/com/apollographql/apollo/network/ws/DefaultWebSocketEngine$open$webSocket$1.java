package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.BufferedChannel;
import okhttp3.WebSocketListener;
import okhttp3.internal.ws.RealWebSocket;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/apollographql/apollo/network/ws/DefaultWebSocketEngine$open$webSocket$1", "Lokhttp3/WebSocketListener;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultWebSocketEngine$open$webSocket$1 extends WebSocketListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f13635a;
    public final /* synthetic */ BufferedChannel b;

    public DefaultWebSocketEngine$open$webSocket$1(CompletableDeferred completableDeferred, BufferedChannel bufferedChannel) {
        this.f13635a = completableDeferred;
        this.b = bufferedChannel;
    }

    public final void a(RealWebSocket webSocket, String reason) {
        Intrinsics.h(webSocket, "webSocket");
        Intrinsics.h(reason, "reason");
        this.b.y(null);
    }
}
