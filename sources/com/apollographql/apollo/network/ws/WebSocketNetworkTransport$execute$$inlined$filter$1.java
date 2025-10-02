package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.ws.internal.Event;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WebSocketNetworkTransport$execute$$inlined$filter$1 implements Flow<Event> {
    public final /* synthetic */ Flow d;
    public final /* synthetic */ ApolloRequest e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;
        public final /* synthetic */ ApolloRequest e;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2", f = "WebSocketNetworkTransport.kt", l = {50}, m = "emit")
        /* renamed from: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(FlowCollector flowCollector, ApolloRequest apolloRequest) {
            this.d = flowCollector;
            this.e = apolloRequest;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r7
                com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = (com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.q = r1
                goto L18
            L13:
                com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1 r0 = new com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1$2$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.q
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.b(r7)
                goto L58
            L27:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L2f:
                kotlin.ResultKt.b(r7)
                r7 = r6
                com.apollographql.apollo.network.ws.internal.Event r7 = (com.apollographql.apollo.network.ws.internal.Event) r7
                java.lang.String r2 = r7.getF13646a()
                com.apollographql.apollo.api.ApolloRequest r4 = r5.e
                java.util.UUID r4 = r4.e
                java.lang.String r4 = r4.toString()
                boolean r2 = kotlin.jvm.internal.Intrinsics.c(r2, r4)
                if (r2 != 0) goto L4d
                java.lang.String r7 = r7.getF13646a()
                if (r7 != 0) goto L58
            L4d:
                r0.q = r3
                kotlinx.coroutines.flow.FlowCollector r7 = r5.d
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L58
                return r1
            L58:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public WebSocketNetworkTransport$execute$$inlined$filter$1(Flow flow, ApolloRequest apolloRequest) {
        this.d = flow;
        this.e = apolloRequest;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.d.collect(new AnonymousClass2(flowCollector, this.e), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objCollect;
    }
}
