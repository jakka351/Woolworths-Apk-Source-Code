package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Set;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransitionComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Transition f2180a;
    public final Set b;

    public TransitionComposeAnimation(Transition transition, Set set) {
        this.f2180a = transition;
        this.b = set;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    /* renamed from: a, reason: from getter */
    public final Transition getF2180a() {
        return this.f2180a;
    }
}
