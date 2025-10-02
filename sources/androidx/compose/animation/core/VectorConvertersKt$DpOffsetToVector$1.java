package androidx.compose.animation.core;

import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/unit/DpOffset;", "invoke-jo-Fl9I", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt$DpOffsetToVector$1 extends Lambda implements Function1<DpOffset, AnimationVector2D> {
    public static final VectorConvertersKt$DpOffsetToVector$1 h = new VectorConvertersKt$DpOffsetToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((DpOffset) obj).f2198a;
        return new AnimationVector2D(DpOffset.a(j), DpOffset.b(j));
    }
}
