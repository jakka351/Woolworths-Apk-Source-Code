package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VectorizedFloatAnimationSpec f800a;

    public VectorizedSpringSpec(final float f, final float f2, final AnimationVector animationVector) {
        int[] iArr = VectorizedAnimationSpecKt.f789a;
        this.f800a = new VectorizedFloatAnimationSpec(animationVector != null ? new Animations(f, f2, animationVector) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

            /* renamed from: a, reason: collision with root package name */
            public final FloatSpringSpec[] f790a;

            {
                int iB = animationVector.b();
                FloatSpringSpec[] floatSpringSpecArr = new FloatSpringSpec[iB];
                for (int i = 0; i < iB; i++) {
                    floatSpringSpecArr[i] = new FloatSpringSpec(f, f2, animationVector.a(i));
                }
                this.f790a = floatSpringSpecArr;
            }

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return this.f790a[i];
            }
        } : new Animations(f, f2) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2

            /* renamed from: a, reason: collision with root package name */
            public final FloatSpringSpec f791a;

            {
                this.f791a = new FloatSpringSpec(f, f2, 0.01f);
            }

            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return this.f791a;
            }
        });
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final boolean a() {
        this.f800a.getClass();
        return false;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f800a.b(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f800a.d(animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f800a.e(j, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return this.f800a.f(j, animationVector, animationVector2, animationVector3);
    }
}
