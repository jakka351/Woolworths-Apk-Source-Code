package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class Sonic {

    /* renamed from: a, reason: collision with root package name */
    public final int f2895a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public double w;

    public Sonic(int i, int i2, float f, float f2, int i3) {
        this.f2895a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        int i5 = i4 * 2;
        this.h = i5;
        this.i = new short[i5];
        this.j = new short[i5 * i2];
        this.l = new short[i5 * i2];
        this.n = new short[i5 * i2];
    }

    public static void e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        short[] sArrC = c(this.l, this.m, i2);
        this.l = sArrC;
        int i3 = this.b;
        System.arraycopy(sArr, i * i3, sArrC, this.m * i3, i3 * i2);
        this.m += i2;
    }

    public final void b(short[] sArr, int i, int i2) {
        int i3 = this.h / i2;
        int i4 = this.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[YU.a.C(i7, i5, i6, i9)];
            }
            this.i[i7] = (short) (i8 / i5);
        }
    }

    public final short[] c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.u = i6 / i7;
        this.v = i8 / i5;
        return i7;
    }

    public final void f() {
        float f;
        double d;
        int iD;
        int i;
        int i2;
        int i3;
        int iRound;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i8 = this.f2895a;
        int i9 = 1;
        int i10 = this.b;
        int i11 = 0;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i12 = this.k;
            int i13 = this.h;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.r;
                    if (i15 > 0) {
                        int iMin = Math.min(i13, i15);
                        a(this.j, i14, iMin);
                        this.r -= iMin;
                        i14 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i13;
                    } else {
                        short[] sArr = this.j;
                        int i16 = i8 > 4000 ? i8 / 4000 : i9;
                        int i17 = this.g;
                        int i18 = this.f;
                        if (i10 == i9 && i16 == i9) {
                            iD = d(sArr, i14, i18, i17);
                            f = f4;
                            d = d2;
                        } else {
                            b(sArr, i14, i16);
                            f = f4;
                            d = d2;
                            short[] sArr2 = this.i;
                            int iD2 = d(sArr2, i11, i18 / i16, i17 / i16);
                            if (i16 != 1) {
                                int i19 = iD2 * i16;
                                int i20 = i16 * 4;
                                int i21 = i19 - i20;
                                int i22 = i19 + i20;
                                if (i21 >= i18) {
                                    i18 = i21;
                                }
                                if (i22 <= i17) {
                                    i17 = i22;
                                }
                                if (i10 == 1) {
                                    iD = d(sArr, i14, i18, i17);
                                } else {
                                    b(sArr, i14, 1);
                                    iD = d(sArr2, i11, i18, i17);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i23 = this.u;
                        int i24 = this.v;
                        if (i23 == 0 || (i = this.s) == 0 || i24 > i23 * 3 || i23 * 2 <= this.t * 3) {
                            i = iD;
                        }
                        this.t = i23;
                        this.s = iD;
                        if (d > 1.0d) {
                            short[] sArr3 = this.j;
                            if (d >= 2.0d) {
                                i2 = i13;
                                double d3 = (i / (d - 1.0d)) + this.w;
                                iRound = (int) Math.round(d3);
                                this.w = d3 - iRound;
                            } else {
                                i2 = i13;
                                double d4 = (((2.0d - d) * i) / (d - 1.0d)) + this.w;
                                int iRound2 = (int) Math.round(d4);
                                this.r = iRound2;
                                this.w = d4 - iRound2;
                                iRound = i;
                            }
                            short[] sArrC = c(this.l, this.m, iRound);
                            this.l = sArrC;
                            int i25 = i14 + i;
                            int i26 = i14;
                            int i27 = iRound;
                            e(i27, this.b, sArrC, this.m, sArr3, i26, sArr3, i25);
                            this.m += i27;
                            i14 = i + i27 + i26;
                        } else {
                            i2 = i13;
                            int i28 = i14;
                            short[] sArr4 = this.j;
                            if (d < 0.5d) {
                                double d5 = ((i * d) / (1.0d - d)) + this.w;
                                int iRound3 = (int) Math.round(d5);
                                this.w = d5 - iRound3;
                                i3 = iRound3;
                            } else {
                                double d6 = ((((d * 2.0d) - 1.0d) * i) / (1.0d - d)) + this.w;
                                int iRound4 = (int) Math.round(d6);
                                this.r = iRound4;
                                this.w = d6 - iRound4;
                                i3 = i;
                            }
                            int i29 = i + i3;
                            short[] sArrC2 = c(this.l, this.m, i29);
                            this.l = sArrC2;
                            System.arraycopy(sArr4, i28 * i10, sArrC2, this.m * i10, i * i10);
                            e(i3, this.b, this.l, this.m + i, sArr4, i28 + i, sArr4, i28);
                            this.m += i29;
                            i14 = i28 + i3;
                        }
                    }
                    if (i14 + i2 > i12) {
                        break;
                    }
                    i11 = 0;
                    i13 = i2;
                    i9 = 1;
                    f4 = f;
                    d2 = d;
                }
                int i30 = this.k - i14;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i14 * i10, sArr5, 0, i30 * i10);
                this.k = i30;
            }
            if (f != 1.0f || this.m == i7) {
            }
            long j3 = (long) (i8 / f);
            long j4 = i8;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i31 = this.m - i7;
            short[] sArrC3 = c(this.n, this.o, i31);
            this.n = sArrC3;
            System.arraycopy(this.l, i7 * i10, sArrC3, this.o * i10, i31 * i10);
            this.m = i7;
            this.o += i31;
            int i32 = 0;
            while (true) {
                i4 = this.o;
                i5 = i4 - 1;
                if (i32 >= i5) {
                    break;
                }
                while (true) {
                    i6 = this.p + 1;
                    j = i6;
                    long j5 = j * j3;
                    j2 = this.q;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.l = c(this.l, this.m, 1);
                    int i33 = 0;
                    while (i33 < i10) {
                        short[] sArr6 = this.l;
                        int i34 = (this.m * i10) + i33;
                        short[] sArr7 = this.n;
                        int i35 = (i32 * i10) + i33;
                        short s = sArr7[i35];
                        short s2 = sArr7[i35 + i10];
                        long j6 = j3;
                        int i36 = i32;
                        long j7 = (r12 + 1) * j6;
                        long j8 = j7 - (this.q * j4);
                        long j9 = j7 - (this.p * j6);
                        sArr6[i34] = (short) ((((j9 - j8) * s2) + (s * j8)) / j9);
                        i33++;
                        i32 = i36;
                        j3 = j6;
                    }
                    this.q++;
                    this.m++;
                    i32 = i32;
                    j3 = j3;
                }
                long j10 = j3;
                int i37 = i32;
                this.p = i6;
                if (j == j4) {
                    this.p = 0;
                    Assertions.f(j2 == j10);
                    this.q = 0;
                }
                i32 = i37 + 1;
                j3 = j10;
            }
            if (i5 == 0) {
                return;
            }
            short[] sArr8 = this.n;
            System.arraycopy(sArr8, i5 * i10, sArr8, 0, (i4 - i5) * i10);
            this.o -= i5;
            return;
        }
        a(this.j, 0, this.k);
        this.k = 0;
        f = f4;
        if (f != 1.0f) {
        }
    }
}
