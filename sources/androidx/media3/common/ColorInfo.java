package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class ColorInfo {
    public static final ColorInfo h;

    /* renamed from: a, reason: collision with root package name */
    public final int f2849a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    public static final class Builder {
        public byte[] d;

        /* renamed from: a, reason: collision with root package name */
        public int f2850a = -1;
        public int b = -1;
        public int c = -1;
        public int e = -1;
        public int f = -1;

        public final ColorInfo a() {
            return new ColorInfo(this.f2850a, this.b, this.c, this.e, this.f, this.d);
        }
    }

    static {
        Builder builder = new Builder();
        builder.f2850a = 1;
        builder.b = 2;
        builder.c = 3;
        h = builder.a();
        Builder builder2 = new Builder();
        builder2.f2850a = 1;
        builder2.b = 1;
        builder2.c = 2;
        builder2.a();
        Util.E(0);
        Util.E(1);
        Util.E(2);
        Util.E(3);
        Util.E(4);
        Util.E(5);
    }

    public ColorInfo(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f2849a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        return i != -1 ? i != 1 ? i != 2 ? YU.a.d(i, "Undefined color range ") : "Limited range" : "Full range" : "Unset color range";
    }

    public static String b(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? YU.a.d(i, "Undefined color space ") : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String c(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? YU.a.d(i, "Undefined color transfer ") : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static boolean e(ColorInfo colorInfo) {
        if (colorInfo == null) {
            return true;
        }
        int i = colorInfo.f2849a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = colorInfo.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = colorInfo.c;
        if ((i3 != -1 && i3 != 3) || colorInfo.d != null) {
            return false;
        }
        int i4 = colorInfo.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = colorInfo.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f2849a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ColorInfo.class == obj.getClass()) {
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.f2849a == colorInfo.f2849a && this.b == colorInfo.b && this.c == colorInfo.c && Arrays.equals(this.d, colorInfo.d) && this.e == colorInfo.e && this.f == colorInfo.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.g == 0) {
            this.g = ((androidx.compose.ui.input.pointer.a.d((((((527 + this.f2849a) * 31) + this.b) * 31) + this.c) * 31, 31, this.d) + this.e) * 31) + this.f;
        }
        return this.g;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f2849a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.e;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return YU.a.o(sb, str2, ")");
    }
}
