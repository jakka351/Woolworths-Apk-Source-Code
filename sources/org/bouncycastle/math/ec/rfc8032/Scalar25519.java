package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* loaded from: classes8.dex */
abstract class Scalar25519 {
    private static final int L0 = -50998291;
    private static final int L1 = 19280294;
    private static final int L2 = 127719000;
    private static final int L3 = -6428113;
    private static final int L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    static final int SIZE = 8;
    private static final int TARGET_LENGTH = 254;
    private static final int[] L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] LSq = {-1424848535, -487721339, 580428573, 1745064566, -770181698, 1036971123, 461123738, -1582065343, 1268693629, -889041821, -731974758, 43769659, 0, 0, 0, 16777216};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        decode(bArr, iArr);
        return !Nat256.gte(iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 8);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply128Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        Nat256.mul128(iArr, iArr2, iArr4);
        if (iArr2[3] < 0) {
            Nat256.addTo(L, 0, iArr4, 4, 0);
            Nat256.subFrom(iArr, 0, iArr4, 4, 0);
        }
        byte[] bArr = new byte[64];
        Codec.encode32(iArr4, 0, 12, bArr, 0);
        decode(reduce(bArr), iArr3);
    }

    public static byte[] reduce(byte[] bArr) {
        long jDecode32 = Codec.decode32(bArr, 0) & M32L;
        long jDecode24 = (Codec.decode24(bArr, 4) << 4) & M32L;
        long jDecode322 = Codec.decode32(bArr, 7) & M32L;
        long jDecode242 = (Codec.decode24(bArr, 11) << 4) & M32L;
        long jDecode323 = Codec.decode32(bArr, 14) & M32L;
        long jDecode243 = (Codec.decode24(bArr, 18) << 4) & M32L;
        long jDecode324 = Codec.decode32(bArr, 21) & M32L;
        long jDecode244 = (Codec.decode24(bArr, 25) << 4) & M32L;
        long jDecode325 = Codec.decode32(bArr, 28) & M32L;
        long jDecode245 = (Codec.decode24(bArr, 32) << 4) & M32L;
        long jDecode326 = Codec.decode32(bArr, 35) & M32L;
        long jDecode246 = (Codec.decode24(bArr, 39) << 4) & M32L;
        long jDecode327 = Codec.decode32(bArr, 42) & M32L;
        long jDecode247 = (Codec.decode24(bArr, 46) << 4) & M32L;
        long jDecode328 = Codec.decode32(bArr, 49);
        long j = jDecode328 & M32L;
        long jDecode248 = (Codec.decode24(bArr, 53) << 4) & M32L;
        long jDecode329 = Codec.decode32(bArr, 56);
        long j2 = jDecode329 & M32L;
        long jDecode249 = (Codec.decode24(bArr, 60) << 4) & M32L;
        long j3 = bArr[63] & M08L;
        long j4 = jDecode249 + (j2 >> 28);
        long j5 = jDecode329 & M28L;
        long j6 = (jDecode327 - (j3 * (-6428113))) - (j4 * 5343);
        long j7 = (jDecode325 - (j4 * (-50998291))) - (j5 * 19280294);
        long j8 = ((jDecode245 - (j3 * (-50998291))) - (j4 * 19280294)) - (j5 * 127719000);
        long j9 = ((jDecode326 - (j3 * 19280294)) - (j4 * 127719000)) - (j5 * (-6428113));
        long j10 = ((jDecode246 - (j3 * 127719000)) - (j4 * (-6428113))) - (j5 * 5343);
        long j11 = jDecode248 + (j >> 28);
        long j12 = jDecode328 & M28L;
        long j13 = j9 - (j11 * 5343);
        long j14 = (j8 - (j11 * (-6428113))) - (j12 * 5343);
        long j15 = (jDecode247 - (j3 * 5343)) + (j6 >> 28);
        long j16 = ((jDecode324 - (j11 * (-50998291))) - (j12 * 19280294)) - (j15 * 127719000);
        long j17 = (((jDecode244 - (j5 * (-50998291))) - (j11 * 19280294)) - (j12 * 127719000)) - (j15 * (-6428113));
        long j18 = ((j7 - (j11 * 127719000)) - (j12 * (-6428113))) - (j15 * 5343);
        long j19 = (j6 & M28L) + (j10 >> 28);
        long j20 = (jDecode323 - (j15 * (-50998291))) - (j19 * 19280294);
        long j21 = ((jDecode243 - (j12 * (-50998291))) - (j15 * 19280294)) - (j19 * 127719000);
        long j22 = j17 - (j19 * 5343);
        long j23 = (j10 & M28L) + (j13 >> 28);
        long j24 = jDecode322 - (j23 * (-50998291));
        long j25 = (jDecode242 - (j19 * (-50998291))) - (j23 * 19280294);
        long j26 = j20 - (j23 * 127719000);
        long j27 = j21 - (j23 * (-6428113));
        long j28 = (j16 - (j19 * (-6428113))) - (j23 * 5343);
        long j29 = (j13 & M28L) + (j14 >> 28);
        long j30 = j14 & M28L;
        long j31 = jDecode24 - (j29 * (-50998291));
        long j32 = j24 - (j29 * 19280294);
        long j33 = j25 - (j29 * 127719000);
        long j34 = j26 - (j29 * (-6428113));
        long j35 = j27 - (j29 * 5343);
        long j36 = j18 + (j22 >> 28);
        long j37 = j22 & M28L;
        long j38 = j30 + (j36 >> 28);
        long j39 = j36 & M28L;
        long j40 = j39 >>> 27;
        long j41 = j38 + j40;
        long j42 = jDecode32 - (j41 * (-50998291));
        long j43 = j32 - (j41 * 127719000);
        long j44 = j33 - (j41 * (-6428113));
        long j45 = j34 - (j41 * 5343);
        long j46 = (j31 - (j41 * 19280294)) + (j42 >> 28);
        long j47 = j42 & M28L;
        long j48 = j43 + (j46 >> 28);
        long j49 = j46 & M28L;
        long j50 = j44 + (j48 >> 28);
        long j51 = j48 & M28L;
        long j52 = j45 + (j50 >> 28);
        long j53 = j50 & M28L;
        long j54 = j35 + (j52 >> 28);
        long j55 = j52 & M28L;
        long j56 = j28 + (j54 >> 28);
        long j57 = j54 & M28L;
        long j58 = j37 + (j56 >> 28);
        long j59 = j56 & M28L;
        long j60 = j39 + (j58 >> 28);
        long j61 = j58 & M28L;
        long j62 = j60 >> 28;
        long j63 = j60 & M28L;
        long j64 = j62 - j40;
        long j65 = j47 + (j64 & (-50998291));
        long j66 = j49 + (j64 & 19280294) + (j65 >> 28);
        long j67 = j65 & M28L;
        long j68 = j51 + (j64 & 127719000) + (j66 >> 28);
        long j69 = j66 & M28L;
        long j70 = j53 + (j64 & (-6428113)) + (j68 >> 28);
        long j71 = j68 & M28L;
        long j72 = j55 + (j64 & 5343) + (j70 >> 28);
        long j73 = j70 & M28L;
        long j74 = j57 + (j72 >> 28);
        long j75 = j72 & M28L;
        long j76 = j59 + (j74 >> 28);
        long j77 = j74 & M28L;
        long j78 = j61 + (j76 >> 28);
        long j79 = j76 & M28L;
        long j80 = j63 + (j78 >> 28);
        long j81 = j78 & M28L;
        byte[] bArr2 = new byte[64];
        Codec.encode56(j67 | (j69 << 28), bArr2, 0);
        Codec.encode56(j71 | (j73 << 28), bArr2, 7);
        Codec.encode56((j77 << 28) | j75, bArr2, 14);
        Codec.encode56((j81 << 28) | j79, bArr2, 21);
        Codec.encode32((int) j80, bArr2, 28);
        return bArr2;
    }

    public static void reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        System.arraycopy(LSq, 0, iArr4, 0, 16);
        int[] iArr5 = new int[16];
        Nat256.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[16];
        int[] iArr7 = L;
        Nat256.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[4];
        System.arraycopy(iArr7, 0, iArr8, 0, 4);
        int[] iArr9 = new int[4];
        System.arraycopy(iArr, 0, iArr9, 0, 4);
        int[] iArr10 = new int[4];
        iArr10[0] = 1;
        int i = 15;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(15, iArr5);
        int[] iArr11 = iArr10;
        int[] iArr12 = new int[4];
        int[] iArr13 = iArr8;
        int[] iArr14 = iArr9;
        while (bitLengthPositive > TARGET_LENGTH) {
            int bitLength = ScalarUtil.getBitLength(i, iArr6) - bitLengthPositive;
            int i2 = bitLength & (~(bitLength >> 31));
            if (iArr6[i] < 0) {
                ScalarUtil.addShifted_NP(i, i2, iArr4, iArr5, iArr6);
                ScalarUtil.addShifted_UV(3, i2, iArr13, iArr12, iArr14, iArr11);
            } else {
                ScalarUtil.subShifted_NP(i, i2, iArr4, iArr5, iArr6);
                ScalarUtil.subShifted_UV(3, i2, iArr13, iArr12, iArr14, iArr11);
            }
            int[] iArr15 = iArr11;
            if (ScalarUtil.lessThan(i, iArr4, iArr5)) {
                int i3 = bitLengthPositive >>> 5;
                int bitLengthPositive2 = ScalarUtil.getBitLengthPositive(i3, iArr4);
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr14;
                iArr14 = iArr13;
                iArr13 = iArr17;
                bitLengthPositive = bitLengthPositive2;
                iArr11 = iArr12;
                iArr12 = iArr15;
                i = i3;
            } else {
                iArr11 = iArr15;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 4);
        System.arraycopy(iArr11, 0, iArr3, 0, 4);
    }

    public static void toSignedDigits(int i, int[] iArr, int[] iArr2) {
        Nat.cadd(8, (~iArr[0]) & 1, iArr, L, iArr2);
        Nat.shiftDownBit(8, iArr2, 1);
    }
}
