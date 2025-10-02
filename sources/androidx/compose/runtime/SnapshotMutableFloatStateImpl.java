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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "FloatStateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {
    public FloatStateStateRecord e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl$FloatStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloatStateStateRecord extends StateRecord {
        public float c;

        public FloatStateStateRecord(long j, float f) {
            super(j);
            this.c = f;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.c = ((FloatStateStateRecord) stateRecord).c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return c(SnapshotKt.k().getB());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new FloatStateStateRecord(j, this.c);
        }
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public final float a() {
        return ((FloatStateStateRecord) SnapshotKt.t(this.e, this)).c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.e = (FloatStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* renamed from: c */
    public final SnapshotMutationPolicy getE() {
        return StructuralEqualityPolicy.f1671a;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord o(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((FloatStateStateRecord) stateRecord2).c == ((FloatStateStateRecord) stateRecord3).c) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public final void p(float f) {
        Snapshot snapshotK;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.i(this.e);
        if (floatStateStateRecord.c == f) {
            return;
        }
        FloatStateStateRecord floatStateStateRecord2 = this.e;
        synchronized (SnapshotKt.c) {
            snapshotK = SnapshotKt.k();
            ((FloatStateStateRecord) SnapshotKt.o(floatStateStateRecord2, this, snapshotK, floatStateStateRecord)).c = f;
        }
        SnapshotKt.n(snapshotK, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.e;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.i(this.e)).c + ")@" + hashCode();
    }
}
