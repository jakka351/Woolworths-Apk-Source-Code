package com.apollographql.apollo.network.ws;

import androidx.lifecycle.d;
import com.apollographql.apollo.network.http.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/DefaultWebSocketEngine;", "Lcom/apollographql/apollo/network/ws/WebSocketEngine;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultWebSocketEngine implements WebSocketEngine {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f13633a;

    public DefaultWebSocketEngine(OkHttpClient okHttpClient) {
        this.f13633a = LazyKt.b(new d(new a(okHttpClient, 1), 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.ws.WebSocketEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, java.util.List r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1 r0 = (com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1 r0 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            okhttp3.WebSocket r6 = r0.q
            kotlinx.coroutines.channels.BufferedChannel r7 = r0.p
            kotlin.ResultKt.b(r8)
            goto L76
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.b(r8)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r2 = 6
            r4 = 0
            kotlinx.coroutines.channels.BufferedChannel r8 = kotlinx.coroutines.channels.ChannelKt.a(r8, r2, r4)
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.CompletableDeferredKt.a()
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder
            r4.<init>()
            r4.h(r6)
            okhttp3.Headers r6 = com.apollographql.apollo.network.OkHttpExtensionsKt.b(r7)
            r4.d(r6)
            okhttp3.Request r6 = new okhttp3.Request
            r6.<init>(r4)
            kotlin.Lazy r7 = r5.f13633a
            java.lang.Object r7 = r7.getD()
            okhttp3.WebSocket$Factory r7 = (okhttp3.WebSocket.Factory) r7
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1 r4 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$webSocket$1
            r4.<init>(r2, r8)
            okhttp3.internal.ws.RealWebSocket r6 = r7.b(r6, r4)
            r0.p = r8
            r0.q = r6
            r0.t = r3
            java.lang.Object r7 = r2.await(r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            r7 = r8
        L76:
            au.com.woolworths.shop.lists.ui.shoppinglist.main.i r8 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.i
            r0 = 10
            r8.<init>(r6, r0)
            r7.j(r8)
            com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3 r8 = new com.apollographql.apollo.network.ws.DefaultWebSocketEngine$open$3
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.DefaultWebSocketEngine.a(java.lang.String, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
