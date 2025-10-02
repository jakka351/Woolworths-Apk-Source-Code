package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/StartDelayAnimationSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f773a;
    public final long b;

    public StartDelayAnimationSpec(FiniteAnimationSpec finiteAnimationSpec, long j) {
        this.f773a = finiteAnimationSpec;
        this.b = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.f773a.a(twoWayConverter), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.b == this.b && Intrinsics.c(startDelayAnimationSpec.f773a, this.f773a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f773a.hashCode() * 31);
    }
}
