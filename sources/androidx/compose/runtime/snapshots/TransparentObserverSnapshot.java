package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public final Snapshot e;
    public final boolean f;
    public Function1 g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentObserverSnapshot(Snapshot snapshot, Function1 function1, boolean z) {
        Function1 g;
        super(0L, SnapshotIdSet.h);
        Function1 function12 = SnapshotKt.f1707a;
        this.e = snapshot;
        this.f = z;
        this.g = SnapshotKt.l(function1, (snapshot == null || (g = snapshot.getE()) == null) ? SnapshotKt.j.e : g, false);
        this.h = Thread_jvmKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        Snapshot snapshot;
        this.c = true;
        if (!this.f || (snapshot = this.e) == null) {
            return;
        }
        snapshot.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: d */
    public final SnapshotIdSet getF1703a() {
        return v().getF1703a();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: e, reason: from getter */
    public final Function1 getE() {
        return this.g;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean f() {
        return v().f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: g */
    public final long getB() {
        return v().getB();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: i */
    public final Function1 getF() {
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
        v().m();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        v().n(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot u(Function1 function1) {
        return SnapshotKt.h(v().u(null), SnapshotKt.l(function1, this.g, true), true);
    }

    public final Snapshot v() {
        Snapshot snapshot = this.e;
        return snapshot == null ? SnapshotKt.j : snapshot;
    }
}
