package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public final class Lists {

    /* renamed from: com.google.common.collect.Lists$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass1 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Lists$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass2 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static class AbstractListWrapper<E> extends AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static final class CharSequenceAsList extends AbstractList<Character> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static class Partition<T> extends AbstractList<List<T>> {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* loaded from: classes6.dex */
    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    /* loaded from: classes6.dex */
    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    /* loaded from: classes6.dex */
    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
    }

    /* loaded from: classes6.dex */
    public static class ReverseList<T> extends AbstractList<T> {
        public static final /* synthetic */ int e = 0;
        public final List d;

        public ReverseList(List list) {
            list.getClass();
            this.d = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            this.d.add(b(i), obj);
        }

        public final int b(int i) {
            int size = this.d.size();
            Preconditions.l(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            this.d.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            List list = this.d;
            int size = list.size();
            Preconditions.i(i, size);
            return list.get((size - 1) - i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            final ListIterator listIterator = this.d.listIterator(b(i));
            return new ListIterator<Object>(this) { // from class: com.google.common.collect.Lists.ReverseList.1
                public boolean d;
                public final /* synthetic */ ReverseList f;

                {
                    this.f = this;
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
                    ListIterator listIterator2 = listIterator;
                    listIterator2.add(obj);
                    listIterator2.previous();
                    this.d = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final Object next() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.d = true;
                    return listIterator2.previous();
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
                    int iNextIndex = listIterator.nextIndex();
                    int i2 = ReverseList.e;
                    return this.f.b(iNextIndex);
                }

                @Override // java.util.ListIterator
                public final Object previous() {
                    ListIterator listIterator2 = listIterator;
                    if (!listIterator2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.d = true;
                    return listIterator2.next();
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public final void remove() {
                    CollectPreconditions.d(this.d);
                    listIterator.remove();
                    this.d = false;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
                    Preconditions.r(this.d);
                    listIterator.set(obj);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            List list = this.d;
            int size = list.size();
            Preconditions.i(i, size);
            return list.remove((size - 1) - i);
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            List list = this.d;
            int size = list.size();
            Preconditions.i(i, size);
            return list.set((size - 1) - i, obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            List list = this.d;
            Preconditions.m(i, i2, list.size());
            List listSubList = list.subList(b(i2), b(i));
            return listSubList instanceof ImmutableList ? ((ImmutableList) listSubList).z() : listSubList instanceof ReverseList ? ((ReverseList) listSubList).d : listSubList instanceof RandomAccess ? new RandomAccessReverseList(listSubList) : new ReverseList(listSubList);
        }
    }

    /* loaded from: classes6.dex */
    public static final class StringAsImmutableList extends ImmutableList<Character> {
        public final String f;

        public StringAsImmutableList(String str) {
            this.f = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: C */
        public final ImmutableList subList(int i, int i2) {
            String str = this.f;
            Preconditions.m(i, i2, str.length());
            String strSubstring = str.substring(i, i2);
            strSubstring.getClass();
            return new StringAsImmutableList(strSubstring);
        }

        @Override // java.util.List
        public final Object get(int i) {
            String str = this.f;
            Preconditions.i(i, str.length());
            return Character.valueOf(str.charAt(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f.indexOf(((Character) obj).charValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean j() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return this.f.lastIndexOf(((Character) obj).charValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f.length();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: classes6.dex */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        public final List d;
        public final Function e;

        public TransformingRandomAccessList(List list, Function function) {
            list.getClass();
            this.d = list;
            this.e = function;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            return this.e.apply(this.d.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            return new TransformedListIterator<Object, Object>(this.d.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingRandomAccessList.this.e.apply(obj);
                }
            };
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i) {
            return this.e.apply(this.d.remove(i));
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.d.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d.size();
        }
    }

    /* loaded from: classes6.dex */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        public final List d;
        public final Function e;

        public TransformingSequentialList(List list, Function function) {
            list.getClass();
            this.d = list;
            this.e = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            return new TransformedListIterator<Object, Object>(this.d.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                public final Object a(Object obj) {
                    return TransformingSequentialList.this.e.apply(obj);
                }
            };
        }

        @Override // java.util.AbstractList
        public final void removeRange(int i, int i2) {
            this.d.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d.size();
        }
    }

    /* loaded from: classes6.dex */
    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            if (i == 0 || i == 1) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    public static int a(int i) {
        CollectPreconditions.b(i, "arraySize");
        return Ints.e(i + 5 + (i / 10));
    }

    public static ArrayList b(Iterator it) {
        ArrayList arrayList = new ArrayList();
        Iterators.a(arrayList, it);
        return arrayList;
    }

    public static ArrayList c() {
        CollectPreconditions.b(3, "initialArraySize");
        return new ArrayList(3);
    }

    public static AbstractList d(List list, Function function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
