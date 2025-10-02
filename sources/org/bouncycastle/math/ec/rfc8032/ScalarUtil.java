package org.bouncycastle.math.ec.rfc8032;

import org.bouncycastle.util.Integers;

/* loaded from: classes8.dex */
abstract class ScalarUtil {
    private static final long M = 4294967295L;

    public static void addShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = M;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = j2 + (iArr[i5] & M) + (iArr3[i6] & M);
                long j5 = j3 + (iArr3[i5] & M) + (iArr2[i6] & M);
                iArr3[i5] = (int) j5;
                j3 = j5 >>> 32;
                long j6 = j4 + (iArr3[i6] & M);
                iArr[i5] = (int) j6;
                j2 = j6 >>> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        long j7 = 0;
        while (i7 <= i) {
            int i11 = i7 - i3;
            int i12 = iArr3[i11];
            char c2 = c;
            int i13 = -i4;
            long j8 = j;
            int i14 = iArr2[i11];
            long j9 = j7 + (iArr3[i7] & j8) + (((i14 << i4) | (i9 >>> i13)) & j8);
            iArr3[i7] = (int) j9;
            j7 = j9 >>> c2;
            int i15 = iArr3[i11];
            long j10 = j2 + (iArr[i7] & j8) + (((i12 << i4) | (i8 >>> i13)) & j8) + (((i10 >>> i13) | (i15 << i4)) & j8);
            iArr[i7] = (int) j10;
            j2 = j10 >>> c2;
            i7++;
            c = c2;
            i9 = i14;
            i10 = i15;
            i8 = i12;
            j = j8;
        }
    }

    public static void addShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = M;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j4 = j2 + (iArr[i5] & M);
                long j5 = j3 + (iArr2[i5] & M);
                int i6 = i5 - i3;
                long j6 = j4 + (iArr3[i6] & M);
                long j7 = j5 + (iArr4[i6] & M);
                iArr[i5] = (int) j6;
                j2 = j6 >>> 32;
                iArr2[i5] = (int) j7;
                j3 = j7 >>> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j8 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j9 = j;
            long j10 = j2 + (iArr[i7] & j9);
            long j11 = j10 + (((i8 >>> (-i4)) | (i11 << i4)) & j9);
            long j12 = j8 + (iArr2[i7] & j9) + (((i9 >>> r3) | (i12 << i4)) & j9);
            iArr[i7] = (int) j11;
            j2 = j11 >>> c2;
            iArr2[i7] = (int) j12;
            j8 = j12 >>> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j9;
        }
    }

    public static int getBitLength(int i, int[] iArr) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i] ^ i2);
    }

    public static int getBitLengthPositive(int i, int[] iArr) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i]);
    }

    public static boolean lessThan(int i, int[] iArr, int[] iArr2) {
        do {
            int i2 = iArr[i] - Integer.MIN_VALUE;
            int i3 = iArr2[i] - Integer.MIN_VALUE;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    public static void subShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = M;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                int i6 = i5 - i3;
                long j4 = (j2 + (iArr[i5] & M)) - (iArr3[i6] & M);
                long j5 = (j3 + (iArr3[i5] & M)) - (iArr2[i6] & M);
                iArr3[i5] = (int) j5;
                j3 = j5 >> 32;
                long j6 = j4 - (iArr3[i6] & M);
                iArr[i5] = (int) j6;
                j2 = j6 >> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        long j7 = 0;
        while (i7 <= i) {
            int i11 = i7 - i3;
            int i12 = iArr3[i11];
            char c2 = c;
            int i13 = -i4;
            long j8 = j;
            int i14 = iArr2[i11];
            long j9 = (j7 + (iArr3[i7] & j8)) - (((i14 << i4) | (i9 >>> i13)) & j8);
            iArr3[i7] = (int) j9;
            j7 = j9 >> c2;
            int i15 = iArr3[i11];
            long j10 = ((j2 + (iArr[i7] & j8)) - (((i12 << i4) | (i8 >>> i13)) & j8)) - (((i10 >>> i13) | (i15 << i4)) & j8);
            iArr[i7] = (int) j10;
            j2 = j10 >> c2;
            i7++;
            c = c2;
            i9 = i14;
            i10 = i15;
            i8 = i12;
            j = j8;
        }
    }

    public static void subShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        char c = ' ';
        long j = M;
        long j2 = 0;
        if (i4 == 0) {
            long j3 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j4 = j2 + (iArr[i5] & M);
                long j5 = j3 + (iArr2[i5] & M);
                int i6 = i5 - i3;
                long j6 = j4 - (iArr3[i6] & M);
                long j7 = j5 - (iArr4[i6] & M);
                iArr[i5] = (int) j6;
                j2 = j6 >> 32;
                iArr2[i5] = (int) j7;
                j3 = j7 >> 32;
            }
            return;
        }
        int i7 = i3;
        int i8 = 0;
        int i9 = 0;
        long j8 = 0;
        while (i7 <= i) {
            int i10 = i7 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            char c2 = c;
            long j9 = j;
            long j10 = j2 + (iArr[i7] & j9);
            long j11 = j10 - (((i8 >>> (-i4)) | (i11 << i4)) & j9);
            long j12 = (j8 + (iArr2[i7] & j9)) - (((i9 >>> r3) | (i12 << i4)) & j9);
            iArr[i7] = (int) j11;
            j2 = j11 >> c2;
            iArr2[i7] = (int) j12;
            j8 = j12 >> c2;
            i7++;
            c = c2;
            i9 = i12;
            i8 = i11;
            j = j9;
        }
    }
}
