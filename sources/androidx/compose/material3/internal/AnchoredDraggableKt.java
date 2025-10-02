package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {
    public static final DraggableAnchors a(Function1 function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.f1556a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r0.q = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.c(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.b(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object c(AnchoredDraggableState anchoredDraggableState, Object obj, float f, Continuation continuation) {
        Object objB = anchoredDraggableState.b(obj, MutatePriority.d, new AnchoredDraggableKt$animateTo$2(anchoredDraggableState, f, null), continuation);
        return objB == CoroutineSingletons.d ? objB : Unit.f24250a;
    }

    public static final Modifier d(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, Function2 function2) {
        return modifier.x0(new DraggableAnchorsElement(anchoredDraggableState, function2, orientation));
    }
}
