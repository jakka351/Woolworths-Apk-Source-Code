package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedTweenSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedTweenSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f801a;
    public final int b;
    public final Easing c;
    public final VectorizedFloatAnimationSpec d;

    public VectorizedTweenSpec(int i, int i2, Easing easing) {
        this.f801a = i;
        this.b = i2;
        this.c = easing;
        this.d = new VectorizedFloatAnimationSpec(new FloatTweenSpec(i, i2, easing));
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* renamed from: c, reason: from getter */
    public final int getF801a() {
        return this.f801a;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.d.e(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.d.f(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    /* renamed from: g, reason: from getter */
    public final int getF799a() {
        return this.b;
    }
}
