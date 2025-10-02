package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Size;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-7Ah8Wj8", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorConvertersKt$SizeToVector$2 extends Lambda implements Function1<AnimationVector2D, Size> {
    public static final VectorConvertersKt$SizeToVector$2 h = new VectorConvertersKt$SizeToVector$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationVector2D animationVector2D = (AnimationVector2D) obj;
        float f = animationVector2D.f746a;
        float f2 = animationVector2D.b;
        return new Size((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
