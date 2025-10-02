package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.g4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1012g4 extends R3 {
    private volatile Object d;

    public C1012g4(Object obj, int i, C1012g4 c1012g4) {
        super(obj, i, c1012g4);
        this.d = null;
    }

    public final void a(Object obj) {
        this.d = obj;
    }

    @Override // com.scandit.datacapture.core.W3
    public final Object getValue() {
        return this.d;
    }

    public final C1012g4 a(C1012g4 c1012g4) {
        C1012g4 c1012g42 = new C1012g4(this.f18368a, this.b, c1012g4);
        c1012g42.d = this.d;
        return c1012g42;
    }
}
