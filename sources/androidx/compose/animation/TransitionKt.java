package androidx.compose.animation;

import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransitionKt {
    public static final InfiniteTransition.TransitionAnimationState a(InfiniteTransition infiniteTransition, long j, long j2, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i, int i2) {
        Composer composer2;
        String str = (i2 & 8) != 0 ? "ColorAnimation" : "animatedBackgroundColor";
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            int i3 = Color.l;
            Function1 function1 = ColorVectorConverterKt.f719a;
            objG = (TwoWayConverter) ColorVectorConverterKt$ColorToVector$1.h.invoke(Color.f(j2));
            composer2 = composer;
            composer2.A(objG);
        } else {
            composer2 = composer;
        }
        int i4 = i << 3;
        return InfiniteTransitionKt.b(infiniteTransition, new Color(j), new Color(j2), (TwoWayConverter) objG, infiniteRepeatableSpec, str, composer2, (i & 14) | 8 | (i & 112) | (i & 896) | 32768 | (57344 & i4) | (i4 & 458752), 0);
    }
}
