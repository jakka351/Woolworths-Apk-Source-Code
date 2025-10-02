package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
abstract class TransformedIterator<F, T> implements Iterator<T> {
    public final Iterator d;

    public TransformedIterator(Iterator it) {
        it.getClass();
        this.d = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
    }
}
