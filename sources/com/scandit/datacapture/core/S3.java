package com.scandit.datacapture.core;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
abstract class S3 extends WeakReference implements W3 {

    /* renamed from: a, reason: collision with root package name */
    final int f18372a;
    final W3 b;

    public S3(ReferenceQueue referenceQueue, Object obj, int i, W3 w3) {
        super(obj, referenceQueue);
        this.f18372a = i;
        this.b = w3;
    }

    @Override // com.scandit.datacapture.core.W3
    public final W3 b() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.W3
    public final int c() {
        return this.f18372a;
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getKey() {
        return get();
    }
}
