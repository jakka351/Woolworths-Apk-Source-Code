package org.bouncycastle.math.ec.rfc7748;

import androidx.compose.ui.input.pointer.a;
import org.bouncycastle.math.raw.Mod;

/* loaded from: classes8.dex */
public abstract class X25519Field {
    private static final int M24 = 16777215;
    private static final int M25 = 33554431;
    private static final int M26 = 67108863;
    private static final int[] P32 = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] ROOT_NEG_ONE = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};
    public static final int SIZE = 10;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2] ^ iArr2[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static void carry(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i3 + (i2 >> 26);
        int i12 = i2 & M26;
        int i13 = i5 + (i4 >> 26);
        int i14 = i4 & M26;
        int i15 = i8 + (i7 >> 26);
        int i16 = i7 & M26;
        int i17 = i10 + (i9 >> 26);
        int i18 = i9 & M26;
        int i19 = i14 + (i11 >> 25);
        int i20 = i11 & M25;
        int i21 = i6 + (i13 >> 25);
        int i22 = i13 & M25;
        int i23 = i18 + (i15 >> 25);
        int i24 = i15 & M25;
        int i25 = ((i17 >> 25) * 38) + i;
        int i26 = i17 & M25;
        int i27 = i12 + (i25 >> 26);
        int i28 = i25 & M26;
        int i29 = i16 + (i21 >> 26);
        int i30 = i21 & M26;
        int i31 = i20 + (i27 >> 26);
        int i32 = i27 & M26;
        int i33 = i22 + (i19 >> 26);
        int i34 = i19 & M26;
        int i35 = i24 + (i29 >> 26);
        int i36 = i29 & M26;
        int i37 = i26 + (i23 >> 26);
        int i38 = i23 & M26;
        iArr[0] = i28;
        iArr[1] = i32;
        iArr[2] = i31;
        iArr[3] = i34;
        iArr[4] = i33;
        iArr[5] = i30;
        iArr[6] = i36;
        iArr[7] = i35;
        iArr[8] = i38;
        iArr[9] = i37;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[10];
    }

    public static int[] createTable(int i) {
        return new int[i * 10];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode128(bArr, i, iArr, 0);
        decode128(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    private static void decode128(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode322 = decode32(bArr, i + 4);
        int iDecode323 = decode32(bArr, i + 8);
        int iDecode324 = decode32(bArr, i + 12);
        iArr[i2] = iDecode32 & M26;
        iArr[i2 + 1] = ((iDecode32 >>> 26) | (iDecode322 << 6)) & M26;
        iArr[i2 + 2] = ((iDecode322 >>> 20) | (iDecode323 << 12)) & M25;
        iArr[i2 + 3] = M26 & ((iDecode324 << 19) | (iDecode323 >>> 13));
        iArr[i2 + 4] = iDecode324 >>> 7;
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode128(iArr, i, bArr, i2);
        encode128(iArr, i + 5, bArr, i2 + 16);
    }

    private static void encode128(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        encode32((i4 << 26) | i3, bArr, i2);
        encode32((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        encode32((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        encode32((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        long j = i;
        long j2 = i4 * j;
        int i12 = ((int) j2) & M25;
        long j3 = j2 >> 25;
        long j4 = i6 * j;
        int i13 = ((int) j4) & M25;
        long j5 = i9 * j;
        int i14 = ((int) j5) & M25;
        long j6 = i11 * j;
        int i15 = ((int) j6) & M25;
        long j7 = (i2 * j) + ((j6 >> 25) * 38);
        iArr2[0] = ((int) j7) & M26;
        long j8 = (i7 * j) + (j4 >> 25);
        iArr2[5] = ((int) j8) & M26;
        long j9 = (i3 * j) + (j7 >> 26);
        iArr2[1] = ((int) j9) & M26;
        long j10 = (i5 * j) + j3;
        iArr2[3] = ((int) j10) & M26;
        long j11 = (i8 * j) + (j8 >> 26);
        iArr2[6] = ((int) j11) & M26;
        long j12 = (i10 * j) + (j5 >> 25);
        iArr2[8] = ((int) j12) & M26;
        iArr2[2] = i12 + ((int) (j9 >> 26));
        iArr2[4] = i13 + ((int) (j10 >> 26));
        iArr2[7] = i14 + ((int) (j11 >> 26));
        iArr2[9] = i15 + ((int) (j12 >> 26));
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void normalize(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        reduce(iArr, i);
        reduce(iArr, -i);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm5d8(int[] iArr, int[] iArr2, int[] iArr3) {
        sqr(iArr, iArr2);
        mul(iArr, iArr2, iArr2);
        int[] iArrCreate = create();
        sqr(iArr2, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArr2, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, 5, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 5, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 10, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 25, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 25, iArrCreate3);
        mul(iArrCreate, iArrCreate3, iArrCreate3);
        sqr(iArrCreate3, 50, iArrCreate);
        mul(iArrCreate2, iArrCreate, iArrCreate);
        sqr(iArrCreate, 125, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate2);
        sqr(iArrCreate2, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr3);
    }

    private static void reduce(int[] iArr, int i) {
        int i2 = M24 & iArr[9];
        long j = (((r1 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j) & M26;
        long j2 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j2) & M26;
        long j3 = (j2 >> 26) + iArr[2];
        iArr[2] = ((int) j3) & M25;
        long j4 = (j3 >> 25) + iArr[3];
        iArr[3] = ((int) j4) & M26;
        long j5 = (j4 >> 26) + iArr[4];
        iArr[4] = ((int) j5) & M25;
        long j6 = (j5 >> 25) + iArr[5];
        iArr[5] = ((int) j6) & M26;
        long j7 = (j6 >> 26) + iArr[6];
        iArr[6] = ((int) j7) & M26;
        long j8 = (j7 >> 26) + iArr[7];
        iArr[7] = M25 & ((int) j8);
        long j9 = (j8 >> 25) + iArr[8];
        iArr[8] = M26 & ((int) j9);
        iArr[9] = i2 + ((int) (j9 >> 26));
    }

    public static void sqr(int[] iArr, int i, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        mul(iArr, iArr2, iArrCreate);
        sqr(iArr2, iArrCreate2);
        mul(iArrCreate, iArrCreate2, iArrCreate);
        sqr(iArrCreate2, iArrCreate2);
        mul(iArrCreate2, iArrCreate, iArrCreate2);
        int[] iArrCreate3 = create();
        int[] iArrCreate4 = create();
        powPm5d8(iArrCreate2, iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArrCreate, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, iArrCreate5);
        mul(iArrCreate5, iArr2, iArrCreate5);
        sub(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (isZeroVar(iArrCreate3)) {
            copy(iArrCreate4, 0, iArr3, 0);
            return true;
        }
        add(iArrCreate5, iArr, iArrCreate3);
        normalize(iArrCreate3);
        if (!isZeroVar(iArrCreate3)) {
            return false;
        }
        mul(iArrCreate4, ROOT_NEG_ONE, iArr3);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode128(bArr, i, iArr, i2);
        decode128(bArr, i + 16, iArr, i2 + 5);
        int i3 = i2 + 9;
        iArr[i3] = iArr[i3] & M24;
    }

    private static void decode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & M26;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & M26;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & M25;
        iArr2[i2 + 3] = M26 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode128(iArr, 0, bArr, 0);
        encode128(iArr, 5, bArr, 16);
    }

    private static void encode128(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = j * j2;
        long j4 = i4;
        long j5 = j * j4;
        long j6 = i3;
        long j7 = (j6 * j2) + j5;
        long j8 = i6;
        long j9 = (j6 * j4) + (j * j8);
        long j10 = i5;
        long j11 = (j10 * j2) + j9;
        long j12 = ((j10 * j4) + (j6 * j8)) << 1;
        long j13 = i8;
        long j14 = j * j13;
        long j15 = i7;
        long jF = a.f(j15, j2, j14, j12);
        long j16 = (j10 * j8) << 1;
        long j17 = i10;
        long j18 = i9;
        long jF2 = a.f(j18, j2, (j15 * j4) + (j6 * j13) + (j * j17), j16);
        long j19 = ((j18 * j4) + ((j15 * j8) + ((j10 * j13) + (j6 * j17)))) << 1;
        long j20 = (j15 * j13) + (((j18 * j8) + (j10 * j17)) << 1);
        long j21 = (j18 * j13) + (j15 * j17);
        long j22 = (j18 * j17) << 1;
        long j23 = i11;
        long j24 = i12;
        long j25 = j23 * j24;
        long j26 = i14;
        long j27 = j23 * j26;
        long j28 = i13;
        long j29 = (j28 * j24) + j27;
        long j30 = i16;
        long j31 = (j28 * j26) + (j23 * j30);
        long j32 = i15;
        long j33 = i18;
        long j34 = j23 * j33;
        long j35 = i17;
        long jF3 = a.f(j35, j24, j34, ((j32 * j26) + (j28 * j30)) << 1);
        long j36 = i20;
        long j37 = (j35 * j26) + (j28 * j33) + (j23 * j36);
        long j38 = i19;
        long jF4 = a.f(j38, j24, j37, (j32 * j30) << 1);
        long j39 = j3 - (((j26 * j38) + ((j35 * j30) + ((j32 * j33) + (j28 * j36)))) * 76);
        long j40 = j7 - (((j35 * j33) + (((j30 * j38) + (j32 * j36)) << 1)) * 38);
        long j41 = j11 - (((j38 * j33) + (j35 * j36)) * 38);
        long j42 = jF - ((j36 * j38) * 76);
        long j43 = j19 - j25;
        long j44 = j20 - j29;
        long j45 = j21 - ((j32 * j24) + j31);
        long j46 = j22 - jF3;
        long j47 = i + i11;
        long j48 = i2 + i12;
        long j49 = j47 * j48;
        long j50 = i4 + i14;
        long j51 = j47 * j50;
        long j52 = i3 + i13;
        long j53 = (j52 * j48) + j51;
        long j54 = i6 + i16;
        long j55 = i5 + i15;
        long j56 = (j55 * j48) + (j52 * j50) + (j47 * j54);
        long j57 = ((j55 * j50) + (j52 * j54)) << 1;
        long j58 = i8 + i18;
        long j59 = i7 + i17;
        long jF5 = a.f(j59, j48, j47 * j58, j57);
        long j60 = i10 + i20;
        long j61 = i9 + i19;
        long jF6 = a.f(j61, j48, (j59 * j50) + (j52 * j58) + (j47 * j60), (j55 * j54) << 1);
        long j62 = ((j50 * j61) + ((j59 * j54) + ((j55 * j58) + (j52 * j60)))) << 1;
        long j63 = (j59 * j58) + (((j54 * j61) + (j55 * j60)) << 1);
        long j64 = (j61 * j58) + (j59 * j60);
        long j65 = (j60 * j61) << 1;
        long j66 = (jF5 - j42) + j46;
        int i21 = ((int) j66) & M26;
        long j67 = ((jF6 - jF2) - jF4) + (j66 >> 26);
        int i22 = ((int) j67) & M25;
        long j68 = ((((j67 >> 25) + j62) - j43) * 38) + j39;
        iArr3[0] = ((int) j68) & M26;
        long j69 = ((j63 - j44) * 38) + j40 + (j68 >> 26);
        iArr3[1] = ((int) j69) & M26;
        long j70 = ((j64 - j45) * 38) + j41 + (j69 >> 26);
        iArr3[2] = ((int) j70) & M25;
        long j71 = ((j65 - j46) * 38) + j42 + (j70 >> 25);
        iArr3[3] = ((int) j71) & M26;
        long jF7 = a.f(jF4, 38L, jF2, j71 >> 26);
        iArr3[4] = ((int) jF7) & M25;
        long j72 = (j49 - j39) + j43 + (jF7 >> 25);
        iArr3[5] = ((int) j72) & M26;
        long j73 = (j53 - j40) + j44 + (j72 >> 26);
        iArr3[6] = ((int) j73) & M26;
        long j74 = (j56 - j41) + j45 + (j73 >> 26);
        iArr3[7] = ((int) j74) & M25;
        long j75 = (j74 >> 25) + i21;
        iArr3[8] = ((int) j75) & M26;
        iArr3[9] = i22 + ((int) (j75 >> 26));
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = i;
        long j2 = j * j;
        long j3 = i2 * 2;
        long j4 = j * j3;
        long j5 = i3 * 2;
        long j6 = j * j5;
        long j7 = i2;
        long j8 = (j7 * j7) + j6;
        long j9 = i4 * 2;
        long j10 = (j * j9) + (j3 * j5);
        long j11 = i5 * 2;
        long j12 = (j7 * j9) + (j * j11) + (i3 * j5);
        long j13 = (j5 * j9) + (j3 * j11);
        long j14 = j5 * j11;
        long j15 = i4;
        long j16 = (j15 * j15) + j14;
        long j17 = j15 * j11;
        long j18 = i6;
        long j19 = j18 * j18;
        long j20 = i7 * 2;
        long j21 = j18 * j20;
        long j22 = i8 * 2;
        long j23 = j18 * j22;
        long j24 = i7;
        long j25 = (j24 * j24) + j23;
        long j26 = j20 * j22;
        long j27 = i9 * 2;
        long j28 = i10 * 2;
        long j29 = (j24 * j27) + (j18 * j28) + (i8 * j22);
        long j30 = (j22 * j27) + (j20 * j28);
        long j31 = j22 * j28;
        long j32 = i9;
        long j33 = j2 - (j30 * 38);
        long j34 = j4 - (((j32 * j32) + j31) * 38);
        long j35 = j8 - ((j32 * j28) * 38);
        long j36 = j10 - ((i10 * j28) * 38);
        long j37 = j13 - j19;
        long j38 = j16 - j21;
        long j39 = j17 - j25;
        long j40 = (i5 * j11) - ((j18 * j27) + j26);
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j41 = i + i6;
        long j42 = i11 * 2;
        long j43 = j41 * j42;
        long j44 = i12 * 2;
        long j45 = i11;
        long j46 = (j45 * j45) + (j41 * j44);
        long j47 = i13 * 2;
        long j48 = i14 * 2;
        long j49 = i13;
        long j50 = i14 * j48;
        long j51 = (((j41 * j47) + (j42 * j44)) - j36) + j40;
        int i15 = ((int) j51) & M26;
        long j52 = ((((j45 * j47) + ((j41 * j48) + (i12 * j44))) - j12) - j29) + (j51 >> 26);
        int i16 = ((int) j52) & M25;
        long j53 = ((((j52 >> 25) + ((j47 * j44) + (j42 * j48))) - j37) * 38) + j33;
        iArr2[0] = ((int) j53) & M26;
        long j54 = ((((j49 * j49) + (j44 * j48)) - j38) * 38) + j34 + (j53 >> 26);
        iArr2[1] = ((int) j54) & M26;
        long j55 = (((j49 * j48) - j39) * 38) + j35 + (j54 >> 26);
        iArr2[2] = ((int) j55) & M25;
        long j56 = ((j50 - j40) * 38) + j36 + (j55 >> 25);
        iArr2[3] = ((int) j56) & M26;
        long jF = a.f(j29, 38L, j12, j56 >> 26);
        iArr2[4] = ((int) jF) & M25;
        long j57 = ((j41 * j41) - j33) + j37 + (jF >> 25);
        iArr2[5] = ((int) j57) & M26;
        long j58 = (j43 - j34) + j38 + (j57 >> 26);
        iArr2[6] = ((int) j58) & M26;
        long j59 = (j46 - j35) + j39 + (j58 >> 26);
        iArr2[7] = ((int) j59) & M25;
        long j60 = (j59 >> 25) + i15;
        iArr2[8] = ((int) j60) & M26;
        iArr2[9] = i16 + ((int) (j60 >> 26));
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode128(bArr, 0, iArr, 0);
        decode128(bArr, 16, iArr, 5);
        iArr[9] = iArr[9] & M24;
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode128(iArr, 0, bArr, i);
        encode128(iArr, 5, bArr, i + 16);
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode128(iArr, i, iArr2, 0);
        decode128(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & M24;
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode128(iArr, 0, iArr2, i);
        encode128(iArr, 5, iArr2, i + 4);
    }
}
