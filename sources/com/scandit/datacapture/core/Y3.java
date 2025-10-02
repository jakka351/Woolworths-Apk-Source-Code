package com.scandit.datacapture.core;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class Y3 extends V3 {
    public Y3(ConcurrentMapC1165x4 concurrentMapC1165x4) {
        super(concurrentMapC1165x4);
    }

    @Override // java.util.Iterator
    public final Object next() throws F4 {
        try {
            if (!hasNext()) {
                throw F4.f18315a;
            }
            this.g = this.f;
            a();
            return this.g.f18984a;
        } catch (F4 unused) {
            throw new NoSuchElementException();
        }
    }
}
