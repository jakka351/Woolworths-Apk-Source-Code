package kotlinx.coroutines.reactive;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/reactive/PublisherAsFlow;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "kotlinx-coroutines-reactive"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class PublisherAsFlow<T> extends ChannelFlow<T> {
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        CoroutineContext h = continuation.getH();
        CoroutineContext coroutineContext = this.d;
        ContinuationInterceptor.Key key = ContinuationInterceptor.Key.d;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(key);
        Unit unit = Unit.f24250a;
        if (continuationInterceptor == null || continuationInterceptor.equals(h.get(key))) {
            Object objL = l(h.plus(coroutineContext), flowCollector, continuation);
            if (objL == CoroutineSingletons.d) {
                return objL;
            }
        } else {
            Object objC = CoroutineScopeKt.c(new PublisherAsFlow$collectSlowPath$2(flowCollector, this, null), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            if (objC != coroutineSingletons) {
                objC = unit;
            }
            if (objC == coroutineSingletons) {
                return objC;
            }
        }
        return unit;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object h(ProducerScope producerScope, Continuation continuation) {
        Object objL = l(producerScope.getD(), new SendingCollector(producerScope.b()), continuation);
        return objL == CoroutineSingletons.d ? objL : Unit.f24250a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow i(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[PHI: r0 r5 r7 r8 r13
  0x0052: PHI (r0v4 kotlinx.coroutines.reactive.ReactiveSubscriber) = (r0v10 kotlinx.coroutines.reactive.ReactiveSubscriber), (r0v11 kotlinx.coroutines.reactive.ReactiveSubscriber) binds: [B:21:0x004f, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r5v1 long) = (r5v0 long), (r5v4 long) binds: [B:21:0x004f, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r7v1 kotlinx.coroutines.flow.FlowCollector) = (r7v0 kotlinx.coroutines.flow.FlowCollector), (r7v2 kotlinx.coroutines.flow.FlowCollector) binds: [B:21:0x004f, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r8v2 kotlinx.coroutines.reactive.PublisherAsFlow) = (r8v1 kotlinx.coroutines.reactive.PublisherAsFlow), (r8v3 kotlinx.coroutines.reactive.PublisherAsFlow) binds: [B:21:0x004f, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r13v4 java.lang.Object) = (r13v1 java.lang.Object), (r13v7 java.lang.Object) binds: [B:21:0x004f, B:40:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:32:0x007a, B:34:0x0085, B:36:0x0089, B:37:0x0091, B:38:0x0094, B:39:0x0095, B:29:0x0062, B:21:0x004f), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:32:0x007a, B:34:0x0085, B:36:0x0089, B:37:0x0091, B:38:0x0094, B:39:0x0095, B:29:0x0062, B:21:0x004f), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0077 -> B:32:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(kotlin.coroutines.CoroutineContext r12, kotlinx.coroutines.flow.FlowCollector r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r12 = r14 instanceof kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1
            if (r12 == 0) goto L13
            r12 = r14
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r12 = (kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1) r12
            int r13 = r12.v
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r13 & r0
            if (r1 == 0) goto L13
            int r13 = r13 - r0
            r12.v = r13
            goto L18
        L13:
            kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1 r12 = new kotlinx.coroutines.reactive.PublisherAsFlow$collectImpl$1
            r12.<init>(r11, r14)
        L18:
            java.lang.Object r13 = r12.t
            kotlin.coroutines.intrinsics.CoroutineSingletons r14 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r12.v
            r1 = 0
            if (r0 == 0) goto Lb2
            java.lang.String r2 = "subscription"
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L43
            if (r0 != r3) goto L3b
            long r5 = r12.s
            java.lang.Object r0 = r12.r
            kotlinx.coroutines.reactive.ReactiveSubscriber r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r0
            kotlinx.coroutines.flow.FlowCollector r7 = r12.q
            java.lang.Object r8 = r12.p
            kotlinx.coroutines.reactive.PublisherAsFlow r8 = (kotlinx.coroutines.reactive.PublisherAsFlow) r8
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L39
            goto L7a
        L39:
            r12 = move-exception
            goto La6
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            long r5 = r12.s
            java.lang.Object r0 = r12.r
            kotlinx.coroutines.reactive.ReactiveSubscriber r0 = (kotlinx.coroutines.reactive.ReactiveSubscriber) r0
            kotlinx.coroutines.flow.FlowCollector r7 = r12.q
            java.lang.Object r8 = r12.p
            kotlinx.coroutines.reactive.PublisherAsFlow r8 = (kotlinx.coroutines.reactive.PublisherAsFlow) r8
            kotlin.ResultKt.b(r13)     // Catch: java.lang.Throwable -> L39
        L52:
            if (r13 != 0) goto L62
            org.reactivestreams.Subscription r12 = r0.e
            if (r12 == 0) goto L5e
            r12.cancel()
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        L5e:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        L62:
            kotlin.coroutines.CoroutineContext r9 = r12.getH()     // Catch: java.lang.Throwable -> L39
            kotlinx.coroutines.JobKt.e(r9)     // Catch: java.lang.Throwable -> L39
            r12.p = r8     // Catch: java.lang.Throwable -> L39
            r12.q = r7     // Catch: java.lang.Throwable -> L39
            r12.r = r0     // Catch: java.lang.Throwable -> L39
            r12.s = r5     // Catch: java.lang.Throwable -> L39
            r12.v = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r13 = r7.emit(r13, r12)     // Catch: java.lang.Throwable -> L39
            if (r13 != r14) goto L7a
            goto La5
        L7a:
            r9 = 1
            long r5 = r5 + r9
            long r9 = r8.m()     // Catch: java.lang.Throwable -> L39
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 != 0) goto L95
            org.reactivestreams.Subscription r13 = r0.e     // Catch: java.lang.Throwable -> L39
            if (r13 == 0) goto L91
            long r5 = r0.d     // Catch: java.lang.Throwable -> L39
            r13.request(r5)     // Catch: java.lang.Throwable -> L39
            r5 = 0
            goto L95
        L91:
            kotlin.jvm.internal.Intrinsics.p(r2)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L39
        L95:
            r12.p = r8     // Catch: java.lang.Throwable -> L39
            r12.q = r7     // Catch: java.lang.Throwable -> L39
            r12.r = r0     // Catch: java.lang.Throwable -> L39
            r12.s = r5     // Catch: java.lang.Throwable -> L39
            r12.v = r4     // Catch: java.lang.Throwable -> L39
            java.lang.Object r13 = r0.a(r12)     // Catch: java.lang.Throwable -> L39
            if (r13 != r14) goto L52
        La5:
            return r14
        La6:
            org.reactivestreams.Subscription r13 = r0.e
            if (r13 == 0) goto Lae
            r13.cancel()
            throw r12
        Lae:
            kotlin.jvm.internal.Intrinsics.p(r2)
            throw r1
        Lb2:
            kotlin.ResultKt.b(r13)
            kotlinx.coroutines.reactive.ReactiveSubscriber r12 = new kotlinx.coroutines.reactive.ReactiveSubscriber
            kotlinx.coroutines.channels.BufferOverflow r13 = r11.f
            long r2 = r11.m()
            int r14 = r11.e
            r12.<init>(r14, r13, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow.l(kotlin.coroutines.CoroutineContext, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long m() {
        if (this.f != BufferOverflow.d) {
            return Long.MAX_VALUE;
        }
        int i = this.e;
        if (i == -2) {
            Channel.w3.getClass();
            return Channel.Factory.b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        throw new IllegalStateException("Check failed.");
    }
}
