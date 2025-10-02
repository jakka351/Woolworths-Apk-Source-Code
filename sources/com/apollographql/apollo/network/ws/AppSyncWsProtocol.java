package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.network.ws.WsProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol;", "Lcom/apollographql/apollo/network/ws/WsProtocol;", "Factory", "Companion", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppSyncWsProtocol extends WsProtocol {
    public Map c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$1", f = "AppSyncWsProtocol.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$1, reason: invalid class name */
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

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$2", f = "AppSyncWsProtocol.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Object>>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Companion;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/AppSyncWsProtocol$Factory;", "Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements WsProtocol.Factory {

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1", f = "AppSyncWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$1, reason: invalid class name */
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

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2", f = "AppSyncWsProtocol.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.apollographql.apollo.network.ws.AppSyncWsProtocol$Factory$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Map<String, ? extends Object>>, Object> {
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                throw null;
            }
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final WsProtocol a(WebSocketConnection webSocketConnection, WsProtocol.Listener listener, CoroutineScope scope) {
            Intrinsics.h(webSocketConnection, "webSocketConnection");
            Intrinsics.h(listener, "listener");
            Intrinsics.h(scope, "scope");
            Intrinsics.h(null, "connectionPayload");
            new AppSyncWsProtocol(webSocketConnection, listener);
            throw null;
        }

        @Override // com.apollographql.apollo.network.ws.WsProtocol.Factory
        public final String getName() {
            return "graphql-ws";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.apollographql.apollo.network.ws.WsProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1 r0 = (com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L1a
        L13:
            com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1 r0 = new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L53
            r5 = 2
            if (r2 == r4) goto L35
            if (r2 != r5) goto L2d
            kotlin.ResultKt.b(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            com.apollographql.apollo.network.ws.AppSyncWsProtocol r2 = r0.p
            kotlin.ResultKt.b(r7)
            java.util.Map r7 = (java.util.Map) r7
            r2.c = r7
            com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2 r7 = new com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$2
            r7.<init>(r6, r3)
            r0.p = r3
            r0.s = r5
            r2 = 0
            java.lang.Object r7 = kotlinx.coroutines.TimeoutKt.b(r2, r7, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L53:
            kotlin.ResultKt.b(r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r1 = "type"
            java.lang.String r2 = "connection_init"
            r7.<init>(r1, r2)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r7}
            java.util.LinkedHashMap r7 = kotlin.collections.MapsKt.l(r7)
            r6.h(r7)
            r0.p = r6
            r0.s = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.AppSyncWsProtocol.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void c(Map messageMap) {
        Intrinsics.h(messageMap, "messageMap");
        Object obj = messageMap.get("type");
        boolean zC = Intrinsics.c(obj, "data");
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
            if (obj4 instanceof String) {
                listener.b((String) obj4, (Map) messageMap.get("payload"));
                return;
            } else {
                listener.c((Map) messageMap.get("payload"));
                return;
            }
        }
        if (!Intrinsics.c(obj, "complete")) {
            Intrinsics.c(obj, "ka");
            return;
        }
        Object obj5 = messageMap.get("id");
        Intrinsics.f(obj5, "null cannot be cast to non-null type kotlin.String");
        listener.d((String) obj5);
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void i(ApolloRequest request) {
        Intrinsics.h(request, "request");
        NullableAdapter nullableAdapter = Adapters.m;
        Map mapA = DefaultHttpRequestComposer.Companion.a(request);
        CustomScalarAdapters customScalarAdapters = CustomScalarAdapters.g;
        Intrinsics.h(nullableAdapter, "<this>");
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Buffer buffer = new Buffer();
        nullableAdapter.toJson(new BufferedSinkJsonWriter(buffer), customScalarAdapters, mapA);
        h(MapsKt.j(new Pair("type", "start"), new Pair("id", request.e.toString()), new Pair("payload", MapsKt.j(new Pair("data", buffer.v()), new Pair("extensions", MapsKt.i(new Pair("authorization", this.c)))))));
    }

    @Override // com.apollographql.apollo.network.ws.WsProtocol
    public final void j(ApolloRequest request) {
        Intrinsics.h(request, "request");
        h(MapsKt.j(new Pair("type", "stop"), new Pair("id", request.e.toString())));
    }
}
