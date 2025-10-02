package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1075n4 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1075n4 f18810a = new C1075n4();

    public static C1075n4 b() {
        return f18810a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, W3 w3, W3 w32) {
        C1093p4 c1093p4 = (C1093p4) abstractC0967b4;
        C1084o4 c1084o4 = (C1084o4) w3;
        C1084o4 c1084o42 = (C1084o4) w32;
        if (c1084o4.get() == 0) {
            return null;
        }
        return c1084o4.a(c1093p4.i, c1084o42);
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, Object obj, int i, W3 w3) {
        return new C1084o4(((C1093p4) abstractC0967b4).i, obj, i, (C1084o4) w3);
    }

    @Override // com.scandit.datacapture.core.X3
    public final void a(AbstractC0967b4 abstractC0967b4, W3 w3, Object obj) {
        ((C1084o4) w3).a(obj);
    }

    @Override // com.scandit.datacapture.core.X3
    public final EnumC0994e4 a() {
        return EnumC0994e4.f18489a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final AbstractC0967b4 a(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        return new C1093p4(concurrentMapC1165x4, i);
    }
}
