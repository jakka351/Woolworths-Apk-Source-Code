package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.TransitionBasedAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransitionClock<T> implements ComposeAnimationClock<TransitionBasedAnimation<T>, TargetState<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2185a;

    public TransitionClock(TransitionBasedAnimation transitionBasedAnimation) {
        this.f2185a = transitionBasedAnimation;
        transitionBasedAnimation.getF2172a().f776a.a();
        ((SnapshotMutableStateImpl) transitionBasedAnimation.getF2172a().d).getD();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.tooling.animation.TransitionBasedAnimation, java.lang.Object] */
    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long a() {
        long jH = this.f2185a.getF2172a().h();
        List list = Utils_androidKt.f2186a;
        return (jH + 999999) / 1000000;
    }
}
