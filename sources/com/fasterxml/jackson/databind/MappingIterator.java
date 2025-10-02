package com.fasterxml.jackson.databind;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class MappingIterator<T> implements Iterator<T>, Closeable {
    public int d;

    public final boolean a() {
        int i = this.d;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return i != 2;
        }
        throw null;
    }

    public final Object b() {
        int i = this.d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        if ((i == 1 || i == 2) && !a()) {
            throw new NoSuchElementException();
        }
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d != 0) {
            this.d = 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        try {
            return a();
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            b();
            throw null;
        } catch (JsonMappingException e) {
            throw new RuntimeJsonMappingException(e.getMessage(), e);
        } catch (IOException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
