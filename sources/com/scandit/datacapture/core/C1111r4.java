package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.scandit.datacapture.core.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1111r4 extends S3 implements InterfaceC1129t4 {
    private volatile InterfaceC1138u4 c;

    public C1111r4(ReferenceQueue referenceQueue, Object obj, int i, C1111r4 c1111r4) {
        super(referenceQueue, obj, i, c1111r4);
        this.c = ConcurrentMapC1165x4.j;
    }

    public final C1111r4 a(ReferenceQueue referenceQueue, ReferenceQueue referenceQueue2, C1111r4 c1111r4) {
        C1111r4 c1111r42 = new C1111r4(referenceQueue, get(), this.f18372a, c1111r4);
        c1111r42.c = this.c.a(referenceQueue2, c1111r42);
        return c1111r42;
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getValue() {
        return this.c.get();
    }

    public final void a(Object obj, ReferenceQueue referenceQueue) {
        InterfaceC1138u4 interfaceC1138u4 = this.c;
        this.c = new C1147v4(referenceQueue, obj, this);
        interfaceC1138u4.clear();
    }

    @Override // com.scandit.datacapture.core.InterfaceC1129t4
    public final InterfaceC1138u4 a() {
        return this.c;
    }
}
