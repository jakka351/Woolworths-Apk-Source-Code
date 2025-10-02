package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonWriters;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okio.Buffer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol;", "", "Listener", "Factory", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class WsProtocol {

    /* renamed from: a, reason: collision with root package name */
    public final WebSocketConnection f13640a;
    public final Listener b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Factory;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        WsProtocol a(WebSocketConnection webSocketConnection, Listener listener, CoroutineScope coroutineScope);

        String getName();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/ws/WsProtocol$Listener;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Listener {
        void a(Exception exc);

        void b(String str, Map map);

        void c(Map map);

        void d(String str);

        void e(String str, Map map);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WsFrameType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                WsFrameType wsFrameType = WsFrameType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public WsProtocol(WebSocketConnection webSocketConnection, Listener listener) {
        Intrinsics.h(webSocketConnection, "webSocketConnection");
        Intrinsics.h(listener, "listener");
        this.f13640a = webSocketConnection;
        this.b = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0045 -> B:23:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(com.apollographql.apollo.network.ws.WsProtocol r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof com.apollographql.apollo.network.ws.WsProtocol$run$1
            if (r0 == 0) goto L13
            r0 = r5
            com.apollographql.apollo.network.ws.WsProtocol$run$1 r0 = (com.apollographql.apollo.network.ws.WsProtocol$run$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.WsProtocol$run$1 r0 = new com.apollographql.apollo.network.ws.WsProtocol$run$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.apollographql.apollo.network.ws.WsProtocol r4 = r0.q
            com.apollographql.apollo.network.ws.WsProtocol r2 = r0.p
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L58
            goto L46
        L2b:
            r4 = move-exception
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
        L38:
            r0.p = r4     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L58
            r0.q = r4     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L58
            r0.t = r3     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L58
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Exception -> L4d java.util.concurrent.CancellationException -> L58
            if (r5 != r1) goto L45
            return r1
        L45:
            r2 = r4
        L46:
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L58
            r4.c(r5)     // Catch: java.lang.Exception -> L2b java.util.concurrent.CancellationException -> L58
            r4 = r2
            goto L38
        L4d:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L50:
            com.apollographql.apollo.network.ws.WsProtocol$Listener r5 = r2.b
            r5.a(r4)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L58:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WsProtocol.f(com.apollographql.apollo.network.ws.WsProtocol, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void a() {
        this.f13640a.close();
    }

    public abstract Object b(Continuation continuation);

    public abstract void c(Map map);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: Exception -> 0x0069, TRY_LEAVE, TryCatch #0 {Exception -> 0x0069, blocks: (B:20:0x004d, B:22:0x0066), top: B:27:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0041 -> B:19:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1
            if (r0 == 0) goto L13
            r0 = r8
            com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1 r0 = (com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1 r0 = new com.apollographql.apollo.network.ws.WsProtocol$receiveMessageMap$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.apollographql.apollo.network.ws.WsProtocol r2 = r0.p
            kotlin.ResultKt.b(r8)
            goto L42
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            kotlin.ResultKt.b(r8)
        L34:
            r0.p = r7
            r0.s = r3
            com.apollographql.apollo.network.ws.WebSocketConnection r8 = r7.f13640a
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r2 = r7
        L42:
            java.lang.String r8 = (java.lang.String) r8
            r2.getClass()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r8, r2)
            r2 = 0
            com.apollographql.apollo.api.Adapters$AnyAdapter$1 r4 = com.apollographql.apollo.api.Adapters.g     // Catch: java.lang.Exception -> L69
            com.apollographql.apollo.api.json.BufferedSourceJsonReader r5 = new com.apollographql.apollo.api.json.BufferedSourceJsonReader     // Catch: java.lang.Exception -> L69
            okio.Buffer r6 = new okio.Buffer     // Catch: java.lang.Exception -> L69
            r6.<init>()     // Catch: java.lang.Exception -> L69
            r6.t0(r8)     // Catch: java.lang.Exception -> L69
            r5.<init>(r6)     // Catch: java.lang.Exception -> L69
            com.apollographql.apollo.api.CustomScalarAdapters r8 = com.apollographql.apollo.api.CustomScalarAdapters.g     // Catch: java.lang.Exception -> L69
            java.lang.Object r8 = r4.fromJson(r5, r8)     // Catch: java.lang.Exception -> L69
            boolean r4 = r8 instanceof java.util.Map     // Catch: java.lang.Exception -> L69
            if (r4 == 0) goto L69
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L69
            r2 = r8
        L69:
            if (r2 == 0) goto L34
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WsProtocol.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public Object e(Continuation continuation) {
        return f(this, (ContinuationImpl) continuation);
    }

    public final void g(Map messageMap, WsFrameType frameType) {
        Intrinsics.h(messageMap, "messageMap");
        Intrinsics.h(frameType, "frameType");
        int iOrdinal = frameType.ordinal();
        if (iOrdinal == 0) {
            h(messageMap);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            Buffer buffer = new Buffer();
            JsonWriters.a(new BufferedSinkJsonWriter(buffer), messageMap);
            this.f13640a.a(buffer.p0(buffer.e));
        }
    }

    public final void h(Map messageMap) {
        Intrinsics.h(messageMap, "messageMap");
        Buffer buffer = new Buffer();
        JsonWriters.a(new BufferedSinkJsonWriter(buffer), messageMap);
        this.f13640a.b(buffer.v());
    }

    public abstract void i(ApolloRequest apolloRequest);

    public abstract void j(ApolloRequest apolloRequest);
}
