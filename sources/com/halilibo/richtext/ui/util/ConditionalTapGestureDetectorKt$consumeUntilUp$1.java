package com.halilibo.richtext.ui.util;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt", f = "ConditionalTapGestureDetector.kt", l = {151}, m = "consumeUntilUp")
/* loaded from: classes6.dex */
final class ConditionalTapGestureDetectorKt$consumeUntilUp$1 extends ContinuationImpl {
    public AwaitPointerEventScope p;
    public /* synthetic */ Object q;
    public int r;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[LOOP:0: B:17:0x0051->B:18:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:16:0x0044). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.q = r10
            int r10 = r9.r
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.r = r10
            kotlin.jvm.functions.Function3 r1 = com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt.f16309a
            r1 = r10 & r0
            if (r1 == 0) goto L14
            int r10 = r10 - r0
            r9.r = r10
            r10 = r9
            goto L19
        L14:
            com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$consumeUntilUp$1 r10 = new com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$consumeUntilUp$1
            r10.<init>(r9)
        L19:
            java.lang.Object r0 = r10.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r10.r
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = r10.p
            kotlin.ResultKt.b(r0)
            goto L44
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            kotlin.ResultKt.b(r0)
            r0 = 0
            r2 = r0
        L37:
            r10.p = r2
            r10.r = r3
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r0 = r2.x1(r0, r10)
            if (r0 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
            java.lang.Object r4 = r0.f1851a
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            int r5 = r5.size()
            r6 = 0
            r7 = r6
        L51:
            if (r7 >= r5) goto L5f
            java.lang.Object r8 = r4.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            r8.a()
            int r7 = r7 + 1
            goto L51
        L5f:
            java.lang.Object r0 = r0.f1851a
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L68:
            if (r6 >= r4) goto L78
            java.lang.Object r5 = r0.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L75
            goto L37
        L75:
            int r6 = r6 + 1
            goto L68
        L78:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$consumeUntilUp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
