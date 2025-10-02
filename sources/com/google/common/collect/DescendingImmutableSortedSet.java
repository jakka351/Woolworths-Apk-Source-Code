package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public final ImmutableSortedSet i;

    public DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(Ordering.b(immutableSortedSet.g).g());
        this.i = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet B() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: C */
    public final UnmodifiableIterator descendingIterator() {
        return this.i.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* renamed from: D */
    public final ImmutableSortedSet descendingSet() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet I(Object obj, boolean z) {
        return this.i.tailSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z, Object obj2, boolean z2) {
        return this.i.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet O(Object obj, boolean z) {
        return this.i.headSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.i.floor(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.i.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.i.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.i.ceiling(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.i.lower(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.i.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return this.i.j();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return this.i.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.i.higher(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
