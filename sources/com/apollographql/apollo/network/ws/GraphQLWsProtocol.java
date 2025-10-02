package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.DefaultWebSocketPayloadComposer;
import com.apollographql.apollo.network.ws.WsProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "Factory", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GraphQLWsProtocol extends WsProtocol {
    public final Function1 c;
    public final long d;
    public final long e;
    public final WsFrameType f;
    public final CoroutineScope g;
    public final DefaultWebSocketPayloadComposer h;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$1", f = "GraphQLWsProtocol.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$2", f = "GraphQLWsProtocol.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(1, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/GraphQLWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements WsProtocol.Factory {

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1", f = "GraphQLWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new AnonymousClass1(1, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
                return null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                return null;
            }
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final WsProtocol a(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope) {
            Intrinsics.h(webSocketConnection, "webSocketConnection");
            Intrinsics.h(listener, "listener");
            Intrinsics.h(scope, "scope");
            GraphQLWsProtocol$Factory$create$connectionPayload$1 graphQLWsProtocol$Factory$create$connectionPayload$1 = new GraphQLWsProtocol$Factory$create$connectionPayload$1(1, null);
            WsFrameType wsFrameType = WsFrameType.d;
            return new GraphQLWsProtocol(graphQLWsProtocol$Factory$create$connectionPayload$1, webSocketConnection, listener, scope, new DefaultWebSocketPayloadComposer());
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final String getName() {
            return "graphql-transport-ws";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLWsProtocol(Function1 function1, WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope, DefaultWebSocketPayloadComposer defaultWebSocketPayloadComposer) {
        super(webSocketConnection, listener);
        WsFrameType wsFrameType = WsFrameType.d;
        Intrinsics.h(webSocketConnection, "webSocketConnection");
        Intrinsics.h(listener, "listener");
        Intrinsics.h(scope, "scope");
        this.c = function1;
        this.d = 10000L;
        this.e = -1L;
        this.f = wsFrameType;
        this.g = scope;
        this.h = defaultWebSocketPayloadComposer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (kotlinx.coroutines.TimeoutKt.b(r6.d, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1 r0 = (com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1 r0 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            goto L7e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.util.LinkedHashMap r2 = r0.p
            kotlin.ResultKt.b(r7)
            goto L5d
        L3a:
            kotlin.ResultKt.b(r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r2 = "type"
            java.lang.String r5 = "connection_init"
            r7.<init>(r2, r5)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r7}
            java.util.LinkedHashMap r2 = kotlin.collections.MapsKt.l(r7)
            r0.p = r2
            r0.s = r4
            kotlin.jvm.functions.Function1 r7 = r6.c
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1 r7 = (com.apollographql.apollo.network.ws.GraphQLWsProtocol$Factory$create$connectionPayload$1) r7
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L5d
            goto L7d
        L5d:
            java.util.Map r7 = (java.util.Map) r7
            if (r7 == 0) goto L66
            java.lang.String r4 = "payload"
            r2.put(r4, r7)
        L66:
            com.apollographql.apollo.network.ws.WsFrameType r7 = r6.f
            r6.g(r2, r7)
            com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2 r7 = new com.apollographql.apollo.network.ws.GraphQLWsProtocol$connectionInit$2
            r2 = 0
            r7.<init>(r6, r2)
            r0.p = r2
            r0.s = r3
            long r2 = r6.d
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.b(r2, r7, r0)
            if (r7 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void c(Map messageMap) {
        Intrinsics.h(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        boolean zC = Intrinsics.c(obj, "next");
        WsProtocol.Listener listener = this.b;
        if (zC) {
            Object obj2 = messageMap.get("id");
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = messageMap.get("payload");
            Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            listener.e((String) obj2, (Map) obj3);
            return;
        }
        if (Intrinsics.c(obj, "error")) {
            Object obj4 = messageMap.get("id");
            Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.String");
            listener.e((String) obj4, MapsKt.i(new Pair("errors", messageMap.get("payload"))));
            Object obj5 = messageMap.get("id");
            Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.String");
            listener.d((String) obj5);
            return;
        }
        if (Intrinsics.c(obj, "complete")) {
            Object obj6 = messageMap.get("id");
            Intrinsics.f(obj6, "null cannot be cast to non-null type kotlin.String");
            listener.d((String) obj6);
        } else if (Intrinsics.c(obj, "ping")) {
            k();
        } else {
            Intrinsics.c(obj, "pong");
        }
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final Object e(Continuation continuation) {
        if (this.e > 0) {
            BuildersKt.c(this.g, null, null, new GraphQLWsProtocol$run$2(this, null), 3);
        }
        Object objF = WsProtocol.f(this, (ContinuationImpl) continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void i(ApolloRequest request) {
        Intrinsics.h(request, "request");
        Pair pair = new Pair("type", "subscribe");
        Pair pair2 = new Pair("id", request.e.toString());
        this.h.getClass();
        g(MapsKt.j(pair, pair2, new Pair("payload", DefaultHttpRequestComposer.Companion.a(request))), this.f);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void j(ApolloRequest request) {
        Intrinsics.h(request, "request");
        g(MapsKt.j(new Pair("type", "complete"), new Pair("id", request.e.toString())), this.f);
    }

    public final void k() {
        g(MapsKt.l(new Pair("type", "pong")), this.f);
    }
}
