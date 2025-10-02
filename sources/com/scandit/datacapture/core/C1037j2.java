package com.scandit.datacapture.core;

import android.util.Size;

/* renamed from: com.scandit.datacapture.core.j2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1037j2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18776a;
    private final int b;
    private final int c;

    public C1037j2(int i, int i2, int i3) {
        this.f18776a = i;
        this.b = i2;
        this.c = i3;
    }

    public final Size a() {
        return new Size(this.f18776a, this.b);
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.f18776a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1037j2)) {
            return false;
        }
        C1037j2 c1037j2 = (C1037j2) obj;
        return this.f18776a == c1037j2.f18776a && this.b == c1037j2.b && this.c == c1037j2.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f18776a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameSize(width=");
        sb.append(this.f18776a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", minPreviewShortSide=");
        return YU.a.l(sb, this.c, ')');
    }
}
