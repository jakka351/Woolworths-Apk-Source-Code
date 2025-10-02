package com.scandit.datacapture.core;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
abstract class V3 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f18385a;
    int b = -1;
    AbstractC0967b4 c;
    AtomicReferenceArray d;
    W3 e;
    C1156w4 f;
    C1156w4 g;
    final /* synthetic */ ConcurrentMapC1165x4 h;

    public V3(ConcurrentMapC1165x4 concurrentMapC1165x4) {
        this.h = concurrentMapC1165x4;
        this.f18385a = concurrentMapC1165x4.c.length - 1;
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x004d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00de, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0100, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.V3.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1156w4 c1156w4 = this.g;
        if (!(c1156w4 != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.h.remove(c1156w4.f18984a);
        this.g = null;
    }
}
