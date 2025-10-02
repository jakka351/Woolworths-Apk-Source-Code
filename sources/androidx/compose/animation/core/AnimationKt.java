package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimationKt {
    public static final DecayAnimation a(FloatDecayAnimationSpec floatDecayAnimationSpec, float f, float f2) {
        return new DecayAnimation(new DecayAnimationSpecImpl(floatDecayAnimationSpec), VectorConvertersKt.f788a, Float.valueOf(f), new AnimationVector1D(f2));
    }

    public static final TargetBasedAnimation b(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3) {
        return new TargetBasedAnimation(animationSpec, twoWayConverter, obj, obj2, (AnimationVector) twoWayConverter.a().invoke(obj3));
    }

    public static final long c(TargetBasedAnimation targetBasedAnimation) {
        return targetBasedAnimation.getH() / 1000000;
    }
}
