package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableSetWrapper;", "E", "Landroidx/collection/SetWrapper;", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class MutableSetWrapper<E> extends SetWrapper<E> implements Set<E>, KMutableSet {
    public final MutableScatterSet e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableSetWrapper$iterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.MutableSetWrapper$iterator$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 implements Iterator<Object>, KMutableIterator {
        public int d = -1;
        public final Iterator e;

        public AnonymousClass1() {
            this.e = SequencesKt.o(new MutableSetWrapper$iterator$1$iterator$1(MutableSetWrapper.this, this, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return this.e.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.d;
            if (i != -1) {
                MutableSetWrapper.this.e.o(i);
                this.d = -1;
            }
        }
    }

    public MutableSetWrapper(MutableScatterSet mutableScatterSet) {
        super(mutableScatterSet);
        this.e = mutableScatterSet;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.e.e(obj);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        MutableScatterSet mutableScatterSet = this.e;
        mutableScatterSet.getClass();
        int i = mutableScatterSet.d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            mutableScatterSet.m(it.next());
        }
        return i != mutableScatterSet.d;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        this.e.g();
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1();
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.e.n(obj);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        MutableScatterSet mutableScatterSet = this.e;
        mutableScatterSet.getClass();
        int i = mutableScatterSet.d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            mutableScatterSet.k(it.next());
        }
        return i != mutableScatterSet.d;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        boolean z;
        Intrinsics.h(elements, "elements");
        MutableScatterSet mutableScatterSet = this.e;
        mutableScatterSet.getClass();
        Object[] objArr = mutableScatterSet.b;
        int i = mutableScatterSet.d;
        long[] jArr = mutableScatterSet.f700a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.t(elements, objArr[i5])) {
                                mutableScatterSet.o(i5);
                            }
                        }
                        j >>= 8;
                    }
                    z = false;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    z = false;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        } else {
            z = false;
        }
        if (i != mutableScatterSet.d) {
            return true;
        }
        return z;
    }
}
