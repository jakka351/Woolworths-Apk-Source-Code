package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    @Override // com.google.common.collect.ForwardingCollection
    /* renamed from: b2, reason: merged with bridge method [inline-methods] */
    public abstract Queue P1();

    @Override // java.util.Queue
    public final Object element() {
        return P1().element();
    }

    public boolean offer(Object obj) {
        return P1().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return P1().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return P1().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return P1().remove();
    }
}
