package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1030i4 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1030i4 f18533a = new C1030i4();

    public static C1030i4 b() {
        return f18533a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, W3 w3, W3 w32) {
        C1048k4 c1048k4 = (C1048k4) abstractC0967b4;
        C1039j4 c1039j4 = (C1039j4) w3;
        C1039j4 c1039j42 = (C1039j4) w32;
        int i = AbstractC0967b4.h;
        if (c1039j4.getValue() == null) {
            return null;
        }
        return c1039j4.a(c1048k4.i, c1039j42);
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, Object obj, int i, W3 w3) {
        return new C1039j4(obj, i, (C1039j4) w3);
    }

    @Override // com.scandit.datacapture.core.X3
    public final void a(AbstractC0967b4 abstractC0967b4, W3 w3, Object obj) {
        ((C1039j4) w3).a(obj, ((C1048k4) abstractC0967b4).i);
    }

    @Override // com.scandit.datacapture.core.X3
    public final EnumC0994e4 a() {
        return EnumC0994e4.b;
    }

    @Override // com.scandit.datacapture.core.X3
    public final AbstractC0967b4 a(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        return new C1048k4(concurrentMapC1165x4, i);
    }
}
