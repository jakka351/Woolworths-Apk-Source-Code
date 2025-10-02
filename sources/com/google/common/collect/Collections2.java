package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Collections2 {

    public static class FilteredCollection<E> extends AbstractCollection<E> {
        public final Collection d;
        public final Predicate e;

        public FilteredCollection(Collection collection, Predicate predicate) {
            this.d = collection;
            this.e = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(Object obj) {
            Preconditions.g(this.e.apply(obj));
            return this.d.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection collection) {
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.g(this.e.apply(it.next()));
            }
            return this.d.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            Iterables.f(this.d, this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (Collections2.c(obj, this.d)) {
                return this.e.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection collection) {
            return Collections2.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return !Iterables.a(this.d, this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.e(this.d.iterator(), this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(Object obj) {
            return contains(obj) && this.d.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection collection) {
            Iterator<E> it = this.d.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.e.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection collection) {
            Iterator<E> it = this.d.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.e.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            Iterator<E> it = this.d.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.e.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return Lists.b(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            return Lists.b(iterator()).toArray(objArr);
        }
    }

    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "orderedPermutationCollection(null)";
        }
    }

    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {
        public ArrayList f;

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            ArrayList arrayList = this.f;
            if (arrayList == null) {
                this.d = AbstractIterator.State.f;
                return null;
            }
            ImmutableList immutableListO = ImmutableList.o(arrayList);
            Objects.requireNonNull(this.f);
            int size = this.f.size();
            int i = size - 2;
            if (i < 0) {
                this.f = null;
                return immutableListO;
            }
            this.f.get(i);
            this.f.get(size - 1);
            throw null;
        }
    }

    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof List) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            new PermutationIterator();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return "permutations(null)";
        }
    }

    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {
        public final ArrayList f = new ArrayList((Collection) null);
        public int g;

        public PermutationIterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractIterator
        public final Object a() {
            if (this.g <= 0) {
                this.d = AbstractIterator.State.f;
                return null;
            }
            ArrayList arrayList = this.f;
            ImmutableList immutableListO = ImmutableList.o(arrayList);
            int size = arrayList.size() - 1;
            this.g = size;
            if (size == -1) {
                return immutableListO;
            }
            throw null;
        }
    }

    public static class TransformedCollection<F, T> extends AbstractCollection<T> {
        public final Collection d;
        public final Function e;

        public TransformedCollection(Collection collection, Function function) {
            collection.getClass();
            this.d = collection;
            function.getClass();
            this.e = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return Iterators.m(this.d.iterator(), this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.d.size();
        }
    }

    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(Predicate predicate) {
        throw null;
    }

    public static boolean c(Object obj, Collection collection) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
