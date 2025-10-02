package androidx.compose.animation.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpecImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/DecayAnimationSpec;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DecayAnimationSpecImpl<T> implements DecayAnimationSpec<T> {

    /* renamed from: a, reason: collision with root package name */
    public final FloatDecayAnimationSpec f754a;

    public DecayAnimationSpecImpl(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.f754a = floatDecayAnimationSpec;
    }

    @Override // androidx.compose.animation.core.DecayAnimationSpec
    public final VectorizedDecayAnimationSpec b() {
        return new VectorizedFloatDecaySpec(this.f754a);
    }
}
