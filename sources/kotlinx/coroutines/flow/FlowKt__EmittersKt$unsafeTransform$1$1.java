package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$unsafeTransform$1$1<T> implements FlowCollector {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r4 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1) r4
            int r0 = r4.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1 r4 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1$emit$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r4.r
            if (r4 == 0) goto L31
            r0 = 1
            if (r4 != r0) goto L29
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
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
