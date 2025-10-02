package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import com.google.common.collect.SortedLists;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {
    public static final ImmutableRangeSet e;
    public static final ImmutableRangeSet f;
    public final transient ImmutableList d;

    /* renamed from: com.google.common.collect.ImmutableRangeSet$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable>> {
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;
        public final /* synthetic */ Range h;
        public final /* synthetic */ ImmutableRangeSet i;

        public AnonymousClass1(ImmutableRangeSet immutableRangeSet, int i, int i2, Range range) {
            this.f = i;
            this.g = i2;
            this.h = range;
            this.i = immutableRangeSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.i.d;
            int i2 = this.f;
            Preconditions.i(i, i2);
            int i3 = this.g;
            return (i == 0 || i == i2 + (-1)) ? ((Range) immutableList.get(i + i3)).d(this.h) : (Range) immutableList.get(i + i3);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class AsSet extends ImmutableSortedSet<C> {
        public transient Integer i;

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Comparable> {
            public final UnmodifiableListIterator f;
            public final UnmodifiableIterator g;

            public AnonymousClass1(AsSet asSet) {
                asSet.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.g;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.f;
                if (!unmodifiableListIterator.hasNext()) {
                    this.d = AbstractIterator.State.f;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                int i = ContiguousSet.i;
                range.getClass();
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.ImmutableRangeSet$AsSet$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Comparable> {
            public final UnmodifiableListIterator f;
            public final UnmodifiableIterator g;

            public AnonymousClass2(AsSet asSet) {
                asSet.getClass();
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                UnmodifiableIterator unmodifiableIterator = this.g;
                if (unmodifiableIterator.hasNext()) {
                    return (Comparable) unmodifiableIterator.next();
                }
                UnmodifiableListIterator unmodifiableListIterator = this.f;
                if (!unmodifiableListIterator.hasNext()) {
                    this.d = AbstractIterator.State.f;
                    return null;
                }
                Range range = (Range) unmodifiableListIterator.next();
                int i = ContiguousSet.i;
                range.getClass();
                throw null;
            }
        }

        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet B() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* renamed from: C */
        public final UnmodifiableIterator descendingIterator() {
            return new AnonymousClass2(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet I(Object obj, boolean z) {
            P(Range.h((Comparable) obj, BoundType.a(z)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet L(Object obj, boolean z, Object obj2, boolean z2) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z && !z2) {
                Range range = Range.f;
                if (comparable.compareTo(comparable2) == 0) {
                    return RegularImmutableSortedSet.j;
                }
            }
            P(Range.g(comparable, BoundType.a(z), comparable2, BoundType.a(z2)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet O(Object obj, boolean z) {
            P(Range.b((Comparable) obj, BoundType.a(z)));
            throw null;
        }

        public final ImmutableSortedSet P(Range range) {
            Cut cut = range.e;
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new AnonymousClass2(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return new AnonymousClass1(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: k */
        public final UnmodifiableIterator iterator() {
            return new AnonymousClass1(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Integer num = this.i;
            num.getClass();
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        public Object writeReplace() {
            throw null;
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        public AsSetSerializedForm(ImmutableList immutableList) {
        }

        public Object readResolve() {
            throw null;
        }
    }

    public static class Builder<C extends Comparable<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f14890a = new ArrayList();
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        @Override // java.util.List
        public final Object get(int i) {
            Preconditions.i(i, 0);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final ImmutableList d;

        public SerializedForm(ImmutableList immutableList) {
            this.d = immutableList;
        }

        public Object readResolve() {
            ImmutableList immutableList = this.d;
            return immutableList.isEmpty() ? ImmutableRangeSet.e : immutableList.equals(ImmutableList.w(Range.f)) ? ImmutableRangeSet.f : new ImmutableRangeSet(immutableList);
        }
    }

    static {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
        e = new ImmutableRangeSet(RegularImmutableList.h);
        f = new ImmutableRangeSet(ImmutableList.w(Range.f));
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.d = immutableList;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.RangeSet
    public final Set a() {
        ImmutableList immutableList = this.d;
        if (immutableList.isEmpty()) {
            int i = ImmutableSet.f;
            return RegularImmutableSet.m;
        }
        Range range = Range.f;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range b(Comparable comparable) {
        int iA;
        e eVar = new e(0);
        Cut.BelowValue belowValueA = Cut.a(comparable);
        ImmutableList immutableList = this.d;
        AbstractList abstractListD = Lists.d(immutableList, eVar);
        if (!(abstractListD instanceof RandomAccess)) {
            abstractListD = new ArrayList(abstractListD);
        }
        int size = abstractListD.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                iA = SortedLists.KeyAbsentBehavior.d.a(i);
                break;
            }
            int i2 = (i + size) >>> 1;
            int iCompare = NaturalOrdering.f.compare(belowValueA, abstractListD.get(i2));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    int i3 = i2 - i;
                    SortedLists.KeyPresentBehavior.d.a(belowValueA, abstractListD.subList(i, size + 1), i3);
                    iA = i + i3;
                    break;
                }
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        if (iA == -1) {
            return null;
        }
        Range range = (Range) immutableList.get(iA);
        if (range.a(comparable)) {
            return range;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range c() {
        ImmutableList immutableList = this.d;
        if (immutableList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new Range(((Range) immutableList.get(0)).d, ((Range) immutableList.get(immutableList.size() - 1)).e);
    }

    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this.d);
    }
}
