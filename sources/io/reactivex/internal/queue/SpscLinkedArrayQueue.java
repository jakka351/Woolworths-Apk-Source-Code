package io.reactivex.internal.queue;

import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    public static final int l = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object m = new Object();
    public final AtomicLong d;
    public final int e;
    public long f;
    public final int g;
    public AtomicReferenceArray h;
    public final int i;
    public AtomicReferenceArray j;
    public final AtomicLong k;

    public SpscLinkedArrayQueue(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.d = atomicLong;
        this.k = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.e = Math.min(iNumberOfLeadingZeros / 4, l);
        this.j = atomicReferenceArray;
        this.i = i2;
        this.f = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final void a(Serializable serializable, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.h;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        long j2 = 2 + j;
        int i = this.g;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, obj);
            atomicReferenceArray.lazySet(i2, serializable);
            atomicLong.lazySet(j2);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.h = atomicReferenceArray2;
        int i3 = ((int) j) & i;
        atomicReferenceArray2.lazySet(i3 + 1, obj);
        atomicReferenceArray2.lazySet(i3, serializable);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, m);
        atomicLong.lazySet(j2);
    }

    public final Object b() {
        AtomicReferenceArray atomicReferenceArray = this.j;
        int i = (int) this.k.get();
        int i2 = this.i;
        int i3 = i & i2;
        Object obj = atomicReferenceArray.get(i3);
        if (obj != m) {
            return obj;
        }
        int i4 = i2 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
        atomicReferenceArray.lazySet(i4, null);
        this.j = atomicReferenceArray2;
        return atomicReferenceArray2.get(i3);
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
        return this.d.get() == this.k.get();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.h;
        AtomicLong atomicLong = this.d;
        long j = atomicLong.get();
        int i = this.g;
        int i2 = ((int) j) & i;
        if (j < this.f) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = this.e + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.f = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.h = atomicReferenceArray2;
        this.f = (j + i) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, m);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.j;
        AtomicLong atomicLong = this.k;
        long j = atomicLong.get();
        int i = this.i;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == m;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.j = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
