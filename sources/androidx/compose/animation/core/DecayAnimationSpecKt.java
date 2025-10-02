package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecayAnimationSpecKt {
    public static final float a(DecayAnimationSpec decayAnimationSpec, float f, float f2) {
        TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
        return ((AnimationVector1D) ((VectorizedFloatDecaySpec) decayAnimationSpec.b()).d(new AnimationVector1D(f), new AnimationVector1D(f2))).f745a;
    }

    public static DecayAnimationSpec b(int i) {
        return new DecayAnimationSpecImpl(new FloatExponentialDecaySpec((i & 1) != 0 ? 1.0f : 3.0f));
    }

    public static final DecayAnimationSpec c(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        return new DecayAnimationSpecImpl(floatDecayAnimationSpec);
    }
}
