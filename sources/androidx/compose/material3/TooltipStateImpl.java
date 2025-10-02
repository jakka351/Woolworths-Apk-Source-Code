package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/TooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TooltipStateImpl implements TooltipState {
    @Override // androidx.compose.material3.TooltipState
    public final void a() {
        throw null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final Object b(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null);
        throw null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
        throw null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        throw null;
    }
}
