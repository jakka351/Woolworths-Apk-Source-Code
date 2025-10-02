package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.internal.DeferredJsonMerger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebSocketNetworkTransport$execute$$inlined$map$1 implements Flow<ApolloResponse<Operation.Data>> {
    public final /* synthetic */ Flow d;
    public final /* synthetic */ ApolloRequest e;
    public final /* synthetic */ DeferredJsonMerger f;
    public final /* synthetic */ WebSocketNetworkTransport g;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;
        public final /* synthetic */ ApolloRequest e;
        public final /* synthetic */ DeferredJsonMerger f;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
        /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(FlowCollector flowCollector, ApolloRequest apolloRequest, DeferredJsonMerger deferredJsonMerger, WebSocketNetworkTransport webSocketNetworkTransport) {
            this.d = flowCollector;
            this.e = apolloRequest;
            this.f = deferredJsonMerger;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
            /*
                Method dump skipped, instructions count: 282
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public WebSocketNetworkTransport$execute$$inlined$map$1(Flow flow, ApolloRequest apolloRequest, DeferredJsonMerger deferredJsonMerger, WebSocketNetworkTransport webSocketNetworkTransport) {
        this.d = flow;
        this.e = apolloRequest;
        this.f = deferredJsonMerger;
        this.g = webSocketNetworkTransport;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = ((AbstractFlow) this.d).collect(new AnonymousClass2(flowCollector, this.e, this.f, this.g), continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}
