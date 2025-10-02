package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Deque;
import java.util.Iterator;

@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        P1().addFirst(obj);
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        P1().addLast(obj);
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return P1().descendingIterator();
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public abstract Deque P1();

    @Override // java.util.Deque
    public final Object getFirst() {
        return P1().getFirst();
    }

    @Override // java.util.Deque
    public final Object getLast() {
        return P1().getLast();
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        return P1().offerFirst(obj);
    }

    @Override // java.util.Deque
    public final boolean offerLast(Object obj) {
        return P1().offerLast(obj);
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return P1().peekFirst();
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return P1().peekLast();
    }

    @Override // java.util.Deque
    public final Object pollFirst() {
        return P1().pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        return P1().pollLast();
    }

    @Override // java.util.Deque
    public final Object pop() {
        return P1().pop();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        P1().push(obj);
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        return P1().removeFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return P1().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        return P1().removeLast();
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return P1().removeLastOccurrence(obj);
    }
}
