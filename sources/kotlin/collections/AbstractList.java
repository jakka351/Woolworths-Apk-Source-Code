package kotlin.collections;

import YU.a;
import androidx.camera.core.impl.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "SubList", "IteratorImpl", "ListIteratorImpl", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public static void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbQ = a.q(i, i2, "startIndex: ", ", endIndex: ", ", size: ");
                sbQ.append(i3);
                throw new IndexOutOfBoundsException(sbQ.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(b.i(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        public static void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(b.i(i, i2, "index: ", ", size: "));
            }
        }

        public static void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(b.i(i, i2, "index: ", ", size: "));
            }
        }

        public static void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbQ = a.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
                sbQ.append(i3);
                throw new IndexOutOfBoundsException(sbQ.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(b.i(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public class IteratorImpl implements Iterator<E>, KMappedMarker {
        public int d;

        public IteratorImpl() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d < AbstractList.this.getF();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.d;
            this.d = i + 1;
            return AbstractList.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E>, KMappedMarker {
        public ListIteratorImpl(int i) {
            super();
            Companion.c(i, AbstractList.this.getF());
            this.d = i;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d;
        }

        @Override // java.util.ListIterator
        public final Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.d - 1;
            this.d = i;
            return AbstractList.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d - 1;
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {
        public final AbstractList d;
        public final int e;
        public final int f;

        public SubList(AbstractList abstractList, int i, int i2) {
            this.d = abstractList;
            this.e = i;
            Companion.d(i, i2, abstractList.getF());
            this.f = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b, reason: from getter */
        public final int getF() {
            return this.f;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final Object get(int i) {
            Companion.b(i, this.f);
            return this.d.get(this.e + i);
        }

        @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public final List subList(int i, int i2) {
            Companion.d(i, i2, this.f);
            int i3 = this.e;
            return new SubList(this.d, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.c(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.c(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new IteratorImpl();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new SubList(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new ListIteratorImpl(i);
    }
}
