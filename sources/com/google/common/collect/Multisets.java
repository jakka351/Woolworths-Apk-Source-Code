package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Multisets {

    /* renamed from: com.google.common.collect.Multisets$1, reason: invalid class name */
    class AnonymousClass1 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$1$1, reason: invalid class name and collision with other inner class name */
        class C03121 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$2, reason: invalid class name */
    class AnonymousClass2 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$2$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$3, reason: invalid class name */
    class AnonymousClass3 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$3$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$4, reason: invalid class name */
    class AnonymousClass4 extends ViewMultiset<Object> {

        /* renamed from: com.google.common.collect.Multisets$4$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Object> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        /* renamed from: com.google.common.collect.Multisets$4$2, reason: invalid class name */
        class AnonymousClass2 extends AbstractIterator<Multiset.Entry<Object>> {
            @Override // com.google.common.collect.AbstractIterator
            public final Object a() {
                throw null;
            }
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
        public final int g() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Multisets$5, reason: invalid class name */
    class AnonymousClass5 extends TransformedIterator<Multiset.Entry<Object>, Object> {
        @Override // com.google.common.collect.TransformedIterator
        public final Object a(Object obj) {
            return ((Multiset.Entry) obj).a();
        }
    }

    public static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        public final boolean equals(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (getCount() == entry.getCount() && Objects.a(a(), entry.a())) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object objA = a();
            return (objA == null ? 0 : objA.hashCode()) ^ getCount();
        }

        public final String toString() {
            String strValueOf = String.valueOf(a());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    public static final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        @Override // java.util.Comparator
        public final int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    public static abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return h().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection collection) {
            return h().containsAll(collection);
        }

        public abstract Multiset h();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return h().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return h().b0(Integer.MAX_VALUE, obj) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h().entrySet().size();
        }
    }

    public static abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && h().e2(entry.a()) == entry.getCount();
        }

        public abstract Multiset h();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            Object objA = entry.a();
            int count = entry.getCount();
            if (count != 0) {
                return h().V1(count, objA);
            }
            return false;
        }
    }

    public static final class FilteredMultiset<E> extends ViewMultiset<E> {

        /* renamed from: com.google.common.collect.Multisets$FilteredMultiset$1, reason: invalid class name */
        class AnonymousClass1 implements Predicate<Multiset.Entry<Object>> {
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                ((Multiset.Entry) obj).a();
                throw null;
            }
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int add(int i, Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public final int b0(int i, Object obj) {
            CollectPreconditions.b(i, "occurrences");
            if (i == 0 || contains(obj)) {
                throw null;
            }
            return 0;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Set d() {
            throw null;
        }

        @Override // com.google.common.collect.Multiset
        public final int e2(Object obj) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator h() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public final Iterator i() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }
    }

    public static class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        public final Object d;
        public final int e;

        public ImmutableEntry(Object obj, int i) {
            this.d = obj;
            this.e = i;
            CollectPreconditions.b(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final Object a() {
            return this.d;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.e;
        }
    }

    public static final class MultisetIteratorImpl<E> implements Iterator<E> {
        public final Multiset d;
        public final Iterator e;
        public Multiset.Entry f;
        public int g;
        public int h;
        public boolean i;

        public MultisetIteratorImpl(Multiset multiset, Iterator it) {
            this.d = multiset;
            this.e = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g > 0 || this.e.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.g == 0) {
                Multiset.Entry entry = (Multiset.Entry) this.e.next();
                this.f = entry;
                int count = entry.getCount();
                this.g = count;
                this.h = count;
            }
            this.g--;
            this.i = true;
            Multiset.Entry entry2 = this.f;
            java.util.Objects.requireNonNull(entry2);
            return entry2.a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.i);
            if (this.h == 1) {
                this.e.remove();
            } else {
                Multiset.Entry entry = this.f;
                java.util.Objects.requireNonNull(entry);
                this.d.remove(entry.a());
            }
            this.h--;
            this.i = false;
        }
    }

    public static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        public final Multiset d;
        public transient Set e;
        public transient Set f;

        public UnmodifiableMultiset(SortedMultiset sortedMultiset) {
            this.d = sortedMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final boolean V1(int i, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int b0(int i, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
        /* renamed from: b2, reason: merged with bridge method [inline-methods] */
        public Multiset P1() {
            return this.d;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set c() {
            Set set = this.e;
            if (set != null) {
                return set;
            }
            Set setF2 = f2();
            this.e = setF2;
            return setF2;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final Set entrySet() {
            Set set = this.f;
            if (set != null) {
                return set;
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.d.entrySet());
            this.f = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        public Set f2() {
            return Collections.unmodifiableSet(this.d.c());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            return Iterators.n(this.d.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int w2(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public final int add(int i, Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int g() {
            return c().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Multisets.b(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            long count = 0;
            while (entrySet().iterator().hasNext()) {
                count += ((Multiset.Entry) r0.next()).getCount();
            }
            return Ints.e(count);
        }
    }

    public static boolean a(Multiset multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (!(obj instanceof Multiset)) {
            return false;
        }
        Multiset multiset2 = (Multiset) obj;
        if (multiset.size() != multiset2.size() || multiset.entrySet().size() != multiset2.entrySet().size()) {
            return false;
        }
        for (Multiset.Entry entry : multiset2.entrySet()) {
            if (multiset.e2(entry.a()) != entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static Iterator b(Multiset multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }
}
