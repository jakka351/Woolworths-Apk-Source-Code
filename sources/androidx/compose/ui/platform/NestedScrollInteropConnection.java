package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object J0(long j, Continuation continuation) {
        Velocity.d(j);
        Velocity.e(j);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final Object V(long j, long j2, Continuation continuation) {
        Velocity.d(j2);
        Velocity.e(j2);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long b0(int i, long j) {
        NestedScrollInteropConnectionKt.a(j);
        throw null;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public final long n0(int i, long j, long j2) {
        NestedScrollInteropConnectionKt.a(j2);
        throw null;
    }
}
