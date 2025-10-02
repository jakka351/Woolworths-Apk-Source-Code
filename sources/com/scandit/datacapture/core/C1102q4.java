package com.scandit.datacapture.core;

/* renamed from: com.scandit.datacapture.core.q4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1102q4 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C1102q4 f18821a = new C1102q4();

    public static C1102q4 b() {
        return f18821a;
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, W3 w3, W3 w32) {
        C1120s4 c1120s4 = (C1120s4) abstractC0967b4;
        C1111r4 c1111r4 = (C1111r4) w3;
        C1111r4 c1111r42 = (C1111r4) w32;
        if (c1111r4.get() == 0) {
            return null;
        }
        int i = AbstractC0967b4.h;
        if (c1111r4.getValue() == null) {
            return null;
        }
        return c1111r4.a(c1120s4.i, c1120s4.j, c1111r42);
    }

    @Override // com.scandit.datacapture.core.X3
    public final W3 a(AbstractC0967b4 abstractC0967b4, Object obj, int i, W3 w3) {
        return new C1111r4(((C1120s4) abstractC0967b4).i, obj, i, (C1111r4) w3);
    }

    @Override // com.scandit.datacapture.core.X3
    public final void a(AbstractC0967b4 abstractC0967b4, W3 w3, Object obj) {
        ((C1111r4) w3).a(obj, ((C1120s4) abstractC0967b4).j);
    }

    @Override // com.scandit.datacapture.core.X3
    public final EnumC0994e4 a() {
        return EnumC0994e4.b;
    }

    @Override // com.scandit.datacapture.core.X3
    public final AbstractC0967b4 a(ConcurrentMapC1165x4 concurrentMapC1165x4, int i) {
        return new C1120s4(concurrentMapC1165x4, i);
    }
}
