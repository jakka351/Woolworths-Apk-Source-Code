package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {
    public final Comparator f;
    public transient SortedMultiset g;

    public AbstractSortedMultiset() {
        this(NaturalOrdering.f);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((TreeMultiset) ((TreeMultiset) this).g2(obj, boundType)).G0(obj2, boundType2);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Set b() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator comparator() {
        return this.f;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry firstEntry() {
        Iterator itI = i();
        if (itI.hasNext()) {
            return (Multiset.Entry) itI.next();
        }
        return null;
    }

    public abstract Iterator j();

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry lastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) j();
        if (anonymousClass3.hasNext()) {
            return anonymousClass3.next();
        }
        return null;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollFirstEntry() {
        Iterator itI = i();
        if (!itI.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) itI.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(entry.a(), entry.getCount());
        itI.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry pollLastEntry() {
        TreeMultiset.AnonymousClass3 anonymousClass3 = (TreeMultiset.AnonymousClass3) j();
        if (!anonymousClass3.hasNext()) {
            return null;
        }
        Multiset.Entry<Object> next = anonymousClass3.next();
        Multisets.ImmutableEntry immutableEntry = new Multisets.ImmutableEntry(next.a(), next.getCount());
        anonymousClass3.remove();
        return immutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset t0() {
        SortedMultiset sortedMultiset = this.g;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        DescendingMultiset<Object> descendingMultiset = new DescendingMultiset<Object>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset
            public final Iterator f2() {
                return AbstractSortedMultiset.this.j();
            }

            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return Multisets.b(AbstractSortedMultiset.this.t0());
            }

            @Override // com.google.common.collect.DescendingMultiset
            public final SortedMultiset k2() {
                return AbstractSortedMultiset.this;
            }
        };
        this.g = descendingMultiset;
        return descendingMultiset;
    }

    public AbstractSortedMultiset(Comparator comparator) {
        comparator.getClass();
        this.f = comparator;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public NavigableSet c() {
        return (NavigableSet) super.c();
    }
}
