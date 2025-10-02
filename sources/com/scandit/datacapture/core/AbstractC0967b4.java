package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.scandit.datacapture.core.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC0967b4 extends ReentrantLock {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    final ConcurrentMapC1165x4 f18419a;
    volatile int b;
    int c;
    int d;
    volatile AtomicReferenceArray e;
    final AtomicInteger g = new AtomicInteger();
    final int f = -1;

    public AbstractC0967b4(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        this.f18419a = concurrentMapC1165x4;
        a(a(i));
    }

    public static AtomicReferenceArray a(int i) {
        return new AtomicReferenceArray(i);
    }

    public void b() {
    }

    public void c() {
    }

    public final void d() {
        if ((this.g.incrementAndGet() & 63) == 0) {
            e();
        }
    }

    public final void e() {
        if (tryLock()) {
            try {
                c();
                this.g.set(0);
            } finally {
                unlock();
            }
        }
    }

    public abstract AbstractC0967b4 f();

    public final void a(AtomicReferenceArray atomicReferenceArray) {
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.d = length;
        if (length == this.f) {
            this.d = length + 1;
        }
        this.e = atomicReferenceArray;
    }

    public final void b(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            InterfaceC1138u4 interfaceC1138u4 = (InterfaceC1138u4) objPoll;
            ConcurrentMapC1165x4 concurrentMapC1165x4 = this.f18419a;
            concurrentMapC1165x4.getClass();
            W3 w3A = interfaceC1138u4.a();
            int iC = w3A.c();
            AbstractC0967b4 abstractC0967b4C = concurrentMapC1165x4.c(iC);
            Object key = w3A.getKey();
            abstractC0967b4C.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = abstractC0967b4C.e;
                int length = (atomicReferenceArray.length() - 1) & iC;
                W3 w3 = (W3) atomicReferenceArray.get(length);
                W3 w3B = w3;
                while (true) {
                    if (w3B == null) {
                        break;
                    }
                    Object key2 = w3B.getKey();
                    if (w3B.c() != iC || key2 == null || !abstractC0967b4C.f18419a.e.b(key, key2)) {
                        w3B = w3B.b();
                    } else if (((InterfaceC1129t4) w3B).a() == interfaceC1138u4) {
                        abstractC0967b4C.c++;
                        W3 w3A2 = abstractC0967b4C.a(w3, w3B);
                        int i2 = abstractC0967b4C.b - 1;
                        atomicReferenceArray.set(length, w3A2);
                        abstractC0967b4C.b = i2;
                    }
                }
                i++;
            } finally {
                abstractC0967b4C.unlock();
            }
        } while (i != 16);
    }

    public final void a(ReferenceQueue referenceQueue) {
        int i = 0;
        do {
            Object objPoll = referenceQueue.poll();
            if (objPoll == null) {
                return;
            }
            W3 w3 = (W3) objPoll;
            ConcurrentMapC1165x4 concurrentMapC1165x4 = this.f18419a;
            concurrentMapC1165x4.getClass();
            int iC = w3.c();
            AbstractC0967b4 abstractC0967b4C = concurrentMapC1165x4.c(iC);
            abstractC0967b4C.lock();
            try {
                AtomicReferenceArray atomicReferenceArray = abstractC0967b4C.e;
                int length = iC & (atomicReferenceArray.length() - 1);
                W3 w32 = (W3) atomicReferenceArray.get(length);
                W3 w3B = w32;
                while (true) {
                    if (w3B == null) {
                        break;
                    }
                    if (w3B == w3) {
                        abstractC0967b4C.c++;
                        W3 w3A = abstractC0967b4C.a(w32, w3B);
                        int i2 = abstractC0967b4C.b - 1;
                        atomicReferenceArray.set(length, w3A);
                        abstractC0967b4C.b = i2;
                        break;
                    }
                    w3B = w3B.b();
                }
                i++;
            } finally {
                abstractC0967b4C.unlock();
            }
        } while (i != 16);
    }

    public final Object a(Object obj, int i, Object obj2, boolean z) {
        lock();
        try {
            e();
            int i2 = this.b + 1;
            if (i2 > this.d) {
                a();
                i2 = this.b + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.e;
            int length = (atomicReferenceArray.length() - 1) & i;
            W3 w3 = (W3) atomicReferenceArray.get(length);
            for (W3 w3B = w3; w3B != null; w3B = w3B.b()) {
                Object key = w3B.getKey();
                if (w3B.c() == i && key != null && this.f18419a.e.b(obj, key)) {
                    Object value = w3B.getValue();
                    if (value == null) {
                        this.c++;
                        this.f18419a.f.a(f(), w3B, obj2);
                        this.b = this.b;
                        unlock();
                        return null;
                    }
                    if (z) {
                        unlock();
                        return value;
                    }
                    this.c++;
                    this.f18419a.f.a(f(), w3B, obj2);
                    unlock();
                    return value;
                }
            }
            this.c++;
            W3 w3A = this.f18419a.f.a(f(), obj, i, w3);
            this.f18419a.f.a(f(), w3A, obj2);
            atomicReferenceArray.set(length, w3A);
            this.b = i2;
            unlock();
            return null;
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    public final void a() {
        AtomicReferenceArray atomicReferenceArray = this.e;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.d = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            W3 w3B = (W3) atomicReferenceArray.get(i2);
            if (w3B != null) {
                W3 w3B2 = w3B.b();
                int iC = w3B.c() & length2;
                if (w3B2 == null) {
                    atomicReferenceArray2.set(iC, w3B);
                } else {
                    W3 w3 = w3B;
                    while (w3B2 != null) {
                        int iC2 = w3B2.c() & length2;
                        if (iC2 != iC) {
                            w3 = w3B2;
                            iC = iC2;
                        }
                        w3B2 = w3B2.b();
                    }
                    atomicReferenceArray2.set(iC, w3);
                    while (w3B != w3) {
                        int iC3 = w3B.c() & length2;
                        W3 w3A = this.f18419a.f.a(f(), w3B, (W3) atomicReferenceArray2.get(iC3));
                        if (w3A != null) {
                            atomicReferenceArray2.set(iC3, w3A);
                        } else {
                            i--;
                        }
                        w3B = w3B.b();
                    }
                }
            }
        }
        this.e = atomicReferenceArray2;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r8.f18419a.f.a().a().b(r11, r4.getValue()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4.getValue() != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        r8.c++;
        r9 = a(r3, r4);
        r10 = r8.b - 1;
        r0.set(r1, r9);
        r8.b = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r9, int r10, java.lang.Object r11) {
        /*
            r8 = this;
            r8.lock()
            r8.e()     // Catch: java.lang.Throwable -> L62
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r8.e     // Catch: java.lang.Throwable -> L62
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L62
            r2 = 1
            int r1 = r1 - r2
            r1 = r1 & r10
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.W3 r3 = (com.scandit.datacapture.core.W3) r3     // Catch: java.lang.Throwable -> L62
            r4 = r3
        L16:
            r5 = 0
            if (r4 == 0) goto L6d
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L62
            int r7 = r4.c()     // Catch: java.lang.Throwable -> L62
            if (r7 != r10) goto L68
            if (r6 == 0) goto L68
            com.scandit.datacapture.core.x4 r7 = r8.f18419a     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.S1 r7 = r7.e     // Catch: java.lang.Throwable -> L62
            boolean r6 = r7.b(r9, r6)     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L68
            java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.x4 r10 = r8.f18419a     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.X3 r10 = r10.f     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.e4 r10 = r10.a()     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.S1 r10 = r10.a()     // Catch: java.lang.Throwable -> L62
            boolean r9 = r10.b(r11, r9)     // Catch: java.lang.Throwable -> L62
            if (r9 == 0) goto L47
            r5 = r2
            goto L4d
        L47:
            java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L62
            if (r9 != 0) goto L64
        L4d:
            int r9 = r8.c     // Catch: java.lang.Throwable -> L62
            int r9 = r9 + r2
            r8.c = r9     // Catch: java.lang.Throwable -> L62
            com.scandit.datacapture.core.W3 r9 = r8.a(r3, r4)     // Catch: java.lang.Throwable -> L62
            int r10 = r8.b     // Catch: java.lang.Throwable -> L62
            int r10 = r10 - r2
            r0.set(r1, r9)     // Catch: java.lang.Throwable -> L62
            r8.b = r10     // Catch: java.lang.Throwable -> L62
            r8.unlock()
            return r5
        L62:
            r9 = move-exception
            goto L71
        L64:
            r8.unlock()
            return r5
        L68:
            com.scandit.datacapture.core.W3 r4 = r4.b()     // Catch: java.lang.Throwable -> L62
            goto L16
        L6d:
            r8.unlock()
            return r5
        L71:
            r8.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.AbstractC0967b4.a(java.lang.Object, int, java.lang.Object):boolean");
    }

    public final W3 a(W3 w3, W3 w32) {
        int i = this.b;
        W3 w3B = w32.b();
        while (w3 != w32) {
            W3 w3A = this.f18419a.f.a(f(), w3, w3B);
            if (w3A != null) {
                w3B = w3A;
            } else {
                i--;
            }
            w3 = w3.b();
        }
        this.b = i;
        return w3B;
    }
}
