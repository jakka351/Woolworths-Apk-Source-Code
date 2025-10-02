package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {

    /* renamed from: a, reason: collision with root package name */
    public final Transition f2173a;
    public final Set b;

    public AnimatedVisibilityComposeAnimation(Transition transition) {
        this.f2173a = transition;
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATED_VISIBILITY;
        this.b = ArraysKt.r0(new AnimatedVisibilityState[]{new AnimatedVisibilityState("Enter"), new AnimatedVisibilityState("Exit")});
    }
}
