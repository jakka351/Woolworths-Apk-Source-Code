package com.apollographql.apollo.network.ws;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", l = {31, 38}, m = "connectionInit")
/* loaded from: classes4.dex */
final class SubscriptionWsProtocol$connectionInit$1 extends ContinuationImpl {
    public LinkedHashMap p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SubscriptionWsProtocol r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionWsProtocol$connectionInit$1(SubscriptionWsProtocol subscriptionWsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = subscriptionWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
