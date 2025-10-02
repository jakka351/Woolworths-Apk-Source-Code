package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multimaps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AbstractMultimap<K, V> implements Multimap<K, V> {
    public transient Collection d;
    public transient Set e;
    public transient Multiset f;
    public transient Collection g;
    public transient Map h;

    public class Entries extends Multimaps.Entries<K, V> {
        public Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        public final Multimap b() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return AbstractMultimap.this.g();
        }
    }

    public class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public class Values extends AbstractCollection<V> {
        public final /* synthetic */ AbstractMapBasedMultimap d;

        public Values(AbstractMapBasedMultimap abstractMapBasedMultimap) {
            this.d = abstractMapBasedMultimap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return this.d.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.d.p();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.d.size();
        }
    }

    @Override // com.google.common.collect.Multimap
    public Multiset F() {
        Multiset multiset = this.f;
        if (multiset != null) {
            return multiset;
        }
        Multiset multisetE = e();
        this.f = multisetE;
        return multisetE;
    }

    public abstract Map a();

    public abstract Collection c();

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        Iterator<V> it = p1().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Set d();

    public abstract Multiset e();

    @Override // com.google.common.collect.Multimap
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return p1().equals(((Multimap) obj).p1());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Iterator g();

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return p1().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Multimap
    public Set keySet() {
        Set set = this.e;
        if (set != null) {
            return set;
        }
        Set setD = d();
        this.e = setD;
        return setD;
    }

    @Override // com.google.common.collect.Multimap
    public Collection l() {
        Collection collection = this.d;
        if (collection != null) {
            return collection;
        }
        Collection collectionC = c();
        this.d = collectionC;
        return collectionC;
    }

    @Override // com.google.common.collect.Multimap
    public Map p1() {
        Map map = this.h;
        if (map != null) {
            return map;
        }
        Map mapA = a();
        this.h = mapA;
        return mapA;
    }

    @Override // com.google.common.collect.Multimap
    public boolean put(Object obj, Object obj2) {
        return get(obj).add(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) p1().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return p1().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Collection values() {
        Collection collection = this.g;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.g = collectionF;
        return collectionF;
    }

    @Override // com.google.common.collect.Multimap
    public boolean y1(Object obj, Object obj2) {
        Collection collection = (Collection) p1().get(obj);
        return collection != null && collection.contains(obj2);
    }
}
