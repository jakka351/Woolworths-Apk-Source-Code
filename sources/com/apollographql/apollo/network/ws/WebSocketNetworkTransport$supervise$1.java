package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.network.ws.internal.Message;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", l = {149, 154, 156, 191, 190, 200, 210, 214, 241}, m = "supervise")
/* loaded from: classes.dex */
final class WebSocketNetworkTransport$supervise$1 extends ContinuationImpl {
    public CoroutineScope p;
    public Ref.ObjectRef q;
    public Ref.ObjectRef r;
    public Ref.ObjectRef s;
    public Map t;
    public Message u;
    public WebSocketEngine v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ WebSocketNetworkTransport y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$supervise$1(WebSocketNetworkTransport webSocketNetworkTransport, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.y = webSocketNetworkTransport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return WebSocketNetworkTransport.b(this.y, null, this);
    }
}
