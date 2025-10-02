package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {130}, m = "receiveMessageMap")
/* loaded from: classes4.dex */
final class WsProtocol$receiveMessageMap$1 extends ContinuationImpl {
    public WsProtocol p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WsProtocol r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsProtocol$receiveMessageMap$1(WsProtocol wsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = wsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(this);
    }
}
