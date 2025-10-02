package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    @Override // com.google.common.collect.ForwardingObject
    /* renamed from: R1, reason: merged with bridge method [inline-methods] */
    public abstract Iterator P1();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return P1().hasNext();
    }

    public Object next() {
        return P1().next();
    }

    public void remove() {
        P1().remove();
    }
}
