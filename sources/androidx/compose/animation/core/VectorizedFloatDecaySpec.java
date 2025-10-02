package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatDecaySpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* renamed from: a, reason: collision with root package name */
    public final FloatDecayAnimationSpec f794a;
    public AnimationVector b;
    public AnimationVector c;
    public AnimationVector d;
    public final float e;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f794a = floatDecayAnimationSpec;
        this.e = floatDecayAnimationSpec.getF757a();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    /* renamed from: a, reason: from getter */
    public final float getE() {
        return this.e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector b(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.c == null) {
            this.c = animationVector.c();
        }
        AnimationVector animationVector3 = this.c;
        if (animationVector3 == null) {
            Intrinsics.p("velocityVector");
            throw null;
        }
        int iB = animationVector3.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector4 = this.c;
            if (animationVector4 == null) {
                Intrinsics.p("velocityVector");
                throw null;
            }
            animationVector.getClass();
            animationVector4.e(this.f794a.d(j, animationVector2.a(i)), i);
        }
        AnimationVector animationVector5 = this.c;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.p("velocityVector");
        throw null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final AnimationVector c(long j, AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.b == null) {
            this.b = animationVector.c();
        }
        AnimationVector animationVector3 = this.b;
        if (animationVector3 == null) {
            Intrinsics.p("valueVector");
            throw null;
        }
        int iB = animationVector3.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector4 = this.b;
            if (animationVector4 == null) {
                Intrinsics.p("valueVector");
                throw null;
            }
            animationVector4.e(this.f794a.e(j, animationVector.a(i), animationVector2.a(i)), i);
        }
        AnimationVector animationVector5 = this.b;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.p("valueVector");
        throw null;
    }

    public final AnimationVector d(AnimationVector animationVector, AnimationVector animationVector2) {
        if (this.d == null) {
            this.d = animationVector.c();
        }
        AnimationVector animationVector3 = this.d;
        if (animationVector3 == null) {
            Intrinsics.p("targetVector");
            throw null;
        }
        int iB = animationVector3.b();
        for (int i = 0; i < iB; i++) {
            AnimationVector animationVector4 = this.d;
            if (animationVector4 == null) {
                Intrinsics.p("targetVector");
                throw null;
            }
            animationVector4.e(this.f794a.c(animationVector.a(i), animationVector2.a(i)), i);
        }
        AnimationVector animationVector5 = this.d;
        if (animationVector5 != null) {
            return animationVector5;
        }
        Intrinsics.p("targetVector");
        throw null;
    }
}
