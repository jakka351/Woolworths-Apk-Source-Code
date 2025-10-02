package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/AnimationData;", "it", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AnimationDataConverter$convertFromVector$1 extends Lambda implements Function1<AnimationVector4D, AnimationData> {
    public static final AnimationDataConverter$convertFromVector$1 h = new AnimationDataConverter$convertFromVector$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AnimationVector4D animationVector4D = (AnimationVector4D) obj;
        float f = animationVector4D.f748a;
        float f2 = animationVector4D.b;
        float f3 = animationVector4D.c;
        return new AnimationData((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f, animationVector4D.d);
    }
}
