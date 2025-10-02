package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterTransitionImpl;", "Landroidx/compose/animation/EnterTransition;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class EnterTransitionImpl extends EnterTransition {
    public final TransitionData b;

    public EnterTransitionImpl(TransitionData transitionData) {
        this.b = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    /* renamed from: a, reason: from getter */
    public final TransitionData getB() {
        return this.b;
    }
}
