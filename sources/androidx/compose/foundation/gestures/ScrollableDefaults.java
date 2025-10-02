package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults;", "", "NoOpOverscrollEffect", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScrollableDefaults {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableDefaults$NoOpOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class NoOpOverscrollEffect implements OverscrollEffect {
        @Override // androidx.compose.foundation.OverscrollEffect
        public final DelegatableNode i() {
            return new ScrollableDefaults$NoOpOverscrollEffect$node$1();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public final boolean j() {
            return false;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public final long k(long j, int i, Function1 function1) {
            return ((Offset) function1.invoke(new Offset(j))).f1751a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public final Object l(long j, Function2 function2, Continuation continuation) {
            Object objInvoke = function2.invoke(new Velocity(j), continuation);
            return objInvoke == CoroutineSingletons.d ? objInvoke : Unit.f24250a;
        }
    }

    public static DefaultFlingBehavior a(Composer composer) {
        DecayAnimationSpec decayAnimationSpecA = SplineBasedFloatDecayAnimationSpec_androidKt.a(composer);
        boolean zN = composer.n(decayAnimationSpecA);
        Object objG = composer.G();
        if (zN || objG == Composer.Companion.f1624a) {
            objG = new DefaultFlingBehavior(decayAnimationSpecA);
            composer.A(objG);
        }
        return (DefaultFlingBehavior) objG;
    }
}
