package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // com.google.common.collect.ForwardingIterator
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator P1();

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        P1().add(obj);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return P1().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return P1().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return P1().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return P1().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        P1().set(obj);
    }
}
