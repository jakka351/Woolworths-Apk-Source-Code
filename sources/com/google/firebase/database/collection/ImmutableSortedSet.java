package com.google.firebase.database.collection;

import com.google.firebase.database.collection.RBTreeSortedMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ImmutableSortedSet<T> implements Iterable<T> {
    public final ImmutableSortedMap d;

    public static class WrappedEntryIterator<T> implements Iterator<T> {
        public final Iterator d;

        public WrappedEntryIterator(Iterator it) {
            this.d = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            return ((Map.Entry) this.d.next()).getKey();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.d.remove();
        }
    }

    public ImmutableSortedSet(List list, Comparator comparator) {
        ImmutableSortedMap immutableSortedMapB;
        Map map = Collections.EMPTY_MAP;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i = 0;
            for (Object obj : list) {
                objArr[i] = obj;
                objArr2[i] = map.get(obj);
                i++;
            }
            immutableSortedMapB = new ArraySortedMap(comparator, objArr, objArr2);
        } else {
            immutableSortedMapB = RBTreeSortedMap.Builder.b(list, map, comparator);
        }
        this.d = immutableSortedMapB;
    }

    public final ImmutableSortedSet b(Object obj) {
        return new ImmutableSortedSet(this.d.j(obj, null));
    }

    public final Iterator d(Object obj) {
        return new WrappedEntryIterator(this.d.k(obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableSortedSet) {
            return this.d.equals(((ImmutableSortedSet) obj).d);
        }
        return false;
    }

    public final ImmutableSortedSet g(Object obj) {
        ImmutableSortedMap immutableSortedMap = this.d;
        ImmutableSortedMap immutableSortedMapL = immutableSortedMap.l(obj);
        return immutableSortedMapL == immutableSortedMap ? this : new ImmutableSortedSet(immutableSortedMapL);
    }

    public final ImmutableSortedSet h(ImmutableSortedSet immutableSortedSet) {
        ImmutableSortedSet immutableSortedSetB;
        if (this.d.size() < immutableSortedSet.d.size()) {
            immutableSortedSetB = immutableSortedSet;
            immutableSortedSet = this;
        } else {
            immutableSortedSetB = this;
        }
        Iterator it = immutableSortedSet.iterator();
        while (true) {
            WrappedEntryIterator wrappedEntryIterator = (WrappedEntryIterator) it;
            if (!wrappedEntryIterator.d.hasNext()) {
                return immutableSortedSetB;
            }
            immutableSortedSetB = immutableSortedSetB.b(wrappedEntryIterator.next());
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new WrappedEntryIterator(this.d.iterator());
    }

    public ImmutableSortedSet(ImmutableSortedMap immutableSortedMap) {
        this.d = immutableSortedMap;
    }
}
