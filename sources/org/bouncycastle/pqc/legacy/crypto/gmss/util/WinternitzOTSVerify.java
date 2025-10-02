package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes8.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;
    private int w;

    public WinternitzOTSVerify(Digest digest, int i) {
        this.w = i;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 < 1) {
            System.arraycopy(bArr, i, bArr2, i3, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i3);
            i2--;
            if (i2 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i3, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.mdsize;
        byte[] bArr3 = new byte[i5];
        int i6 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i7 = this.mdsize << 3;
        int i8 = this.w;
        int i9 = ((i8 - 1) + i7) / i8;
        boolean z = true;
        int log = getLog((i9 << i8) + 1);
        int i10 = this.w;
        int i11 = this.mdsize;
        int i12 = i11 * ((((log + i10) - 1) / i10) + i9);
        if (i12 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i12];
        char c = '\b';
        if (8 % i10 == 0) {
            int i13 = 8 / i10;
            int i14 = (1 << i10) - 1;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i5) {
                int i18 = i16;
                int i19 = 0;
                while (i19 < i13) {
                    int i20 = bArr3[i17] & i14;
                    int i21 = i15 + i20;
                    int i22 = this.mdsize;
                    hashSignatureBlock(bArr2, i18 * i22, i14 - i20, bArr4, i22 * i18);
                    bArr3[i17] = (byte) (bArr3[i17] >>> this.w);
                    i18++;
                    i19++;
                    i15 = i21;
                }
                i17++;
                i16 = i18;
            }
            int i23 = (i9 << this.w) - i15;
            int i24 = i16;
            int i25 = 0;
            while (i25 < log) {
                int i26 = this.mdsize;
                hashSignatureBlock(bArr2, i24 * i26, i14 - (i23 & i14), bArr4, i24 * i26);
                int i27 = this.w;
                i23 >>>= i27;
                i24++;
                i25 += i27;
            }
        } else {
            if (i10 >= 8) {
                if (i10 < 57) {
                    int i28 = (i11 << 3) - i10;
                    int i29 = (1 << i10) - 1;
                    byte[] bArr5 = new byte[i11];
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    while (i30 <= i28) {
                        int i33 = i30 >>> 3;
                        int i34 = i30 % 8;
                        char c2 = c;
                        i30 += this.w;
                        int i35 = i6;
                        int i36 = i33;
                        long j = 0;
                        while (true) {
                            i4 = i28;
                            if (i36 >= ((i30 + 7) >>> 3)) {
                                break;
                            }
                            j ^= (bArr3[i36] & 255) << (i35 << 3);
                            i35++;
                            i36++;
                            i28 = i4;
                            bArr3 = bArr3;
                        }
                        byte[] bArr6 = bArr3;
                        long j2 = i29;
                        long j3 = (j >>> i34) & j2;
                        i31 = (int) (i31 + j3);
                        int i37 = this.mdsize;
                        System.arraycopy(bArr2, i32 * i37, bArr5, 0, i37);
                        while (j3 < j2) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j3++;
                        }
                        int i38 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i32 * i38, i38);
                        i32++;
                        c = c2;
                        i28 = i4;
                        bArr3 = bArr6;
                        i6 = 0;
                    }
                    byte[] bArr7 = bArr3;
                    int i39 = i30 >>> 3;
                    if (i39 < this.mdsize) {
                        int i40 = i30 % 8;
                        int i41 = 0;
                        long j4 = 0;
                        while (true) {
                            i3 = this.mdsize;
                            if (i39 >= i3) {
                                break;
                            }
                            j4 ^= (bArr7[i39] & 255) << (i41 << 3);
                            i41++;
                            i39++;
                        }
                        i = i9;
                        long j5 = i29;
                        long j6 = (j4 >>> i40) & j5;
                        i31 = (int) (i31 + j6);
                        System.arraycopy(bArr2, i32 * i3, bArr5, 0, i3);
                        while (j6 < j5) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                            j6++;
                        }
                        int i42 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i32 * i42, i42);
                        i32++;
                    } else {
                        i = i9;
                    }
                    int i43 = (i << this.w) - i31;
                    int i44 = 0;
                    while (i44 < log) {
                        int i45 = this.mdsize;
                        System.arraycopy(bArr2, i32 * i45, bArr5, 0, i45);
                        int i46 = i32;
                        for (long j7 = i43 & i29; j7 < i29; j7++) {
                            this.messDigestOTS.update(bArr5, 0, i11);
                            this.messDigestOTS.doFinal(bArr5, 0);
                        }
                        int i47 = this.mdsize;
                        System.arraycopy(bArr5, 0, bArr4, i46 * i47, i47);
                        int i48 = this.w;
                        i43 >>>= i48;
                        i32 = i46 + 1;
                        i44 += i48;
                    }
                    i2 = 0;
                }
                this.messDigestOTS.update(bArr4, i2, i12);
                byte[] bArr8 = new byte[this.mdsize];
                this.messDigestOTS.doFinal(bArr8, i2);
                return bArr8;
            }
            int i49 = i11 / i10;
            int i50 = (1 << i10) - 1;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            while (i51 < i49) {
                int i55 = i52;
                boolean z2 = z;
                long j8 = 0;
                for (int i56 = 0; i56 < this.w; i56++) {
                    j8 ^= (bArr3[i55] & 255) << (i56 << 3);
                    i55++;
                }
                int i57 = 0;
                while (i57 < 8) {
                    int i58 = (int) (j8 & i50);
                    int i59 = i53 + i58;
                    int i60 = this.mdsize;
                    hashSignatureBlock(bArr2, i54 * i60, i50 - i58, bArr4, i60 * i54);
                    j8 >>>= this.w;
                    i54++;
                    i57++;
                    i53 = i59;
                    i50 = i50;
                    i51 = i51;
                }
                i51++;
                z = z2;
                i52 = i55;
            }
            int i61 = i50;
            int i62 = this.mdsize % this.w;
            long j9 = 0;
            for (int i63 = 0; i63 < i62; i63++) {
                j9 ^= (bArr3[i52] & 255) << (i63 << 3);
                i52++;
            }
            int i64 = i62 << 3;
            int i65 = 0;
            while (i65 < i64) {
                int i66 = (int) (j9 & i61);
                int i67 = i53 + i66;
                int i68 = this.mdsize;
                hashSignatureBlock(bArr2, i54 * i68, i61 - i66, bArr4, i54 * i68);
                int i69 = this.w;
                j9 >>>= i69;
                i54++;
                i65 += i69;
                i53 = i67;
            }
            int i70 = (i9 << this.w) - i53;
            int i71 = 0;
            while (i71 < log) {
                int i72 = this.mdsize;
                hashSignatureBlock(bArr2, i54 * i72, i61 - (i70 & i61), bArr4, i54 * i72);
                int i73 = this.w;
                i70 >>>= i73;
                i54++;
                i71 += i73;
            }
        }
        i2 = 0;
        this.messDigestOTS.update(bArr4, i2, i12);
        byte[] bArr82 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr82, i2);
        return bArr82;
    }

    public int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i = this.w;
        int i2 = ((i - 1) + (digestSize << 3)) / i;
        int log = getLog((i2 << i) + 1);
        return ((((log + r2) - 1) / this.w) + i2) * digestSize;
    }
}
