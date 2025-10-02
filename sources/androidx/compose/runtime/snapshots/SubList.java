package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SubList<T> implements List<T>, KMutableList {
    public final SnapshotStateList d;
    public final int e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010+\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/snapshots/SubList$listIterator$1", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.SubList$listIterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements ListIterator<Object>, KMutableListIterator {
        public final /* synthetic */ Ref.IntRef d;
        public final /* synthetic */ SubList e;

        public AnonymousClass1(Ref.IntRef intRef, SubList subList) {
            this.d = intRef;
            this.e = subList;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d.d < this.e.g - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d.d >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            Ref.IntRef intRef = this.d;
            int i = intRef.d + 1;
            SubList subList = this.e;
            SnapshotStateListKt.a(i, subList.g);
            intRef.d = i;
            return subList.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d.d + 1;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            Ref.IntRef intRef = this.d;
            int i = intRef.d;
            SubList subList = this.e;
            SnapshotStateListKt.a(i, subList.g);
            intRef.d = i - 1;
            return subList.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d.d;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public SubList(SnapshotStateList snapshotStateList, int i, int i2) {
        this.d = snapshotStateList;
        this.e = i;
        this.f = snapshotStateList.h();
        this.g = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.e + this.g;
        SnapshotStateList snapshotStateList = this.d;
        snapshotStateList.add(i, obj);
        this.g++;
        this.f = snapshotStateList.h();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.g, collection);
    }

    public final void b() {
        if (this.d.h() != this.f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        if (this.g > 0) {
            b();
            SnapshotStateList snapshotStateList = this.d;
            int i2 = this.e;
            int i3 = this.g + i2;
            do {
                synchronized (SnapshotStateListKt.f1708a) {
                    SnapshotStateList.StateListStateRecord stateListStateRecord = snapshotStateList.d;
                    Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    SnapshotStateList.StateListStateRecord stateListStateRecord2 = (SnapshotStateList.StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                    i = stateListStateRecord2.d;
                    persistentList = stateListStateRecord2.c;
                }
                Intrinsics.e(persistentList);
                PersistentVectorBuilder persistentVectorBuilderBuilder = persistentList.builder();
                persistentVectorBuilderBuilder.subList(i2, i3).clear();
                PersistentList persistentListG = persistentVectorBuilderBuilder.g();
                if (Intrinsics.c(persistentListG, persistentList)) {
                    break;
                }
                SnapshotStateList.StateListStateRecord stateListStateRecord3 = snapshotStateList.d;
                Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (SnapshotKt.c) {
                    snapshotK = SnapshotKt.k();
                    zD = SnapshotStateList.d((SnapshotStateList.StateListStateRecord) SnapshotKt.w(stateListStateRecord3, snapshotStateList, snapshotK), i, persistentListG, true);
                }
                SnapshotKt.n(snapshotK, snapshotStateList);
            } while (!zD);
            this.g = 0;
            this.f = this.d.h();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        SnapshotStateListKt.a(i, this.g);
        return this.d.get(this.e + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.g;
        int i2 = this.e;
        IntProgressionIterator it = RangesKt.o(i2, i + i2).iterator();
        while (it.f) {
            int iNextInt = it.nextInt();
            if (Intrinsics.c(obj, this.d.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.g;
        int i2 = this.e;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (Intrinsics.c(obj, this.d.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        PersistentList persistentList;
        Snapshot snapshotK;
        boolean zD;
        b();
        SnapshotStateList snapshotStateList = this.d;
        int i2 = this.e;
        int i3 = this.g + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (SnapshotStateListKt.f1708a) {
                SnapshotStateList.StateListStateRecord stateListStateRecord = snapshotStateList.d;
                Intrinsics.f(stateListStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                SnapshotStateList.StateListStateRecord stateListStateRecord2 = (SnapshotStateList.StateListStateRecord) SnapshotKt.i(stateListStateRecord);
                i = stateListStateRecord2.d;
                persistentList = stateListStateRecord2.c;
            }
            Intrinsics.e(persistentList);
            PersistentVectorBuilder persistentVectorBuilderBuilder = persistentList.builder();
            persistentVectorBuilderBuilder.subList(i2, i3).retainAll(collection);
            PersistentList persistentListG = persistentVectorBuilderBuilder.g();
            if (Intrinsics.c(persistentListG, persistentList)) {
                break;
            }
            SnapshotStateList.StateListStateRecord stateListStateRecord3 = snapshotStateList.d;
            Intrinsics.f(stateListStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (SnapshotKt.c) {
                snapshotK = SnapshotKt.k();
                zD = SnapshotStateList.d((SnapshotStateList.StateListStateRecord) SnapshotKt.w(stateListStateRecord3, snapshotStateList, snapshotK), i, persistentListG, true);
            }
            SnapshotKt.n(snapshotK, snapshotStateList);
        } while (!zD);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f = this.d.h();
            this.g -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        SnapshotStateListKt.a(i, this.g);
        b();
        int i2 = i + this.e;
        SnapshotStateList snapshotStateList = this.d;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.f = snapshotStateList.h();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.g;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= this.g)) {
            PreconditionsKt.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.e;
        return new SubList(this.d, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.d = i - 1;
        return new AnonymousClass1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.e;
        SnapshotStateList snapshotStateList = this.d;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.g = collection.size() + this.g;
            this.f = snapshotStateList.h();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.e + i;
        SnapshotStateList snapshotStateList = this.d;
        Object objRemove = snapshotStateList.remove(i2);
        this.g--;
        this.f = snapshotStateList.h();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.e + i;
        SnapshotStateList snapshotStateList = this.d;
        snapshotStateList.add(i2, obj);
        this.g++;
        this.f = snapshotStateList.h();
    }
}
