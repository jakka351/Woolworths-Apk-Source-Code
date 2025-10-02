package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;
    private final int w;

    public WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.w = sPHINCSPlusEngine.WOTS_W;
    }

    public void base_w(byte[] bArr, int i, int i2, int[] iArr, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i4) {
            if (i6 == 0) {
                i6 += 8;
                i7 = bArr[i];
                i++;
            }
            i6 -= this.engine.WOTS_LOGW;
            iArr[i3] = (i7 >>> i6) & (i2 - 1);
            i5++;
            i3++;
        }
    }

    public byte[] chain(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (i2 == 0) {
            return Arrays.clone(bArr);
        }
        if (i + i2 > this.w - 1) {
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            adrs.setHashAddress(i + i3);
            bArr = this.engine.F(bArr2, adrs, bArr);
        }
        return bArr;
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = adrs;
        ADRS adrs3 = new ADRS(adrs2);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr2, 0, this.w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i = 0;
        int i2 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i2 += (this.w - 1) - iArr[i];
            i++;
        }
        int i3 = sPHINCSPlusEngine.WOTS_LEN2;
        int i4 = sPHINCSPlusEngine.WOTS_LOGW;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i2 << (8 - ((i3 * i4) % 8)));
        int i5 = 4 - (((i3 * i4) + 7) / 8);
        int i6 = this.w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i5, i6, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        SPHINCSPlusEngine sPHINCSPlusEngine4 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine4.N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine4.WOTS_LEN][];
        int i7 = 0;
        while (i7 < this.engine.WOTS_LEN) {
            adrs2.setChainAddress(i7);
            int i8 = this.engine.N;
            System.arraycopy(bArr, i7 * i8, bArr4, 0, i8);
            byte[] bArr6 = bArr4;
            int i9 = iArr[i7];
            bArr5[i7] = chain(bArr6, i9, (this.w - 1) - i9, bArr3, adrs2);
            i7++;
            adrs2 = adrs;
            bArr4 = bArr6;
        }
        adrs3.setType(1);
        adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs3, Arrays.concatenate(bArr5));
    }

    public byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i = 0;
        while (i < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setType(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i);
            adrs3.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setType(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i] = chain(bArrPRF, 0, this.w - 1, bArr4, adrs3);
            i++;
            bArr2 = bArr4;
        }
        adrs2.setType(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr, 0, this.w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i = 0;
        int i2 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i2 += (this.w - 1) - iArr[i];
            i++;
        }
        int i3 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i3 % 8 != 0) {
            i2 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i3) % 8);
        }
        int i4 = ((sPHINCSPlusEngine.WOTS_LEN2 * i3) + 7) / 8;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i2);
        int i5 = 4 - i4;
        int i6 = this.w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i5, i6, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i7 = 0; i7 < this.engine.WOTS_LEN; i7++) {
            adrs2.setType(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i7);
            adrs2.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setType(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i7);
            adrs2.setHashAddress(0);
            bArr4[i7] = chain(bArrPRF, 0, iArr[i7], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}
