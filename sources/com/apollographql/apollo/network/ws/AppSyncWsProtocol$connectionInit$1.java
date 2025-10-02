package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", l = {40, 42}, m = "connectionInit")
/* loaded from: classes4.dex */
final class AppSyncWsProtocol$connectionInit$1 extends ContinuationImpl {
    public AppSyncWsProtocol p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AppSyncWsProtocol r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSyncWsProtocol$connectionInit$1(AppSyncWsProtocol appSyncWsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = appSyncWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
