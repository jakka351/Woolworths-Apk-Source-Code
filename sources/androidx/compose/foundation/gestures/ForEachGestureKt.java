package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public static final boolean a(AwaitPointerEventScope awaitPointerEventScope) {
        ?? r5 = awaitPointerEventScope.y1().f1851a;
        int size = ((Collection) r5).size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((PointerInputChange) r5.get(i)).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.q
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.p
            kotlin.ResultKt.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.ResultKt.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L68
        L3f:
            r0.p = r7
            r0.q = r8
            r0.s = r3
            java.lang.Object r9 = r7.x1(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.lang.Object r9 = r9.f1851a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L58:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r5 = (androidx.compose.ui.input.pointer.PointerInputChange) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L65
            goto L3f
        L65:
            int r4 = r4 + 1
            goto L58
        L68:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.b(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object c(PointerInputScope pointerInputScope, Function2 function2, Continuation continuation) {
        Object objC1 = pointerInputScope.c1(new ForEachGestureKt$awaitEachGesture$2(continuation.getE(), function2, null), continuation);
        return objC1 == CoroutineSingletons.d ? objC1 : Unit.f24250a;
    }
}
