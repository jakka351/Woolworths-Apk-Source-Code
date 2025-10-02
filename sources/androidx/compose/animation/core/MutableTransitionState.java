package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {
    public final MutableState b;
    public final MutableState c;

    public MutableTransitionState(Object obj) {
        this.b = SnapshotStateKt.f(obj);
        this.c = SnapshotStateKt.f(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object a() {
        return ((SnapshotMutableStateImpl) this.b).getD();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object b() {
        return ((SnapshotMutableStateImpl) this.c).getD();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void c(Object obj) {
        ((SnapshotMutableStateImpl) this.b).setValue(obj);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void d(Transition transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final void e() {
    }
}
