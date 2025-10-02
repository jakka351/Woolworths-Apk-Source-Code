package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    public Object[] d;
    public int e;
    public int f;

    public static final class Builder<B> {
    }

    public class Heap {
    }

    public static class MoveDesc<E> {
    }

    public class QueueIterator implements Iterator<E> {
        public int d = -1;
        public int e = -1;
        public int f;
        public boolean g;

        public QueueIterator() {
            this.f = MinMaxPriorityQueue.this.f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.f != this.f) {
                throw new ConcurrentModificationException();
            }
            int i = this.d + 1;
            if (this.e < i) {
                this.e = i;
            }
            return this.e < minMaxPriorityQueue.e;
        }

        @Override // java.util.Iterator
        public final Object next() {
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (minMaxPriorityQueue.f != this.f) {
                throw new ConcurrentModificationException();
            }
            int i = this.d + 1;
            if (this.e < i) {
                this.e = i;
            }
            int i2 = this.e;
            if (i2 >= minMaxPriorityQueue.e) {
                throw new NoSuchElementException("iterator moved past last element in queue.");
            }
            this.d = i2;
            this.g = true;
            Object obj = minMaxPriorityQueue.d[i2];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.Iterator
        public final void remove() {
            CollectPreconditions.d(this.g);
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            int i = minMaxPriorityQueue.f;
            int i2 = this.f;
            if (i != i2) {
                throw new ConcurrentModificationException();
            }
            this.g = false;
            this.f = i2 + 1;
            int i3 = this.d;
            if (i3 >= minMaxPriorityQueue.e) {
                throw null;
            }
            minMaxPriorityQueue.b(i3);
            this.d--;
            this.e--;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        offer(obj);
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator<E> it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        offer(it.next());
        throw null;
    }

    public final void b(int i) {
        Preconditions.l(i, this.e);
        this.f++;
        int i2 = this.e - 1;
        this.e = i2;
        if (i2 == i) {
            this.d[i2] = null;
        } else {
            Objects.requireNonNull(this.d[i2]);
            Preconditions.q("negative index", (~(~(this.e + 1))) > 0);
            throw null;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i = 0; i < this.e; i++) {
            this.d[i] = null;
        }
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        this.f++;
        int i = this.e + 1;
        this.e = i;
        Object[] objArr = this.d;
        if (i > objArr.length) {
            int length = objArr.length;
            Object[] objArr2 = new Object[Math.min((length < 64 ? (length + 1) * 2 : IntMath.b(length / 2)) - 1, 0) + 1];
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = objArr2;
        }
        Preconditions.q("negative index", (~(~i)) > 0);
        throw null;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.d[0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        Object obj = this.d[0];
        Objects.requireNonNull(obj);
        b(0);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        int i = this.e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.d, 0, objArr, 0, i);
        return objArr;
    }
}
