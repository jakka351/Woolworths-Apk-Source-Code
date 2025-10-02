package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Animations f792a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;

    public VectorizedFloatAnimationSpec(Animations animations) {
        this.f792a = animations;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        int iB = animationVector.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.f792a.get(i).c(animationVector.a(i), animationVector2.a(i), animationVector3.a(i)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.d == null) {
            this.d = animationVector3.c();
        }
        AnimationVector animationVector4 = this.d;
        if (animationVector4 == null) {
            Intrinsics.p("endVelocityVector");
            throw null;
        }
        int iB = animationVector4.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector5 = this.d;
            if (animationVector5 == null) {
                Intrinsics.p("endVelocityVector");
                throw null;
            }
            animationVector5.e(this.f792a.get(i).f(animationVector.a(i), animationVector2.a(i), animationVector3.a(i)), i);
        }
        AnimationVector animationVector6 = this.d;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.p("endVelocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector e(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.c == null) {
            this.c = animationVector3.c();
        }
        AnimationVector animationVector4 = this.c;
        if (animationVector4 == null) {
            Intrinsics.p("velocityVector");
            throw null;
        }
        int iB = animationVector4.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector5 = this.c;
            if (animationVector5 == null) {
                Intrinsics.p("velocityVector");
                throw null;
            }
            animationVector5.e(this.f792a.get(i).e(animationVector.a(i), animationVector2.a(i), animationVector3.a(i), j), i);
        }
        AnimationVector animationVector6 = this.c;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.p("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final AnimationVector f(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        if (this.b == null) {
            this.b = animationVector.c();
        }
        AnimationVector animationVector4 = this.b;
        if (animationVector4 == null) {
            Intrinsics.p("valueVector");
            throw null;
        }
        int iB = animationVector4.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector5 = this.b;
            if (animationVector5 == null) {
                Intrinsics.p("valueVector");
                throw null;
            }
            animationVector5.e(this.f792a.get(i).d(animationVector.a(i), animationVector2.a(i), animationVector3.a(i), j), i);
        }
        AnimationVector animationVector6 = this.b;
        if (animationVector6 != null) {
            return animationVector6;
        }
        Intrinsics.p("valueVector");
        throw null;
    }

    public VectorizedFloatAnimationSpec(final FloatAnimationSpec floatAnimationSpec) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            public final FloatAnimationSpec get(int i) {
                return floatAnimationSpec;
            }
        });
    }
}
