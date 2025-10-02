package com.apollographql.apollo.network.ws;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol", f = "GraphQLWsProtocol.kt", l = {54, 61}, m = "connectionInit")
/* loaded from: classes4.dex */
final class GraphQLWsProtocol$connectionInit$1 extends ContinuationImpl {
    public LinkedHashMap p;
    public /* synthetic */ Object q;
    public final /* synthetic */ GraphQLWsProtocol r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLWsProtocol$connectionInit$1(GraphQLWsProtocol graphQLWsProtocol, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = graphQLWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
