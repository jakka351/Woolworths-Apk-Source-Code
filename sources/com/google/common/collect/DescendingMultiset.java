package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {
    public transient Ordering d;
    public transient NavigableSet e;
    public transient Set f;

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G0(Object obj, BoundType boundType) {
        return ((TreeMultiset) k2()).g2(obj, boundType).t0();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return k2().K1(obj2, boundType2, obj, boundType).t0();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Object P1() {
        return k2();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* renamed from: R1 */
    public final Collection P1() {
        return k2();
    }

    @Override // com.google.common.collect.ForwardingMultiset
    /* renamed from: b2 */
    public final Multiset P1() {
        return k2();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        Ordering ordering = this.d;
        if (ordering != null) {
            return ordering;
        }
        Ordering orderingG = Ordering.b(k2().comparator()).g();
        this.d = orderingG;
        return orderingG;
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final Set entrySet() {
        Set set = this.f;
        if (set != null) {
            return set;
        }
        Multisets.EntrySet<Object> entrySet = new Multisets.EntrySet<Object>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            public final Multiset h() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return DescendingMultiset.this.f2();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return DescendingMultiset.this.k2().entrySet().size();
            }
        };
        this.f = entrySet;
        return entrySet;
    }

    public abstract Iterator f2();

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return k2().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset g2(Object obj, BoundType boundType) {
        return ((TreeMultiset) k2()).G0(obj, boundType).t0();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return Multisets.b(this);
    }

    public abstract SortedMultiset k2();

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return k2().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        return k2().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        return k2().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0() {
        return k2();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return U1();
    }

    @Override // com.google.common.collect.ForwardingObject
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return ObjectArrays.c(this, objArr);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        NavigableSet navigableSet = this.e;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.e = navigableElementSet;
        return navigableElementSet;
    }
}
