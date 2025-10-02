package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {
    public transient UnmodifiableSortedMultiset g;

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset G0(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetG0 = ((SortedMultiset) this.d).G0(obj, boundType);
        sortedMultisetG0.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetG0);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset K1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        SortedMultiset sortedMultisetK1 = ((SortedMultiset) this.d).K1(obj, boundType, obj2, boundType2);
        sortedMultisetK1.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetK1);
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Object P1() {
        return (SortedMultiset) this.d;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    /* renamed from: R1 */
    public final Collection P1() {
        return (SortedMultiset) this.d;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset
    /* renamed from: b2 */
    public final Multiset P1() {
        return (SortedMultiset) this.d;
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return ((SortedMultiset) this.d).comparator();
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    public final Set f2() {
        return Sets.j(((SortedMultiset) this.d).c());
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return ((SortedMultiset) this.d).firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset g2(Object obj, BoundType boundType) {
        SortedMultiset sortedMultisetG2 = ((SortedMultiset) this.d).g2(obj, boundType);
        sortedMultisetG2.getClass();
        return new UnmodifiableSortedMultiset(sortedMultisetG2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return ((SortedMultiset) this.d).lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final SortedMultiset t0() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.g;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(((SortedMultiset) this.d).t0());
        unmodifiableSortedMultiset2.g = this;
        this.g = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public final NavigableSet c() {
        return (NavigableSet) super.c();
    }
}
