package androidx.core.graphics;

import YU.a;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class Insets {
    public static final Insets e = new Insets(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2430a;
    public final int b;
    public final int c;
    public final int d;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        public static android.graphics.Insets a(int i, int i2, int i3, int i4) {
            return android.graphics.Insets.of(i, i2, i3, i4);
        }
    }

    public Insets(int i, int i2, int i3, int i4) {
        this.f2430a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static Insets a(Insets insets, Insets insets2) {
        return c(Math.max(insets.f2430a, insets2.f2430a), Math.max(insets.b, insets2.b), Math.max(insets.c, insets2.c), Math.max(insets.d, insets2.d));
    }

    public static Insets b(Insets insets, Insets insets2) {
        return c(Math.min(insets.f2430a, insets2.f2430a), Math.min(insets.b, insets2.b), Math.min(insets.c, insets2.c), Math.min(insets.d, insets2.d));
    }

    public static Insets c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new Insets(i, i2, i3, i4);
    }

    public static Insets d(android.graphics.Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final android.graphics.Insets e() {
        return Api29Impl.a(this.f2430a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.d == insets.d && this.f2430a == insets.f2430a && this.c == insets.c && this.b == insets.b;
    }

    public final int hashCode() {
        return (((((this.f2430a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f2430a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return a.l(sb, this.d, '}');
    }
}
