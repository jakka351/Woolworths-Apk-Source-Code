package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/Animation;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a, reason: collision with root package name */
    public final VectorizedAnimationSpec f775a;
    public final TwoWayConverter b;
    public Object c;
    public Object d;
    public AnimationVector e;
    public AnimationVector f;
    public final AnimationVector g;
    public long h;
    public AnimationVector i;

    public TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector) {
        this.f775a = animationSpec.a(twoWayConverter);
        this.b = twoWayConverter;
        this.c = obj2;
        this.d = obj;
        this.e = (AnimationVector) twoWayConverter.a().invoke(obj);
        this.f = (AnimationVector) twoWayConverter.a().invoke(obj2);
        this.g = animationVector != null ? AnimationVectorsKt.a(animationVector) : ((AnimationVector) twoWayConverter.a().invoke(obj)).c();
        this.h = -1L;
    }

    @Override // androidx.compose.animation.core.Animation
    public final boolean a() {
        return this.f775a.a();
    }

    @Override // androidx.compose.animation.core.Animation
    public final long c() {
        if (this.h < 0) {
            this.h = this.f775a.b(this.e, this.f, this.g);
        }
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
            return this.c;
        }
        AnimationVector animationVectorF = this.f775a.f(j, this.e, this.f, this.g);
        int iB = animationVectorF.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(animationVectorF.a(i))) {
                PreconditionsKt.b("AnimationVector cannot contain a NaN. " + animationVectorF + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b().invoke(animationVectorF);
    }

    @Override // androidx.compose.animation.core.Animation
    /* renamed from: f, reason: from getter */
    public final Object getC() {
        return this.c;
    }

    @Override // androidx.compose.animation.core.Animation
    public final AnimationVector g(long j) {
        if (!b(j)) {
            return this.f775a.e(j, this.e, this.f, this.g);
        }
        AnimationVector animationVector = this.i;
        if (animationVector != null) {
            return animationVector;
        }
        AnimationVector animationVectorD = this.f775a.d(this.e, this.f, this.g);
        this.i = animationVectorD;
        return animationVectorD;
    }

    public final void h(Object obj) {
        if (Intrinsics.c(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (AnimationVector) this.b.a().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (Intrinsics.c(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (AnimationVector) this.b.a().invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + AnimationKt.c(this) + " ms,animationSpec: " + this.f775a;
    }
}
