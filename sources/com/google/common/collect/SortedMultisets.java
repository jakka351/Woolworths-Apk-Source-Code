package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class SortedMultisets {

    public static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {
        public final SortedMultiset d;

        public ElementSet(SortedMultiset sortedMultiset) {
            this.d = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return this.d.comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Multiset.Entry entryFirstEntry = this.d.firstEntry();
            if (entryFirstEntry != null) {
                return entryFirstEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        public final Multiset h() {
            return this.d;
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return this.d.G0(obj, BoundType.d).c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return new Multisets.AnonymousClass5(this.d.entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public final Object last() {
            Multiset.Entry entryLastEntry = this.d.lastEntry();
            if (entryLastEntry != null) {
                return entryLastEntry.a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return this.d.K1(obj, BoundType.e, obj2, BoundType.d).c();
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return this.d.g2(obj, BoundType.e).c();
        }
    }

    @GwtIncompatible
    public static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return SortedMultisets.a(this.d.g2(obj, BoundType.e).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return ((ElementSet) descendingSet()).iterator();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return new NavigableElementSet(this.d.t0());
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return SortedMultisets.a(this.d.G0(obj, BoundType.e).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return new NavigableElementSet(this.d.G0(obj, BoundType.a(z)));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return SortedMultisets.a(this.d.g2(obj, BoundType.d).firstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return SortedMultisets.a(this.d.G0(obj, BoundType.d).lastEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return SortedMultisets.a(this.d.pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return SortedMultisets.a(this.d.pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new NavigableElementSet(this.d.K1(obj, BoundType.a(z), obj2, BoundType.a(z2)));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return new NavigableElementSet(this.d.g2(obj, BoundType.a(z)));
        }
    }

    public static Object a(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.a();
    }
}
