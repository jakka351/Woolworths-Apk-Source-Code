package org.bouncycastle.math.ec.rfc7748;

import org.bouncycastle.math.raw.Mod;

/* loaded from: classes8.dex */
public abstract class X448Field {
    private static final int M28 = 268435455;
    private static final int[] P32 = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    public static final int SIZE = 16;
    private static final long U32 = 4294967295L;

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i2 + (i >>> 28);
        int i18 = i & M28;
        int i19 = i6 + (i5 >>> 28);
        int i20 = i5 & M28;
        int i21 = i10 + (i9 >>> 28);
        int i22 = i9 & M28;
        int i23 = i14 + (i13 >>> 28);
        int i24 = i13 & M28;
        int i25 = i3 + (i17 >>> 28);
        int i26 = i17 & M28;
        int i27 = i7 + (i19 >>> 28);
        int i28 = i19 & M28;
        int i29 = i11 + (i21 >>> 28);
        int i30 = i21 & M28;
        int i31 = i15 + (i23 >>> 28);
        int i32 = i23 & M28;
        int i33 = i4 + (i25 >>> 28);
        int i34 = i25 & M28;
        int i35 = i8 + (i27 >>> 28);
        int i36 = i27 & M28;
        int i37 = i12 + (i29 >>> 28);
        int i38 = i29 & M28;
        int i39 = i16 + (i31 >>> 28);
        int i40 = i31 & M28;
        int i41 = i39 >>> 28;
        int i42 = i39 & M28;
        int i43 = i18 + i41;
        int i44 = i20 + (i33 >>> 28);
        int i45 = i33 & M28;
        int i46 = i22 + i41 + (i35 >>> 28);
        int i47 = i35 & M28;
        int i48 = i24 + (i37 >>> 28);
        int i49 = i37 & M28;
        int i50 = i26 + (i43 >>> 28);
        int i51 = i43 & M28;
        int i52 = i28 + (i44 >>> 28);
        int i53 = i44 & M28;
        int i54 = i30 + (i46 >>> 28);
        int i55 = i46 & M28;
        int i56 = i32 + (i48 >>> 28);
        int i57 = i48 & M28;
        iArr[0] = i51;
        iArr[1] = i50;
        iArr[2] = i34;
        iArr[3] = i45;
        iArr[4] = i53;
        iArr[5] = i52;
        iArr[6] = i36;
        iArr[7] = i47;
        iArr[8] = i55;
        iArr[9] = i54;
        iArr[10] = i38;
        iArr[11] = i49;
        iArr[12] = i57;
        iArr[13] = i56;
        iArr[14] = i40;
        iArr[15] = i42;
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i) {
        return new int[i * 16];
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        decode56(bArr, i, iArr, 0);
        decode56(bArr, i + 7, iArr, 2);
        decode56(bArr, i + 14, iArr, 4);
        decode56(bArr, i + 21, iArr, 6);
        decode56(bArr, i + 28, iArr, 8);
        decode56(bArr, i + 35, iArr, 10);
        decode56(bArr, i + 42, iArr, 12);
        decode56(bArr, i + 49, iArr, 14);
    }

    private static void decode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        iArr2[i2] = i3 & M28;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i4 << 4)) & M28;
        iArr2[i2 + 2] = ((i4 >>> 24) | (i5 << 8)) & M28;
        iArr2[i2 + 3] = ((i5 >>> 20) | (i6 << 12)) & M28;
        iArr2[i2 + 4] = ((i6 >>> 16) | (i7 << 16)) & M28;
        iArr2[i2 + 5] = ((i7 >>> 12) | (i8 << 20)) & M28;
        iArr2[i2 + 6] = M28 & ((i8 >>> 8) | (i9 << 24));
        iArr2[i2 + 7] = i9 >>> 4;
    }

    private static int decode24(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static int decode32(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void decode56(byte[] bArr, int i, int[] iArr, int i2) {
        int iDecode32 = decode32(bArr, i);
        int iDecode24 = decode24(bArr, i + 4);
        iArr[i2] = M28 & iDecode32;
        iArr[i2 + 1] = (iDecode24 << 4) | (iDecode32 >>> 28);
    }

    public static void encode(int[] iArr, int i, byte[] bArr, int i2) {
        encode56(iArr, i, bArr, i2);
        encode56(iArr, i + 2, bArr, i2 + 7);
        encode56(iArr, i + 4, bArr, i2 + 14);
        encode56(iArr, i + 6, bArr, i2 + 21);
        encode56(iArr, i + 8, bArr, i2 + 28);
        encode56(iArr, i + 10, bArr, i2 + 35);
        encode56(iArr, i + 12, bArr, i2 + 42);
        encode56(iArr, i + 14, bArr, i2 + 49);
    }

    private static void encode224(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        int i10 = iArr[i + 7];
        iArr2[i2] = (i4 << 28) | i3;
        iArr2[i2 + 1] = (i4 >>> 4) | (i5 << 24);
        iArr2[i2 + 2] = (i5 >>> 8) | (i6 << 20);
        iArr2[i2 + 3] = (i6 >>> 12) | (i7 << 16);
        iArr2[i2 + 4] = (i7 >>> 16) | (i8 << 12);
        iArr2[i2 + 5] = (i8 >>> 20) | (i9 << 8);
        iArr2[i2 + 6] = (i10 << 4) | (i9 >>> 24);
    }

    private static void encode24(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
    }

    private static void encode32(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void encode56(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        encode32((i4 << 28) | i3, bArr, i2);
        encode24(i4 >>> 4, bArr, i2 + 4);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverse(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, iArrCreate, 0);
        normalize(iArrCreate);
        encode(iArrCreate, iArr3, 0);
        Mod.modOddInverseVar(P32, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
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
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = i;
        long j2 = i3 * j;
        int i18 = ((int) j2) & M28;
        long j3 = j2 >>> 28;
        long j4 = i7 * j;
        int i19 = ((int) j4) & M28;
        long j5 = j4 >>> 28;
        long j6 = i11 * j;
        int i20 = ((int) j6) & M28;
        long j7 = j6 >>> 28;
        long j8 = i15 * j;
        int i21 = ((int) j8) & M28;
        long j9 = j8 >>> 28;
        long j10 = (i4 * j) + j3;
        iArr2[2] = ((int) j10) & M28;
        long j11 = j10 >>> 28;
        long j12 = (i8 * j) + j5;
        iArr2[6] = ((int) j12) & M28;
        long j13 = j12 >>> 28;
        long j14 = (i12 * j) + j7;
        iArr2[10] = ((int) j14) & M28;
        long j15 = (i16 * j) + j9;
        iArr2[14] = ((int) j15) & M28;
        long j16 = j15 >>> 28;
        long j17 = (i5 * j) + j11;
        iArr2[3] = ((int) j17) & M28;
        long j18 = (i9 * j) + j13;
        iArr2[7] = ((int) j18) & M28;
        long j19 = (i13 * j) + (j14 >>> 28);
        iArr2[11] = ((int) j19) & M28;
        long j20 = j19 >>> 28;
        long j21 = (i17 * j) + j16;
        iArr2[15] = ((int) j21) & M28;
        long j22 = j21 >>> 28;
        long j23 = (i6 * j) + (j17 >>> 28);
        iArr2[4] = ((int) j23) & M28;
        long j24 = j23 >>> 28;
        long j25 = (i10 * j) + (j18 >>> 28) + j22;
        iArr2[8] = ((int) j25) & M28;
        long j26 = (i14 * j) + j20;
        iArr2[12] = ((int) j26) & M28;
        long j27 = j26 >>> 28;
        long j28 = (i2 * j) + j22;
        iArr2[0] = ((int) j28) & M28;
        iArr2[1] = i18 + ((int) (j28 >>> 28));
        iArr2[5] = i19 + ((int) j24);
        iArr2[9] = i20 + ((int) (j25 >>> 28));
        iArr2[13] = i21 + ((int) j27);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        reduce(iArr, 1);
        reduce(iArr, -1);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    private static void powPm3d4(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, 111, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, 223, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    private static void reduce(int[] iArr, int i) {
        int i2;
        int i3 = iArr[15];
        int i4 = i3 & M28;
        long j = (i3 >>> 28) + i;
        int i5 = 0;
        long j2 = j;
        while (true) {
            if (i5 >= 8) {
                break;
            }
            long j3 = j2 + (U32 & iArr[i5]);
            iArr[i5] = ((int) j3) & M28;
            j2 = j3 >> 28;
            i5++;
        }
        long j4 = j2 + j;
        for (i2 = 8; i2 < 15; i2++) {
            long j5 = j4 + (iArr[i2] & U32);
            iArr[i2] = ((int) j5) & M28;
            j4 = j5 >> 28;
        }
        iArr[15] = i4 + ((int) j4);
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
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        powPm3d4(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = (i2 + 536870910) - i18;
        int i33 = (i6 + 536870910) - i22;
        int i34 = (i10 + 536870910) - i26;
        int i35 = (i14 + 536870910) - i30;
        int i36 = (i16 + 536870910) - iArr2[15];
        int i37 = ((i3 + 536870910) - i19) + (i32 >>> 28);
        int i38 = i32 & M28;
        int i39 = ((i7 + 536870910) - i23) + (i33 >>> 28);
        int i40 = i33 & M28;
        int i41 = ((i11 + 536870910) - i27) + (i34 >>> 28);
        int i42 = i34 & M28;
        int i43 = ((i15 + 536870910) - i31) + (i35 >>> 28);
        int i44 = i35 & M28;
        int i45 = ((i4 + 536870910) - i20) + (i37 >>> 28);
        int i46 = i37 & M28;
        int i47 = ((i8 + 536870910) - i24) + (i39 >>> 28);
        int i48 = i39 & M28;
        int i49 = ((i12 + 536870910) - i28) + (i41 >>> 28);
        int i50 = i41 & M28;
        int i51 = i36 + (i43 >>> 28);
        int i52 = i43 & M28;
        int i53 = i51 >>> 28;
        int i54 = i51 & M28;
        int i55 = ((i + 536870910) - i17) + i53;
        int i56 = ((i5 + 536870910) - i21) + (i45 >>> 28);
        int i57 = i45 & M28;
        int i58 = ((i9 + 536870908) - i25) + i53 + (i47 >>> 28);
        int i59 = i47 & M28;
        int i60 = ((i13 + 536870910) - i29) + (i49 >>> 28);
        int i61 = i49 & M28;
        int i62 = i38 + (i55 >>> 28);
        int i63 = i55 & M28;
        int i64 = i40 + (i56 >>> 28);
        int i65 = i56 & M28;
        int i66 = i42 + (i58 >>> 28);
        int i67 = i58 & M28;
        int i68 = i44 + (i60 >>> 28);
        int i69 = i60 & M28;
        iArr3[0] = i63;
        iArr3[1] = i62;
        iArr3[2] = i46;
        iArr3[3] = i57;
        iArr3[4] = i65;
        iArr3[5] = i64;
        iArr3[6] = i48;
        iArr3[7] = i59;
        iArr3[8] = i67;
        iArr3[9] = i66;
        iArr3[10] = i50;
        iArr3[11] = i61;
        iArr3[12] = i69;
        iArr3[13] = i68;
        iArr3[14] = i52;
        iArr3[15] = i54;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void decode(byte[] bArr, int i, int[] iArr, int i2) {
        decode56(bArr, i, iArr, i2);
        decode56(bArr, i + 7, iArr, i2 + 2);
        decode56(bArr, i + 14, iArr, i2 + 4);
        decode56(bArr, i + 21, iArr, i2 + 6);
        decode56(bArr, i + 28, iArr, i2 + 8);
        decode56(bArr, i + 35, iArr, i2 + 10);
        decode56(bArr, i + 42, iArr, i2 + 12);
        decode56(bArr, i + 49, iArr, i2 + 14);
    }

    public static void encode(int[] iArr, byte[] bArr) {
        encode56(iArr, 0, bArr, 0);
        encode56(iArr, 2, bArr, 7);
        encode56(iArr, 4, bArr, 14);
        encode56(iArr, 6, bArr, 21);
        encode56(iArr, 8, bArr, 28);
        encode56(iArr, 10, bArr, 35);
        encode56(iArr, 12, bArr, 42);
        encode56(iArr, 14, bArr, 49);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i2 + i10;
        int i35 = i3 + i11;
        int i36 = i4 + i12;
        int i37 = i5 + i13;
        int i38 = i6 + i14;
        int i39 = i7 + i15;
        int i40 = i8 + i16;
        int i41 = i17 + i25;
        int i42 = i18 + i26;
        int i43 = i19 + i27;
        int i44 = i20 + i28;
        int i45 = i21 + i29;
        int i46 = i22 + i30;
        int i47 = i23 + i31;
        int i48 = i24 + i32;
        long j = i;
        long j2 = i17;
        long j3 = j * j2;
        long j4 = i8;
        long j5 = i18;
        long j6 = j4 * j5;
        long j7 = i7;
        long j8 = i19;
        long j9 = (j7 * j8) + j6;
        long j10 = i6;
        long j11 = i20;
        long j12 = i5;
        long j13 = i21;
        long j14 = i4;
        long j15 = i22;
        long j16 = (j14 * j15) + (j12 * j13) + (j10 * j11) + j9;
        long j17 = i3;
        long j18 = i23;
        long j19 = i2;
        long j20 = i24;
        long j21 = j19 * j20;
        long j22 = i9;
        long j23 = i25;
        long j24 = j22 * j23;
        long j25 = i16;
        long j26 = i26;
        long j27 = j25 * j26;
        long j28 = i15;
        long j29 = i27;
        long j30 = (j28 * j29) + j27;
        long j31 = i14;
        long j32 = i28;
        long j33 = (j31 * j32) + j30;
        long j34 = i13;
        long j35 = i29;
        long j36 = (j34 * j35) + j33;
        long j37 = i12;
        long j38 = i30;
        long j39 = (j37 * j38) + j36;
        long j40 = i11;
        long j41 = i31;
        long j42 = (j40 * j41) + j39;
        long j43 = i10;
        long j44 = i32;
        long j45 = (j43 * j44) + j42;
        long j46 = i33;
        long j47 = i41;
        long j48 = j46 * j47;
        long j49 = i40;
        long j50 = i42;
        long j51 = j49 * j50;
        long j52 = i39;
        long j53 = i43;
        long j54 = (j52 * j53) + j51;
        long j55 = i38;
        long j56 = i44;
        long j57 = (j55 * j56) + j54;
        long j58 = i37;
        long j59 = i45;
        long j60 = (j58 * j59) + j57;
        long j61 = i36;
        long j62 = i46;
        long j63 = (j61 * j62) + j60;
        long j64 = i35;
        long j65 = i47;
        long j66 = (j64 * j65) + j63;
        long j67 = i34;
        long j68 = i48;
        long j69 = (j67 * j68) + j66;
        long j70 = ((j3 + j24) + j69) - (j21 + ((j17 * j18) + j16));
        int i49 = ((int) j70) & M28;
        long j71 = ((j45 + j48) - j3) + j69;
        int i50 = ((int) j71) & M28;
        long j72 = j71 >>> 28;
        long j73 = (j * j5) + (j19 * j2);
        long j74 = (j40 * j44) + (j37 * j41) + (j34 * j38) + (j31 * j35) + (j28 * j32) + (j25 * j29);
        long j75 = (j46 * j50) + (j67 * j47);
        long j76 = (j64 * j68) + (j61 * j65) + (j58 * j62) + (j55 * j59) + (j52 * j56) + (j49 * j53);
        long j77 = (((j73 + ((j22 * j26) + (j43 * j23))) + j76) - ((j17 * j20) + ((j14 * j18) + ((j12 * j15) + ((j10 * j13) + ((j7 * j11) + (j4 * j8))))))) + (j70 >>> 28);
        int i51 = ((int) j77) & M28;
        long j78 = j77 >>> 28;
        long j79 = ((j74 + j75) - j73) + j76 + j72;
        int i52 = ((int) j79) & M28;
        long j80 = j79 >>> 28;
        long j81 = (j * j8) + (j19 * j5) + (j17 * j2);
        long j82 = (j37 * j44) + (j34 * j41) + (j31 * j38) + (j28 * j35) + (j25 * j32);
        long j83 = (j46 * j53) + (j67 * j50) + (j64 * j47);
        long j84 = (j61 * j68) + (j58 * j65) + (j55 * j62) + (j52 * j59) + (j49 * j56);
        long j85 = (((j81 + ((j22 * j29) + ((j43 * j26) + (j40 * j23)))) + j84) - ((j14 * j20) + ((j12 * j18) + ((j10 * j15) + ((j7 * j13) + (j4 * j11)))))) + j78;
        int i53 = ((int) j85) & M28;
        long j86 = j85 >>> 28;
        long j87 = ((j82 + j83) - j81) + j84 + j80;
        int i54 = ((int) j87) & M28;
        long j88 = j87 >>> 28;
        long j89 = (j * j11) + (j19 * j8) + (j17 * j5) + (j14 * j2);
        long j90 = (j34 * j44) + (j31 * j41) + (j28 * j38) + (j25 * j35);
        long j91 = (j46 * j56) + (j67 * j53) + (j64 * j50) + (j61 * j47);
        long j92 = (j58 * j68) + (j55 * j65) + (j52 * j62) + (j49 * j59);
        long j93 = (((j89 + ((j22 * j32) + ((j43 * j29) + ((j40 * j26) + (j37 * j23))))) + j92) - ((j12 * j20) + ((j10 * j18) + ((j7 * j15) + (j4 * j13))))) + j86;
        int i55 = ((int) j93) & M28;
        long j94 = j93 >>> 28;
        long j95 = ((j90 + j91) - j89) + j92 + j88;
        int i56 = ((int) j95) & M28;
        long j96 = j95 >>> 28;
        long j97 = (j * j13) + (j19 * j11) + (j17 * j8) + (j14 * j5) + (j12 * j2);
        long j98 = (j31 * j44) + (j28 * j41) + (j25 * j38);
        long j99 = (j46 * j59) + (j67 * j56) + (j64 * j53) + (j61 * j50) + (j58 * j47);
        long j100 = (j55 * j68) + (j52 * j65) + (j49 * j62);
        long j101 = (((j97 + ((j22 * j35) + ((j43 * j32) + ((j40 * j29) + ((j37 * j26) + (j34 * j23)))))) + j100) - ((j10 * j20) + ((j7 * j18) + (j4 * j15)))) + j94;
        int i57 = ((int) j101) & M28;
        long j102 = j101 >>> 28;
        long j103 = ((j98 + j99) - j97) + j100 + j96;
        int i58 = ((int) j103) & M28;
        long j104 = j103 >>> 28;
        long j105 = (j * j15) + (j19 * j13) + (j17 * j11) + (j14 * j8) + (j12 * j5) + (j10 * j2);
        long j106 = (j28 * j44) + (j25 * j41);
        long j107 = (j46 * j62) + (j67 * j59) + (j64 * j56) + (j61 * j53) + (j58 * j50) + (j55 * j47);
        long j108 = (j52 * j68) + (j49 * j65);
        long j109 = (((j105 + ((j22 * j38) + ((j43 * j35) + ((j40 * j32) + ((j37 * j29) + ((j34 * j26) + (j31 * j23))))))) + j108) - ((j7 * j20) + (j4 * j18))) + j102;
        int i59 = ((int) j109) & M28;
        long j110 = j109 >>> 28;
        long j111 = ((j106 + j107) - j105) + j108 + j104;
        int i60 = ((int) j111) & M28;
        long j112 = j111 >>> 28;
        long j113 = (j * j18) + (j19 * j15) + (j17 * j13) + (j14 * j11) + (j12 * j8) + (j10 * j5) + (j7 * j2);
        long j114 = j25 * j44;
        long j115 = (j46 * j65) + (j67 * j62) + (j64 * j59) + (j61 * j56) + (j58 * j53) + (j55 * j50) + (j52 * j47);
        long j116 = j49 * j68;
        long j117 = (((j113 + ((j22 * j41) + ((j43 * j38) + ((j40 * j35) + ((j37 * j32) + ((j34 * j29) + ((j31 * j26) + (j28 * j23)))))))) + j116) - (j4 * j20)) + j110;
        int i61 = ((int) j117) & M28;
        long j118 = j117 >>> 28;
        long j119 = ((j114 + j115) - j113) + j116 + j112;
        int i62 = ((int) j119) & M28;
        long j120 = j14 * j13;
        long j121 = (j * j20) + (j19 * j18) + (j17 * j15) + j120 + (j12 * j11) + (j10 * j8) + (j7 * j5) + (j2 * j4);
        long j122 = (j22 * j44) + (j43 * j41) + (j40 * j38) + (j37 * j35) + (j34 * j32) + (j31 * j29) + (j28 * j26) + (j25 * j23) + j121 + j118;
        int i63 = ((int) j122) & M28;
        long j123 = (((j46 * j68) + ((j67 * j65) + ((j64 * j62) + ((j61 * j59) + ((j58 * j56) + ((j55 * j53) + ((j52 * j50) + (j49 * j47)))))))) - j121) + (j119 >>> 28);
        int i64 = ((int) j123) & M28;
        long j124 = j123 >>> 28;
        long j125 = (j122 >>> 28) + j124 + i50;
        int i65 = ((int) j125) & M28;
        long j126 = j124 + i49;
        iArr3[0] = ((int) j126) & M28;
        iArr3[1] = i51 + ((int) (j126 >>> 28));
        iArr3[2] = i53;
        iArr3[3] = i55;
        iArr3[4] = i57;
        iArr3[5] = i59;
        iArr3[6] = i61;
        iArr3[7] = i63;
        iArr3[8] = i65;
        iArr3[9] = i52 + ((int) (j125 >>> 28));
        iArr3[10] = i54;
        iArr3[11] = i56;
        iArr3[12] = i58;
        iArr3[13] = i60;
        iArr3[14] = i62;
        iArr3[15] = i64;
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i5 * 2;
        int i20 = i6 * 2;
        int i21 = i7 * 2;
        int i22 = i9 * 2;
        int i23 = i11 * 2;
        int i24 = i12 * 2;
        int i25 = i13 * 2;
        int i26 = i + i9;
        int i27 = i2 + i10;
        int i28 = i3 + i11;
        int i29 = i4 + i12;
        int i30 = i5 + i13;
        int i31 = i6 + i14;
        int i32 = i7 + i15;
        int i33 = i26 * 2;
        int i34 = i27 * 2;
        int i35 = i28 * 2;
        int i36 = i29 * 2;
        long j = i;
        long j2 = j * j;
        long j3 = i8;
        long j4 = i18;
        long j5 = j3 * j4;
        long j6 = i7;
        long j7 = i3 * 2;
        long j8 = (j6 * j7) + j5;
        long j9 = i6;
        long j10 = i4 * 2;
        long j11 = (j9 * j10) + j8;
        long j12 = i5;
        long j13 = i9;
        long j14 = j13 * j13;
        long j15 = i16;
        long j16 = i10 * 2;
        long j17 = i15;
        long j18 = i23;
        long j19 = (j17 * j18) + (j15 * j16);
        long j20 = i14;
        long j21 = i24;
        long j22 = i13;
        long j23 = j22 * j22;
        long j24 = i26;
        long j25 = j24 * j24;
        long j26 = i8 + i16;
        long j27 = i34 & U32;
        long j28 = j26 * j27;
        long j29 = i32;
        long j30 = i35 & U32;
        long j31 = (j29 * j30) + j28;
        long j32 = i31;
        long j33 = i36 & U32;
        long j34 = (j32 * j33) + j31;
        long j35 = i30;
        long j36 = (j35 * j35) + j34;
        long j37 = ((j2 + j14) + j36) - ((j12 * j12) + j11);
        int i37 = ((int) j37) & M28;
        long j38 = j37 >>> 28;
        long j39 = (((j23 + ((j20 * j21) + j19)) + j25) - j2) + j36;
        int i38 = ((int) j39) & M28;
        long j40 = j39 >>> 28;
        long j41 = i2;
        long j42 = i17;
        long j43 = j41 * j42;
        long j44 = i19;
        long j45 = j9 * j44;
        long j46 = i10;
        long j47 = i22;
        long j48 = j46 * j47;
        long j49 = i25;
        long j50 = j20 * j49;
        long j51 = i27;
        long j52 = i33 & U32;
        long j53 = j51 * j52;
        long j54 = (j29 * j33) + (j26 * j30);
        long j55 = (i30 * 2) & U32;
        long j56 = (j32 * j55) + j54;
        long j57 = (((j43 + j48) + j56) - (j45 + ((j6 * j10) + (j3 * j7)))) + j38;
        int i39 = ((int) j57) & M28;
        long j58 = j57 >>> 28;
        long j59 = (((j50 + ((j17 * j21) + (j15 * j18))) + j53) - j43) + j56 + j40;
        int i40 = ((int) j59) & M28;
        long j60 = j59 >>> 28;
        long j61 = i3;
        long j62 = (j41 * j41) + (j61 * j42);
        long j63 = (j6 * j44) + (j3 * j10);
        long j64 = i11;
        long j65 = (j46 * j46) + (j64 * j47);
        long j66 = (j17 * j49) + (j15 * j21);
        long j67 = i28;
        long j68 = (j51 * j51) + (j67 * j52);
        long j69 = (j32 * j32) + (j29 * j55) + (j26 * j33);
        long j70 = (((j62 + j65) + j69) - ((j9 * j9) + j63)) + j58;
        int i41 = ((int) j70) & M28;
        long j71 = j70 >>> 28;
        long j72 = ((((j20 * j20) + j66) + j68) - j62) + j69 + j60;
        int i42 = ((int) j72) & M28;
        long j73 = j72 >>> 28;
        long j74 = i4;
        long j75 = (j61 * j4) + (j74 * j42);
        long j76 = j3 * j44;
        long j77 = i20;
        long j78 = (j6 * j77) + j76;
        long j79 = i12;
        long j80 = (j64 * j16) + (j79 * j47);
        long j81 = j15 * j49;
        long j82 = i14 * 2;
        long j83 = (j17 * j82) + j81;
        long j84 = i29;
        long j85 = (j67 * j27) + (j84 * j52);
        long j86 = j55 * j26;
        long j87 = (i31 * 2) & U32;
        long j88 = (j29 * j87) + j86;
        long j89 = (((j75 + j80) + j88) - j78) + j71;
        int i43 = ((int) j89) & M28;
        long j90 = j89 >>> 28;
        long j91 = ((j83 + j85) - j75) + j88 + j73;
        int i44 = ((int) j91) & M28;
        long j92 = j91 >>> 28;
        long j93 = (j61 * j61) + (j74 * j4) + (j12 * j42);
        long j94 = (j17 * j17) + (j82 * j15);
        long j95 = (j67 * j67) + (j84 * j27) + (j35 * j52);
        long j96 = (j29 * j29) + (j26 * j87);
        long j97 = (((j93 + ((j64 * j64) + ((j79 * j16) + (j22 * j47)))) + j96) - ((j6 * j6) + (j3 * j77))) + j90;
        int i45 = ((int) j97) & M28;
        long j98 = j97 >>> 28;
        long j99 = ((j94 + j95) - j93) + j96 + j92;
        int i46 = ((int) j99) & M28;
        long j100 = j99 >>> 28;
        long j101 = (j74 * j7) + (j12 * j4) + (j9 * j42);
        long j102 = (j79 * j18) + (j22 * j16) + (j20 * j47);
        long j103 = (j84 * j30) + (j35 * j27) + (j32 * j52);
        long j104 = ((i32 * 2) & U32) * j26;
        long j105 = (((j101 + j102) + j104) - (i21 * j3)) + j98;
        int i47 = ((int) j105) & M28;
        long j106 = j105 >>> 28;
        long j107 = ((((i15 * 2) * j15) + j103) - j101) + j104 + j100;
        int i48 = ((int) j107) & M28;
        long j108 = j107 >>> 28;
        long j109 = (j74 * j74) + (j12 * j7) + (j9 * j4) + (j6 * j42);
        long j110 = (j84 * j84) + (j35 * j30) + (j32 * j27) + (j29 * j52);
        long j111 = j26 * j26;
        long j112 = (((j109 + ((j79 * j79) + ((j22 * j18) + ((j20 * j16) + (j17 * j47))))) + j111) - (j3 * j3)) + j106;
        int i49 = ((int) j112) & M28;
        long j113 = j112 >>> 28;
        long j114 = (((j15 * j15) + j110) - j109) + j111 + j108;
        int i50 = ((int) j114) & M28;
        long j115 = (j10 * j12) + (j9 * j7) + (j6 * j4) + (j3 * j42);
        long j116 = j20 * j18;
        long j117 = (j22 * j21) + j116 + (j17 * j16) + (j15 * j47);
        long j118 = j117 + j115 + j113;
        int i51 = ((int) j118) & M28;
        long j119 = (((j35 * j33) + ((j32 * j30) + ((j29 * j27) + (j26 * j52)))) - j115) + (j114 >>> 28);
        int i52 = ((int) j119) & M28;
        long j120 = j119 >>> 28;
        long j121 = (j118 >>> 28) + j120 + i38;
        int i53 = ((int) j121) & M28;
        long j122 = j120 + i37;
        iArr2[0] = ((int) j122) & M28;
        iArr2[1] = i39 + ((int) (j122 >>> 28));
        iArr2[2] = i41;
        iArr2[3] = i43;
        iArr2[4] = i45;
        iArr2[5] = i47;
        iArr2[6] = i49;
        iArr2[7] = i51;
        iArr2[8] = i53;
        iArr2[9] = i40 + ((int) (j121 >>> 28));
        iArr2[10] = i42;
        iArr2[11] = i44;
        iArr2[12] = i46;
        iArr2[13] = i48;
        iArr2[14] = i50;
        iArr2[15] = i52;
    }

    public static void decode(byte[] bArr, int[] iArr) {
        decode56(bArr, 0, iArr, 0);
        decode56(bArr, 7, iArr, 2);
        decode56(bArr, 14, iArr, 4);
        decode56(bArr, 21, iArr, 6);
        decode56(bArr, 28, iArr, 8);
        decode56(bArr, 35, iArr, 10);
        decode56(bArr, 42, iArr, 12);
        decode56(bArr, 49, iArr, 14);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        encode56(iArr, 0, bArr, i);
        encode56(iArr, 2, bArr, i + 7);
        encode56(iArr, 4, bArr, i + 14);
        encode56(iArr, 6, bArr, i + 21);
        encode56(iArr, 8, bArr, i + 28);
        encode56(iArr, 10, bArr, i + 35);
        encode56(iArr, 12, bArr, i + 42);
        encode56(iArr, 14, bArr, i + 49);
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        decode224(iArr, i, iArr2, 0);
        decode224(iArr, i + 7, iArr2, 8);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        encode224(iArr, 0, iArr2, i);
        encode224(iArr, 8, iArr2, i + 7);
    }
}
