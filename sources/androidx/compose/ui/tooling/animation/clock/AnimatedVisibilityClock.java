package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedVisibilityClock implements ComposeAnimationClock<AnimatedVisibilityComposeAnimation, AnimatedVisibilityState> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedVisibilityComposeAnimation f2183a;
    public final String b;

    public AnimatedVisibilityClock(AnimatedVisibilityComposeAnimation animatedVisibilityComposeAnimation) {
        this.f2183a = animatedVisibilityComposeAnimation;
        this.b = ((Boolean) animatedVisibilityComposeAnimation.f2173a.f776a.a()).booleanValue() ? "Exit" : "Enter";
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long a() {
        Object objJ = CollectionsKt.J(0, this.f2183a.f2173a.j);
        Transition transition = objJ instanceof Transition ? (Transition) objJ : null;
        if (transition == null) {
            return 0L;
        }
        long jH = transition.h();
        List list = Utils_androidKt.f2186a;
        return (jH + 999999) / 1000000;
    }
}
