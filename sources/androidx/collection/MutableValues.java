package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/collection/MutableValues;", "K", "V", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class MutableValues<K, V> implements Collection<V>, KMutableCollection {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010)\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/collection/MutableValues$iterator$1", "", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.collection.MutableValues$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<Object>, KMutableIterator {
        public final Iterator d;
        public int e = -1;

        public AnonymousClass1(MutableValues mutableValues) {
            this.d = SequencesKt.o(new MutableValues$iterator$1$iterator$1(mutableValues, null));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.e = ((Number) this.d.next()).intValue();
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.e >= 0) {
                throw null;
            }
        }
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next();
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        throw null;
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.a(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.h(array, "array");
        return CollectionToArray.b(this, array);
    }
}
