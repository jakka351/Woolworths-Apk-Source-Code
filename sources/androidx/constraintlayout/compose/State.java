package androidx.constraintlayout.compose;

import androidx.camera.core.impl.e;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/constraintlayout/compose/State;", "Landroidx/constraintlayout/core/state/State;", "Landroidx/constraintlayout/compose/SolverState;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class State extends androidx.constraintlayout.core.state.State {
    public final Density k;
    public long l = ConstraintsKt.b(0, 0, 15);

    public State(Density density) {
        this.k = density;
        LayoutDirection layoutDirection = LayoutDirection.d;
        this.f2300a = new e(this, 3);
    }

    @Override // androidx.constraintlayout.core.state.State
    public final int d(Float f) {
        return super.d(f);
    }
}
