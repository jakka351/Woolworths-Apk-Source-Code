package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1 implements FlowCollector<Object> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1) r4
            int r0 = r4.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.s = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1$emit$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.s
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 != r1) goto L39
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = r4.p
            kotlin.ResultKt.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L33
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L33:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L41:
            kotlin.ResultKt.b(r5)
            r4.p = r3
            r4.s = r1
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
