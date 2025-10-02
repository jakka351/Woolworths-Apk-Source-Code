package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector3D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/graphics/vector/VectorizedReversedSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VectorizedReversedSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedFiniteAnimationSpec f821a;
    public final long b;

    public VectorizedReversedSpec(VectorizedFiniteAnimationSpec vectorizedFiniteAnimationSpec, long j) {
        this.f821a = vectorizedFiniteAnimationSpec;
        this.b = j;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.b;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationVector animationVectorE = this.f821a.e(this.b - j, animationVector2, animationVector, animationVector3);
        if (animationVectorE instanceof AnimationVector1D) {
            return new AnimationVector1D(((AnimationVector1D) animationVectorE).f745a * (-1));
        }
        if (animationVectorE instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) animationVectorE;
            float f = -1;
            return new AnimationVector2D(animationVector2D.f746a * f, animationVector2D.b * f);
        }
        if (animationVectorE instanceof AnimationVector3D) {
            AnimationVector3D animationVector3D = (AnimationVector3D) animationVectorE;
            float f2 = -1;
            return new AnimationVector3D(animationVector3D.f747a * f2, animationVector3D.b * f2, animationVector3D.c * f2);
        }
        if (animationVectorE instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) animationVectorE;
            float f3 = -1;
            return new AnimationVector4D(animationVector4D.f748a * f3, animationVector4D.b * f3, animationVector4D.c * f3, animationVector4D.d * f3);
        }
        throw new RuntimeException("Unknown AnimationVector: " + animationVectorE);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f821a.f(this.b - j, animationVector2, animationVector, animationVector3);
    }
}
