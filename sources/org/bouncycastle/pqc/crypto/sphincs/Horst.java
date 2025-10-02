package org.bouncycastle.pqc.crypto.sphincs;

import YU.a;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes8.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    public static void expand_seed(byte[] bArr, byte[] bArr2) throws DataLengthException, IllegalArgumentException {
        Seed.prg(bArr, 0, llqqqql.cc00630063c00630063, bArr2, 0);
    }

    public static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) throws DataLengthException, IllegalArgumentException {
        byte[] bArr6 = new byte[2097152];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i2 = 0; i2 < HORST_T; i2++) {
            hashFunctions.hash_n_n(bArr7, (Blake2xsDigest.UNKNOWN_DIGEST_LENGTH + i2) * 32, bArr6, i2 * 32);
        }
        for (int i3 = 0; i3 < 16; i3++) {
            long j = (1 << (16 - i3)) - 1;
            int i4 = 1 << (15 - i3);
            long j2 = i4 - 1;
            int i5 = 0;
            while (i5 < i4) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((i5 + j2) * 32), bArr7, (int) (((i5 * 2) + j) * 32), bArr4, i3 * 64);
                i5++;
                j2 = j2;
            }
        }
        int i6 = 2016;
        int i7 = i;
        while (i6 < 4064) {
            bArr[i7] = bArr7[i6];
            i6++;
            i7++;
        }
        for (int i8 = 0; i8 < 32; i8++) {
            int i9 = i8 * 2;
            int i10 = (bArr5[i9] & 255) + ((bArr5[i9 + 1] & 255) << 8);
            int i11 = 0;
            while (i11 < 32) {
                bArr[i7] = bArr6[(i10 * 32) + i11];
                i11++;
                i7++;
            }
            int i12 = i10 + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            for (int i13 = 0; i13 < 10; i13++) {
                int i14 = (i12 & 1) != 0 ? i12 + 1 : i12 - 1;
                int i15 = 0;
                while (i15 < 32) {
                    bArr[i7] = bArr7[(i14 * 32) + i15];
                    i15++;
                    i7++;
                }
                i12 = (i14 - 1) / 2;
            }
        }
        for (int i16 = 0; i16 < 32; i16++) {
            bArr2[i16] = bArr7[i16];
        }
        return HORST_SIGBYTES;
    }

    public static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = bArr2;
        byte[] bArr6 = new byte[1024];
        int i2 = i + 2048;
        int i3 = 0;
        while (i3 < 32) {
            int i4 = i3 * 2;
            int i5 = (bArr4[i4] & 255) + ((bArr4[i4 + 1] & 255) << 8);
            if ((i5 & 1) == 0) {
                hashFunctions.hash_n_n(bArr6, 0, bArr5, i2);
                for (int i6 = 0; i6 < 32; i6++) {
                    bArr6[i6 + 32] = bArr5[i2 + 32 + i6];
                }
            } else {
                hashFunctions.hash_n_n(bArr6, 32, bArr5, i2);
                for (int i7 = 0; i7 < 32; i7++) {
                    bArr6[i7] = bArr5[i2 + 32 + i7];
                }
            }
            int i8 = i2 + 64;
            int i9 = 1;
            while (i9 < 10) {
                int i10 = i5 >>> 1;
                if ((i10 & 1) == 0) {
                    hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, (i9 - 1) * 64);
                    for (int i11 = 0; i11 < 32; i11++) {
                        bArr6[i11 + 32] = bArr5[i8 + i11];
                    }
                } else {
                    hashFunctions.hash_2n_n_mask(bArr6, 32, bArr6, 0, bArr3, (i9 - 1) * 64);
                    for (int i12 = 0; i12 < 32; i12++) {
                        bArr6[i12] = bArr5[i8 + i12];
                    }
                }
                i8 += 32;
                i9++;
                i5 = i10;
            }
            int i13 = i5 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr6, 0, bArr6, 0, bArr3, 576);
            for (int i14 = 0; i14 < 32; i14++) {
                if (bArr5[a.C(i13, 32, i, i14)] != bArr6[i14]) {
                    for (int i15 = 0; i15 < 32; i15++) {
                        bArr[i15] = 0;
                    }
                    return -1;
                }
            }
            i3++;
            i2 = i8;
        }
        int i16 = 0;
        while (i16 < 32) {
            hashFunctions.hash_2n_n_mask(bArr6, i16 * 32, bArr5, (i16 * 64) + i, bArr3, 640);
            i16++;
            bArr5 = bArr2;
        }
        for (int i17 = 0; i17 < 16; i17++) {
            hashFunctions.hash_2n_n_mask(bArr6, i17 * 32, bArr6, i17 * 64, bArr3, 704);
        }
        for (int i18 = 0; i18 < 8; i18++) {
            hashFunctions.hash_2n_n_mask(bArr6, i18 * 32, bArr6, i18 * 64, bArr3, 768);
        }
        for (int i19 = 0; i19 < 4; i19++) {
            hashFunctions.hash_2n_n_mask(bArr6, i19 * 32, bArr6, i19 * 64, bArr3, 832);
        }
        for (int i20 = 0; i20 < 2; i20++) {
            hashFunctions.hash_2n_n_mask(bArr6, i20 * 32, bArr6, i20 * 64, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr6, 0, bArr3, 960);
        return 0;
    }
}
