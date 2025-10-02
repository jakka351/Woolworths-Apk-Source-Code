package kotlin.collections.builders;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\u000b\f\rJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Companion", "Itr", "BuilderSubList", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    public static final ListBuilder g;
    public Object[] d;
    public int e;
    public boolean f;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001\u0010J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "Itr", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class BuilderSubList<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        public Object[] d;
        public final int e;
        public int f;
        public final BuilderSubList g;
        public final ListBuilder h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
            public final BuilderSubList d;
            public int e;
            public int f = -1;
            public int g;

            public Itr(BuilderSubList builderSubList, int i) {
                this.d = builderSubList;
                this.e = i;
                this.g = ((AbstractList) builderSubList).modCount;
            }

            public final void a() {
                if (((AbstractList) this.d.h).modCount != this.g) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(Object obj) {
                a();
                int i = this.e;
                this.e = i + 1;
                BuilderSubList builderSubList = this.d;
                builderSubList.add(i, obj);
                this.f = -1;
                this.g = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.e < this.d.f;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.e > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final Object next() {
                a();
                int i = this.e;
                BuilderSubList builderSubList = this.d;
                if (i >= builderSubList.f) {
                    throw new NoSuchElementException();
                }
                this.e = i + 1;
                this.f = i;
                return builderSubList.d[builderSubList.e + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.e;
            }

            @Override // java.util.ListIterator
            public final Object previous() {
                a();
                int i = this.e;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.e = i2;
                this.f = i2;
                BuilderSubList builderSubList = this.d;
                return builderSubList.d[builderSubList.e + i2];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.e - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i = this.f;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                BuilderSubList builderSubList = this.d;
                builderSubList.d(i);
                this.e = this.f;
                this.f = -1;
                this.g = ((AbstractList) builderSubList).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(Object obj) {
                a();
                int i = this.f;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.d.set(i, obj);
            }
        }

        public BuilderSubList(Object[] backing, int i, int i2, BuilderSubList builderSubList, ListBuilder root) {
            Intrinsics.h(backing, "backing");
            Intrinsics.h(root, "root");
            this.d = backing;
            this.e = i;
            this.f = i2;
            this.g = builderSubList;
            this.h = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void readObject(ObjectInputStream input) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.h.f) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            k();
            j();
            i(this.e + this.f, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            k();
            j();
            int size = elements.size();
            h(this.e + this.f, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractMutableList
        /* renamed from: b */
        public final int getK() {
            j();
            return this.f;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            k();
            j();
            m(this.e, this.f);
        }

        @Override // kotlin.collections.AbstractMutableList
        public final Object d(int i) {
            k();
            j();
            AbstractList.Companion.b(i, this.f);
            return l(this.e + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            j();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.d;
                int i = this.f;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.c(objArr[this.e + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            j();
            AbstractList.Companion.b(i, this.f);
            return this.d[this.e + i];
        }

        public final void h(int i, Collection collection, int i2) {
            ((java.util.AbstractList) this).modCount++;
            ListBuilder listBuilder = this.h;
            BuilderSubList builderSubList = this.g;
            if (builderSubList != null) {
                builderSubList.h(i, collection, i2);
            } else {
                ListBuilder listBuilder2 = ListBuilder.g;
                listBuilder.h(i, collection, i2);
            }
            this.d = listBuilder.d;
            this.f += i2;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            j();
            Object[] objArr = this.d;
            int i = this.f;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[this.e + i2];
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i(int i, Object obj) {
            ((java.util.AbstractList) this).modCount++;
            ListBuilder listBuilder = this.h;
            BuilderSubList builderSubList = this.g;
            if (builderSubList != null) {
                builderSubList.i(i, obj);
            } else {
                ListBuilder listBuilder2 = ListBuilder.g;
                listBuilder.i(i, obj);
            }
            this.d = listBuilder.d;
            this.f++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            j();
            for (int i = 0; i < this.f; i++) {
                if (Intrinsics.c(this.d[this.e + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            j();
            return this.f == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        public final void j() {
            if (((java.util.AbstractList) this.h).modCount != ((java.util.AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final void k() {
            if (this.h.f) {
                throw new UnsupportedOperationException();
            }
        }

        public final Object l(int i) {
            Object objL;
            ((java.util.AbstractList) this).modCount++;
            BuilderSubList builderSubList = this.g;
            if (builderSubList != null) {
                objL = builderSubList.l(i);
            } else {
                ListBuilder listBuilder = ListBuilder.g;
                objL = this.h.l(i);
            }
            this.f--;
            return objL;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            j();
            for (int i = this.f - 1; i >= 0; i--) {
                if (Intrinsics.c(this.d[this.e + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        public final void m(int i, int i2) {
            if (i2 > 0) {
                ((java.util.AbstractList) this).modCount++;
            }
            BuilderSubList builderSubList = this.g;
            if (builderSubList != null) {
                builderSubList.m(i, i2);
            } else {
                ListBuilder listBuilder = ListBuilder.g;
                this.h.m(i, i2);
            }
            this.f -= i2;
        }

        public final int n(int i, int i2, Collection collection, boolean z) {
            int iN;
            BuilderSubList builderSubList = this.g;
            if (builderSubList != null) {
                iN = builderSubList.n(i, i2, collection, z);
            } else {
                ListBuilder listBuilder = ListBuilder.g;
                iN = this.h.n(i, i2, collection, z);
            }
            if (iN > 0) {
                ((java.util.AbstractList) this).modCount++;
            }
            this.f -= iN;
            return iN;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            k();
            j();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                d(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            k();
            j();
            return n(this.e, this.f, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection elements) {
            Intrinsics.h(elements, "elements");
            k();
            j();
            return n(this.e, this.f, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            k();
            j();
            AbstractList.Companion.b(i, this.f);
            Object[] objArr = this.d;
            int i2 = this.e + i;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            AbstractList.Companion.d(i, i2, this.f);
            return new BuilderSubList(this.d, this.e + i, i2 - i, this, this.h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] array) {
            Intrinsics.h(array, "array");
            j();
            int length = array.length;
            int i = this.f;
            int i2 = this.e;
            if (length < i) {
                Object[] objArrCopyOfRange = Arrays.copyOfRange(this.d, i2, i + i2, array.getClass());
                Intrinsics.g(objArrCopyOfRange, "copyOfRange(...)");
                return objArrCopyOfRange;
            }
            ArraysKt.t(this.d, 0, array, i2, i + i2);
            int i3 = this.f;
            if (i3 < array.length) {
                array[i3] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            j();
            return ListBuilderKt.a(this.d, this.e, this.f, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            j();
            AbstractList.Companion.c(i, this.f);
            return new Itr(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            k();
            j();
            AbstractList.Companion.c(i, this.f);
            i(this.e + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection elements) {
            Intrinsics.h(elements, "elements");
            k();
            j();
            AbstractList.Companion.c(i, this.f);
            int size = elements.size();
            h(this.e + i, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            j();
            Object[] objArr = this.d;
            int i = this.f;
            int i2 = this.e;
            return ArraysKt.z(i2, i + i2, objArr);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "Lkotlin/collections/builders/ListBuilder;", "", "Empty", "Lkotlin/collections/builders/ListBuilder;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {
        public final ListBuilder d;
        public int e;
        public int f = -1;
        public int g;

        public Itr(ListBuilder listBuilder, int i) {
            this.d = listBuilder;
            this.e = i;
            this.g = ((java.util.AbstractList) listBuilder).modCount;
        }

        public final void a() {
            if (((java.util.AbstractList) this.d).modCount != this.g) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            a();
            int i = this.e;
            this.e = i + 1;
            ListBuilder listBuilder = this.d;
            listBuilder.add(i, obj);
            this.f = -1;
            this.g = ((java.util.AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.e < this.d.e;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.e > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            a();
            int i = this.e;
            ListBuilder listBuilder = this.d;
            if (i >= listBuilder.e) {
                throw new NoSuchElementException();
            }
            this.e = i + 1;
            this.f = i;
            return listBuilder.d[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.e;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            a();
            int i = this.e;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.e = i2;
            this.f = i2;
            return this.d.d[i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.e - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i = this.f;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            ListBuilder listBuilder = this.d;
            listBuilder.d(i);
            this.e = this.f;
            this.f = -1;
            this.g = ((java.util.AbstractList) listBuilder).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            a();
            int i = this.f;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.d.set(i, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f = true;
        g = listBuilder;
    }

    public ListBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.d = new Object[i];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        int i = this.e;
        ((java.util.AbstractList) this).modCount++;
        k(i, 1);
        this.d[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        j();
        int size = elements.size();
        h(this.e, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public final int getK() {
        return this.e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        m(0, this.e);
    }

    @Override // kotlin.collections.AbstractMutableList
    public final Object d(int i) {
        j();
        AbstractList.Companion.b(i, this.e);
        return l(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.d;
            int i = this.e;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.c(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        AbstractList.Companion.b(i, this.e);
        return this.d[i];
    }

    public final void h(int i, Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        k(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.d[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.d;
        int i = this.e;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Object obj) {
        ((java.util.AbstractList) this).modCount++;
        k(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.e; i++) {
            if (Intrinsics.c(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void k(int i, int i2) {
        int i3 = this.e + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.d;
        if (i3 > objArr.length) {
            int iE = AbstractList.Companion.e(objArr.length, i3);
            Object[] objArr2 = this.d;
            Intrinsics.h(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            Intrinsics.g(objArrCopyOf, "copyOf(...)");
            this.d = objArrCopyOf;
        }
        Object[] objArr3 = this.d;
        ArraysKt.t(objArr3, i + i2, objArr3, i, this.e);
        this.e += i2;
    }

    public final Object l(int i) {
        ((java.util.AbstractList) this).modCount++;
        Object[] objArr = this.d;
        Object obj = objArr[i];
        ArraysKt.t(objArr, i, objArr, i + 1, this.e);
        Object[] objArr2 = this.d;
        int i2 = this.e - 1;
        Intrinsics.h(objArr2, "<this>");
        objArr2[i2] = null;
        this.e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.e - 1; i >= 0; i--) {
            if (Intrinsics.c(this.d[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        Object[] objArr = this.d;
        ArraysKt.t(objArr, i, objArr, i + i2, this.e);
        Object[] objArr2 = this.d;
        int i3 = this.e;
        ListBuilderKt.b(i3 - i2, i3, objArr2);
        this.e -= i2;
    }

    public final int n(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.d[i5]) == z) {
                Object[] objArr = this.d;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.d;
        ArraysKt.t(objArr2, i + i4, objArr2, i2 + i, this.e);
        Object[] objArr3 = this.d;
        int i7 = this.e;
        ListBuilderKt.b(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.e -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            d(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        j();
        return n(0, this.e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.h(elements, "elements");
        j();
        return n(0, this.e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        j();
        AbstractList.Companion.b(i, this.e);
        Object[] objArr = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        AbstractList.Companion.d(i, i2, this.e);
        return new BuilderSubList(this.d, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.h(array, "array");
        int length = array.length;
        int i = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.d, 0, i, array.getClass());
            Intrinsics.g(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        ArraysKt.t(this.d, 0, array, 0, i);
        int i2 = this.e;
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return ListBuilderKt.a(this.d, 0, this.e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractList.Companion.c(i, this.e);
        return new Itr(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.h(elements, "elements");
        j();
        AbstractList.Companion.c(i, this.e);
        int size = elements.size();
        h(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        j();
        AbstractList.Companion.c(i, this.e);
        ((java.util.AbstractList) this).modCount++;
        k(i, 1);
        this.d[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ArraysKt.z(0, this.e, this.d);
    }
}
