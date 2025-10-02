package com.scandit.datacapture.barcode;

/* renamed from: com.scandit.datacapture.barcode.s6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0825s6 implements InterfaceC0795q6 {

    /* renamed from: a, reason: collision with root package name */
    private C0810r6 f18001a;

    public C0825s6(C0810r6 c0810r6) {
        this.f18001a = c0810r6;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0795q6
    public final void a() {
        Md mdB;
        C0810r6 c0810r6 = this.f18001a;
        Nd ndA = c0810r6 != null ? c0810r6.a() : null;
        C0810r6 c0810r62 = this.f18001a;
        if (c0810r62 != null && (mdB = c0810r62.b()) != null) {
            ((C0794q5) mdB).b(ndA);
        }
        this.f18001a = null;
    }
}
