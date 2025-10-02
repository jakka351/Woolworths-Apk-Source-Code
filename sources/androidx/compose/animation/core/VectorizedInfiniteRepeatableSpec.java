package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedDurationBasedAnimationSpec f795a;
    public final RepeatMode b;
    public final long c;
    public final long d;

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f795a = vectorizedDurationBasedAnimationSpec;
        this.b = repeatMode;
        this.c = (vectorizedDurationBasedAnimationSpec.c() + vectorizedDurationBasedAnimationSpec.getF799a()) * 1000000;
        this.d = j * 1000000;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        return true;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f795a.e(h(j), animationVector, animationVector2, i(j, animationVector, animationVector3, animationVector2));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f795a.f(h(j), animationVector, animationVector2, i(j, animationVector, animationVector3, animationVector2));
    }

    public final long h(long j) {
        long j2 = this.d;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.c;
        long j5 = j3 / j4;
        return (this.b == RepeatMode.d || j5 % ((long) 2) == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public final AnimationVector i(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? this.f795a.e(j4 - j2, animationVector, animationVector3, animationVector2) : animationVector2;
    }
}
