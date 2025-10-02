package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final int f798a;
    public final VectorizedDurationBasedAnimationSpec b;
    public final RepeatMode c;
    public final long d;
    public final long e;

    public VectorizedRepeatableSpec(int i, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f798a = i;
        this.b = vectorizedDurationBasedAnimationSpec;
        this.c = repeatMode;
        if (i < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.d = (vectorizedDurationBasedAnimationSpec.c() + vectorizedDurationBasedAnimationSpec.getF799a()) * 1000000;
        this.e = j * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return (this.f798a * this.d) - this.e;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.b.e(h(j), animationVector, animationVector2, i(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.b.f(h(j), animationVector, animationVector2, i(j, animationVector, animationVector3, animationVector2));
    }

    public final long h(long j) {
        long j2 = this.e;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.d;
        long jMin = Math.min(j3 / j4, this.f798a - 1);
        return (this.c == RepeatMode.d || jMin % ((long) 2) == 0) ? j3 - (jMin * j4) : ((jMin + 1) * j4) - j3;
    }

    public final AnimationVector i(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.e;
        long j3 = j + j2;
        long j4 = this.d;
        return j3 > j4 ? e(j4 - j2, animationVector, animationVector2, animationVector3) : animationVector2;
    }
}
