package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    public Object d;

    public AbstractSequentialIterator(Object obj) {
        this.d = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.d;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.d = a(obj);
        return obj;
    }
}
