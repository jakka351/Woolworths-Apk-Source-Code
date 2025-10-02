package com.google.android.gms.internal.p002firebaseauthapi;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzic {
    private static long zza(byte[] bArr, int i, int i2) {
        return (zza(bArr, i) >> i2) & 67108863;
    }

    private static long zza(byte[] bArr, int i) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long jZza = zza(bArr, 0, 0) & 67108863;
            int i = 3;
            int i2 = 2;
            long jZza2 = zza(bArr, 3, 2) & 67108611;
            long jZza3 = zza(bArr, 6, 4) & 67092735;
            long jZza4 = zza(bArr, 9, 6) & 66076671;
            long jZza5 = zza(bArr, 12, 8) & 1048575;
            long j = jZza2 * 5;
            long j2 = jZza3 * 5;
            long j3 = jZza4 * 5;
            long j4 = jZza5 * 5;
            int i3 = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i4 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i4 < bArr2.length) {
                int iMin = Math.min(16, bArr2.length - i4);
                System.arraycopy(bArr2, i4, bArr3, 0, iMin);
                bArr3[iMin] = 1;
                if (iMin != 16) {
                    Arrays.fill(bArr3, iMin + 1, i3, (byte) 0);
                }
                long jZza6 = j9 + zza(bArr3, 0, 0);
                long jZza7 = j5 + zza(bArr3, i, i2);
                long jZza8 = j6 + zza(bArr3, 6, 4);
                long jZza9 = j7 + zza(bArr3, 9, 6);
                long j10 = jZza2;
                long jZza10 = j8 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j11 = (jZza10 * j) + (jZza9 * j2) + (jZza8 * j3) + (jZza7 * j4) + (jZza6 * jZza);
                long j12 = (jZza10 * j2) + (jZza9 * j3) + (jZza8 * j4) + (jZza7 * jZza) + (jZza6 * j10);
                long j13 = (jZza10 * j3) + (jZza9 * j4) + (jZza8 * jZza) + (jZza7 * j10) + (jZza6 * jZza3);
                long j14 = (jZza10 * j4) + (jZza9 * jZza) + (jZza8 * j10) + (jZza7 * jZza3) + (jZza6 * jZza4);
                long j15 = jZza9 * j10;
                long j16 = jZza10 * jZza;
                long j17 = j12 + (j11 >> 26);
                long j18 = j13 + (j17 >> 26);
                long j19 = j14 + (j18 >> 26);
                long j20 = j16 + j15 + (jZza8 * jZza3) + (jZza7 * jZza4) + (jZza6 * jZza5) + (j19 >> 26);
                long j21 = j20 >> 26;
                j8 = j20 & 67108863;
                long j22 = (j21 * 5) + (j11 & 67108863);
                i4 += 16;
                j6 = j18 & 67108863;
                j7 = j19 & 67108863;
                i3 = 17;
                i = 3;
                j9 = j22 & 67108863;
                j5 = (j17 & 67108863) + (j22 >> 26);
                jZza2 = j10;
                i2 = 2;
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
            long j35 = (j33 >> 26) + j32;
            long j36 = j24 + (j35 >> 26);
            long j37 = j26 + (j36 >> 26);
            long j38 = (j28 + (j37 >> 26)) - llqqqql.c00630063c006300630063;
            long j39 = j38 >> 63;
            long j40 = ~j39;
            long j41 = (j31 & j39) | (j34 & j40);
            long j42 = (j32 & j39) | (j35 & 67108863 & j40);
            long j43 = (j24 & j39) | (j36 & 67108863 & j40);
            long j44 = (j26 & j39) | (j37 & 67108863 & j40);
            long j45 = (j41 | (j42 << 26)) & 4294967295L;
            long j46 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
            long j47 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
            long j48 = ((((j38 & j40) | (j28 & j39)) << 8) | (j44 >> 18)) & 4294967295L;
            long jZza11 = j45 + zza(bArr, 16);
            long j49 = jZza11 & 4294967295L;
            long jZza12 = j46 + zza(bArr, 20) + (jZza11 >> 32);
            long jZza13 = j47 + zza(bArr, 24) + (jZza12 >> 32);
            long jZza14 = (j48 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j49, 0);
            zza(bArr4, jZza12 & 4294967295L, 4);
            zza(bArr4, jZza13 & 4294967295L, 8);
            zza(bArr4, jZza14, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
