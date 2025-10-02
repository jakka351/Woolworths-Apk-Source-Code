package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/TweenSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f786a;
    public final int b;
    public final Easing c;

    public TweenSpec(int i, Easing easing, int i2) {
        this((i2 & 1) != 0 ? nlnlnnn.xxx00780078x0078 : i, 0, (i2 & 4) != 0 ? EasingKt.f756a : easing);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f786a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) obj;
            if (tweenSpec.f786a == this.f786a && tweenSpec.b == this.b && Intrinsics.c(tweenSpec.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.f786a * 31)) * 31) + this.b;
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f786a, this.b, this.c);
    }

    public TweenSpec(int i, int i2, Easing easing) {
        this.f786a = i;
        this.b = i2;
        this.c = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedTweenSpec(this.f786a, this.b, this.c);
    }
}
