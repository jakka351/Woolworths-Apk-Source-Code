package com.fasterxml.jackson.core.io.schubfach;

/* loaded from: classes4.dex */
public final class FloatToDecimal {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f14208a = new byte[15];
    public int b;

    public static int e(long j, long j2) {
        long jA = MathUtils.a(j, j2);
        return (int) ((((jA & 4294967295L) + 4294967295L) >>> 32) | (jA >>> 31));
    }

    public final void a(int i) {
        int i2 = this.b + 1;
        this.b = i2;
        this.f14208a[i2] = (byte) i;
    }

    public final void b(int i) {
        int iA = ((int) (MathUtils.a((i + 1) << 28, 193428131138340668L) >>> 20)) - 1;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iA * 10;
            c(i3 >>> 28);
            iA = i3 & 268435455;
        }
    }

    public final void c(int i) {
        int i2 = this.b + 1;
        this.b = i2;
        this.f14208a[i2] = (byte) (i + 48);
    }

    public final void d() {
        int i;
        byte b;
        while (true) {
            i = this.b;
            b = this.f14208a[i];
            if (b != 48) {
                break;
            } else {
                this.b = i - 1;
            }
        }
        if (b == 46) {
            this.b = i + 1;
        }
    }

    public final void f(int i, int i2) {
        int iNumberOfLeadingZeros = (int) (((32 - Integer.numberOfLeadingZeros(i)) * 661971961083L) >> 41);
        long j = i;
        long[] jArr = MathUtils.f14209a;
        if (j >= jArr[iNumberOfLeadingZeros]) {
            iNumberOfLeadingZeros++;
        }
        int i3 = i * ((int) jArr[9 - iNumberOfLeadingZeros]);
        int i4 = i2 + iNumberOfLeadingZeros;
        int i5 = (int) ((i3 * 1441151881) >>> 57);
        int i6 = i3 - (100000000 * i5);
        int i7 = 1;
        if (i4 > 0 && i4 <= 7) {
            c(i5);
            int iA = ((int) (MathUtils.a((i6 + 1) << 28, 193428131138340668L) >>> 20)) - 1;
            while (i7 < i4) {
                int i8 = iA * 10;
                c(i8 >>> 28);
                iA = i8 & 268435455;
                i7++;
            }
            a(46);
            while (i7 <= 8) {
                int i9 = iA * 10;
                c(i9 >>> 28);
                iA = i9 & 268435455;
                i7++;
            }
            d();
            return;
        }
        if (-3 < i4 && i4 <= 0) {
            c(0);
            a(46);
            while (i4 < 0) {
                c(0);
                i4++;
            }
            c(i5);
            b(i6);
            d();
            return;
        }
        c(i5);
        a(46);
        b(i6);
        d();
        int i10 = i4 - 1;
        a(69);
        if (i10 < 0) {
            a(45);
            i10 = -i10;
        }
        if (i10 < 10) {
            c(i10);
            return;
        }
        int i11 = (i10 * 103) >>> 10;
        c(i11);
        c(i10 - (i11 * 10));
    }

    public final void g(int i, int i2, int i3) {
        char c;
        long j;
        long j2;
        int i4 = i2 & 1;
        long j3 = i2 << 2;
        long j4 = j3 + 2;
        if ((i2 != 8388608) || (i == -149)) {
            j = j3 - 2;
            c = ')';
            j2 = i * 661971961083L;
        } else {
            c = ')';
            j = j3 - 1;
            j2 = (i * 661971961083L) - 274743187321L;
        }
        int i5 = (int) (j2 >> c);
        int i6 = i + ((int) (((-i5) * 913124641741L) >> 38)) + 33;
        long j5 = MathUtils.b[(i5 + 324) << 1] + 1;
        int iE = e(j5, j3 << i6);
        int iE2 = e(j5, j << i6);
        int iE3 = e(j5, j4 << i6);
        int i7 = iE >> 2;
        if (i7 >= 100) {
            int i8 = ((int) ((i7 * 1717986919) >>> 34)) * 10;
            int i9 = i8 + 10;
            boolean z = iE2 + i4 <= (i8 << 2);
            if (z != ((i9 << 2) + i4 <= iE3)) {
                if (!z) {
                    i8 = i9;
                }
                f(i8, i5);
                return;
            }
        }
        int i10 = i7 + 1;
        boolean z2 = iE2 + i4 <= (i7 << 2);
        if (z2 != ((i10 << 2) + i4 <= iE3)) {
            if (!z2) {
                i7 = i10;
            }
            f(i7, i5 + i3);
        } else {
            int i11 = iE - ((i7 + i10) << 1);
            if (i11 >= 0 && (i11 != 0 || (i7 & 1) != 0)) {
                i7 = i10;
            }
            f(i7, i5 + i3);
        }
    }
}
