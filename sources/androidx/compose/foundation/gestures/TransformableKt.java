package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransformableKt {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.jvm.internal.BaseContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.foundation.gestures.ScrollConfig r5 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = r0.p
            kotlin.ResultKt.b(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.b(r7)
        L39:
            r0.p = r5
            r0.q = r6
            r0.s = r3
            java.lang.Object r7 = c(r5, r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L39
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0262, code lost:
    
        if (r14 != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0264, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0269 A[EDGE_INSN: B:96:0x0269->B:84:0x0269 BREAK  A[LOOP:0: B:78:0x0254->B:83:0x0266], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0239 -> B:77:0x0245). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r26, kotlinx.coroutines.channels.BufferedChannel r27, kotlin.jvm.functions.Function1 r28, kotlin.coroutines.jvm.internal.BaseContinuationImpl r29) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlinx.coroutines.channels.BufferedChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, androidx.compose.foundation.gestures.ScrollConfig r5, kotlin.coroutines.jvm.internal.BaseContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.foundation.gestures.ScrollConfig r5 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = r0.p
            kotlin.ResultKt.b(r6)
            goto L45
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.ResultKt.b(r6)
            r0.p = r4
            r0.q = r5
            r0.s = r3
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.e
            java.lang.Object r6 = r4.x1(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r6 = (androidx.compose.ui.input.pointer.PointerEvent) r6
            int r0 = r6.d
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L80
            int r0 = r6.e
            r1 = 6
            if (r0 != r1) goto L80
            r4.a()
            long r4 = r5.a(r6)
            r0 = 0
            boolean r0 = androidx.compose.ui.geometry.Offset.c(r4, r0)
            if (r0 == 0) goto L62
            goto L80
        L62:
            java.lang.Object r6 = r6.f1851a
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r1 = 0
        L6c:
            if (r1 >= r0) goto L7a
            java.lang.Object r2 = r6.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.ui.input.pointer.PointerInputChange) r2
            r2.a()
            int r1 = r1 + 1
            goto L6c
        L7a:
            androidx.compose.ui.geometry.Offset r6 = new androidx.compose.ui.geometry.Offset
            r6.<init>(r4)
            return r6
        L80:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static Modifier d(Modifier modifier, TransformableState transformableState) {
        return modifier.x0(new TransformableElement(transformableState));
    }
}
