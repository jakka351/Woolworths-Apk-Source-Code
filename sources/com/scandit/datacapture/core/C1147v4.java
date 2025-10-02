package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.scandit.datacapture.core.v4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1147v4 extends WeakReference implements InterfaceC1138u4 {

    /* renamed from: a, reason: collision with root package name */
    final W3 f18979a;

    public C1147v4(ReferenceQueue referenceQueue, Object obj, W3 w3) {
        super(obj, referenceQueue);
        this.f18979a = w3;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1138u4
    public final W3 a() {
        return this.f18979a;
    }

    @Override // com.scandit.datacapture.core.InterfaceC1138u4
    public final InterfaceC1138u4 a(ReferenceQueue referenceQueue, InterfaceC1129t4 interfaceC1129t4) {
        return new C1147v4(referenceQueue, get(), interfaceC1129t4);
    }
}
