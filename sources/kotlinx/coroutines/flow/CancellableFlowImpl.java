package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/CancellableFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/CancellableFlow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CancellableFlowImpl<T> implements CancellableFlow<T> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    final class AnonymousClass2<T> implements FlowCollector {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
            /*
                r3 = this;
                boolean r4 = r5 instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                if (r4 == 0) goto L13
                r4 = r5
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r4 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) r4
                int r0 = r4.r
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r4.r = r0
                goto L18
            L13:
                kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 r4 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1
                r4.<init>(r3, r5)
            L18:
                java.lang.Object r5 = r4.p
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r0 = r4.r
                if (r0 == 0) goto L31
                r4 = 1
                if (r0 != r4) goto L29
                kotlin.ResultKt.b(r5)
                kotlin.Unit r4 = kotlin.Unit.f24250a
                return r4
            L29:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L31:
                kotlin.ResultKt.b(r5)
                kotlin.coroutines.CoroutineContext r4 = r4.getD()
                kotlinx.coroutines.JobKt.e(r4)
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CancellableFlowImpl.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        throw null;
    }
}
