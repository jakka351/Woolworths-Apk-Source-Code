package androidx.compose.ui.tooling.animation.clock;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.states.TargetState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/states/TargetState;", "", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class InfiniteTransitionClock implements ComposeAnimationClock<InfiniteTransitionComposeAnimation, TargetState<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public final InfiniteTransitionComposeAnimation f2184a;
    public final Function0 b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function0<Long> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return 0L;
        }
    }

    public InfiniteTransitionClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, Function0 function0) {
        this.f2184a = infiniteTransitionComposeAnimation;
        this.b = function0;
    }

    public static long b(InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        AnimationSpec animationSpec = transitionAnimationState.h;
        Intrinsics.f(animationSpec, "null cannot be cast to non-null type androidx.compose.animation.core.InfiniteRepeatableSpec<T of androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock.getIterationDuration>");
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) animationSpec;
        int i = infiniteRepeatableSpec.b == RepeatMode.e ? 2 : 1;
        VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpecA = infiniteRepeatableSpec.f760a.a(transitionAnimationState.f);
        long f799a = vectorizedDurationBasedAnimationSpecA.getF799a() + (vectorizedDurationBasedAnimationSpecA.getC() * i);
        List list = Utils_androidKt.f2186a;
        return f799a * 1000000;
    }

    @Override // androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock
    public final long a() {
        return Math.max(c(), ((Number) this.b.invoke()).longValue());
    }

    public final long c() {
        Long l;
        Iterator it = this.f2184a.f2178a.f761a.g().iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(b((InfiniteTransition.TransitionAnimationState) it.next()));
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(b((InfiniteTransition.TransitionAnimationState) it.next()));
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        long jLongValue = l != null ? l.longValue() : 0L;
        List list = Utils_androidKt.f2186a;
        return (jLongValue + 999999) / 1000000;
    }
}
