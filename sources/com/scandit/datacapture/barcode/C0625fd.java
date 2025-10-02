package com.scandit.datacapture.barcode;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.fd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0625fd {

    /* renamed from: a, reason: collision with root package name */
    private final String f17642a;
    private final int b;
    private final int c;

    public C0625fd(int i, int i2, String text) {
        Intrinsics.h(text, "text");
        this.f17642a = text;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.f17642a;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0625fd)) {
            return false;
        }
        C0625fd c0625fd = (C0625fd) obj;
        return Intrinsics.c(this.f17642a, c0625fd.f17642a) && this.b == c0625fd.b && this.c == c0625fd.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, this.f17642a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToastTextAndColor(text=");
        sb.append(this.f17642a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", textColor=");
        return YU.a.l(sb, this.c, ')');
    }
}
