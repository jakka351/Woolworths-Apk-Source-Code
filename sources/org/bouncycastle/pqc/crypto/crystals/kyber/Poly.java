package org.bouncycastle.pqc.crypto.crystals.kyber;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes8.dex */
class Poly {
    private KyberEngine engine;
    private int eta1;
    private int polyCompressedBytes;
    private Symmetric symmetric;
    private short[] coeffs = new short[256];
    private int eta2 = KyberEngine.getKyberEta2();

    public Poly(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.polyCompressedBytes = kyberEngine.getKyberPolyCompressedBytes();
        this.eta1 = kyberEngine.getKyberEta1();
        this.symmetric = kyberEngine.getSymmetric();
    }

    public static void baseMultMontgomery(Poly poly, Poly poly2, Poly poly3) {
        for (int i = 0; i < 64; i++) {
            int i2 = i * 4;
            short coeffIndex = poly2.getCoeffIndex(i2);
            int i3 = i2 + 1;
            short coeffIndex2 = poly2.getCoeffIndex(i3);
            short coeffIndex3 = poly3.getCoeffIndex(i2);
            short coeffIndex4 = poly3.getCoeffIndex(i3);
            short[] sArr = Ntt.nttZetas;
            int i4 = i + 64;
            Ntt.baseMult(poly, i2, coeffIndex, coeffIndex2, coeffIndex3, coeffIndex4, sArr[i4]);
            int i5 = i2 + 2;
            int i6 = i2 + 3;
            Ntt.baseMult(poly, i5, poly2.getCoeffIndex(i5), poly2.getCoeffIndex(i6), poly3.getCoeffIndex(i5), poly3.getCoeffIndex(i6), (short) (sArr[i4] * (-1)));
        }
    }

    public void addCoeffs(Poly poly) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, (short) (getCoeffIndex(i) + poly.getCoeffIndex(i)));
        }
    }

    public byte[] compressPoly() {
        byte[] bArr = new byte[8];
        byte[] bArr2 = new byte[this.polyCompressedBytes];
        conditionalSubQ();
        int i = this.polyCompressedBytes;
        if (i == 128) {
            int i2 = 0;
            for (int i3 = 0; i3 < 32; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((((getCoeffIndex((i3 * 8) + i4) << 4) + 1664) / KyberEngine.KyberQ) & 15);
                }
                bArr2[i2] = (byte) (bArr[0] | (bArr[1] << 4));
                bArr2[i2 + 1] = (byte) (bArr[2] | (bArr[3] << 4));
                bArr2[i2 + 2] = (byte) (bArr[4] | (bArr[5] << 4));
                bArr2[i2 + 3] = (byte) (bArr[6] | (bArr[7] << 4));
                i2 += 4;
            }
        } else {
            if (i != 160) {
                throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
            }
            int i5 = 0;
            for (int i6 = 0; i6 < 32; i6++) {
                for (int i7 = 0; i7 < 8; i7++) {
                    bArr[i7] = (byte) ((((getCoeffIndex((i6 * 8) + i7) << 5) + 1664) / KyberEngine.KyberQ) & 31);
                }
                bArr2[i5] = (byte) (bArr[0] | (bArr[1] << 5));
                bArr2[i5 + 1] = (byte) ((bArr[1] >> 3) | (bArr[2] << 2) | (bArr[3] << 7));
                bArr2[i5 + 2] = (byte) ((bArr[3] >> 1) | (bArr[4] << 4));
                bArr2[i5 + 3] = (byte) ((bArr[4] >> 4) | (bArr[5] << 1) | (bArr[6] << 6));
                bArr2[i5 + 4] = (byte) ((bArr[6] >> 2) | (bArr[7] << 3));
                i5 += 5;
            }
        }
        return bArr2;
    }

    public void conditionalSubQ() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.conditionalSubQ(getCoeffIndex(i)));
        }
    }

    public void convertToMont() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.montgomeryReduce(getCoeffIndex(i) * 1353));
        }
    }

    public void decompressPoly(byte[] bArr) {
        char c = 4;
        int i = 1;
        if (this.engine.getKyberPolyCompressedBytes() == 128) {
            int i2 = 0;
            for (int i3 = 0; i3 < 128; i3++) {
                int i4 = i3 * 2;
                setCoeffIndex(i4, (short) (((((short) (bArr[i2] & 15)) * 3329) + 8) >> 4));
                setCoeffIndex(i4 + 1, (short) (((((short) ((bArr[i2] & 255) >> 4)) * 3329) + 8) >> 4));
                i2++;
            }
            return;
        }
        if (this.engine.getKyberPolyCompressedBytes() != 160) {
            throw new RuntimeException("PolyCompressedBytes is neither 128 or 160!");
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 32) {
            byte b = bArr[i6];
            byte b2 = (byte) (b & 255);
            byte b3 = bArr[i6 + 1];
            byte b4 = (byte) (((b & 255) >> 5) | ((b3 & 255) << 3));
            byte b5 = (byte) ((b3 & 255) >> 2);
            byte b6 = bArr[i6 + 2];
            char c2 = c;
            byte b7 = (byte) (((b6 & 255) << i) | ((b3 & 255) >> 7));
            int i7 = (b6 & 255) >> 4;
            byte b8 = bArr[i6 + 3];
            int i8 = i;
            byte b9 = (byte) (((b8 & 255) << 4) | i7);
            byte b10 = (byte) ((b8 & 255) >> 1);
            byte b11 = bArr[i6 + 4];
            byte b12 = (byte) (((b11 & 255) << 2) | ((b8 & 255) >> 6));
            byte[] bArr2 = new byte[8];
            bArr2[0] = b2;
            bArr2[i8] = b4;
            bArr2[2] = b5;
            bArr2[3] = b7;
            bArr2[c2] = b9;
            bArr2[5] = b10;
            bArr2[6] = b12;
            bArr2[7] = (byte) ((b11 & 255) >> 3);
            i6 += 5;
            for (int i9 = 0; i9 < 8; i9++) {
                setCoeffIndex((i5 * 8) + i9, (short) ((((bArr2[i9] & 31) * KyberEngine.KyberQ) + 16) >> 5));
            }
            i5++;
            c = c2;
            i = i8;
        }
    }

    public void fromBytes(byte[] bArr) {
        for (int i = 0; i < 128; i++) {
            int i2 = i * 2;
            int i3 = i * 3;
            setCoeffIndex(i2, (short) (((bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8)) & l3.b));
            setCoeffIndex(i2 + 1, (short) ((((bArr[r4] & 255) >> 4) | ((bArr[i3 + 2] & 255) << 4)) & 4095));
        }
    }

    public void fromMsg(byte[] bArr) {
        if (bArr.length != 32) {
            throw new RuntimeException("KYBER_INDCPA_MSGBYTES must be equal to KYBER_N/8 bytes!");
        }
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                setCoeffIndex((i * 8) + i2, (short) (((short) (((short) (((bArr[i] & 255) >> i2) & 1)) * (-1))) & 1665));
            }
        }
    }

    public short getCoeffIndex(int i) {
        return this.coeffs[i];
    }

    public short[] getCoeffs() {
        return this.coeffs;
    }

    public void getEta1Noise(byte[] bArr, byte b) {
        byte[] bArr2 = new byte[(this.eta1 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b);
        CBD.kyberCBD(this, bArr2, this.eta1);
    }

    public void getEta2Noise(byte[] bArr, byte b) {
        byte[] bArr2 = new byte[(this.eta2 * 256) / 4];
        this.symmetric.prf(bArr2, bArr, b);
        CBD.kyberCBD(this, bArr2, this.eta2);
    }

    public void polyInverseNttToMont() {
        setCoeffs(Ntt.invNtt(getCoeffs()));
    }

    public void polyNtt() {
        setCoeffs(Ntt.ntt(getCoeffs()));
        reduce();
    }

    public void polySubtract(Poly poly) {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, (short) (poly.getCoeffIndex(i) - getCoeffIndex(i)));
        }
    }

    public void reduce() {
        for (int i = 0; i < 256; i++) {
            setCoeffIndex(i, Reduce.barretReduce(getCoeffIndex(i)));
        }
    }

    public void setCoeffIndex(int i, short s) {
        this.coeffs[i] = s;
    }

    public void setCoeffs(short[] sArr) {
        this.coeffs = sArr;
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[KyberEngine.KyberPolyBytes];
        conditionalSubQ();
        for (int i = 0; i < 128; i++) {
            int i2 = i * 2;
            short coeffIndex = getCoeffIndex(i2);
            short coeffIndex2 = getCoeffIndex(i2 + 1);
            int i3 = i * 3;
            bArr[i3] = (byte) coeffIndex;
            bArr[i3 + 1] = (byte) ((coeffIndex >> 8) | (coeffIndex2 << 4));
            bArr[i3 + 2] = (byte) (coeffIndex2 >> 4);
        }
        return bArr;
    }

    public byte[] toMsg() {
        byte[] bArr = new byte[KyberEngine.getKyberIndCpaMsgBytes()];
        conditionalSubQ();
        for (int i = 0; i < 32; i++) {
            bArr[i] = 0;
            for (int i2 = 0; i2 < 8; i2++) {
                bArr[i] = (byte) (((byte) (((short) (((((short) (getCoeffIndex((i * 8) + i2) << 1)) + 1664) / KyberEngine.KyberQ) & 1)) << i2)) | bArr[i]);
            }
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            short[] sArr = this.coeffs;
            if (i >= sArr.length) {
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            stringBuffer.append((int) sArr[i]);
            if (i != this.coeffs.length - 1) {
                stringBuffer.append(", ");
            }
            i++;
        }
    }
}
