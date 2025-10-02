package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.scandit.datacapture.core.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1084o4 extends S3 {
    private volatile Object c;

    public C1084o4(ReferenceQueue referenceQueue, Object obj, int i, C1084o4 c1084o4) {
        super(referenceQueue, obj, i, c1084o4);
        this.c = null;
    }

    public final void a(Object obj) {
        this.c = obj;
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getValue() {
        return this.c;
    }

    public final C1084o4 a(ReferenceQueue referenceQueue, C1084o4 c1084o4) {
        C1084o4 c1084o42 = new C1084o4(referenceQueue, get(), this.f18372a, c1084o4);
        c1084o42.c = this.c;
        return c1084o42;
    }
}
