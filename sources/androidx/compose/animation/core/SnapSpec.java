package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/SnapSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f770a;

    public SnapSpec(int i) {
        this.f770a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).f770a == this.f770a;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF770a() {
        return this.f770a;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedSnapSpec(this.f770a);
    }
}
