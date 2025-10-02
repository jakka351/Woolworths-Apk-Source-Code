package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public final Function1 e;
    public final Snapshot f;

    public NestedReadonlySnapshot(long j, SnapshotIdSet snapshotIdSet, Function1 function1, Snapshot snapshot) {
        super(j, snapshotIdSet);
        this.e = function1;
        this.f = snapshot;
        snapshot.k();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        if (this.c) {
            return;
        }
        long j = this.b;
        Snapshot snapshot = this.f;
        if (j != snapshot.getB()) {
            a();
        }
        snapshot.l();
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: e, reason: from getter */
    public final Function1 getE() {
        return this.e;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean f() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: i */
    public final Function1 getS() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        Function1 function1 = SnapshotKt.f1707a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot u(Function1 function1) {
        return new NestedReadonlySnapshot(this.b, this.f1703a, SnapshotKt.l(function1, this.e, true), this.f);
    }
}
