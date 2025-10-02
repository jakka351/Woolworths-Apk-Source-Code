package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Multiset;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset j;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.j = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        return this.j.e2(obj);
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry firstEntry() {
        return this.j.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return this.j.j();
    }

    @Override // com.google.common.collect.SortedMultiset
    public final Multiset.Entry lastEntry() {
        return this.j.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final Multiset.Entry o(int i) {
        return (Multiset.Entry) this.j.entrySet().b().z().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* renamed from: q */
    public final ImmutableSortedMultiset t0() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet c() {
        return this.j.c().descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.j.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset G0(Object obj, BoundType boundType) {
        return this.j.g2(obj, boundType).t0();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public final SortedMultiset t0() {
        return this.j;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset g2(Object obj, BoundType boundType) {
        return this.j.G0(obj, boundType).t0();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
