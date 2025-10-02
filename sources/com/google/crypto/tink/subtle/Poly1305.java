package com.google.crypto.tink.subtle;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.Arrays;

/* loaded from: classes6.dex */
class Poly1305 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jB = b(0, bArr) & 67108863;
        int i = 3;
        long jB2 = (b(3, bArr) >> 2) & 67108611;
        long jB3 = (b(6, bArr) >> 4) & 67092735;
        long jB4 = (b(9, bArr) >> 6) & 66076671;
        long jB5 = (b(12, bArr) >> 8) & 1048575;
        long j = jB2 * 5;
        long j2 = jB3 * 5;
        long j3 = jB4 * 5;
        long j4 = jB5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jB6 = j9 + (b(0, bArr3) & 67108863);
            long jB7 = j5 + ((b(i, bArr3) >> 2) & 67108863);
            long jB8 = j6 + ((b(6, bArr3) >> 4) & 67108863);
            long jB9 = j7 + ((b(9, bArr3) >> 6) & 67108863);
            long j10 = jB2;
            long jB10 = j8 + (((b(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (jB10 * j) + (jB9 * j2) + (jB8 * j3) + (jB7 * j4) + (jB6 * jB);
            long j12 = (jB10 * j2) + (jB9 * j3) + (jB8 * j4) + (jB7 * jB) + (jB6 * j10);
            long j13 = (jB10 * j3) + (jB9 * j4) + (jB8 * jB) + (jB7 * j10) + (jB6 * jB3);
            long j14 = (jB10 * j4) + (jB9 * jB) + (jB8 * j10) + (jB7 * jB3) + (jB6 * jB4);
            long j15 = jB9 * j10;
            long j16 = jB10 * jB;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jB8 * jB3) + (jB7 * jB4) + (jB6 * jB5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jB2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - llqqqql.c00630063c006300630063;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jB11 = j50 + b(16, bArr);
        long jB12 = j51 + b(20, bArr) + (jB11 >> 32);
        long jB13 = j52 + b(24, bArr) + (jB12 >> 32);
        long jB14 = (j53 + b(28, bArr) + (jB13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        c(0, jB11 & 4294967295L, bArr4);
        c(4, jB12 & 4294967295L, bArr4);
        c(8, jB13 & 4294967295L, bArr4);
        c(12, jB14, bArr4);
        return bArr4;
    }

    public static long b(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static void c(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }
}
