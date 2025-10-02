package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.scandit.datacapture.core.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1093p4 extends AbstractC0967b4 {
    private final ReferenceQueue i;

    public C1093p4(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        super(concurrentMapC1165x4, i);
        this.i = new ReferenceQueue();
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final void b() {
        while (this.i.poll() != null) {
        }
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final void c() {
        a(this.i);
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final AbstractC0967b4 f() {
        return this;
    }
}
