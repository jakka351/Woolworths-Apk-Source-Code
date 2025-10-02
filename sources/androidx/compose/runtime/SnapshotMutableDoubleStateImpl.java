package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "DoubleStateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public DoubleStateStateRecord e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DoubleStateStateRecord extends StateRecord {
        public double c;

        public DoubleStateStateRecord(double d, long j) {
            super(j);
            this.c = d;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.c = ((DoubleStateStateRecord) stateRecord).c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return c(this.f1715a);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new DoubleStateStateRecord(this.c, j);
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.e = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* renamed from: c */
    public final SnapshotMutationPolicy getE() {
        return StructuralEqualityPolicy.f1671a;
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public final double f() {
        return ((DoubleStateStateRecord) SnapshotKt.t(this.e, this)).c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord o(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((DoubleStateStateRecord) stateRecord2).c == ((DoubleStateStateRecord) stateRecord3).c) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public final void s(double d) {
        Snapshot snapshotK;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.i(this.e);
        if (doubleStateStateRecord.c == d) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.e;
        synchronized (SnapshotKt.c) {
            snapshotK = SnapshotKt.k();
            ((DoubleStateStateRecord) SnapshotKt.o(doubleStateStateRecord2, this, snapshotK, doubleStateStateRecord)).c = d;
        }
        SnapshotKt.n(snapshotK, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.e;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.i(this.e)).c + ")@" + hashCode();
    }
}
