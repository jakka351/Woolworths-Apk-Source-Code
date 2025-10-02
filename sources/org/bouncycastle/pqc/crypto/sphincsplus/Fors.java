package org.bouncycastle.pqc.crypto.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    public static int[] message_to_idxs(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            iArr[i4] = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i4] = iArr[i4] ^ (((bArr[i3 >> 3] >> (i3 & 7)) & 1) << i5);
                i3++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i;
        int i2 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i3 = sPHINCSPlusEngine.K;
        byte[][] bArr4 = new byte[i3][];
        int i4 = sPHINCSPlusEngine.T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i3, sPHINCSPlusEngine.A);
        int i5 = 0;
        while (i5 < this.engine.K) {
            int i6 = iArrMessage_to_idxs[i5];
            byte[] sk = sig_forsArr[i5].getSK();
            adrs.setTreeHeight(0);
            int i7 = (i5 * i4) + i6;
            adrs.setTreeIndex(i7);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i5].getAuthPath();
            adrs.setTreeIndex(i7);
            int i8 = 0;
            while (i8 < this.engine.A) {
                int i9 = i8 + 1;
                adrs.setTreeHeight(i9);
                if ((i6 / (1 << i8)) % i2 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i2);
                    i = i2;
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i8]);
                } else {
                    i = i2;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i8], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i8 = i9;
                i2 = i;
            }
            bArr4[i5] = bArr3[0];
            i5++;
            i2 = i2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setType(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.K, sPHINCSPlusEngine.A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.K];
        int i = sPHINCSPlusEngine2.T;
        int i2 = 0;
        while (i2 < fors.engine.K) {
            int i3 = iArrMessage_to_idxs[i2];
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i4 = i2 * i;
            adrs2.setTreeIndex(i4 + i3);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i5 = 0;
            while (i5 < fors.engine.A) {
                int i6 = 1 << i5;
                bArr6[i5] = fors.treehash(bArr4, (((i3 / i6) ^ 1) * i6) + i4, i5, bArr5, adrs2);
                i5++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i2] = new SIG_FORS(bArrPRF, bArr6);
            i2++;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        LinkedList linkedList = new LinkedList();
        int i3 = 1 << i2;
        if (i % i3 != 0) {
            return null;
        }
        ADRS adrs2 = new ADRS(adrs);
        for (int i4 = 0; i4 < i3; i4++) {
            adrs2.setType(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            adrs2.setTreeIndex(i + i4);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == adrs2.getTreeHeight()) {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                adrs2.setTreeHeight(adrs2.getTreeHeight() + 1);
            }
            linkedList.add(0, new NodeEntry(bArrF, adrs2.getTreeHeight()));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
