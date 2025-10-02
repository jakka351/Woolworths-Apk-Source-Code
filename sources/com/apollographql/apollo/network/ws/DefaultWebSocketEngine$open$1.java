package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.BufferedChannel;
import okhttp3.WebSocket;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", l = {85}, m = "open")
/* loaded from: classes4.dex */
final class DefaultWebSocketEngine$open$1 extends ContinuationImpl {
    public BufferedChannel p;
    public WebSocket q;
    public /* synthetic */ Object r;
    public final /* synthetic */ DefaultWebSocketEngine s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketEngine$open$1(DefaultWebSocketEngine defaultWebSocketEngine, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = defaultWebSocketEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(null, null, this);
    }
}
