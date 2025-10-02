package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.DoNotMock;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

@GwtCompatible
@DoNotMock
@ElementTypesAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    public static final Object[] d = new Object[0];

    public static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f14883a;
        public int b;
        public boolean c;

        public ArrayBasedBuilder(int i) {
            CollectPreconditions.b(i, "initialCapacity");
            this.f14883a = new Object[i];
            this.b = 0;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ArrayBasedBuilder a(Object obj) {
            obj.getClass();
            g(1);
            Object[] objArr = this.f14883a;
            int i = this.b;
            this.b = i + 1;
            objArr[i] = obj;
            return this;
        }

        public final void d(int i, Object[] objArr) {
            ObjectArrays.a(i, objArr);
            g(i);
            System.arraycopy(objArr, 0, this.f14883a, this.b, i);
            this.b += i;
        }

        public final void e(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.b = ((ImmutableCollection) collection).d(this.b, this.f14883a);
                    return;
                }
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public void f(Iterable iterable) {
            e(iterable);
        }

        public final void g(int i) {
            Object[] objArr = this.f14883a;
            int iB = Builder.b(objArr.length, this.b + i);
            if (iB > objArr.length || this.c) {
                this.f14883a = Arrays.copyOf(this.f14883a, iB);
                this.c = false;
            }
        }
    }

    @DoNotMock
    public static abstract class Builder<E> {
        public static int b(int i, int i2) {
            if (i2 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i2 <= i) {
                return i;
            }
            int iHighestOneBit = i + (i >> 1) + 1;
            if (iHighestOneBit < i2) {
                iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public abstract Builder a(Object obj);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList b() {
        if (isEmpty()) {
            UnmodifiableListIterator unmodifiableListIterator = ImmutableList.e;
            return RegularImmutableList.h;
        }
        Object[] array = toArray(d);
        UnmodifiableListIterator unmodifiableListIterator2 = ImmutableList.e;
        return ImmutableList.l(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d(int i, Object[] objArr) {
        UnmodifiableIterator it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    public Object[] g() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract UnmodifiableIterator iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(d);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray(d));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return Arrays.copyOfRange(objArrG, i(), h(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(0, objArr);
        return objArr;
    }
}
