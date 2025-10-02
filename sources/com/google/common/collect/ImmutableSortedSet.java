package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E> {
    public final transient Comparator g;
    public transient ImmutableSortedSet h;

    public static final class Builder<E> extends ImmutableSet.Builder<E> {
        public final Comparator f;

        public Builder(Comparator comparator) {
            super(4);
            comparator.getClass();
            this.f = comparator;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        public final ImmutableCollection.Builder a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder
        /* renamed from: c */
        public final ImmutableCollection.ArrayBasedBuilder a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        /* renamed from: h */
        public final ImmutableSet.Builder a(Object obj) {
            super.a(obj);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder i(Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder j(Iterable iterable) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet k() {
            ImmutableSortedSet immutableSortedSetZ = ImmutableSortedSet.z(this.f, this.b, this.f14883a);
            this.b = ((RegularImmutableSortedSet) immutableSortedSetZ).i.size();
            this.c = true;
            return immutableSortedSetZ;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder
        public final ImmutableSet.Builder l(ImmutableSet.Builder builder) {
            super.l(builder);
            return this;
        }

        public final void m(Object... objArr) {
            super.i(objArr);
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<E> implements Serializable {
        public final Comparator d;
        public final Object[] e;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.d = comparator;
            this.e = objArr;
        }

        public Object readResolve() {
            Builder builder = new Builder(this.d);
            builder.m(this.e);
            ImmutableSortedSet immutableSortedSetZ = ImmutableSortedSet.z(builder.f, builder.b, builder.f14883a);
            builder.b = ((RegularImmutableSortedSet) immutableSortedSetZ).i.size();
            builder.c = true;
            return immutableSortedSetZ;
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.g = comparator;
    }

    public static RegularImmutableSortedSet E(Comparator comparator) {
        return NaturalOrdering.f.equals(comparator) ? RegularImmutableSortedSet.j : new RegularImmutableSortedSet(RegularImmutableList.h, comparator);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSortedSet z(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return E(comparator);
        }
        ObjectArrays.a(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.l(i2, objArr), comparator);
    }

    public abstract ImmutableSortedSet B();

    @Override // java.util.NavigableSet
    /* renamed from: C */
    public abstract UnmodifiableIterator descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.h;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet immutableSortedSetB = B();
        this.h = immutableSortedSetB;
        immutableSortedSetB.h = this;
        return immutableSortedSetB;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z) {
        obj.getClass();
        return I(obj, z);
    }

    public abstract ImmutableSortedSet I(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        Preconditions.g(this.g.compare(obj, obj2) <= 0);
        return L(obj, z, obj2, z2);
    }

    public abstract ImmutableSortedSet L(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return O(obj, z);
    }

    public abstract ImmutableSortedSet O(Object obj, boolean z);

    public Object ceiling(Object obj) {
        return Iterators.h(tailSet(obj, true).iterator(), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public final Comparator comparator() {
        return this.g;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return Iterators.h(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return Iterators.h(tailSet(obj, false).iterator(), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return Iterators.h(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.g, toArray(ImmutableCollection.d));
    }
}
