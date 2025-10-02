package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, KMutableList {
    public StateListStateRecord d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/StateRecord;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class StateListStateRecord<T> extends StateRecord {
        public PersistentList c;
        public int d;
        public int e;

        public StateListStateRecord(long j, PersistentList persistentList) {
            super(j);
            this.c = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            synchronized (SnapshotStateListKt.f1708a) {
                Intrinsics.f(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.c = ((StateListStateRecord) stateRecord).c;
                this.d = ((StateListStateRecord) stateRecord).d;
                this.e = ((StateListStateRecord) stateRecord).e;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return c(SnapshotKt.k().getB());
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord c(long j) {
            return new StateListStateRecord(j, this.c);
        }
    }

    public SnapshotStateList() {
        Snapshot snapshotK = SnapshotKt.k();
        long b = snapshotK.getB();
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.e;
        StateListStateRecord stateListStateRecord = new StateListStateRecord(b, smallPersistentVector);
        if (!(snapshotK instanceof GlobalSnapshot)) {
            stateListStateRecord.b = new StateListStateRecord(1, smallPersistentVector);
        }
        this.d = stateListStateRecord;
    }

    public static boolean d(StateListStateRecord stateListStateRecord, int i, PersistentList persistentList, boolean z) {
        boolean z2;
        synchronized (SnapshotStateListKt.f1708a) {
            try {
                int i2 = stateListStateRecord.d;
                if (i2 == i) {
                    stateListStateRecord.c = persistentList;
                    z2 = true;
                    if (z) {
                        stateListStateRecord.e++;
                    }
                    stateListStateRecord.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListAdd = persistentList.add(obj);
            if (persistentListAdd.equals(persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i, persistentListAdd, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return i(new Function1<List<Object>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void b(StateRecord stateRecord) {
        stateRecord.b = this.d;
        this.d = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        Snapshot snapshotK;
        StateListStateRecord stateListStateRecord = this.d;
        Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (SnapshotKt.c) {
            snapshotK = SnapshotKt.k();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.w(stateListStateRecord, this, snapshotK);
            synchronized (SnapshotStateListKt.f1708a) {
                stateListStateRecord2.c = SmallPersistentVector.e;
                stateListStateRecord2.d++;
                stateListStateRecord2.e++;
            }
        }
        SnapshotKt.n(snapshotK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return g().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return g().c.containsAll(collection);
    }

    public final StateListStateRecord g() {
        StateListStateRecord stateListStateRecord = this.d;
        Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.t(stateListStateRecord, this);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return g().c.get(i);
    }

    public final int h() {
        StateListStateRecord stateListStateRecord = this.d;
        Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.i(stateListStateRecord)).e;
    }

    public final boolean i(Function1 function1) {
        int i;
        PersistentList persistentList;
        Object objInvoke;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentVectorBuilder persistentVectorBuilderBuilder = persistentList.builder();
            objInvoke = function1.invoke(persistentVectorBuilderBuilder);
            PersistentList persistentListG = persistentVectorBuilderBuilder.g();
            if (Intrinsics.c(persistentListG, persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i, persistentListG, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return g().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return g().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return g().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        Object obj = get(i);
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListM1 = persistentList.m1(i);
            if (persistentListM1.equals(persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i2, persistentListM1, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListRemoveAll = persistentList.removeAll(collection);
            if (Intrinsics.c(persistentListRemoveAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i, persistentListRemoveAll, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(final Collection collection) {
        return i(new Function1<List<Object>, Boolean>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).retainAll(collection));
            }
        });
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        Object obj2 = get(i);
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentList2 = persistentList.set(i, obj);
            if (persistentList2.equals(persistentList)) {
                break;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i2, persistentList2, false);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return g().c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            PreconditionsKt.a("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i, i2);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord t() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    public final String toString() {
        StateListStateRecord stateListStateRecord = this.d;
        Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.i(stateListStateRecord)).c + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListAddAll = persistentList.addAll(collection);
            if (Intrinsics.c(persistentListAddAll, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i, persistentListAddAll, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new StateListIterator(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i2 = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListAdd = persistentList.add(i, obj);
            if (persistentListAdd.equals(persistentList)) {
                return;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i2, persistentListAdd, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                StateListStateRecord stateListStateRecord = this.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentList persistentListRemove = persistentList.remove(obj);
            if (Intrinsics.c(persistentListRemove, persistentList)) {
                return false;
            }
            StateListStateRecord stateListStateRecord3 = this.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = d((StateListStateRecord) SnapshotKt.w(stateListStateRecord3, this, snapshotK), i, persistentListRemove, true);
            }
            SnapshotKt.n(snapshotK, this);
        } while (!zD);
        return true;
    }
}
