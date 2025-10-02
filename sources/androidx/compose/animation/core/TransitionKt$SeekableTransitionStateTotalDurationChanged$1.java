package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/core/SeekableTransitionState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransitionKt$SeekableTransitionStateTotalDurationChanged$1 extends Lambda implements Function1<SeekableTransitionState<?>, Unit> {
    public static final TransitionKt$SeekableTransitionStateTotalDurationChanged$1 h = new TransitionKt$SeekableTransitionStateTotalDurationChanged$1(1);

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj;
        long j = seekableTransitionState.f;
        ((SnapshotStateObserver) TransitionKt.b.getD()).e(seekableTransitionState, h, seekableTransitionState.g);
        long j2 = seekableTransitionState.f;
        if (j != j2) {
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = seekableTransitionState.n;
            if (seekingAnimationState != null) {
                if (seekingAnimationState.f769a > j2) {
                    seekableTransitionState.m();
                } else {
                    seekingAnimationState.g = j2;
                    if (seekingAnimationState.b == null) {
                        seekingAnimationState.h = MathKt.c((1.0d - seekingAnimationState.e.a(0)) * seekableTransitionState.f);
                    }
                }
            } else if (j2 != 0) {
                seekableTransitionState.o();
            }
        }
        return Unit.f24250a;
    }
}
