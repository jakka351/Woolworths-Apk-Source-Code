package com.apollographql.apollo.network.websocket;

import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.GraphQLWsProtocol", f = "GraphQLWsProtocol.kt", l = {26}, m = "connectionInit")
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
        GraphQLWsProtocol$connectionInit$1 graphQLWsProtocol$connectionInit$1;
        this.q = obj;
        int i = this.s | Integer.MIN_VALUE;
        this.s = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.s = i - Integer.MIN_VALUE;
            graphQLWsProtocol$connectionInit$1 = this;
        } else {
            graphQLWsProtocol$connectionInit$1 = new GraphQLWsProtocol$connectionInit$1(this.r, this);
        }
        Object obj2 = graphQLWsProtocol$connectionInit$1.q;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = graphQLWsProtocol$connectionInit$1.s;
        if (i2 == 0) {
            ResultKt.b(obj2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", "connection_init");
            graphQLWsProtocol$connectionInit$1.p = linkedHashMap;
            graphQLWsProtocol$connectionInit$1.s = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        LinkedHashMap linkedHashMap2 = graphQLWsProtocol$connectionInit$1.p;
        ResultKt.b(obj2);
        if (obj2 != null) {
            linkedHashMap2.put("payload", obj2);
        }
        return ClientMessageKt.a(linkedHashMap2);
    }
}
