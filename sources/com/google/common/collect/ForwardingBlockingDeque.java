package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
@Deprecated
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        return P1().drainTo(collection);
    }

    @Override // com.google.common.collect.ForwardingDeque
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque P1();

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        return P1().offer(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerFirst(Object obj, long j, TimeUnit timeUnit) {
        return P1().offerFirst(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerLast(Object obj, long j, TimeUnit timeUnit) {
        return P1().offerLast(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final Object poll(long j, TimeUnit timeUnit) {
        return P1().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object pollFirst(long j, TimeUnit timeUnit) {
        return P1().pollFirst(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object pollLast(long j, TimeUnit timeUnit) {
        return P1().pollLast(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        P1().put(obj);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putFirst(Object obj) throws InterruptedException {
        P1().putFirst(obj);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putLast(Object obj) throws InterruptedException {
        P1().putLast(obj);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return P1().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final Object take() {
        return P1().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object takeFirst() {
        return P1().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object takeLast() {
        return P1().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i) {
        return P1().drainTo(collection, i);
    }
}
