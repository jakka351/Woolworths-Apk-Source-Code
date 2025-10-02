package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "StateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public final SnapshotMutationPolicy e;
    public StateStateRecord f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl$StateStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateStateRecord<T> extends StateRecord {
        public Object c;

        public StateStateRecord(long j, Object obj) {
            super(j);
            this.c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.c = ((StateStateRecord) stateRecord).c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateStateRecord(SnapshotKt.k().getB(), this.c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new StateStateRecord(SnapshotKt.k().getB(), this.c);
        }
    }

    public SnapshotMutableStateImpl(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.e = snapshotMutationPolicy;
        Snapshot snapshotK = SnapshotKt.k();
        StateStateRecord stateStateRecord = new StateStateRecord(snapshotK.getB(), obj);
        if (!(snapshotK instanceof GlobalSnapshot)) {
            stateStateRecord.b = new StateStateRecord(1, obj);
        }
        this.f = stateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f = (StateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* renamed from: c, reason: from getter */
    public final SnapshotMutationPolicy getE() {
        return this.e;
    }

    @Override // androidx.compose.runtime.State
    /* renamed from: getValue */
    public final Object getD() {
        return ((StateStateRecord) SnapshotKt.t(this.f, this)).c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord o(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (this.e.a(((StateStateRecord) stateRecord2).c, ((StateStateRecord) stateRecord3).c)) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        Snapshot snapshotK;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.i(this.f);
        if (this.e.a(stateStateRecord.c, obj)) {
            return;
        }
        StateStateRecord stateStateRecord2 = this.f;
        synchronized (SnapshotKt.c) {
            snapshotK = SnapshotKt.k();
            ((StateStateRecord) SnapshotKt.o(stateStateRecord2, this, snapshotK, stateStateRecord)).c = obj;
        }
        SnapshotKt.n(snapshotK, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.f;
    }

    public final String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.i(this.f)).c + ")@" + hashCode();
    }
}
