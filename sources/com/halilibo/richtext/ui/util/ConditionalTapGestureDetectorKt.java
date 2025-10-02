package com.halilibo.richtext.ui.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ConditionalTapGestureDetectorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function3 f16309a = null;

    static {
        new ConditionalTapGestureDetectorKt$NoPressGesture$1(3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c A[PHI: r12 r13
  0x004c: PHI (r12v1 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r12v5 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r12v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:18:0x0049, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r13v2 java.lang.Object) = (r13v8 java.lang.Object), (r13v1 java.lang.Object) binds: [B:18:0x0049, B:15:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0098 -> B:35:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r12, kotlin.coroutines.jvm.internal.BaseContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r13
            com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1 r0 = (com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1 r0 = new com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt$waitForUpOrCancellation$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = r0.p
            kotlin.ResultKt.b(r13)
            goto L9b
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r12 = r0.p
            kotlin.ResultKt.b(r13)
            goto L4c
        L3c:
            kotlin.ResultKt.b(r13)
        L3f:
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.e
            r0.p = r12
            r0.r = r5
            java.lang.Object r13 = r12.x1(r13, r0)
            if (r13 != r1) goto L4c
            goto L9a
        L4c:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            java.lang.Object r13 = r13.f1851a
            r2 = r13
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        L58:
            if (r6 >= r2) goto Lbd
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.b(r7)
            if (r7 != 0) goto Lba
            r2 = r13
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        L6e:
            if (r6 >= r2) goto L8e
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb5
            long r8 = r12.a()
            long r10 = r12.n1()
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.d(r7, r8, r10)
            if (r7 == 0) goto L8b
            goto Lb5
        L8b:
            int r6 = r6 + 1
            goto L6e
        L8e:
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.f
            r0.p = r12
            r0.r = r3
            java.lang.Object r13 = r12.x1(r13, r0)
            if (r13 != r1) goto L9b
        L9a:
            return r1
        L9b:
            androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
            java.lang.Object r13 = r13.f1851a
            r2 = r13
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r6 = r4
        La7:
            if (r6 >= r2) goto L3f
            java.lang.Object r7 = r13.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lb7
        Lb5:
            r12 = 0
            return r12
        Lb7:
            int r6 = r6 + 1
            goto La7
        Lba:
            int r6 = r6 + 1
            goto L58
        Lbd:
            java.lang.Object r12 = r13.get(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.halilibo.richtext.ui.util.ConditionalTapGestureDetectorKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
