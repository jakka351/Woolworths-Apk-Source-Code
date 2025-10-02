package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.scandit.datacapture.core.j4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1039j4 extends R3 implements InterfaceC1129t4 {
    private volatile InterfaceC1138u4 d;

    public C1039j4(Object obj, int i, C1039j4 c1039j4) {
        super(obj, i, c1039j4);
        this.d = ConcurrentMapC1165x4.j;
    }

    public final void a(Object obj, ReferenceQueue referenceQueue) {
        InterfaceC1138u4 interfaceC1138u4 = this.d;
        this.d = new C1147v4(referenceQueue, obj, this);
        interfaceC1138u4.clear();
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getValue() {
        return this.d.get();
    }

    public final C1039j4 a(ReferenceQueue referenceQueue, C1039j4 c1039j4) {
        C1039j4 c1039j42 = new C1039j4(this.f18368a, this.b, c1039j4);
        c1039j42.d = this.d.a(referenceQueue, c1039j42);
        return c1039j42;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1129t4
    public final InterfaceC1138u4 a() {
        return this.d;
    }
}
