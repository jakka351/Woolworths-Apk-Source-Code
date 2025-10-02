package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/ScrollableDefaultFlingBehavior;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {

    /* renamed from: a, reason: collision with root package name */
    public DecayAnimationSpec f880a;
    public final ScrollableKt$DefaultScrollMotionDurationScale$1 b;

    public DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec) {
        ScrollableKt$DefaultScrollMotionDurationScale$1 scrollableKt$DefaultScrollMotionDurationScale$1 = ScrollableKt.c;
        this.f880a = decayAnimationSpec;
        this.b = scrollableKt$DefaultScrollMotionDurationScale$1;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public final Object a(ScrollScope scrollScope, float f, Continuation continuation) {
        return BuildersKt.f(this.b, new DefaultFlingBehavior$performFling$2(f, this, scrollScope, null), continuation);
    }
}
