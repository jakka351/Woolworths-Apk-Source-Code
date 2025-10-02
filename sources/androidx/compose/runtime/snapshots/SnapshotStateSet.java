package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "StateSetStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, KMutableSet {
    public StateSetStateRecord d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet$StateSetStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class StateSetStateRecord<T> extends StateRecord {
        public PersistentSet c;
        public int d;

        public StateSetStateRecord(long j, PersistentSet persistentSet) {
            super(j);
            this.c = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            synchronized (SnapshotStateSetKt.f1713a) {
                Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.c = ((StateSetStateRecord) stateRecord).c;
                this.d = ((StateSetStateRecord) stateRecord).d;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateSetStateRecord(SnapshotKt.k().getB(), this.c);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new StateSetStateRecord(j, this.c);
        }
    }

    public static boolean d(StateSetStateRecord stateSetStateRecord, int i, PersistentSet persistentSet) {
        boolean z;
        synchronized (SnapshotStateSetKt.f1713a) {
            int i2 = stateSetStateRecord.d;
            if (i2 == i) {
                stateSetStateRecord.c = persistentSet;
                z = true;
                stateSetStateRecord.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateSetKt.f1713a) {
                StateSetStateRecord stateSetStateRecord = this.d;
                Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.i(stateSetStateRecord);
                i = stateSetStateRecord2.d;
                persistentSet = stateSetStateRecord2.c;
            }
            Intrinsics.e(persistentSet);
            PersistentSet persistentSetAdd = persistentSet.add(obj);
            if (persistentSetAdd.equals(persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.d;
            Intrinsics.f(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateSetStateRecord) SnapshotKt.w(stateSetStateRecord3, this, snapshotK), i, persistentSetAdd);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateSetKt.f1713a) {
                StateSetStateRecord stateSetStateRecord = this.d;
                Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.i(stateSetStateRecord);
                i = stateSetStateRecord2.d;
                persistentSet = stateSetStateRecord2.c;
            }
            Intrinsics.e(persistentSet);
            PersistentSet persistentSetAddAll = persistentSet.addAll(collection);
            if (Intrinsics.c(persistentSetAddAll, persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.d;
            Intrinsics.f(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateSetStateRecord) SnapshotKt.w(stateSetStateRecord3, this, snapshotK), i, persistentSetAddAll);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        stateRecord.b = this.d;
        this.d = (StateSetStateRecord) stateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        Snapshot snapshotK;
        StateSetStateRecord stateSetStateRecord = this.d;
        Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        synchronized (SnapshotKt.c) {
            snapshotK = SnapshotKt.k();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.w(stateSetStateRecord, this, snapshotK);
            synchronized (SnapshotStateSetKt.f1713a) {
                stateSetStateRecord2.c = PersistentOrderedSet.g;
                stateSetStateRecord2.d++;
            }
        }
        SnapshotKt.n(snapshotK, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return h().c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return h().c.containsAll(collection);
    }

    public final int g() {
        StateSetStateRecord stateSetStateRecord = this.d;
        Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.i(stateSetStateRecord)).d;
    }

    public final StateSetStateRecord h() {
        StateSetStateRecord stateSetStateRecord = this.d;
        Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.t(stateSetStateRecord, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return h().c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new StateSetIterator(this, h().c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateSetKt.f1713a) {
                StateSetStateRecord stateSetStateRecord = this.d;
                Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.i(stateSetStateRecord);
                i = stateSetStateRecord2.d;
                persistentSet = stateSetStateRecord2.c;
            }
            Intrinsics.e(persistentSet);
            PersistentSet persistentSetRemove = persistentSet.remove(obj);
            if (persistentSetRemove.equals(persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.d;
            Intrinsics.f(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateSetStateRecord) SnapshotKt.w(stateSetStateRecord3, this, snapshotK), i, persistentSetRemove);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentSet persistentSet;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateSetKt.f1713a) {
                StateSetStateRecord stateSetStateRecord = this.d;
                Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.i(stateSetStateRecord);
                i = stateSetStateRecord2.d;
                persistentSet = stateSetStateRecord2.c;
            }
            Intrinsics.e(persistentSet);
            PersistentSet persistentSetRemoveAll = persistentSet.removeAll(collection);
            if (Intrinsics.c(persistentSetRemoveAll, persistentSet)) {
                return false;
            }
            StateSetStateRecord stateSetStateRecord3 = this.d;
            Intrinsics.f(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateSetStateRecord) SnapshotKt.w(stateSetStateRecord3, this, snapshotK), i, persistentSetRemoveAll);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(final Collection collection) {
        int i;
        PersistentSet persistentSet;
        Object objInvoke;
        Snapshot snapshotK;
        boolean zD;
        Function1<Set<Object>, Boolean> function1 = new Function1<Set<Object>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((Set) obj).retainAll(CollectionsKt.L0(collection)));
            }
        };
        do {
            synchronized (SnapshotStateSetKt.f1713a) {
                StateSetStateRecord stateSetStateRecord = this.d;
                Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.i(stateSetStateRecord);
                i = stateSetStateRecord2.d;
                persistentSet = stateSetStateRecord2.c;
            }
            if (persistentSet == null) {
                throw new IllegalStateException("No set to mutate");
            }
            PersistentSet.Builder builder = persistentSet.builder();
            objInvoke = function1.invoke(builder);
            PersistentSet persistentSetBuild = builder.build();
            if (Intrinsics.c(persistentSetBuild, persistentSet)) {
                break;
            }
            StateSetStateRecord stateSetStateRecord3 = this.d;
            Intrinsics.f(stateSetStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateSetStateRecord) SnapshotKt.w(stateSetStateRecord3, this, snapshotK), i, persistentSetBuild);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return h().c.size();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final String toString() {
        StateSetStateRecord stateSetStateRecord = this.d;
        Intrinsics.f(stateSetStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.i(stateSetStateRecord)).c + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }
}
