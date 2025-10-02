package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.AnimateXAsStateComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimateXAsStateClock<T, V extends AnimationVector> implements ComposeAnimationClock<AnimateXAsStateComposeAnimation<T, V>, TargetState<T>> {

    /* renamed from: a, reason: collision with root package name */
    public Object f2182a;
    public TargetBasedAnimation b;

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long a() {
        long jC = this.b.c();
        List list = Utils_androidKt.f2186a;
        return (jC + 999999) / 1000000;
    }
}
