package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/FloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationSpec;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface FloatAnimationSpec extends AnimationSpec<Float> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    /* bridge */ /* synthetic */ default VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return b();
    }

    default VectorizedFloatAnimationSpec b() {
        return new VectorizedFloatAnimationSpec(this);
    }

    long c(float f, float f2, float f3);

    float d(float f, float f2, float f3, long j);

    float e(float f, float f2, float f3, long j);

    default float f(float f, float f2, float f3) {
        return e(f, f2, f3, c(f, f2, f3));
    }
}
