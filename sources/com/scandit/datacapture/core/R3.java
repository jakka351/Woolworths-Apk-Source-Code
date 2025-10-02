package com.scandit.datacapture.core;

/* loaded from: classes6.dex */
abstract class R3 implements W3 {

    /* renamed from: a, reason: collision with root package name */
    final Object f18368a;
    final int b;
    final W3 c;

    public R3(Object obj, int i, W3 w3) {
        this.f18368a = obj;
        this.b = i;
        this.c = w3;
    }

    @Override // com.scandit.datacapture.core.W3
    public final W3 b() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.W3
    public final int c() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getKey() {
        return this.f18368a;
    }
}
