package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlowKt__CountKt$count$4<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) r4
            int r0 = r4.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.s = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 != r2) goto L3a
            java.lang.Object r4 = r4.p
            kotlinx.coroutines.flow.FlowKt__CountKt$count$4 r4 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4) r4
            kotlin.ResultKt.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L36
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L36:
            r4.getClass()
            throw r1
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L42:
            kotlin.ResultKt.b(r5)
            r4.p = r3
            r4.s = r2
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__CountKt$count$4.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
