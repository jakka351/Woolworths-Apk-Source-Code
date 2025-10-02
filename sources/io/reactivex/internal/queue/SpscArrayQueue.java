package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes7.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    public static final Integer i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int d;
    public final AtomicLong e;
    public long f;
    public final AtomicLong g;
    public final int h;

    public SpscArrayQueue(int i2) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i2 - 1)));
        this.d = length() - 1;
        this.e = new AtomicLong();
        this.g = new AtomicLong();
        this.h = Math.min(i2 / 4, i.intValue());
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.e.get() == this.g.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == 0) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.e;
        long j = atomicLong.get();
        int i2 = this.d;
        int i3 = ((int) j) & i2;
        if (j >= this.f) {
            long j2 = this.h + j;
            if (get(i2 & ((int) j2)) == null) {
                this.f = j2;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicLong atomicLong = this.g;
        long j = atomicLong.get();
        int i2 = ((int) j) & this.d;
        E e = get(i2);
        if (e == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i2, null);
        return e;
    }
}
