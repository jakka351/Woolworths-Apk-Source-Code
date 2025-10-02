package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet j;
    public final transient ImmutableList i;

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        j = new RegularImmutableSortedSet(RegularImmutableList.h, NaturalOrdering.f);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.i = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet B() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.g);
        return isEmpty() ? ImmutableSortedSet.E(comparatorReverseOrder) : new RegularImmutableSortedSet(this.i.z(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: C */
    public final UnmodifiableIterator descendingIterator() {
        return this.i.z().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet I(Object obj, boolean z) {
        return P(0, Q(obj, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z, Object obj2, boolean z2) {
        return O(obj, z).I(obj2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet O(Object obj, boolean z) {
        return P(S(obj, z), this.i.size());
    }

    public final RegularImmutableSortedSet P(int i, int i2) {
        ImmutableList immutableList = this.i;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.g;
        return i < i2 ? new RegularImmutableSortedSet(immutableList.subList(i, i2), comparator) : ImmutableSortedSet.E(comparator);
    }

    public final int Q(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.g);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int S(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.i, obj, this.g);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList b() {
        return this.i;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iS = S(obj, true);
        ImmutableList immutableList = this.i;
        if (iS == immutableList.size()) {
            return null;
        }
        return immutableList.get(iS);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.i, obj, this.g) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).c();
        }
        Comparator comparator = this.g;
        if (!SortedIterables.a(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator it = iterator();
        Iterator<E> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        E next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int d(int i, Object[] objArr) {
        return this.i.d(i, objArr);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.i.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.g;
        if (!SortedIterables.a(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            UnmodifiableIterator it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || comparator.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.i.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iQ = Q(obj, true) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.i.get(iQ);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.i.g();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.i.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iS = S(obj, false);
        ImmutableList immutableList = this.i;
        if (iS == immutableList.size()) {
            return null;
        }
        return immutableList.get(iS);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int i() {
        return this.i.i();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return this.i.j();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return this.i.listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.i.get(r0.size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iQ = Q(obj, false) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.i.get(iQ);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.i.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
