package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.scandit.datacapture.core.s4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1120s4 extends AbstractC0967b4 {
    private final ReferenceQueue i;
    private final ReferenceQueue j;

    public C1120s4(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        super(concurrentMapC1165x4, i);
        this.i = new ReferenceQueue();
        this.j = new ReferenceQueue();
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final void c() {
        a(this.i);
        b(this.j);
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final AbstractC0967b4 f() {
        return this;
    }

    @Override // com.scandit.datacapture.core.AbstractC0967b4
    public final void b() {
        while (this.i.poll() != null) {
        }
    }
}
