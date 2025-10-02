package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WsProtocol", f = "WsProtocol.kt", l = {143}, m = "run$suspendImpl")
/* loaded from: classes4.dex */
final class WsProtocol$run$1 extends ContinuationImpl {
    public WsProtocol p;
    public WsProtocol q;
    public /* synthetic */ Object r;
    public final /* synthetic */ WsProtocol s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsProtocol$run$1(WsProtocol wsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = wsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return WsProtocol.f(this.s, this);
    }
}
