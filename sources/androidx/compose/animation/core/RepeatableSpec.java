package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f768a;
    public final DurationBasedAnimationSpec b;
    public final RepeatMode c;
    public final long d;

    public RepeatableSpec(int i, long j, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this.f768a = i;
        this.b = durationBasedAnimationSpec;
        this.c = repeatMode;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RepeatableSpec) {
            RepeatableSpec repeatableSpec = (RepeatableSpec) obj;
            if (repeatableSpec.f768a == this.f768a && repeatableSpec.b.equals(this.b) && repeatableSpec.c == this.c && repeatableSpec.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f768a * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedRepeatableSpec(this.f768a, this.b.a(twoWayConverter), this.c, this.d);
    }
}
