package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i) {
        return P1().drainTo(collection, i);
    }

    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue P1();

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        return P1().offer(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object poll(long j, TimeUnit timeUnit) {
        return P1().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        P1().put(obj);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return P1().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object take() {
        return P1().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        return P1().drainTo(collection);
    }
}
