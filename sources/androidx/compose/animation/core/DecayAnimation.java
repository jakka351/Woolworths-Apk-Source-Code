package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedDecayAnimationSpec f753a;
    public final TwoWayConverter b;
    public final Object c;
    public final AnimationVector d;
    public final AnimationVector e;
    public final AnimationVector f;
    public final Object g;
    public final long h;

    public DecayAnimation(DecayAnimationSpec decayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        VectorizedDecayAnimationSpec vectorizedDecayAnimationSpecB = decayAnimationSpec.b();
        this.f753a = vectorizedDecayAnimationSpecB;
        this.b = twoWayConverter;
        this.c = obj;
        AnimationVector animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
        this.d = animationVector2;
        this.e = AnimationVectorsKt.a(animationVector);
        VectorizedFloatDecaySpec vectorizedFloatDecaySpec = (VectorizedFloatDecaySpec) vectorizedDecayAnimationSpecB;
        this.g = twoWayConverter.b().invoke(vectorizedFloatDecaySpec.d(animationVector2, animationVector));
        if (vectorizedFloatDecaySpec.c == null) {
            vectorizedFloatDecaySpec.c = animationVector2.c();
        }
        AnimationVector animationVector3 = vectorizedFloatDecaySpec.c;
        if (animationVector3 == null) {
            Intrinsics.p("velocityVector");
            throw null;
        }
        int iB = animationVector3.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            FloatDecayAnimationSpec floatDecayAnimationSpec = vectorizedFloatDecaySpec.f794a;
            animationVector2.getClass();
            jMax = Math.max(jMax, floatDecayAnimationSpec.b(animationVector.a(i)));
        }
        this.h = jMax;
        AnimationVector animationVectorA = AnimationVectorsKt.a(vectorizedFloatDecaySpec.b(jMax, animationVector2, animationVector));
        this.f = animationVectorA;
        int iB2 = animationVectorA.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            AnimationVector animationVector4 = this.f;
            animationVector4.e(RangesKt.b(animationVector4.a(i2), -this.f753a.getE(), this.f753a.getE()), i2);
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public final boolean a() {
        return false;
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: c, reason: from getter */
    public final long getH() {
        return this.h;
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: d, reason: from getter */
    public final TwoWayConverter getB() {
        return this.b;
    }

    @Override // androidx.compose.animation.core.Animation
    public final Object e(long j) {
        if (b(j)) {
            return this.g;
        }
        return this.b.b().invoke(this.f753a.c(j, this.d, this.e));
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: f, reason: from getter */
    public final Object getG() {
        return this.g;
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector g(long j) {
        if (b(j)) {
            return this.f;
        }
        return this.f753a.b(j, this.d, this.e);
    }
}
