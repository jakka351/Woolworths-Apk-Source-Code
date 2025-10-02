package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"com/apollographql/apollo/internal/FlowsKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlowsKt$collectWhile$collector$1 implements FlowCollector<Object> {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1
            if (r4 == 0) goto L13
            r4 = r5
            com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1 r4 = (com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1) r4
            int r0 = r4.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.r = r0
            goto L18
        L13:
            com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1 r4 = new com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1$emit$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.r
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 != r1) goto L37
            kotlin.ResultKt.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L31
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L31:
            com.apollographql.apollo.internal.AbortFlowException r4 = new com.apollographql.apollo.internal.AbortFlowException
            r4.<init>(r3)
            throw r4
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            kotlin.ResultKt.b(r5)
            r4.r = r1
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.internal.FlowsKt$collectWhile$collector$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
