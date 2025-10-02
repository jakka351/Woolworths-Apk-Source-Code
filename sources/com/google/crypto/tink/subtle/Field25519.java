package com.google.crypto.tink.subtle;

import com.google.android.gms.common.api.internal.a;
import com.google.crypto.tink.annotations.Alpha;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.Arrays;

@Alpha
/* loaded from: classes6.dex */
final class Field25519 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f15157a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] c = {67108863, 33554431};
    public static final int[] d = {26, 25};

    public static byte[] a(long[] jArr) {
        int[] iArr;
        int i;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iArr = d;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j = jArrCopyOf[i4];
                int i5 = -((int) (((j >> 31) & j) >> iArr[i4 & 1]));
                jArrCopyOf[i4] = j + (i5 << r13);
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - i5;
            }
            long j2 = jArrCopyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            jArrCopyOf[9] = j2 + (i6 << 25);
            jArrCopyOf[0] = jArrCopyOf[0] - (i6 * 19);
            i3++;
        }
        long j3 = jArrCopyOf[0];
        jArrCopyOf[0] = j3 + (r3 << 26);
        jArrCopyOf[1] = jArrCopyOf[1] - (-((int) (((j3 >> 31) & j3) >> 26)));
        int i7 = 0;
        while (true) {
            iArr2 = c;
            if (i7 >= 2) {
                break;
            }
            int i8 = i2;
            while (i8 < 9) {
                long j4 = jArrCopyOf[i8];
                int i9 = i2;
                int i10 = (int) (j4 >> iArr[i8 & 1]);
                jArrCopyOf[i8] = j4 & iArr2[r14];
                i8++;
                jArrCopyOf[i8] = jArrCopyOf[i8] + i10;
                i2 = i9;
                i7 = i7;
            }
            i7++;
        }
        int i11 = i2;
        jArrCopyOf[9] = jArrCopyOf[9] & 33554431;
        long j5 = jArrCopyOf[i11] + (((int) (r2 >> 25)) * 19);
        jArrCopyOf[i11] = j5;
        int i12 = ~((((int) j5) - 67108845) >> 31);
        for (int i13 = 1; i13 < 10; i13++) {
            int i14 = ~(((int) jArrCopyOf[i13]) ^ iArr2[i13 & 1]);
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 << 1)) >> 31;
        }
        jArrCopyOf[i11] = jArrCopyOf[i11] - (67108845 & i12);
        long j6 = 33554431 & i12;
        jArrCopyOf[1] = jArrCopyOf[1] - j6;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - (67108863 & i12);
            int i19 = i + 1;
            jArrCopyOf[i19] = jArrCopyOf[i19] - j6;
        }
        for (int i20 = i11; i20 < 10; i20++) {
            jArrCopyOf[i20] = jArrCopyOf[i20] << b[i20];
        }
        byte[] bArr = new byte[32];
        for (int i21 = i11; i21 < 10; i21++) {
            int i22 = f15157a[i21];
            long j7 = bArr[i22];
            long j8 = jArrCopyOf[i21];
            bArr[i22] = (byte) (j7 | (j8 & 255));
            bArr[i22 + 1] = (byte) (bArr[r5] | ((j8 >> 8) & 255));
            bArr[i22 + 2] = (byte) (bArr[r5] | ((j8 >> 16) & 255));
            bArr[i22 + 3] = (byte) (bArr[r4] | ((j8 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] b(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = f15157a[i];
            jArr[i] = (((((bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8)) | ((bArr[i2 + 2] & 255) << 16)) | ((bArr[i2 + 3] & 255) << 24)) >> b[i]) & c[i & 1];
        }
        return jArr;
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = j * j2;
        long j4 = jArr3[1];
        long j5 = jArr2[1];
        long j6 = (j5 * j2) + (j * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        long j9 = (j8 * j2) + (j * j7) + (j5 * 2 * j4);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        long j12 = (j11 * j2) + (j * j10) + (j8 * j4) + (j5 * j7);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        long j15 = (j14 * j2) + (j * j13) + (((j11 * j4) + (j5 * j10)) * 2) + (j8 * j7);
        long j16 = (j14 * j4) + (j5 * j13) + (j11 * j7) + (j8 * j10);
        long j17 = jArr3[5];
        long j18 = jArr2[5];
        long j19 = (j18 * j2) + (j * j17) + j16;
        long jD = (j14 * j7) + (j8 * j13) + a.d(j18, j4, (j5 * j17) + (j11 * j10), 2L);
        long j20 = jArr3[6];
        long j21 = jArr2[6];
        long j22 = (j21 * j2) + (j * j20) + jD;
        long j23 = jArr3[7];
        long j24 = jArr2[7];
        long j25 = (j24 * j2) + (j * j23) + (j21 * j4) + (j5 * j20) + (j18 * j7) + (j8 * j17) + (j14 * j10) + (j11 * j13);
        long j26 = jArr3[8];
        long j27 = jArr2[8];
        long j28 = (j27 * j2) + (j * j26) + (j21 * j7) + (j8 * j20) + (((j24 * j4) + (j5 * j23) + (j18 * j10) + (j11 * j17)) * 2) + (j14 * j13);
        long j29 = jArr3[9];
        long j30 = (j * j29) + (j27 * j4) + (j5 * j26) + (j24 * j7) + (j8 * j23) + (j21 * j10) + (j11 * j20) + (j18 * j13) + (j14 * j17);
        long j31 = jArr2[9];
        long j32 = (((j31 * j23) + (j24 * j29)) * 2) + (j27 * j26);
        d(new long[]{j3, j6, j9, j12, j15, j19, j22, j25, j28, (j2 * j31) + j30, (j27 * j7) + (j8 * j26) + (j21 * j13) + (j14 * j20) + a.d(j31, j4, (j5 * j29) + (j24 * j10) + (j11 * j23) + (j18 * j17), 2L), (j31 * j7) + (j8 * j29) + (j27 * j10) + (j11 * j26) + (j24 * j13) + (j14 * j23) + (j21 * j17) + (j18 * j20), (j27 * j13) + (j14 * j26) + (((j31 * j10) + (j11 * j29) + (j24 * j17) + (j18 * j23)) * 2) + (j21 * j20), (j31 * j13) + (j14 * j29) + (j27 * j17) + (j18 * j26) + (j24 * j20) + (j21 * j23), (j27 * j20) + (j21 * j26) + a.d(j31, j17, (j18 * j29) + (j24 * j23), 2L), (j31 * j20) + (j21 * j29) + (j27 * j23) + (j24 * j26), j32, (j31 * j26) + (j27 * j29), 2 * j31 * j29}, jArr);
    }

    public static void d(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr;
        if (jArr3.length != 19) {
            long[] jArr4 = new long[19];
            System.arraycopy(jArr3, 0, jArr4, 0, jArr3.length);
            jArr3 = jArr4;
        }
        long j = jArr3[8];
        long j2 = jArr3[18];
        long j3 = j + (j2 << 4);
        jArr3[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr3[8] = j4;
        jArr3[8] = j4 + j2;
        long j5 = jArr3[7];
        long j6 = jArr3[17];
        long j7 = j5 + (j6 << 4);
        jArr3[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr3[7] = j8;
        jArr3[7] = j8 + j6;
        long j9 = jArr3[6];
        long j10 = jArr3[16];
        long j11 = j9 + (j10 << 4);
        jArr3[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr3[6] = j12;
        jArr3[6] = j12 + j10;
        long j13 = jArr3[5];
        long j14 = jArr3[15];
        long j15 = j13 + (j14 << 4);
        jArr3[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr3[5] = j16;
        jArr3[5] = j16 + j14;
        long j17 = jArr3[4];
        long j18 = jArr3[14];
        long j19 = j17 + (j18 << 4);
        jArr3[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr3[4] = j20;
        jArr3[4] = j20 + j18;
        long j21 = jArr3[3];
        long j22 = jArr3[13];
        long j23 = j21 + (j22 << 4);
        jArr3[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr3[3] = j24;
        jArr3[3] = j24 + j22;
        long j25 = jArr3[2];
        long j26 = jArr3[12];
        long j27 = j25 + (j26 << 4);
        jArr3[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr3[2] = j28;
        jArr3[2] = j28 + j26;
        long j29 = jArr3[1];
        long j30 = jArr3[11];
        long j31 = j29 + (j30 << 4);
        jArr3[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr3[1] = j32;
        jArr3[1] = j32 + j30;
        long j33 = jArr3[0];
        long j34 = jArr3[10];
        long j35 = j33 + (j34 << 4);
        jArr3[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr3[0] = j36;
        jArr3[0] = j36 + j34;
        jArr3[10] = 0;
        int i = 0;
        while (i < 10) {
            long j37 = jArr3[i];
            long j38 = j37 / llqqqql.c00630063c006300630063;
            jArr3[i] = j37 - (j38 << 26);
            int i2 = i + 1;
            long j39 = jArr3[i2] + j38;
            jArr3[i2] = j39;
            long j40 = j39 / llqqqql.cc0063c006300630063;
            jArr3[i2] = j39 - (j40 << 25);
            i += 2;
            jArr3[i] = jArr3[i] + j40;
        }
        long j41 = jArr3[0];
        long j42 = jArr3[10];
        long j43 = j41 + (j42 << 4);
        jArr3[0] = j43;
        long j44 = j43 + (j42 << 1);
        jArr3[0] = j44;
        long j45 = j44 + j42;
        jArr3[0] = j45;
        jArr3[10] = 0;
        long j46 = j45 / llqqqql.c00630063c006300630063;
        jArr3[0] = j45 - (j46 << 26);
        jArr3[1] = jArr3[1] + j46;
        System.arraycopy(jArr3, 0, jArr2, 0, 10);
    }

    public static void e(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long jD = a.d(j, j4, j3 * j3, 2L);
        long j5 = j3 * j4;
        long j6 = jArr2[3];
        long jD2 = a.d(j, j6, j5, 2L);
        long j7 = jArr2[4];
        long j8 = (j2 * j7) + (j3 * 4 * j6) + (j4 * j4);
        long j9 = (j3 * j7) + (j4 * j6);
        long j10 = jArr2[5];
        long jD3 = a.d(j, j10, j9, 2L);
        long j11 = jArr2[6];
        long j12 = ((j3 * 2 * j10) + (j * j11) + (j4 * j7) + (j6 * j6)) * 2;
        long j13 = (j4 * j10) + (j6 * j7) + (j3 * j11);
        long j14 = jArr2[7];
        long jD4 = a.d(j, j14, j13, 2L);
        long j15 = jArr2[8];
        long j16 = (((((j6 * j10) + (j3 * j14)) * 2) + (j * j15) + (j4 * j11)) * 2) + (j7 * j7);
        long j17 = (j3 * j15) + (j4 * j14) + (j6 * j11) + (j7 * j10);
        long j18 = jArr2[9];
        d(new long[]{j * j, j2 * j3, jD, jD2, j8, jD3, j12, jD4, j16, a.d(j, j18, j17, 2L), ((((j3 * j18) + (j6 * j14)) * 2) + (j4 * j15) + (j7 * j11) + (j10 * j10)) * 2, a.d(j4, j18, (j7 * j14) + (j10 * j11) + (j6 * j15), 2L), (((((j6 * j18) + (j10 * j14)) * 2) + (j7 * j15)) * 2) + (j11 * j11), a.d(j7, j18, (j10 * j15) + (j11 * j14), 2L), ((j10 * 2 * j18) + (j11 * j15) + (j14 * j14)) * 2, a.d(j11, j18, j14 * j15, 2L), (4 * j14 * j18) + (j15 * j15), j15 * 2 * j18, j18 * 2 * j18}, jArr);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }
}
