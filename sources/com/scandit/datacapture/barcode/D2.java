package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.common.geometry.Size2;

/* loaded from: classes6.dex */
public final class D2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17130a;
    private final Size2 b;
    private final float c;
    private final float d;
    private final float e;
    private final Size2 f;

    public /* synthetic */ D2(boolean z, Size2 size2, float f, float f2, float f3, Size2 size22, int i) {
        this(z, size2, f, f2, f3, size22);
    }

    public final boolean a() {
        return this.f17130a;
    }

    public final float b() {
        return this.e;
    }

    public final float c() {
        return this.c;
    }

    public final float d() {
        return this.d;
    }

    public final Size2 e() {
        return this.f;
    }

    public final Size2 f() {
        return this.b;
    }

    private D2(boolean z, Size2 size2, float f, float f2, float f3, Size2 size22) {
        this.f17130a = z;
        this.b = size2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = size22;
    }
}
