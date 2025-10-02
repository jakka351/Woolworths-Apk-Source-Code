package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Collections2;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Sets {

    /* renamed from: com.google.common.collect.Sets$4, reason: invalid class name */
    class AnonymousClass4 extends SetView<Object> {

        /* renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* renamed from: b */
        public final UnmodifiableIterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    class AnonymousClass5 extends AbstractSet<Set<Object>> {

        /* renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Set<Object>> {

            /* renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            class C03141 extends AbstractSet<Object> {

                /* renamed from: com.google.common.collect.Sets$5$1$1$1, reason: invalid class name and collision with other inner class name */
                class C03151 extends AbstractIterator<Object> {
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        throw null;
                    }
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
                    return new C03151();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    throw null;
                }
            }

            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Set) && ((Set) obj).size() == 0) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }
    }

    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1, reason: invalid class name */
        class AnonymousClass1 extends ImmutableList<List<Object>> {
            @Override // java.util.List
            public final Object get(int i) {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            public Object writeReplace() {
                return super.writeReplace();
            }
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            ((List) obj).size();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                throw null;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            size();
            throw null;
        }
    }

    @GwtIncompatible
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final /* bridge */ /* synthetic */ Collection P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final /* bridge */ /* synthetic */ Set P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object ceiling(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Comparator comparator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* renamed from: f2 */
        public final /* bridge */ /* synthetic */ SortedSet P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object first() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object floor(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            headSet(obj, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object higher(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* renamed from: k2 */
        public final NavigableSet P1() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final Object last() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object lower(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollFirst() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final Object pollLast() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            subSet(obj, true, obj2, false);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            tailSet(obj, true);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray(Object[] objArr) {
            return ObjectArrays.c(this, objArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public final String toString() {
            return Y1();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return U1();
        }
    }

    @GwtIncompatible
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            NavigableSet<E> navigableSetTailSet = ((NavigableSet) this.d).tailSet(obj, true);
            return Iterators.f(navigableSetTailSet.iterator(), this.e);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.e(((NavigableSet) this.d).descendingIterator(), this.e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            return Sets.c(((NavigableSet) this.d).descendingSet(), this.e);
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return Iterators.f(((NavigableSet) this.d).headSet(obj, true).descendingIterator(), this.e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return Sets.c(((NavigableSet) this.d).headSet(obj, z), this.e);
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            NavigableSet<E> navigableSetTailSet = ((NavigableSet) this.d).tailSet(obj, false);
            return Iterators.f(navigableSetTailSet.iterator(), this.e);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public final Object last() {
            Iterator<E> itDescendingIterator = ((NavigableSet) this.d).descendingIterator();
            itDescendingIterator.getClass();
            Predicate predicate = this.e;
            predicate.getClass();
            while (itDescendingIterator.hasNext()) {
                E next = itDescendingIterator.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return Iterators.f(((NavigableSet) this.d).headSet(obj, false).descendingIterator(), this.e);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            return Iterables.e((NavigableSet) this.d, this.e);
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            return Iterables.e(((NavigableSet) this.d).descendingSet(), this.e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return Sets.c(((NavigableSet) this.d).subSet(obj, z, obj2, z2), this.e);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return Sets.c(((NavigableSet) this.d).tailSet(obj, z), this.e);
        }
    }

    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        @Override // java.util.SortedSet
        public final Comparator comparator() {
            return ((SortedSet) this.d).comparator();
        }

        @Override // java.util.SortedSet
        public final Object first() {
            Iterator<E> it = this.d.iterator();
            it.getClass();
            Predicate predicate = this.e;
            predicate.getClass();
            while (it.hasNext()) {
                E next = it.next();
                if (predicate.apply(next)) {
                    return next;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.SortedSet
        public final SortedSet headSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.d).headSet(obj), this.e);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.d;
            while (true) {
                Object objLast = sortedSetHeadSet.last();
                if (this.e.apply(objLast)) {
                    return objLast;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
            }
        }

        @Override // java.util.SortedSet
        public final SortedSet subSet(Object obj, Object obj2) {
            return new FilteredSortedSet(((SortedSet) this.d).subSet(obj, obj2), this.e);
        }

        @Override // java.util.SortedSet
        public final SortedSet tailSet(Object obj) {
            return new FilteredSortedSet(((SortedSet) this.d).tailSet(obj), this.e);
        }
    }

    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return Sets.g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            collection.getClass();
            return super.retainAll(collection);
        }
    }

    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* renamed from: com.google.common.collect.Sets$PowerSet$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIndexedListIterator<Set<Object>> {
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public final Object a(int i) {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj instanceof Set) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                throw null;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "powerSet(null)";
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract UnmodifiableIterator iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class SubSet<E> extends AbstractSet<E> {

        /* renamed from: com.google.common.collect.Sets$SubSet$1, reason: invalid class name */
        class AnonymousClass1 extends UnmodifiableIterator<Object> {
            public int d;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d != 0;
            }

            @Override // java.util.Iterator
            public final Object next() {
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.d);
                if (iNumberOfTrailingZeros == 32) {
                    throw new NoSuchElementException();
                }
                this.d = (~(1 << iNumberOfTrailingZeros)) & this.d;
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return Integer.bitCount(0);
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {
        public final NavigableSet d;
        public final SortedSet e;
        public transient UnmodifiableNavigableSet f;

        public UnmodifiableNavigableSet(NavigableSet navigableSet) {
            navigableSet.getClass();
            this.d = navigableSet;
            this.e = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            return this.e;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            return this.e;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: b2 */
        public final Set P1() {
            return this.e;
        }

        @Override // java.util.NavigableSet
        public final Object ceiling(Object obj) {
            return this.d.ceiling(obj);
        }

        @Override // java.util.NavigableSet
        public final Iterator descendingIterator() {
            return Iterators.n(this.d.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public final NavigableSet descendingSet() {
            UnmodifiableNavigableSet unmodifiableNavigableSet = this.f;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet2 = new UnmodifiableNavigableSet(this.d.descendingSet());
            this.f = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f = this;
            return unmodifiableNavigableSet2;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* renamed from: f2 */
        public final SortedSet P1() {
            return this.e;
        }

        @Override // java.util.NavigableSet
        public final Object floor(Object obj) {
            return this.d.floor(obj);
        }

        @Override // java.util.NavigableSet
        public final NavigableSet headSet(Object obj, boolean z) {
            return Sets.j(this.d.headSet(obj, z));
        }

        @Override // java.util.NavigableSet
        public final Object higher(Object obj) {
            return this.d.higher(obj);
        }

        @Override // java.util.NavigableSet
        public final Object lower(Object obj) {
            return this.d.lower(obj);
        }

        @Override // java.util.NavigableSet
        public final Object pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final Object pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return Sets.j(this.d.subSet(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public final NavigableSet tailSet(Object obj, boolean z) {
            return Sets.j(this.d.tailSet(obj, z));
        }
    }

    public static SetView a(final Set set, final Set set2) {
        Preconditions.j(set, "set1");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.3

            /* renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Object> {
                public final Iterator f;

                public AnonymousClass1() {
                    this.f = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.f;
                        if (!it.hasNext()) {
                            this.d = AbstractIterator.State.f;
                            return null;
                        }
                        next = it.next();
                    } while (((SingletonImmutableSet) set2).g.equals(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* renamed from: b */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static boolean b(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static NavigableSet c(NavigableSet navigableSet, Predicate predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.d, Predicates.b(filteredSet.e, predicate));
        }
        navigableSet.getClass();
        predicate.getClass();
        return new FilteredNavigableSet(navigableSet, predicate);
    }

    public static Set d(Set set, Predicate predicate) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof FilteredSet)) {
                predicate.getClass();
                return new FilteredSortedSet(collection, predicate);
            }
            FilteredSet filteredSet = (FilteredSet) collection;
            return new FilteredSortedSet((SortedSet) filteredSet.d, Predicates.b(filteredSet.e, predicate));
        }
        if (set instanceof FilteredSet) {
            FilteredSet filteredSet2 = (FilteredSet) set;
            return new FilteredSet((Set) filteredSet2.d, Predicates.b(filteredSet2.e, predicate));
        }
        set.getClass();
        predicate.getClass();
        return new FilteredSet(set, predicate);
    }

    public static int e(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static SetView f(final Set set, final ImmutableSet immutableSet) {
        Preconditions.j(set, "set1");
        Preconditions.j(immutableSet, "set2");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.2

            /* renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
            class AnonymousClass1 extends AbstractIterator<Object> {
                public final Iterator f;

                public AnonymousClass1() {
                    this.f = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    do {
                        Iterator it = this.f;
                        if (!it.hasNext()) {
                            this.d = AbstractIterator.State.f;
                            return null;
                        }
                        next = it.next();
                    } while (!immutableSet.contains(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* renamed from: b */
            public final UnmodifiableIterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) && immutableSet.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean containsAll(Collection collection) {
                return set.containsAll(collection) && immutableSet.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return Collections.disjoint(immutableSet, set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (immutableSet.contains(it.next())) {
                        i++;
                    }
                }
                return i;
            }
        };
    }

    public static boolean g(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? h(set, collection.iterator()) : Iterators.k(collection, set.iterator());
    }

    public static boolean h(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static SetView i(final Set set, final Set set2) {
        Preconditions.j(set, "set1");
        Preconditions.j(set2, "set2");
        return new SetView<Object>() { // from class: com.google.common.collect.Sets.1

            /* renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name and collision with other inner class name */
            class C03131 extends AbstractIterator<Object> {
                public final Iterator f;
                public final Iterator g;

                public C03131() {
                    this.f = set.iterator();
                    this.g = set2.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Object next;
                    Iterator it = this.f;
                    if (it.hasNext()) {
                        return it.next();
                    }
                    do {
                        Iterator it2 = this.g;
                        if (!it2.hasNext()) {
                            this.d = AbstractIterator.State.f;
                            return null;
                        }
                        next = it2.next();
                    } while (set.contains(next));
                    return next;
                }
            }

            @Override // com.google.common.collect.Sets.SetView
            /* renamed from: b */
            public final UnmodifiableIterator iterator() {
                return new C03131();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator iterator() {
                return new C03131();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                Set set3 = set;
                int size = set3.size();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (!set3.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }
        };
    }

    public static NavigableSet j(NavigableSet navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
