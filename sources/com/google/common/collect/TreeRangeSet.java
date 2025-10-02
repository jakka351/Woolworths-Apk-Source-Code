package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Cut;
import com.google.common.collect.Iterators;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    public final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public final Object P1() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: R1 */
        public final Collection P1() {
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            return Sets.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return Sets.e(this);
        }
    }

    public final class Complement extends TreeRangeSet<C> {
    }

    public static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final NavigableMap d = new RangesByUpperBound();
        public final Range e;

        public ComplementRangesByLowerBound(Range range) {
            this.e = range;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Collection collectionValues;
            Range range = this.e;
            Cut cut = range.d;
            Map map = this.d;
            Cut cut2 = Cut.BelowAll.e;
            if (cut != cut2) {
                collectionValues = ((RangesByUpperBound) map).tailMap((Cut) cut.e(), range.d.n() == BoundType.e).values();
            } else {
                collectionValues = ((AbstractMap) map).values();
            }
            PeekingIterator peekingIteratorI = Iterators.i(collectionValues.iterator());
            if (!range.a(cut2) || (peekingIteratorI.hasNext() && ((Range) ((Iterators.PeekingImpl) peekingIteratorI).a()).d == cut2)) {
                if (!peekingIteratorI.hasNext()) {
                    return Iterators.ArrayItr.g;
                }
                cut2 = ((Range) peekingIteratorI.next()).e;
            }
            return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>(this, cut2, peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1
                public Cut f;
                public final /* synthetic */ PeekingIterator g;
                public final /* synthetic */ ComplementRangesByLowerBound h;

                {
                    this.g = peekingIteratorI;
                    this.h = this;
                    this.f = cut2;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.AbstractIterator
                public final Object a() {
                    Range range2;
                    if (!this.h.e.e.l(this.f)) {
                        Cut cut3 = this.f;
                        Cut.AboveAll aboveAll = Cut.AboveAll.e;
                        if (cut3 != aboveAll) {
                            PeekingIterator peekingIterator = this.g;
                            if (peekingIterator.hasNext()) {
                                Range range3 = (Range) peekingIterator.next();
                                range2 = new Range(this.f, range3.d);
                                this.f = range3.e;
                            } else {
                                range2 = new Range(this.f, aboveAll);
                                this.f = aboveAll;
                            }
                            return new ImmutableEntry(range2.d, range2);
                        }
                    }
                    this.d = AbstractIterator.State.f;
                    return null;
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.e;
            boolean zC = range.c();
            Cut cut = range.e;
            Cut.AboveAll aboveAll = Cut.AboveAll.e;
            PeekingIterator peekingIteratorI = Iterators.i(((RangesByUpperBound) this.d).headMap(zC ? (Cut) cut.e() : aboveAll, range.c() && cut.o() == BoundType.e).descendingMap().values().iterator());
            if (!peekingIteratorI.hasNext()) {
                if (range.a(Cut.BelowAll.e)) {
                    throw null;
                }
                return Iterators.ArrayItr.g;
            }
            Iterators.PeekingImpl peekingImpl = (Iterators.PeekingImpl) peekingIteratorI;
            if (((Range) peekingImpl.a()).e == aboveAll) {
                return new AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>>(this, (Cut) MoreObjects.a(((Range) peekingIteratorI.next()).d, aboveAll), peekingIteratorI) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2
                    public Cut f;
                    public final /* synthetic */ PeekingIterator g;
                    public final /* synthetic */ ComplementRangesByLowerBound h;

                    {
                        this.g = peekingIteratorI;
                        this.h = this;
                        this.f = cut;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.common.collect.AbstractIterator
                    public final Object a() {
                        Range range2 = this.h.e;
                        Cut cut2 = this.f;
                        AbstractIterator.State state = AbstractIterator.State.f;
                        Cut.BelowAll belowAll = Cut.BelowAll.e;
                        if (cut2 == belowAll) {
                            this.d = state;
                            return null;
                        }
                        PeekingIterator peekingIterator = this.g;
                        if (peekingIterator.hasNext()) {
                            Range range3 = (Range) peekingIterator.next();
                            Cut cut3 = range3.e;
                            Range range4 = new Range(cut3, this.f);
                            this.f = range3.d;
                            if (range2.d.l(cut3)) {
                                return new ImmutableEntry(cut3, range4);
                            }
                        } else if (range2.d.l(belowAll)) {
                            Range range5 = new Range(belowAll, this.f);
                            this.f = belowAll;
                            return new ImmutableEntry(belowAll, range5);
                        }
                        this.d = state;
                        return null;
                    }
                };
            }
            Cut cut2 = ((Range) peekingImpl.a()).e;
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Range get(Object obj) {
            if (!(obj instanceof Cut)) {
                return null;
            }
            try {
                Cut cut = (Cut) obj;
                Map.Entry entryFirstEntry = d(Range.b(cut, BoundType.a(true))).firstEntry();
                if (entryFirstEntry == null || !((Cut) entryFirstEntry.getKey()).equals(cut)) {
                    return null;
                }
                return (Range) entryFirstEntry.getValue();
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.e;
            return !range2.e(range) ? ImmutableSortedMap.j : new ComplementRangesByLowerBound(range.d(range2));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return d(Range.h((Cut) obj, BoundType.a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            return Iterators.l(a());
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return d(Range.g((Cut) obj, BoundType.a(z), (Cut) obj2, BoundType.a(z2)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return d(Range.b((Cut) obj, BoundType.a(z)));
        }
    }

    public final class SubRangeSet extends TreeRangeSet<C> {
    }

    public static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range d;

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$SubRangeSetRangesByLowerBound$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public SubRangeSetRangesByLowerBound(Range range) {
            this.d = range;
            throw null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.d.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.d;
            if (!range.e(range2)) {
                return ImmutableSortedMap.j;
            }
            new SubRangeSetRangesByLowerBound(range2.d(range));
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return d(Range.h((Cut) obj, BoundType.a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return d(Range.g((Cut) obj, BoundType.a(z), (Cut) obj2, BoundType.a(z2)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return d(Range.b((Cut) obj, BoundType.a(z)));
        }
    }

    @Override // com.google.common.collect.RangeSet
    public final Set a() {
        throw null;
    }

    @VisibleForTesting
    public static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {
        public final Range d;

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.TreeRangeSet$RangesByUpperBound$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Map.Entry<Cut<Comparable<?>>, Range<Comparable<?>>>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        public RangesByUpperBound() {
            this.d = Range.f;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public final Iterator a() {
            Cut cut = this.d.d;
            if (cut == Cut.BelowAll.e) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        public final Iterator b() {
            Range range = this.d;
            if (!range.c()) {
                throw null;
            }
            throw null;
        }

        public final Range c(Object obj) {
            if (obj instanceof Cut) {
                try {
                    if (this.d.a((Cut) obj)) {
                        throw null;
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.SortedMap
        public final Comparator comparator() {
            return NaturalOrdering.f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            c(obj);
            return false;
        }

        public final NavigableMap d(Range range) {
            Range range2 = this.d;
            return range.e(range2) ? new RangesByUpperBound(range.d(range2)) : ImmutableSortedMap.j;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            c(obj);
            return null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap headMap(Object obj, boolean z) {
            return d(Range.h((Cut) obj, BoundType.a(z)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean isEmpty() {
            if (this.d.equals(Range.f)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            if (this.d.equals(Range.f)) {
                throw null;
            }
            a();
            throw null;
        }

        @Override // java.util.NavigableMap
        public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return d(Range.g((Cut) obj, BoundType.a(z), (Cut) obj2, BoundType.a(z2)));
        }

        @Override // java.util.NavigableMap
        public final NavigableMap tailMap(Object obj, boolean z) {
            return d(Range.b((Cut) obj, BoundType.a(z)));
        }

        public RangesByUpperBound(Range range) {
            this.d = range;
        }
    }
}
