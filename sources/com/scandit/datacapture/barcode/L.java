package com.scandit.datacapture.barcode;

/* loaded from: classes6.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17220a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public L(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17220a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a() {
        return this.f17220a;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l = (L) obj;
        return this.f17220a == l.f17220a && this.b == l.b && this.c == l.c && this.d == l.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f17220a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BarcodeCountToolbarState(audioFeedback=");
        sb.append(this.f17220a);
        sb.append(", hapticFeedback=");
        sb.append(this.b);
        sb.append(", strapMode=");
        sb.append(this.c);
        sb.append(", colorFilter=");
        return androidx.camera.core.impl.b.s(sb, this.d, ')');
    }
}
