package kotlinx.coroutines.stream;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class StreamFlow<T> implements Flow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", l = {22}, m = "collect")
    /* renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    final class AnonymousClass1 extends ContinuationImpl {
        public FlowCollector p;
        public Iterator q;
        public /* synthetic */ Object r;
        public int t;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.r = obj;
            this.t |= Integer.MIN_VALUE;
            StreamFlow.this.collect(null, this);
            return CoroutineSingletons.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof kotlinx.coroutines.stream.StreamFlow.AnonymousClass1
            if (r6 == 0) goto L13
            r6 = r7
            kotlinx.coroutines.stream.StreamFlow$collect$1 r6 = (kotlinx.coroutines.stream.StreamFlow.AnonymousClass1) r6
            int r0 = r6.t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.t = r0
            goto L18
        L13:
            kotlinx.coroutines.stream.StreamFlow$collect$1 r6 = new kotlinx.coroutines.stream.StreamFlow$collect$1
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 != r3) goto L45
            java.util.Iterator r1 = r6.q
            kotlinx.coroutines.flow.FlowCollector r4 = r6.p
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L42
        L2b:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L44
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L42
            r6.p = r4     // Catch: java.lang.Throwable -> L42
            r6.q = r1     // Catch: java.lang.Throwable -> L42
            r6.t = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = r4.emit(r7, r6)     // Catch: java.lang.Throwable -> L42
            if (r7 != r0) goto L2b
            return r0
        L42:
            r6 = r2
            goto L63
        L44:
            throw r2
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            kotlin.ResultKt.b(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.stream.StreamFlow.d
            r7 = 0
            boolean r6 = r6.compareAndSet(r5, r7, r3)
            if (r6 != 0) goto L61
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
        L61:
            throw r2     // Catch: java.lang.Throwable -> L62
        L62:
            r6 = r5
        L63:
            r6.getClass()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.stream.StreamFlow.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
