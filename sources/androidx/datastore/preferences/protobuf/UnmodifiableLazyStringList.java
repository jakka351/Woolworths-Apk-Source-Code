package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$1, reason: invalid class name */
    class AnonymousClass1 implements ListIterator<String> {
        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            throw null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            throw null;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            throw null;
        }

        @Override // java.util.ListIterator
        public final String previous() {
            throw null;
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            throw null;
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

    /* renamed from: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList$2, reason: invalid class name */
    class AnonymousClass2 implements Iterator<String> {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final String next() {
            throw null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final void B0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final List e() {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public final Object getRaw(int i) {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        throw null;
    }
}
