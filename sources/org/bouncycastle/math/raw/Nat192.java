package org.bouncycastle.math.raw;

import androidx.compose.ui.input.pointer.a;
import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public abstract class Nat192 {
    private static final long M = 4294967295L;

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & M) + (iArr2[1] & M) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & M) + (iArr2[2] & M) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & M) + (iArr2[3] & M) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & M) + (iArr2[4] & M) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & M) + (iArr2[5] & M) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) + (iArr2[0] & M) + (iArr3[0] & M);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & M) + (iArr2[1] & M) + (iArr3[1] & M) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & M) + (iArr2[2] & M) + (iArr3[2] & M) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & M) + (iArr2[3] & M) + (iArr3[3] & M) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (iArr[4] & M) + (iArr2[4] & M) + (iArr3[4] & M) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (iArr[5] & M) + (iArr2[5] & M) + (iArr3[5] & M) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (iArr[i] & M) + (iArr2[i2] & M) + (i3 & M);
        iArr2[i2] = (int) j;
        long j2 = (iArr[i + 1] & M) + (iArr2[r6] & M) + (j >>> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = (iArr[i + 2] & M) + (iArr2[r6] & M) + (j2 >>> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = (iArr[i + 3] & M) + (iArr2[r6] & M) + (j3 >>> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = (iArr[i + 4] & M) + (iArr2[r6] & M) + (j4 >>> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = (iArr[i + 5] & M) + (M & iArr2[r12]) + (j5 >>> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & M) + (iArr2[i2] & M);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        long j2 = (iArr[r5] & M) + (iArr2[r8] & M) + (j >>> 32);
        int i4 = (int) j2;
        iArr[i + 1] = i4;
        iArr2[i2 + 1] = i4;
        long j3 = (iArr[r5] & M) + (iArr2[r8] & M) + (j2 >>> 32);
        int i5 = (int) j3;
        iArr[i + 2] = i5;
        iArr2[i2 + 2] = i5;
        long j4 = (iArr[r5] & M) + (iArr2[r8] & M) + (j3 >>> 32);
        int i6 = (int) j4;
        iArr[i + 3] = i6;
        iArr2[i2 + 3] = i6;
        long j5 = (iArr[r5] & M) + (iArr2[r8] & M) + (j4 >>> 32);
        int i7 = (int) j5;
        iArr[i + 4] = i7;
        iArr2[i2 + 4] = i7;
        long j6 = (iArr[r12] & M) + (M & iArr2[r14]) + (j5 >>> 32);
        int i8 = (int) j6;
        iArr[i + 5] = i8;
        iArr2[i2 + 5] = i8;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    public static int[] create() {
        return new int[6];
    }

    public static long[] create64() {
        return new long[3];
    }

    public static int[] createExt() {
        return new int[12];
    }

    public static long[] createExt64() {
        return new long[6];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zGte = gte(iArr, i, iArr2, i2);
        if (zGte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return zGte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return zGte;
    }

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 6; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 3; i++) {
            jArrCreate64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = iArr[i] & M;
        long j8 = j7 * j;
        iArr3[i3] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = 1;
        int i5 = i3;
        while (i4 < 6) {
            int i6 = i5 + 1;
            long j14 = iArr[i + i4] & M;
            int i7 = i5;
            long j15 = (j14 * j) + (iArr3[i6] & M);
            iArr3[i6] = (int) j15;
            long j16 = (j14 * j2) + (iArr3[r3] & M) + (j15 >>> 32);
            iArr3[i7 + 2] = (int) j16;
            long j17 = (j14 * j3) + (iArr3[r21] & M) + (j16 >>> 32);
            iArr3[i7 + 3] = (int) j17;
            long j18 = (j14 * j4) + (iArr3[r21] & M) + (j17 >>> 32);
            iArr3[i7 + 4] = (int) j18;
            long j19 = (j14 * j5) + (iArr3[r21] & M) + (j18 >>> 32);
            iArr3[i7 + 5] = (int) j19;
            long j20 = j19 >>> 32;
            long j21 = (j14 * j6) + (iArr3[r2] & M) + j20;
            iArr3[i7 + 6] = (int) j21;
            iArr3[i7 + 7] = (int) (j21 >>> 32);
            i4++;
            i5 = i6;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & M;
        long j2 = iArr[i2] & M;
        long j3 = (j * j2) + (iArr2[i3] & M);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & M;
        long j5 = (j * j4) + j2 + (iArr2[i3 + 1] & M) + (j3 >>> 32);
        iArr3[i4 + 1] = (int) j5;
        long j6 = iArr[i2 + 2] & M;
        long j7 = (j * j6) + j4 + (iArr2[i3 + 2] & M) + (j5 >>> 32);
        iArr3[i4 + 2] = (int) j7;
        long j8 = iArr[i2 + 3] & M;
        long j9 = (j * j8) + j6 + (iArr2[i3 + 3] & M) + (j7 >>> 32);
        iArr3[i4 + 3] = (int) j9;
        long j10 = iArr[i2 + 4] & M;
        long j11 = (j * j10) + j8 + (iArr2[i3 + 4] & M) + (j9 >>> 32);
        iArr3[i4 + 4] = (int) j11;
        long j12 = iArr[i2 + 5] & M;
        long j13 = (j * j12) + j10 + (M & iArr2[i3 + 5]) + (j11 >>> 32);
        iArr3[i4 + 5] = (int) j13;
        return (j13 >>> 32) + j12;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        long j3 = j & M;
        long j4 = (j2 * j3) + (iArr[i2] & M);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        long j7 = j6 + (iArr[r4] & M) + (j4 >>> 32);
        iArr[i2 + 1] = (int) j7;
        long j8 = j5 + (iArr[r4] & M) + (j7 >>> 32);
        iArr[i2 + 2] = (int) j8;
        long j9 = (j8 >>> 32) + (iArr[r0] & M);
        iArr[i2 + 3] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = i & M;
        long j2 = i2 & M;
        long j3 = (j * j2) + (iArr[i3] & M);
        iArr[i3] = (int) j3;
        long j4 = j2 + (iArr[r5] & M) + (j3 >>> 32);
        iArr[i3 + 1] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[r0] & M);
        iArr[i3 + 2] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & M;
        long j2 = iArr2[i2 + 1] & M;
        long j3 = iArr2[i2 + 2] & M;
        long j4 = iArr2[i2 + 3] & M;
        long j5 = iArr2[i2 + 4] & M;
        long j6 = iArr2[i2 + 5] & M;
        long j7 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 6) {
            long j8 = iArr[i + i4] & M;
            long j9 = (j8 * j) + (iArr3[i5] & M);
            long j10 = j2;
            iArr3[i5] = (int) j9;
            int i6 = i5 + 1;
            long j11 = (j8 * j10) + (iArr3[i6] & M) + (j9 >>> 32);
            iArr3[i6] = (int) j11;
            long j12 = (j8 * j3) + (iArr3[r4] & M) + (j11 >>> 32);
            iArr3[i5 + 2] = (int) j12;
            long j13 = (j8 * j4) + (iArr3[r4] & M) + (j12 >>> 32);
            iArr3[i5 + 3] = (int) j13;
            long j14 = (j8 * j5) + (iArr3[r4] & M) + (j13 >>> 32);
            iArr3[i5 + 4] = (int) j14;
            long j15 = (j8 * j6) + (iArr3[r4] & M) + (j14 >>> 32);
            iArr3[i5 + 5] = (int) j15;
            long j16 = (j15 >>> 32) + (iArr3[r14] & M) + j7;
            iArr3[i5 + 6] = (int) j16;
            j7 = j16 >>> 32;
            i4++;
            i5 = i6;
            j2 = j10;
        }
        return (int) j7;
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = i & M;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = ((iArr[i3] & M) * j) + j2;
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 6);
        return (int) j2;
    }

    public static int mulWordAddExt(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = i & M;
        long j2 = ((iArr[i2] & M) * j) + (iArr2[i3] & M);
        iArr2[i3] = (int) j2;
        long j3 = ((iArr[i2 + 1] & M) * j) + (iArr2[r8] & M) + (j2 >>> 32);
        iArr2[i3 + 1] = (int) j3;
        long j4 = ((iArr[i2 + 2] & M) * j) + (iArr2[r8] & M) + (j3 >>> 32);
        iArr2[i3 + 2] = (int) j4;
        long j5 = ((iArr[i2 + 3] & M) * j) + (iArr2[r8] & M) + (j4 >>> 32);
        iArr2[i3 + 3] = (int) j5;
        long j6 = ((iArr[i2 + 4] & M) * j) + (iArr2[r8] & M) + (j5 >>> 32);
        iArr2[i3 + 4] = (int) j6;
        long j7 = (j * (iArr[i2 + 5] & M)) + (iArr2[r15] & M) + (j6 >>> 32);
        iArr2[i3 + 5] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = i & M;
        long j3 = ((j & M) * j2) + (iArr[i2] & M);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        long j5 = j4 + (iArr[r9] & M) + (j3 >>> 32);
        iArr[i2 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = j6 + (iArr[r0] & M);
        iArr[i2 + 2] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(6, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = iArr[i] & M;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
        while (true) {
            int i6 = i5 - 1;
            long j2 = iArr[i + i5] & M;
            long j3 = j2 * j2;
            iArr2[(i4 - 1) + i2] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & M);
                iArr2[i2] = (int) j4;
                int i7 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[i + 1] & M;
                long j7 = iArr2[r8] & M;
                long j8 = (j6 * j) + j5;
                int i8 = (int) j8;
                iArr2[i2 + 1] = (i8 << 1) | i7;
                long j9 = j7 + (j8 >>> 32);
                long j10 = iArr[i + 2] & M;
                long j11 = iArr2[r9] & M;
                long j12 = iArr2[r24] & M;
                long j13 = (j10 * j) + j9;
                int i9 = (int) j13;
                iArr2[i2 + 2] = (i9 << 1) | (i8 >>> 31);
                long jF = a.f(j10, j6, j13 >>> 32, j11);
                long j14 = j12 + (jF >>> 32);
                long j15 = jF & M;
                long j16 = iArr[i + 3] & M;
                long j17 = (iArr2[r6] & M) + (j14 >>> 32);
                long j18 = j14 & M;
                long j19 = (iArr2[r2] & M) + (j17 >>> 32);
                long j20 = j17 & M;
                long j21 = (j16 * j) + j15;
                int i10 = (int) j21;
                iArr2[i2 + 3] = (i9 >>> 31) | (i10 << 1);
                long jF2 = a.f(j16, j6, j21 >>> 32, j18);
                long jF3 = a.f(j16, j10, jF2 >>> 32, j20);
                long j22 = jF2 & M;
                long j23 = j19 + (jF3 >>> 32);
                long j24 = jF3 & M;
                long j25 = iArr[i + 4] & M;
                long j26 = (iArr2[r4] & M) + (j23 >>> 32);
                long j27 = j23 & M;
                long j28 = (iArr2[r5] & M) + (j26 >>> 32);
                long j29 = j26 & M;
                long j30 = (j25 * j) + j22;
                int i11 = (int) j30;
                iArr2[i2 + 4] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long jF4 = a.f(j25, j6, j30 >>> 32, j24);
                long jF5 = a.f(j25, j10, jF4 >>> 32, j27);
                long j31 = jF4 & M;
                long jF6 = a.f(j25, j16, jF5 >>> 32, j29);
                long j32 = jF5 & M;
                long j33 = j28 + (jF6 >>> 32);
                long j34 = jF6 & M;
                long j35 = iArr[i + 5] & M;
                long j36 = (iArr2[r8] & M) + (j33 >>> 32);
                long j37 = j33 & M;
                long j38 = (iArr2[r0] & M) + (j36 >>> 32);
                long j39 = j36 & M;
                long j40 = (j35 * j) + j31;
                int i13 = (int) j40;
                iArr2[i2 + 5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jF7 = a.f(j35, j6, j40 >>> 32, j32);
                long jF8 = a.f(j35, j10, jF7 >>> 32, j34);
                long jF9 = a.f(j35, j16, jF8 >>> 32, j37);
                long jF10 = a.f(j35, j25, jF9 >>> 32, j39);
                long j41 = j38 + (jF10 >>> 32);
                int i15 = (int) jF7;
                iArr2[i2 + 6] = i14 | (i15 << 1);
                int i16 = (int) jF8;
                iArr2[i2 + 7] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) jF9;
                iArr2[i2 + 8] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jF10;
                iArr2[i2 + 9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j41;
                iArr2[i2 + 10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = i2 + 11;
                iArr2[i24] = ((iArr2[i24] + ((int) (j41 >>> 32))) << 1) | i23;
                return;
            }
            i5 = i6;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & M) - (iArr2[i2] & M);
        iArr3[i3] = (int) j;
        long j2 = ((iArr[i + 1] & M) - (iArr2[i2 + 1] & M)) + (j >> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = ((iArr[i + 2] & M) - (iArr2[i2 + 2] & M)) + (j2 >> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = ((iArr[i + 3] & M) - (iArr2[i2 + 3] & M)) + (j3 >> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = ((iArr[i + 4] & M) - (iArr2[i2 + 4] & M)) + (j4 >> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = ((iArr[i + 5] & M) - (iArr2[i2 + 5] & M)) + (j5 >> 32);
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((iArr3[0] & M) - (iArr[0] & M)) - (iArr2[0] & M);
        iArr3[0] = (int) j;
        long j2 = (((iArr3[1] & M) - (iArr[1] & M)) - (iArr2[1] & M)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = (((iArr3[2] & M) - (iArr[2] & M)) - (iArr2[2] & M)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = (((iArr3[3] & M) - (iArr[3] & M)) - (iArr2[3] & M)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = (((iArr3[4] & M) - (iArr[4] & M)) - (iArr2[4] & M)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = (((iArr3[5] & M) - (iArr[5] & M)) - (iArr2[5] & M)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr2[i2] & M) - (iArr[i] & M);
        iArr2[i2] = (int) j;
        long j2 = ((iArr2[r5] & M) - (iArr[i + 1] & M)) + (j >> 32);
        iArr2[i2 + 1] = (int) j2;
        long j3 = ((iArr2[r5] & M) - (iArr[i + 2] & M)) + (j2 >> 32);
        iArr2[i2 + 2] = (int) j3;
        long j4 = ((iArr2[r5] & M) - (iArr[i + 3] & M)) + (j3 >> 32);
        iArr2[i2 + 3] = (int) j4;
        long j5 = ((iArr2[r5] & M) - (iArr[i + 4] & M)) + (j4 >> 32);
        iArr2[i2 + 4] = (int) j5;
        long j6 = ((iArr2[r13] & M) - (iArr[i + 5] & M)) + (j5 >> 32);
        iArr2[i2 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (iArr[0] & M) + (iArr2[0] & M);
        iArr2[0] = (int) j;
        long j2 = (iArr[1] & M) + (iArr2[1] & M) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (iArr[2] & M) + (iArr2[2] & M) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (iArr[3] & M) + (iArr2[3] & M) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (iArr[4] & M) + (iArr2[4] & M) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (iArr[5] & M) + (M & iArr2[5]) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & M;
        long j2 = iArr2[1] & M;
        long j3 = iArr2[2] & M;
        long j4 = iArr2[3] & M;
        long j5 = iArr2[4] & M;
        long j6 = iArr2[5] & M;
        int i = 1;
        long j7 = iArr[0] & M;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[1] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[2] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[5] = (int) j13;
        int i2 = 6;
        iArr3[6] = (int) (j13 >>> 32);
        while (true) {
            int i3 = i;
            if (i3 >= i2) {
                return;
            }
            long j14 = iArr[i3] & M;
            long j15 = (j14 * j) + (iArr3[i3] & M);
            iArr3[i3] = (int) j15;
            i = i3 + 1;
            long j16 = j5;
            long j17 = (j14 * j2) + (iArr3[i] & M) + (j15 >>> 32);
            iArr3[i] = (int) j17;
            long j18 = (j14 * j3) + (iArr3[r5] & M) + (j17 >>> 32);
            iArr3[i3 + 2] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r5] & M) + (j18 >>> 32);
            iArr3[i3 + 3] = (int) j19;
            long j20 = (j14 * j16) + (iArr3[r5] & M) + (j19 >>> 32);
            iArr3[i3 + 4] = (int) j20;
            long j21 = (j14 * j6) + (iArr3[r5] & M) + (j20 >>> 32);
            iArr3[i3 + 5] = (int) j21;
            iArr3[i3 + 6] = (int) (j21 >>> 32);
            j5 = j16;
            i2 = 6;
        }
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = iArr2[0] & M;
        long j2 = iArr2[1] & M;
        long j3 = iArr2[2] & M;
        long j4 = iArr2[3] & M;
        long j5 = iArr2[4] & M;
        long j6 = iArr2[5] & M;
        long j7 = 0;
        while (i < 6) {
            long j8 = j;
            int i2 = i;
            long j9 = iArr[i] & M;
            long j10 = (iArr3[i2] & M) + (j9 * j8);
            iArr3[i2] = (int) j10;
            int i3 = i2 + 1;
            long j11 = (j9 * j2) + (iArr3[i3] & M) + (j10 >>> 32);
            iArr3[i3] = (int) j11;
            long j12 = (j9 * j3) + (iArr3[r15] & M) + (j11 >>> 32);
            iArr3[i2 + 2] = (int) j12;
            long j13 = (j9 * j4) + (iArr3[r2] & M) + (j12 >>> 32);
            iArr3[i2 + 3] = (int) j13;
            long j14 = (j9 * j5) + (iArr3[r2] & M) + (j13 >>> 32);
            iArr3[i2 + 4] = (int) j14;
            long j15 = (j9 * j6) + (iArr3[r2] & M) + (j14 >>> 32);
            iArr3[i2 + 5] = (int) j15;
            long j16 = (j15 >>> 32) + (iArr3[r2] & M) + j7;
            iArr3[i2 + 6] = (int) j16;
            j7 = j16 >>> 32;
            i = i3;
            j = j8;
        }
        return (int) j7;
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = iArr[0] & M;
        int i = 12;
        int i2 = 0;
        int i3 = 5;
        while (true) {
            int i4 = i3 - 1;
            long j2 = iArr[i3] & M;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i2 << 31) & M);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & M;
                long j7 = iArr2[2] & M;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                long j9 = iArr[2] & M;
                long j10 = iArr2[3] & M;
                long j11 = iArr2[4] & M;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i7 = (int) j12;
                iArr2[2] = (i7 << 1) | (i6 >>> 31);
                long jF = a.f(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jF >>> 32);
                long j14 = jF & M;
                long j15 = iArr[3] & M;
                long j16 = (iArr2[5] & M) + (j13 >>> 32);
                long j17 = j13 & M;
                long j18 = (iArr2[6] & M) + (j16 >>> 32);
                long j19 = j16 & M;
                long j20 = (j15 * j) + j14;
                int i8 = (int) j20;
                iArr2[3] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long jF2 = a.f(j15, j6, j20 >>> 32, j17);
                long jF3 = a.f(j15, j9, jF2 >>> 32, j19);
                long j21 = jF2 & M;
                long j22 = j18 + (jF3 >>> 32);
                long j23 = jF3 & M;
                long j24 = iArr[4] & M;
                long j25 = (iArr2[7] & M) + (j22 >>> 32);
                long j26 = j22 & M;
                long j27 = (iArr2[8] & M) + (j25 >>> 32);
                long j28 = j25 & M;
                long j29 = (j24 * j) + j21;
                int i10 = (int) j29;
                iArr2[4] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jF4 = a.f(j24, j6, j29 >>> 32, j23);
                long jF5 = a.f(j24, j9, jF4 >>> 32, j26);
                long j30 = jF4 & M;
                long jF6 = a.f(j24, j15, jF5 >>> 32, j28);
                long j31 = jF5 & M;
                long j32 = j27 + (jF6 >>> 32);
                long j33 = jF6 & M;
                long j34 = iArr[5] & M;
                long j35 = (iArr2[9] & M) + (j32 >>> 32);
                long j36 = j32 & M;
                long j37 = (iArr2[10] & M) + (j35 >>> 32);
                long j38 = j35 & M;
                long j39 = (j34 * j) + j30;
                int i12 = (int) j39;
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                long jF7 = a.f(j34, j6, j39 >>> 32, j31);
                long jF8 = a.f(j34, j9, jF7 >>> 32, j33);
                long jF9 = a.f(j34, j15, jF8 >>> 32, j36);
                long jF10 = a.f(j34, j24, jF9 >>> 32, j38);
                long j40 = j37 + (jF10 >>> 32);
                int i14 = (int) jF7;
                iArr2[6] = (i14 << 1) | i13;
                int i15 = (int) jF8;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) jF9;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jF10;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j40;
                iArr2[10] = i20 | (i21 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j40 >>> 32))) << 1) | (i21 >>> 31);
                return;
            }
            i3 = i4;
        }
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & M) - (iArr2[0] & M);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & M) - (iArr2[1] & M)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & M) - (iArr2[2] & M)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & M) - (iArr2[3] & M)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((iArr[4] & M) - (iArr2[4] & M)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((iArr[5] & M) - (iArr2[5] & M)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & M) - (iArr[0] & M);
        iArr2[0] = (int) j;
        long j2 = ((iArr2[1] & M) - (iArr[1] & M)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((iArr2[2] & M) - (iArr[2] & M)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((iArr2[3] & M) - (iArr[3] & M)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((iArr2[4] & M) - (iArr[4] & M)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((iArr2[5] & M) - (M & iArr[5])) + (j5 >> 32);
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }
}
