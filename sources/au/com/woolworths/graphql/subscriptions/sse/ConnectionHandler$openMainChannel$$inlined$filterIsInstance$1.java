package au.com.woolworths.graphql.subscriptions.sse;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1 implements Flow<Object> {
    public final /* synthetic */ FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ FlowCollector d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2", f = "ConnectionHandler.kt", l = {50}, m = "emit")
        /* renamed from: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                boolean r0 = r6 instanceof au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r6
                au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2$1 r0 = (au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.q = r1
                goto L18
            L13:
                au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2$1 r0 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1$2$1
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r0.q
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                kotlin.ResultKt.b(r6)
                goto L41
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                kotlin.ResultKt.b(r6)
                boolean r6 = r5 instanceof au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory.MainChannel.SseEvent.SsePayload
                if (r6 == 0) goto L41
                r0.q = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L41
                return r1
            L41:
                kotlin.Unit r5 = kotlin.Unit.f24250a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public ConnectionHandler$openMainChannel$$inlined$filterIsInstance$1(FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1) {
        this.d = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.d.collect(new AnonymousClass2(flowCollector), continuation);
        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
    }
}
