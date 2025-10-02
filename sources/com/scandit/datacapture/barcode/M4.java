package com.scandit.datacapture.barcode;

/* loaded from: classes6.dex */
public final class M4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17236a;
    private final int b;
    private final boolean c;
    private final int d;

    public M4(int i, int i2, boolean z, int i3) {
        this.f17236a = i;
        this.b = i2;
        this.c = z;
        this.d = i3;
    }

    public final int a() {
        return this.d;
    }

    public final boolean b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.f17236a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M4)) {
            return false;
        }
        M4 m4 = (M4) obj;
        return this.f17236a == m4.f17236a && this.b == m4.b && this.c == m4.c && this.d == m4.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = androidx.camera.core.impl.b.a(this.b, Integer.hashCode(this.f17236a) * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return Integer.hashCode(this.d) + ((iA + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BarcodePickStatusIconPositionInfo(y=");
        sb.append(this.f17236a);
        sb.append(", x=");
        sb.append(this.b);
        sb.append(", arrowVisible=");
        sb.append(this.c);
        sb.append(", arrowOffset=");
        return YU.a.l(sb, this.d, ')');
    }
}
