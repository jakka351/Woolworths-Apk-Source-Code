package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    public transient ObjectCountHashMap f;
    public transient long g;

    public abstract class Itr<T> implements Iterator<T> {
        public int d;
        public int e = -1;
        public int f;

        public Itr() {
            this.d = AbstractMapBasedMultiset.this.f.c();
            this.f = AbstractMapBasedMultiset.this.f.d;
        }

        public abstract Object a(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (AbstractMapBasedMultiset.this.f.d == this.f) {
                return this.d >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objA = a(this.d);
            int i = this.d;
            this.e = i;
            this.d = AbstractMapBasedMultiset.this.f.k(i);
            return objA;
        }

        @Override // java.util.Iterator
        public final void remove() {
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            if (abstractMapBasedMultiset.f.d != this.f) {
                throw new ConcurrentModificationException();
            }
            CollectPreconditions.d(this.e != -1);
            abstractMapBasedMultiset.g -= abstractMapBasedMultiset.f.o(this.e);
            this.d = abstractMapBasedMultiset.f.l(this.d, this.e);
            this.e = -1;
            this.f = abstractMapBasedMultiset.f.d;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.f = j(3);
        Serialization.d(this, objectInputStream, i);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.g(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean V1(int i, Object obj) {
        CollectPreconditions.b(i, "oldCount");
        CollectPreconditions.b(0, "newCount");
        int iG = this.f.g(obj);
        if (iG == -1) {
            if (i == 0) {
                return true;
            }
        } else if (this.f.f(iG) == i) {
            this.f.o(iG);
            this.g -= i;
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int add(int i, Object obj) {
        if (i == 0) {
            return this.f.d(obj);
        }
        Preconditions.b(i, "occurrences cannot be negative: %s", i > 0);
        int iG = this.f.g(obj);
        if (iG == -1) {
            this.f.m(i, obj);
            this.g += i;
            return 0;
        }
        int iF = this.f.f(iG);
        long j = i;
        long j2 = iF + j;
        Preconditions.c(j2, "too many occurrences: %s", j2 <= 2147483647L);
        ObjectCountHashMap objectCountHashMap = this.f;
        Preconditions.i(iG, objectCountHashMap.c);
        objectCountHashMap.b[iG] = (int) j2;
        this.g += j;
        return iF;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int b0(int i, Object obj) {
        if (i == 0) {
            return this.f.d(obj);
        }
        Preconditions.b(i, "occurrences cannot be negative: %s", i > 0);
        int iG = this.f.g(obj);
        if (iG == -1) {
            return 0;
        }
        int iF = this.f.f(iG);
        if (iF > i) {
            ObjectCountHashMap objectCountHashMap = this.f;
            Preconditions.i(iG, objectCountHashMap.c);
            objectCountHashMap.b[iG] = iF - i;
        } else {
            this.f.o(iG);
            i = iF;
        }
        this.g -= i;
        return iF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f.a();
        this.g = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int e2(Object obj) {
        return this.f.d(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int g() {
        return this.f.c;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator h() {
        return new AbstractMapBasedMultiset<Object>.Itr<Object>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i) {
                return AbstractMapBasedMultiset.this.f.e(i);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator i() {
        return new AbstractMapBasedMultiset<Object>.Itr<Multiset.Entry<Object>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public final Object a(int i) {
                ObjectCountHashMap objectCountHashMap = AbstractMapBasedMultiset.this.f;
                Preconditions.i(i, objectCountHashMap.c);
                return new ObjectCountHashMap.MapEntry(i);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Multisets.b(this);
    }

    public abstract ObjectCountHashMap j(int i);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return Ints.e(this.g);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final int w2(Object obj) {
        CollectPreconditions.b(0, "count");
        ObjectCountHashMap objectCountHashMap = this.f;
        objectCountHashMap.getClass();
        int iN = objectCountHashMap.n(Hashing.c(obj), obj);
        this.g += 0 - iN;
        return iN;
    }
}
