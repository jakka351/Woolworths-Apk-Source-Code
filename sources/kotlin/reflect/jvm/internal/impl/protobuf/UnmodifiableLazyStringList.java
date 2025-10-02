package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes7.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {
    public final LazyStringArrayList d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$1, reason: invalid class name */
    class AnonymousClass1 implements ListIterator<String> {
        public ListIterator d;

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.d.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return (String) this.d.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.d.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return (String) this.d.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.d.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<String> {
        public Iterator d;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.d.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return (String) this.d.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringArrayList lazyStringArrayList) {
        this.d = lazyStringArrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final ByteString C1(int i) {
        return this.d.C1(i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final void J1(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final List e() {
        return Collections.unmodifiableList(this.d.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public final UnmodifiableLazyStringList f() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.d.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.d = this.d.iterator();
        return anonymousClass2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.d = this.d.listIterator(i);
        return anonymousClass1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }
}
