package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Dp;", "it", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke-u2uoSUM", "(Landroidx/compose/animation/core/AnimationVector1D;)F"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt$DpToVector$2 extends Lambda implements Function1<AnimationVector1D, Dp> {
    public static final VectorConvertersKt$DpToVector$2 h = new VectorConvertersKt$DpToVector$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Dp(((AnimationVector1D) obj).f745a);
    }
}
