package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.internal.DeferredJsonMerger;
import com.apollographql.apollo.internal.FlowsKt;
import com.apollographql.apollo.network.NetworkTransport;
import com.apollographql.apollo.network.ws.WsProtocol;
import com.apollographql.apollo.network.ws.internal.Dispose;
import com.apollographql.apollo.network.ws.internal.GeneralError;
import com.apollographql.apollo.network.ws.internal.NetworkError;
import com.apollographql.apollo.network.ws.internal.OperationComplete;
import com.apollographql.apollo.network.ws.internal.OperationError;
import com.apollographql.apollo.network.ws.internal.OperationResponse;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport;", "Lcom/apollographql/apollo/network/NetworkTransport;", "Builder", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WebSocketNetworkTransport implements NetworkTransport {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f13637a;
    public final ArrayList b;
    public final WebSocketEngine c;
    public final long d;
    public final WsProtocol.Factory e;
    public final BufferedChannel f = ChannelKt.a(Integer.MAX_VALUE, 6, null);
    public final SharedFlowImpl g;
    public final SharedFlow h;
    public final StateFlow i;
    public final WebSocketNetworkTransport$listener$1 j;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1", f = "WebSocketNetworkTransport.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public /* synthetic */ Object q;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = WebSocketNetworkTransport.this.new AnonymousClass1(continuation);
            anonymousClass1.q = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.q;
                this.p = 1;
                if (WebSocketNetworkTransport.b(WebSocketNetworkTransport.this, coroutineScope, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/apollographql/apollo/network/ws/WebSocketNetworkTransport$Builder;", "", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Function1 f13638a;
        public DefaultWebSocketEngine b;

        public final void a(String str) {
            this.f13638a = new WebSocketNetworkTransport$Builder$serverUrl$1$1(str, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1] */
    public WebSocketNetworkTransport(Function1 function1, ArrayList arrayList, WebSocketEngine webSocketEngine, long j, WsProtocol.Factory factory) {
        this.f13637a = function1;
        this.b = arrayList;
        this.c = webSocketEngine;
        this.d = j;
        this.e = factory;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(0, Integer.MAX_VALUE, BufferOverflow.d);
        this.g = sharedFlowImplA;
        this.h = FlowKt.a(sharedFlowImplA);
        this.i = sharedFlowImplA.g();
        BuildersKt.c(CoroutineScopeKt.a(Dispatchers.f24691a.A(1)), null, null, new AnonymousClass1(null), 3);
        this.j = new WsProtocol.Listener() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$listener$1
            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void a(Exception exc) {
                this.f13639a.f.k(new NetworkError(exc));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void b(String str, Map map) {
                this.f13639a.f.k(new OperationError(str, map));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void c(Map map) {
                this.f13639a.f.k(new GeneralError(map));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void d(String str) {
                this.f13639a.f.k(new OperationComplete(str));
            }

            @Override // com.apollographql.apollo.network.ws.WsProtocol.Listener
            public final void e(String str, Map map) {
                this.f13639a.f.k(new OperationResponse(str, map));
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:208|75|76|198|77|78|186|79|206|80|(1:218)(16:83|196|84|85|(4:184|88|(7:194|91|92|190|93|(7:214|95|104|178|105|106|(1:219)(16:109|182|110|111|192|112|(1:220)|115|116|156|(0)(0)|13|167|(0)(0)|174|175))(1:96)|89)|213)|87|188|101|102|204|103|104|178|105|106|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:109|(1:182)|110|111|192|112|(1:220)|115|116|156|(0)(0)|13|167|(0)(0)|174|175) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:83|(1:196)|84|85|(4:184|88|(7:194|91|92|190|93|(7:214|95|104|178|105|106|(1:219)(16:109|182|110|111|192|112|(1:220)|115|116|156|(0)(0)|13|167|(0)(0)|174|175))(1:96)|89)|213)|87|188|101|102|204|103|104|178|105|106|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:83|196|84|85|(4:184|88|(7:194|91|92|190|93|(7:214|95|104|178|105|106|(1:219)(16:109|182|110|111|192|112|(1:220)|115|116|156|(0)(0)|13|167|(0)(0)|174|175))(1:96)|89)|213)|87|188|101|102|204|103|104|178|105|106|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:194|91|92|190|93|(7:214|95|104|178|105|106|(1:219)(16:109|182|110|111|192|112|(1:220)|115|116|156|(0)(0)|13|167|(0)(0)|174|175))(1:96)|89) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x033f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0340, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0384, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0385, code lost:
    
        r9 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0387, code lost:
    
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x038d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x038e, code lost:
    
        r9 = r19;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0393, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0394, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03a4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03a5, code lost:
    
        r2 = r9;
        r9 = r6;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a8, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03a9, code lost:
    
        r15 = r14;
        r7 = r18;
        r21 = r12;
        r13 = r2;
        r2 = r3;
        r12 = r4;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03b6, code lost:
    
        r2 = r9;
        r9 = r6;
        r6 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03bc, code lost:
    
        r18 = r9;
        r9 = r6;
        r6 = r18;
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03f4, code lost:
    
        r5 = r13;
        r0 = r15;
        r21 = r3;
        r3 = r2;
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02b2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b3, code lost:
    
        r11 = r24;
        r9 = r6;
        r12 = r14;
        r6 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:87:0x028c, B:184:0x028f], limit reached: 216 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.lang.Object, java.util.concurrent.CancellationException, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x041c -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x043c -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x0459 -> B:13:0x004d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x047a -> B:167:0x047d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01f2 -> B:175:0x04b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023b -> B:41:0x0196). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.apollographql.apollo.network.ws.WebSocketNetworkTransport r23, kotlinx.coroutines.CoroutineScope r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport.b(com.apollographql.apollo.network.ws.WebSocketNetworkTransport, kotlinx.coroutines.CoroutineScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void c(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        WsProtocol wsProtocol = (WsProtocol) objectRef.d;
        if (wsProtocol != null) {
            wsProtocol.a();
        }
        objectRef.d = null;
        Job job = (Job) objectRef2.d;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        objectRef2.d = null;
        Job job2 = (Job) objectRef3.d;
        if (job2 != null) {
            job2.cancel((CancellationException) null);
        }
        objectRef3.d = null;
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final Flow a(ApolloRequest apolloRequest) {
        final DeferredJsonMerger deferredJsonMerger = new DeferredJsonMerger();
        final WebSocketNetworkTransport$execute$$inlined$map$1 webSocketNetworkTransport$execute$$inlined$map$1 = new WebSocketNetworkTransport$execute$$inlined$map$1(FlowsKt.a(new WebSocketNetworkTransport$execute$$inlined$filter$1(FlowKt.H(this.h, new WebSocketNetworkTransport$execute$1(this, apolloRequest, null)), apolloRequest), new WebSocketNetworkTransport$execute$3(apolloRequest, null)), apolloRequest, deferredJsonMerger, this);
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(new Flow<ApolloResponse<Operation.Data>>() { // from class: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector d;
                public final /* synthetic */ DeferredJsonMerger e;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, DeferredJsonMerger deferredJsonMerger) {
                    this.d = flowCollector;
                    this.e = deferredJsonMerger;
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
                        boolean r0 = r6 instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.q = r1
                        goto L18
                    L13:
                        com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1 r0 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.p
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                        int r2 = r0.q
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.ResultKt.b(r6)
                        goto L46
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.ResultKt.b(r6)
                        r6 = r5
                        com.apollographql.apollo.api.ApolloResponse r6 = (com.apollographql.apollo.api.ApolloResponse) r6
                        com.apollographql.apollo.internal.DeferredJsonMerger r6 = r4.e
                        boolean r6 = r6.f
                        if (r6 != 0) goto L46
                        r0.q = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.Unit r5 = kotlin.Unit.f24250a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filterNot$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = webSocketNetworkTransport$execute$$inlined$map$1.collect(new AnonymousClass2(flowCollector, deferredJsonMerger), continuation);
                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
            }
        }, new WebSocketNetworkTransport$execute$6(this, apolloRequest, null));
    }

    @Override // com.apollographql.apollo.network.NetworkTransport
    public final void dispose() {
        this.f.k(Dispose.f13641a);
    }
}
