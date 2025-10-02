package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public final MutableSnapshot o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, boolean z, boolean z2) {
        Function1 s;
        Function1 function1E;
        Function1 function13 = SnapshotKt.f1707a;
        super(0L, SnapshotIdSet.h, SnapshotKt.l(function1, (mutableSnapshot == null || (function1E = mutableSnapshot.e()) == null) ? SnapshotKt.j.e : function1E, z), SnapshotKt.b(function12, (mutableSnapshot == null || (s = mutableSnapshot.getF()) == null) ? SnapshotKt.j.f : s));
        this.o = mutableSnapshot;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = Thread_jvmKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final void B(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot C(Function1 function1, Function1 function12) {
        Function1 function1L = SnapshotKt.l(function1, this.r, true);
        Function1 function1B = SnapshotKt.b(function12, this.s);
        return !this.p ? new TransparentObserverMutableSnapshot(D().C(null, function1B), function1L, function1B, false, true) : D().C(function1L, function1B);
    }

    public final MutableSnapshot D() {
        MutableSnapshot mutableSnapshot = this.o;
        return mutableSnapshot == null ? SnapshotKt.j : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        MutableSnapshot mutableSnapshot;
        this.c = true;
        if (!this.q || (mutableSnapshot = this.o) == null) {
            return;
        }
        mutableSnapshot.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: d */
    public final SnapshotIdSet getF1703a() {
        return D().getF1703a();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: e, reason: from getter */
    public final Function1 getE() {
        return this.r;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final boolean f() {
        return D().f();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: g */
    public final long getB() {
        return D().getB();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: h */
    public final int getG() {
        return D().getG();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: i, reason: from getter */
    public final Function1 getF() {
        return this.s;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
        D().m();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        D().n(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void r(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void s(long j) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void t(int i) {
        D().t(i);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot u(Function1 function1) {
        Function1 function1L = SnapshotKt.l(function1, this.r, true);
        return !this.p ? SnapshotKt.h(D().u(null), function1L, true) : D().u(function1L);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult w() {
        return D().w();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* renamed from: x */
    public final MutableScatterSet getH() {
        return D().getH();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
