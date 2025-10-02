package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction;
import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.network.NetworkTransport;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/SseNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "SseException", "Listener", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SseNetworkTransport implements NetworkTransport {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectionHandler f9035a;
    public final ApolloSseTransportDynatraceLogger b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/SseNetworkTransport$Listener;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/SseNetworkTransport$SseException;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SseException extends Throwable {
        public ApolloException d;

        public SseException() {
            super((Throwable) null);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.d;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            ApolloException apolloException = this.d;
            if (apolloException != null) {
                return apolloException.getMessage();
            }
            return null;
        }
    }

    public SseNetworkTransport(ConnectionHandler connectionHandler, ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger) {
        Intrinsics.h(connectionHandler, "connectionHandler");
        this.f9035a = connectionHandler;
        this.b = apolloSseTransportDynatraceLogger;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final Flow a(final ApolloRequest apolloRequest) {
        final String string = apolloRequest.e.toString();
        Intrinsics.g(string, "toString(...)");
        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = this.b;
        LinkedHashMap linkedHashMap = apolloSseTransportDynatraceLogger.c;
        DynatraceAction dynatraceActionA = apolloSseTransportDynatraceLogger.f4270a.a("Subscription created");
        dynatraceActionA.d(string);
        linkedHashMap.put(string, dynatraceActionA);
        ConnectionHandler connectionHandler = this.f9035a;
        connectionHandler.getClass();
        BuildersKt.c(connectionHandler.i, null, null, new ConnectionHandler$startOperation$1(connectionHandler, apolloRequest, null), 3);
        final SseException sseException = new SseException();
        final SharedFlowImpl sharedFlowImpl = connectionHandler.q;
        final FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(new SseNetworkTransport$execute$2(), new Flow<ConnectionHandler.MainChannelEvent>() { // from class: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ String e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2", f = "SseNetworkTransport.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.d = flowCollector;
                    this.e = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L4c
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent r6 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent) r6
                        java.lang.String r6 = r6.getF9033a()
                        java.lang.String r2 = r4.e
                        boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
                        if (r6 == 0) goto L4c
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4c
                        return r1
                    L4c:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = sharedFlowImpl.collect(new AnonymousClass2(flowCollector, string), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SseNetworkTransport$execute$5(this, string, null), new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<ApolloResponse<Operation.Data>>() { // from class: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ ApolloRequest e;
                public final /* synthetic */ SseNetworkTransport.SseException f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2", f = "SseNetworkTransport.kt", l = {64}, m = "emit")
                /* renamed from: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object p;
                    public int q;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.p = obj;
                        this.q |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SseNetworkTransport sseNetworkTransport, ApolloRequest apolloRequest, SseNetworkTransport.SseException sseException) {
                    this.d = flowCollector;
                    this.e = apolloRequest;
                    this.f = sseException;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Throwable] */
                /* JADX WARN: Type inference failed for: r9v13 */
                /* JADX WARN: Type inference failed for: r9v14 */
                /* JADX WARN: Type inference failed for: r9v15 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport.SseException {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L30
                        if (r2 != r3) goto L28
                        kotlin.ResultKt.b(r9)
                        goto La0
                    L28:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L30:
                        kotlin.ResultKt.b(r9)
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent r8 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent) r8
                        boolean r9 = r8 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent.Message
                        if (r9 == 0) goto Lad
                        com.apollographql.apollo.api.ApolloRequest r9 = r7.e
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Message r8 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent.Message) r8
                        au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$MainChannel$SsePayloadWrapper r8 = r8.b
                        java.lang.String r2 = "outerPayload"
                        kotlin.jvm.internal.Intrinsics.h(r8, r2)
                        java.lang.String r2 = r8.getSubscriptionId()
                        java.lang.String r8 = r8.getPayload()
                        java.lang.String r4 = "subscriptionId"
                        kotlin.jvm.internal.Intrinsics.h(r2, r4)
                        java.lang.String r4 = "payload"
                        kotlin.jvm.internal.Intrinsics.h(r8, r4)
                        java.util.UUID r2 = java.util.UUID.fromString(r2)
                        okio.Buffer r4 = new okio.Buffer
                        r4.<init>()
                        r4.t0(r8)
                        com.apollographql.apollo.api.json.BufferedSourceJsonReader r8 = com.apollographql.apollo.api.json.JsonReaders.a(r4)
                        com.apollographql.apollo.api.Operation r9 = r9.d     // Catch: java.lang.Throwable -> La4
                        com.apollographql.apollo.api.CustomScalarAdapters r4 = com.apollographql.apollo.api.CustomScalarAdapters.g     // Catch: java.lang.Throwable -> La4
                        java.lang.String r5 = "customScalarAdapters"
                        kotlin.jvm.internal.Intrinsics.h(r4, r5)     // Catch: java.lang.Throwable -> La4
                        r5 = 0
                        com.apollographql.apollo.api.ApolloResponse r9 = com.apollographql.apollo.api.internal.ResponseParser.a(r8, r9, r5, r4, r5)     // Catch: java.lang.Throwable -> L7d
                        r8.close()     // Catch: java.lang.Throwable -> L78
                        goto L79
                    L78:
                        r5 = move-exception
                    L79:
                        r6 = r5
                        r5 = r9
                        r9 = r6
                        goto L86
                    L7d:
                        r9 = move-exception
                        r8.close()     // Catch: java.lang.Throwable -> L82
                        goto L86
                    L82:
                        r8 = move-exception
                        kotlin.ExceptionsKt.a(r9, r8)     // Catch: java.lang.Throwable -> La4
                    L86:
                        if (r9 != 0) goto La3
                        com.apollographql.apollo.api.ApolloResponse$Builder r8 = r5.c()
                        kotlin.jvm.internal.Intrinsics.e(r2)
                        r8.b = r2
                        com.apollographql.apollo.api.ApolloResponse r8 = r8.a()
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r9 = r7.d
                        java.lang.Object r8 = r9.emit(r8, r0)
                        if (r8 != r1) goto La0
                        return r1
                    La0:
                        kotlin.Unit r8 = kotlin.Unit.f24250a
                        return r8
                    La3:
                        throw r9     // Catch: java.lang.Throwable -> La4
                    La4:
                        r8 = move-exception
                        com.apollographql.apollo.exception.ApolloNetworkException r9 = new com.apollographql.apollo.exception.ApolloNetworkException
                        java.lang.String r0 = "Failed to parse GraphQL http network response"
                        r9.<init>(r0, r8)
                        throw r9
                    Lad:
                        boolean r9 = r8 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent.Error
                        if (r9 != 0) goto Lc3
                        boolean r8 = r8 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent.Complete
                        if (r8 == 0) goto Lbd
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "'Complete' event should have been handled upstream!"
                        r8.<init>(r9)
                        throw r8
                    Lbd:
                        kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                        r8.<init>()
                        throw r8
                    Lc3:
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Error r8 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent.Error) r8
                        com.apollographql.apollo.exception.ApolloException r8 = r8.b
                        au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$SseException r9 = r7.f
                        r9.d = r8
                        throw r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector, this, apolloRequest, sseException), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, new SseNetworkTransport$execute$4(this, string, null)));
    }

    public final void b() {
        ConnectionHandler connectionHandler = this.f9035a;
        BuildersKt.c(connectionHandler.i, null, null, new ConnectionHandler$restart$1(connectionHandler, null), 3);
    }

    public final void c() {
        ConnectionHandler connectionHandler = this.f9035a;
        BuildersKt.c(connectionHandler.i, null, null, new ConnectionHandler$start$1(connectionHandler, null), 3);
    }

    public final void d() {
        ConnectionHandler connectionHandler = this.f9035a;
        BuildersKt.c(connectionHandler.i, null, null, new ConnectionHandler$stop$1(connectionHandler, null), 3);
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        ConnectionHandler connectionHandler = this.f9035a;
        BuildersKt.c(connectionHandler.i, null, null, new ConnectionHandler$dispose$1(connectionHandler, null), 3);
    }
}
