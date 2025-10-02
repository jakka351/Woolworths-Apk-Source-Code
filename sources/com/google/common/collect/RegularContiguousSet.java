package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public static final /* synthetic */ int k = 0;
    public final Range j;

    /* renamed from: com.google.common.collect.RegularContiguousSet$3, reason: invalid class name */
    class AnonymousClass3 extends ImmutableAsList<Comparable> {
        @Override // com.google.common.collect.ImmutableAsList
        public final ImmutableCollection D() {
            return null;
        }

        @Override // java.util.List
        public final Object get(int i) {
            Preconditions.i(i, size());
            throw null;
        }

        @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final Range d;

        public SerializedForm(Range range) {
            this.d = range;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.d);
        }
    }

    public RegularContiguousSet(Range range) {
        this.j = range;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final UnmodifiableIterator descendingIterator() {
        return new AbstractSequentialIterator<Comparable>(this, last()) { // from class: com.google.common.collect.RegularContiguousSet.2
            public final Comparable e;

            {
                this.e = this.first();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i = RegularContiguousSet.k;
                Comparable comparable2 = this.e;
                if (comparable2 == null) {
                    throw null;
                }
                Range range = Range.f;
                if (comparable.compareTo(comparable2) == 0) {
                    return null;
                }
                throw null;
            }
        };
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet I(Comparable comparable, boolean z) {
        return V(Range.h(comparable, BoundType.a(z)));
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range Q() {
        Range range = this.j;
        return new Range(range.d.p(), range.e.q());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet L(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return (comparable.compareTo(comparable2) != 0 || z || z2) ? V(Range.g(comparable, BoundType.a(z), comparable2, BoundType.a(z2))) : new EmptyContiguousSet();
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet O(Comparable comparable, boolean z) {
        return V(Range.b(comparable, BoundType.a(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableM = this.j.d.m();
        Objects.requireNonNull(comparableM);
        return comparableM;
    }

    public final ContiguousSet V(Range range) {
        Range range2 = this.j;
        if (!range2.e(range)) {
            return new EmptyContiguousSet();
        }
        range2.d(range);
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableF = this.j.e.f();
        Objects.requireNonNull(comparableF);
        return comparableF;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.j.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return Collections2.a(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            throw null;
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Sets.e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k */
    public final UnmodifiableIterator iterator() {
        return new AbstractSequentialIterator<Comparable>(this, first()) { // from class: com.google.common.collect.RegularContiguousSet.1
            public final Comparable e;

            {
                this.e = this.last();
            }

            @Override // com.google.common.collect.AbstractSequentialIterator
            public final Object a(Object obj) {
                Comparable comparable = (Comparable) obj;
                int i = RegularContiguousSet.k;
                Comparable comparable2 = this.e;
                if (comparable2 == null) {
                    throw null;
                }
                Range range = Range.f;
                if (comparable.compareTo(comparable2) == 0) {
                    return null;
                }
                throw null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        first();
        last();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList t() {
        throw null;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.j);
    }
}
