package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DispatchException;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/internal/BasicTooltipStateImpl;", "Landroidx/compose/material3/TooltipState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class BasicTooltipStateImpl implements TooltipState {

    /* renamed from: a, reason: collision with root package name */
    public CancellableContinuationImpl f1549a;

    @Override // androidx.compose.material3.TooltipState
    public final void a() throws DispatchException {
        CancellableContinuationImpl cancellableContinuationImpl = this.f1549a;
        if (cancellableContinuationImpl != null) {
            cancellableContinuationImpl.cancel(null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public final Object b(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null);
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
