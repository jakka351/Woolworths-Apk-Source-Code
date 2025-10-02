package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnchoredDraggableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f865a = null;
    public static final Function1 b = null;
    public static final DecayAnimationSpec c = DecayAnimationSpecKt.c(new AnchoredDraggableKt$NoOpDecayAnimationSpec$1());

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.jvm.functions.Function0 r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            r0.q = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = kotlinx.coroutines.CoroutineScopeKt.c(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.a(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.lang.Object r8, float r9, androidx.compose.animation.core.AnimationSpec r10, androidx.compose.animation.core.DecayAnimationSpec r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            boolean r8 = r12 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            if (r8 == 0) goto L13
            r8 = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r8 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) r8
            int r0 = r8.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.s = r0
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r8.<init>(r12)
        L18:
            java.lang.Object r12 = r8.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r8.s
            r1 = 1
            if (r0 == 0) goto L3b
            if (r0 != r1) goto L33
            float r9 = r8.p
            kotlin.jvm.internal.Ref$FloatRef r8 = r8.q
            kotlin.ResultKt.b(r12)
            float r8 = r8.d
            float r9 = r9 - r8
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r9)
            return r8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlin.ResultKt.b(r12)
            kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
            r5.<init>()
            r5.d = r9
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r7 = 0
            r3 = r9
            r4 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.q = r5
            r8.p = r3
            r8.s = r1
            androidx.compose.foundation.MutatePriority r8 = androidx.compose.foundation.MutatePriority.d
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.b(java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
