package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect;", "Landroidx/compose/animation/TransitionEffect;", "Key", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ContentScaleTransitionEffect extends TransitionEffect {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/ContentScaleTransitionEffect$Key;", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ContentScaleTransitionEffect);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ContentScaleTransitionEffect(contentScale=null, alignment=null)";
    }
}
