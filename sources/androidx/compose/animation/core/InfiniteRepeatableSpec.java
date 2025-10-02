package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/InfiniteRepeatableSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final DurationBasedAnimationSpec f760a;
    public final RepeatMode b;
    public final long c;

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.f760a = durationBasedAnimationSpec;
        this.b = repeatMode;
        this.c = j;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.f760a.a(twoWayConverter), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
            if (infiniteRepeatableSpec.f760a.equals(this.f760a) && infiniteRepeatableSpec.b == this.b && infiniteRepeatableSpec.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.f760a.hashCode() * 31)) * 31);
    }
}
