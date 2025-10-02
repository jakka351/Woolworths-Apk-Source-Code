package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0543c {

    /* renamed from: a, reason: collision with root package name */
    private final C0527b f17394a;
    private final C0527b b;

    public C0543c(C0527b from, C0527b to) {
        Intrinsics.h(from, "from");
        Intrinsics.h(to, "to");
        this.f17394a = from;
        this.b = to;
    }

    public final C0527b a(float f) {
        C0527b c0527b = this.f17394a;
        float f2 = 1.0f - f;
        Intrinsics.h(c0527b, "<this>");
        C0527b c0527b2 = new C0527b(c0527b.a() * f2, c0527b.b() * f2, c0527b.c() * f2, c0527b.d() * f2);
        C0527b c0527b3 = this.b;
        Intrinsics.h(c0527b3, "<this>");
        C0527b c0527b4 = new C0527b(c0527b3.a() * f, c0527b3.b() * f, c0527b3.c() * f, c0527b3.d() * f);
        return new C0527b(c0527b4.a() + c0527b2.a(), c0527b4.b() + c0527b2.b(), c0527b4.c() + c0527b2.c(), c0527b4.d() + c0527b2.d());
    }
}
