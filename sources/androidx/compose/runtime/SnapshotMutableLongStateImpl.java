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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "LongStateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public LongStateStateRecord e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LongStateStateRecord extends StateRecord {
        public long c;

        public LongStateStateRecord(long j, long j2) {
            super(j);
            this.c = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.c = ((LongStateStateRecord) stateRecord).c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return c(SnapshotKt.k().getB());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new LongStateStateRecord(j, this.c);
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.e = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* renamed from: c */
    public final SnapshotMutationPolicy getE() {
        return StructuralEqualityPolicy.f1671a;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public final long e() {
        return ((LongStateStateRecord) SnapshotKt.t(this.e, this)).c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord o(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((LongStateStateRecord) stateRecord2).c == ((LongStateStateRecord) stateRecord3).c) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.e;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.i(this.e)).c + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.MutableLongState
    public final void z(long j) {
        Snapshot snapshotK;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.i(this.e);
        if (longStateStateRecord.c != j) {
            LongStateStateRecord longStateStateRecord2 = this.e;
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                ((LongStateStateRecord) SnapshotKt.o(longStateStateRecord2, this, snapshotK, longStateStateRecord)).c = j;
            }
            SnapshotKt.n(snapshotK, this);
        }
    }
}
