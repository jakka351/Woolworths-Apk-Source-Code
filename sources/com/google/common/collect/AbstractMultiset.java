package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    public transient Set d;
    public transient Set e;

    public class ElementSet extends Multisets.ElementSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset h() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.h();
        }
    }

    public class EntrySet extends Multisets.EntrySet<E> {
        public EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        public Multiset h() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return AbstractMultiset.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return AbstractMultiset.this.g();
        }
    }

    public boolean V1(int i, Object obj) {
        CollectPreconditions.b(i, "oldCount");
        CollectPreconditions.b(0, "newCount");
        if (e2(obj) != i) {
            return false;
        }
        w2(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        add(1, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof Multiset)) {
            if (collection.isEmpty()) {
                return false;
            }
            return Iterators.a(this, collection.iterator());
        }
        Multiset multiset = (Multiset) collection;
        if (!(multiset instanceof AbstractMapBasedMultiset)) {
            if (multiset.isEmpty()) {
                return false;
            }
            for (Multiset.Entry entry : multiset.entrySet()) {
                add(entry.getCount(), entry.a());
            }
            return true;
        }
        AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) multiset;
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        for (int iC = abstractMapBasedMultiset.f.c(); iC >= 0; iC = abstractMapBasedMultiset.f.k(iC)) {
            add(abstractMapBasedMultiset.f.f(iC), abstractMapBasedMultiset.f.e(iC));
        }
        return true;
    }

    public Set b() {
        return new ElementSet();
    }

    public int b0(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    public Set c() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.d = setB;
        return setB;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return e2(obj) > 0;
    }

    public Set d() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.Multiset
    public Set entrySet() {
        Set set = this.e;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.e = setD;
        return setD;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.a(this, obj);
    }

    public abstract int g();

    public abstract Iterator h();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    public abstract Iterator i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return b0(1, obj) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return c().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return c().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    public int w2(Object obj) {
        CollectPreconditions.b(0, "count");
        int iE2 = e2(obj);
        int i = 0 - iE2;
        if (i > 0) {
            add(i, obj);
            return iE2;
        }
        if (i < 0) {
            b0(-i, obj);
        }
        return iE2;
    }

    public int add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
