package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.feature.shop.onboarding.sdui.ui.f;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.exception.ApolloException;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler;", "", "MainChannelEvent", "SubscriptionsTracker", "Listener", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ConnectionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ChannelFactory f9030a;
    public final SseTransportMessage.MessageType b;
    public final ApolloSseTransportDynatraceLogger c;
    public final int d;
    public final long e;
    public final long f;
    public final Gson g;
    public final SubscriptionsTracker h;
    public final ContextScope i;
    public final Lazy j;
    public ChannelFactory.MainChannel k;
    public SseTransportMessage.Response.ConnectionData l;
    public Job m;
    public final MutexImpl n;
    public boolean o;
    public final SharedFlowImpl p;
    public final SharedFlowImpl q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$Listener;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Listener {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "", "Message", "Complete", "Error", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Complete;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Error;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Message;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface MainChannelEvent {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Complete;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete implements MainChannelEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f9031a;

            public Complete(String subscriptionId) {
                Intrinsics.h(subscriptionId, "subscriptionId");
                this.f9031a = subscriptionId;
            }

            @Override // au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent
            /* renamed from: a, reason: from getter */
            public final String getF9033a() {
                return this.f9031a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Complete) && Intrinsics.c(this.f9031a, ((Complete) obj).f9031a);
            }

            public final int hashCode() {
                return this.f9031a.hashCode();
            }

            public final String toString() {
                return YU.a.h("Complete(subscriptionId=", this.f9031a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Error;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements MainChannelEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f9032a;
            public final ApolloException b;

            public Error(String str, ApolloException apolloException) {
                this.f9032a = str;
                this.b = apolloException;
            }

            @Override // au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent
            /* renamed from: a, reason: from getter */
            public final String getF9033a() {
                return this.f9032a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.f9032a, error.f9032a) && Intrinsics.c(this.b, error.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f9032a.hashCode() * 31);
            }

            public final String toString() {
                return "Error(subscriptionId=" + this.f9032a + ", error=" + this.b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent$Message;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Message implements MainChannelEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f9033a;
            public final ChannelFactory.MainChannel.SsePayloadWrapper b;

            public Message(String subscriptionId, ChannelFactory.MainChannel.SsePayloadWrapper payload) {
                Intrinsics.h(subscriptionId, "subscriptionId");
                Intrinsics.h(payload, "payload");
                this.f9033a = subscriptionId;
                this.b = payload;
            }

            @Override // au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.MainChannelEvent
            /* renamed from: a, reason: from getter */
            public final String getF9033a() {
                return this.f9033a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Message)) {
                    return false;
                }
                Message message = (Message) obj;
                return Intrinsics.c(this.f9033a, message.f9033a) && Intrinsics.c(this.b, message.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f9033a.hashCode() * 31);
            }

            public final String toString() {
                return "Message(subscriptionId=" + this.f9033a + ", payload=" + this.b + ")";
            }
        }

        /* renamed from: a */
        String getF9033a();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$SubscriptionsTracker;", "", "sse-protocol"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubscriptionsTracker {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentHashMap f9034a = new ConcurrentHashMap();
    }

    public ConnectionHandler(ChannelFactory channelFactory, String sideChannelUrl, SseTransportMessage.MessageType messageType, ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger, Gson gson) {
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        DefaultIoScheduler ioDispatchers = DefaultIoScheduler.f;
        Intrinsics.h(sideChannelUrl, "sideChannelUrl");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(ioDispatchers, "ioDispatchers");
        this.f9030a = channelFactory;
        this.b = messageType;
        this.c = apolloSseTransportDynatraceLogger;
        this.d = 3;
        this.e = 30000L;
        this.f = 5000L;
        this.g = gson;
        this.h = new SubscriptionsTracker();
        this.i = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) SupervisorKt.b(), ioDispatchers));
        this.j = LazyKt.b(new f(1, this, sideChannelUrl));
        this.n = MutexKt.a();
        this.o = true;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, Integer.MAX_VALUE, BufferOverflow.d, 1);
        this.p = sharedFlowImplB;
        this.q = sharedFlowImplB;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$SubscriptionsTracker r0 = r7.h
            boolean r1 = r8 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$reestablishMainChannel$1
            if (r1 == 0) goto L15
            r1 = r8
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$reestablishMainChannel$1 r1 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$reestablishMainChannel$1) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$reestablishMainChannel$1 r1 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$reestablishMainChannel$1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.t
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L42
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            java.util.Iterator r0 = r1.q
            java.lang.Object r3 = r1.p
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r3 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response.ConnectionData) r3
            kotlin.ResultKt.b(r8)
            goto L83
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r0 = r1.p
            java.util.Map r0 = (java.util.Map) r0
            kotlin.ResultKt.b(r8)
            goto L78
        L42:
            kotlin.ResultKt.b(r8)
            java.util.concurrent.ConcurrentHashMap r8 = r0.f9034a
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L52
            java.util.Map r8 = kotlin.collections.MapsKt.d()
            goto L5e
        L52:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r8)
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r3)
            kotlin.jvm.internal.Intrinsics.e(r8)
        L5e:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L65
            goto La2
        L65:
            java.util.concurrent.ConcurrentHashMap r0 = r0.f9034a
            r0.clear()
            r1.p = r8
            r1.t = r5
            java.lang.Object r0 = r7.c(r5, r1)
            if (r0 != r2) goto L75
            goto La1
        L75:
            r6 = r0
            r0 = r8
            r8 = r6
        L78:
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r8 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response.ConnectionData) r8
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r3 = r8
        L83:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto La2
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getValue()
            com.apollographql.apollo.api.ApolloRequest r8 = (com.apollographql.apollo.api.ApolloRequest) r8
            r1.p = r3
            r1.q = r0
            r1.t = r4
            java.lang.Object r8 = r7.f(r8, r3, r1)
            if (r8 != r2) goto L83
        La1:
            return r2
        La2:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.a(au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (((kotlinx.coroutines.JobSupport) r8).join(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$closeMainChannel$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$closeMainChannel$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$closeMainChannel$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$closeMainChannel$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$closeMainChannel$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.ResultKt.b(r9)
            goto L61
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            boolean r8 = r0.p
            kotlin.ResultKt.b(r9)
            goto L4c
        L3b:
            kotlin.ResultKt.b(r9)
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$MainChannel r9 = r7.k
            if (r9 == 0) goto L4c
            r0.p = r8
            r0.s = r5
            r9.close()
            if (r3 != r1) goto L4c
            goto L60
        L4c:
            r7.k = r6
            if (r8 != 0) goto L52
            r7.l = r6
        L52:
            kotlinx.coroutines.Job r8 = r7.m
            if (r8 == 0) goto L61
            r0.s = r4
            kotlinx.coroutines.JobSupport r8 = (kotlinx.coroutines.JobSupport) r8
            java.lang.Object r8 = r8.join(r0)
            if (r8 != r1) goto L61
        L60:
            return r1
        L61:
            r7.m = r6
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.b(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:29:0x0072, B:33:0x0082, B:36:0x0088), top: B:41:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v0, types: [au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$getConnectionData$1
            if (r0 == 0) goto L13
            r0 = r9
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$getConnectionData$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$getConnectionData$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$getConnectionData$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$getConnectionData$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.p
            kotlin.jvm.internal.Ref$BooleanRef r1 = r0.r
            kotlinx.coroutines.sync.Mutex r0 = r0.q
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L72
        L31:
            r8 = move-exception
            goto L91
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            boolean r8 = r0.p
            kotlinx.coroutines.sync.Mutex r2 = r0.q
            kotlin.ResultKt.b(r9)
            r9 = r2
            goto L56
        L44:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.sync.MutexImpl r9 = r7.n
            r0.q = r9
            r0.p = r8
            r0.u = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L56
            goto L6d
        L56:
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r6 = r7.l     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L81
            r0.q = r9     // Catch: java.lang.Throwable -> L7e
            r0.r = r2     // Catch: java.lang.Throwable -> L7e
            r0.p = r8     // Catch: java.lang.Throwable -> L7e
            r0.u = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r7.e(r0)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r1 = r0
            r0 = r9
            r9 = r1
            r1 = r2
        L72:
            r2 = r9
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r2 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response.ConnectionData) r2     // Catch: java.lang.Throwable -> L31
            r7.l = r2     // Catch: java.lang.Throwable -> L31
            r1.d = r4     // Catch: java.lang.Throwable -> L31
            r6 = r9
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r6 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response.ConnectionData) r6     // Catch: java.lang.Throwable -> L31
            r2 = r1
            goto L82
        L7e:
            r8 = move-exception
            r0 = r9
            goto L91
        L81:
            r0 = r9
        L82:
            boolean r9 = r2.d     // Catch: java.lang.Throwable -> L31
            if (r9 != 0) goto L88
            if (r8 == 0) goto L8d
        L88:
            r7.m = r5     // Catch: java.lang.Throwable -> L31
            r7.d(r6, r8)     // Catch: java.lang.Throwable -> L31
        L8d:
            r0.c(r5)
            return r6
        L91:
            r0.c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.c(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void d(SseTransportMessage.Response.ConnectionData connectionData, boolean z) {
        final ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1 connectionHandler$openMainChannel$$inlined$filterIsInstance$1 = new ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ConnectionHandler$openMainChannel$sseFlow$5(), FlowKt.A(new ConnectionHandler$openMainChannel$sseFlow$4(), new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ConnectionHandler$openMainChannel$sseFlow$3(this, null), new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ConnectionHandler$openMainChannel$sseFlow$2(this, z, null), FlowKt.B(new ConnectionHandler$openMainChannel$sseFlow$1(this, connectionData, null)))))));
        final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ConnectionHandler$openMainChannel$sseFlow$7(this, null), new Flow<ChannelFactory.MainChannel.SsePayloadWrapper>() { // from class: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ ConnectionHandler e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2", f = "ConnectionHandler.kt", l = {50}, m = "emit")
                /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, ConnectionHandler connectionHandler) {
                    this.d = flowCollector;
                    this.e = connectionHandler;
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
                        boolean r0 = r6 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L4b
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$MainChannel$SseEvent$SsePayload r5 = (au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel.SseEvent.SsePayload) r5
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler r6 = r4.e
                        com.google.gson.Gson r6 = r6.g
                        java.lang.String r5 = r5.f9038a
                        java.lang.Class<au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$MainChannel$SsePayloadWrapper> r2 = au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel.SsePayloadWrapper.class
                        java.lang.Object r5 = r6.d(r2, r5)
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = connectionHandler$openMainChannel$$inlined$filterIsInstance$1.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        });
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ConnectionHandler$openMainChannel$sseFlow$9(this, null), new Flow<MainChannelEvent>() { // from class: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2", f = "ConnectionHandler.kt", l = {58}, m = "emit")
                /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.d = flowCollector;
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
                        boolean r0 = r6 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L68
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$MainChannel$SsePayloadWrapper r5 = (au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel.SsePayloadWrapper) r5
                        java.lang.String r6 = r5.getType()
                        java.lang.String r2 = "complete"
                        boolean r6 = kotlin.jvm.internal.Intrinsics.c(r6, r2)
                        if (r6 == 0) goto L4a
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Complete r6 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Complete
                        java.lang.String r5 = r5.getSubscriptionId()
                        r6.<init>(r5)
                        goto L5b
                    L4a:
                        java.util.List r6 = r5.getActiveSubscriptions()
                        if (r6 != 0) goto L5a
                        au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Message r6 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Message
                        java.lang.String r2 = r5.getSubscriptionId()
                        r6.<init>(r2, r5)
                        goto L5b
                    L5a:
                        r6 = 0
                    L5b:
                        if (r6 == 0) goto L68
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r5 = r4.d
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L68
                        return r1
                    L68:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }), new ConnectionHandler$openMainChannel$sseFlow$10(this, null));
        ConnectionHandler$openMainChannel$reconnectFunc$1 connectionHandler$openMainChannel$reconnectFunc$1 = new ConnectionHandler$openMainChannel$reconnectFunc$1(this, flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, null);
        this.m = FlowKt.E(new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, connectionHandler$openMainChannel$reconnectFunc$1), new ConnectionHandler$openMainChannel$1(connectionHandler$openMainChannel$reconnectFunc$1, null)), this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$sendInit$1
            if (r2 == 0) goto L18
            r2 = r1
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$sendInit$1 r2 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$sendInit$1) r2
            int r3 = r2.r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.r = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$sendInit$1 r2 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$sendInit$1
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r8.r
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$MessageType r9 = r0.b
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            kotlin.ResultKt.b(r1)
            goto L64
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            kotlin.ResultKt.b(r1)
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Request r10 = new au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Request
            java.lang.String r11 = r9.f9042a
            r15 = 14
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            kotlin.Lazy r1 = r0.j
            java.lang.Object r1 = r1.getD()
            r3 = r1
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$SideChannel r3 = (au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.SideChannel) r3
            au.com.woolworths.graphql.subscriptions.sse.a r7 = new au.com.woolworths.graphql.subscriptions.sse.a
            r1 = 0
            r7.<init>(r10, r1)
            r8.r = r4
            int r4 = r0.d
            long r5 = r0.f
            java.lang.Object r1 = au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt.a(r3, r4, r5, r7, r8)
            if (r1 != r2) goto L64
            return r2
        L64:
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response r1 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response) r1
            if (r1 == 0) goto L6d
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r2 = r1.getConnectionData()
            goto L6e
        L6d:
            r2 = 0
        L6e:
            java.lang.String r3 = "'"
            if (r2 == 0) goto L93
            java.lang.String r2 = r1.getType()
            java.lang.String r4 = r9.b
            boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
            if (r2 == 0) goto L83
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r1 = r1.getConnectionData()
            return r1
        L83:
            com.apollographql.apollo.exception.DefaultApolloException r2 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r1 = r1.getType()
            java.lang.String r4 = "Init response: Wrong message type '"
            java.lang.String r1 = YU.a.h(r4, r1, r3)
            r2.<init>(r1)
            throw r2
        L93:
            com.apollographql.apollo.exception.DefaultApolloException r2 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Init response: Connection data not found '"
            r4.<init>(r5)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object f(ApolloRequest request, SseTransportMessage.Response.ConnectionData connectionData, ContinuationImpl continuationImpl) {
        SubscriptionsTracker subscriptionsTracker = this.h;
        synchronized (subscriptionsTracker) {
            Intrinsics.h(request, "request");
            subscriptionsTracker.f9034a.put(request.e, request);
        }
        String strA = connectionData.getConnectionId();
        Object objA = ChannelFactoryKt.a((ChannelFactory.SideChannel) this.j.getD(), this.d, this.f, new a(SseTransportMessage.Request.Companion.a(request.e, strA, this.b, request.d, CustomScalarAdapters.g), 2), continuationImpl);
        if (objA == CoroutineSingletons.d) {
            return objA;
        }
        return Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.apollographql.apollo.api.ApolloRequest r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$stopSubscription$1
            if (r3 == 0) goto L1a
            r3 = r2
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$stopSubscription$1 r3 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$stopSubscription$1) r3
            int r4 = r3.s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.s = r4
        L18:
            r9 = r3
            goto L20
        L1a:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$stopSubscription$1 r3 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$stopSubscription$1
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r9.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r9.s
            kotlin.Unit r10 = kotlin.Unit.f24250a
            r11 = 2
            r5 = 1
            if (r4 == 0) goto L43
            if (r4 == r5) goto L3d
            if (r4 != r11) goto L35
            kotlin.ResultKt.b(r2)
            goto Lb7
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            com.apollographql.apollo.api.ApolloRequest r1 = r9.p
            kotlin.ResultKt.b(r2)
            goto L76
        L43:
            kotlin.ResultKt.b(r2)
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Request r12 = new au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Request
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$MessageType r2 = r0.b
            java.lang.String r13 = r2.d
            java.util.UUID r14 = r1.e
            r17 = 12
            r18 = 0
            r15 = 0
            r16 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            kotlin.Lazy r2 = r0.j
            java.lang.Object r2 = r2.getD()
            r4 = r2
            au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory$SideChannel r4 = (au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.SideChannel) r4
            au.com.woolworths.graphql.subscriptions.sse.a r8 = new au.com.woolworths.graphql.subscriptions.sse.a
            r2 = 1
            r8.<init>(r12, r2)
            r9.p = r1
            r9.s = r5
            int r5 = r0.d
            long r6 = r0.f
            java.lang.Object r2 = au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactoryKt.a(r4, r5, r6, r8, r9)
            if (r2 != r3) goto L76
            goto Lb6
        L76:
            java.util.UUID r1 = r1.e
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            r2 = 0
            r9.p = r2
            r9.s = r11
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$SubscriptionsTracker r2 = r0.h
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = r2.f9034a
            java.util.UUID r4 = java.util.UUID.fromString(r1)
            r2.remove(r4)
            int r2 = r2.size()
            au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger r4 = r0.c
            if (r4 == 0) goto La9
            au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction r4 = r4.b
            if (r4 == 0) goto La9
            java.lang.String r5 = "Subscription destroyed - "
            java.lang.String r1 = r5.concat(r1)
            r4.c(r1)
        La9:
            if (r2 != 0) goto Lb3
            r1 = 0
            java.lang.Object r1 = r0.b(r1, r9)
            if (r1 != r3) goto Lb3
            goto Lb4
        Lb3:
            r1 = r10
        Lb4:
            if (r1 != r3) goto Lb7
        Lb6:
            return r3
        Lb7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler.g(com.apollographql.apollo.api.ApolloRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
