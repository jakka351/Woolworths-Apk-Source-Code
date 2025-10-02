package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/StartDelayVectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f774a;
    public final long b;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec vectorizedAnimationSpec, long j) {
        this.f774a = vectorizedAnimationSpec;
        this.b = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        return this.f774a.a();
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f774a.b(animationVector, animationVector2, animationVector3) + this.b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.b;
        return j < j2 ? animationVector3 : this.f774a.e(j - j2, animationVector, animationVector2, animationVector3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.b == this.b && Intrinsics.c(startDelayVectorizedAnimationSpec.f774a, this.f774a);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        long j2 = this.b;
        return j < j2 ? animationVector : this.f774a.f(j - j2, animationVector, animationVector2, animationVector3);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f774a.hashCode() * 31);
    }
}
