package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f898a = null;
    public static final ScrollableKt$NoOpScrollScope$1 b = new ScrollableKt$NoOpScrollScope$1();
    public static final ScrollableKt$DefaultScrollMotionDurationScale$1 c = new ScrollableKt$DefaultScrollMotionDurationScale$1();
    public static final ScrollableKt$UnityDensity$1 d = new ScrollableKt$UnityDensity$1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.ScrollingLogic r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.q
            androidx.compose.foundation.gestures.ScrollingLogic r11 = r0.p
            kotlin.ResultKt.b(r13)
            r8 = r10
            r10 = r11
            goto L55
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.ResultKt.b(r13)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.d
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r4 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.p = r5
            r0.q = r8
            r0.s = r3
            java.lang.Object r10 = r5.f(r13, r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            float r11 = r8.d
            long r10 = r10.h(r11)
            androidx.compose.ui.geometry.Offset r12 = new androidx.compose.ui.geometry.Offset
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.a(androidx.compose.foundation.gestures.ScrollingLogic, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Modifier b(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        return modifier.x0(new ScrollableElement(scrollableState, orientation, z, z2, mutableInteractionSource));
    }
}
