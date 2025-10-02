package com.google.zxing.common.reedsolomon;

import YU.a;

/* loaded from: classes6.dex */
public final class GenericGF {
    public static final GenericGF h = new GenericGF(4201, 4096, 1);
    public static final GenericGF i = new GenericGF(1033, 1024, 1);
    public static final GenericGF j;
    public static final GenericGF k;
    public static final GenericGF l;
    public static final GenericGF m;
    public static final GenericGF n;
    public static final GenericGF o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16149a;
    public final int[] b;
    public final GenericGFPoly c;
    public final GenericGFPoly d;
    public final int e;
    public final int f;
    public final int g;

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        j = genericGF;
        k = new GenericGF(19, 16, 1);
        l = new GenericGF(285, 256, 0);
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        m = genericGF2;
        n = genericGF2;
        o = genericGF;
    }

    public GenericGF(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.f16149a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f16149a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.f16149a[i7]] = i7;
        }
        this.c = new GenericGFPoly(this, new int[]{0});
        this.d = new GenericGFPoly(this, new int[]{1});
    }

    public final GenericGFPoly a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new GenericGFPoly(this, iArr);
    }

    public final int b(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        return this.f16149a[(this.e - this.b[i2]) - 1];
    }

    public final int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.f16149a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        return a.l(sb, this.e, ')');
    }
}
