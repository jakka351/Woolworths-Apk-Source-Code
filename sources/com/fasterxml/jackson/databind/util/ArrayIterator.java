package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class ArrayIterator<T> implements Iterator<T>, Iterable<T> {
    public final Object[] d;
    public int e = 0;

    public ArrayIterator(Object[] objArr) {
        this.d = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.length;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Object[] objArr = this.d;
        if (i >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.e = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
