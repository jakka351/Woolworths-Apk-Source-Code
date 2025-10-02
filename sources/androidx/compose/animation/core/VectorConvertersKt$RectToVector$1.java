package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorConvertersKt$RectToVector$1 extends Lambda implements Function1<Rect, AnimationVector4D> {
    public static final VectorConvertersKt$RectToVector$1 h = new VectorConvertersKt$RectToVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Rect rect = (Rect) obj;
        return new AnimationVector4D(rect.f1752a, rect.b, rect.c, rect.d);
    }
}
