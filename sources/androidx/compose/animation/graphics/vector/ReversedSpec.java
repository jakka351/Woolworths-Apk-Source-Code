package androidx.compose.animation.graphics.vector;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/graphics/vector/ReversedSpec;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReversedSpec<T> implements FiniteAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FiniteAnimationSpec f817a;
    public final int b;

    public ReversedSpec(FiniteAnimationSpec finiteAnimationSpec, int i) {
        this.f817a = finiteAnimationSpec;
        this.b = i;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return new VectorizedReversedSpec(this.f817a.a(twoWayConverter), this.b * 1000000);
    }
}
