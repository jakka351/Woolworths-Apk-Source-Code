package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1003f4 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1003f4 f18497a = new C1003f4();

    public static C1003f4 b() {
        return f18497a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, W3 w3, W3 w32) {
        return ((C1012g4) w3).a((C1012g4) w32);
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, Object obj, int i, W3 w3) {
        return new C1012g4(obj, i, (C1012g4) w3);
    }

    @Override // com.scandit.datacapture.core.X3
    public final void a(AbstractC0967b4 abstractC0967b4, W3 w3, Object obj) {
        ((C1012g4) w3).a(obj);
    }

    @Override // com.scandit.datacapture.core.X3
    public final EnumC0994e4 a() {
        return EnumC0994e4.f18489a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final AbstractC0967b4 a(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        return new C1021h4(concurrentMapC1165x4, i);
    }
}
