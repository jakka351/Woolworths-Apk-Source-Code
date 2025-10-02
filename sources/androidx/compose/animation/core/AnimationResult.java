package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimationResult<T, V extends AnimationVector> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationState f743a;
    public final AnimationEndReason b;

    public AnimationResult(AnimationState animationState, AnimationEndReason animationEndReason) {
        this.f743a = animationState;
        this.b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.f743a + ')';
    }
}
