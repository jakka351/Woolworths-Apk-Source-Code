package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
class PolyVec {
    private KyberEngine engine;
    private int kyberK;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVec() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public static void pointwiseAccountMontgomery(Poly poly, PolyVec polyVec, PolyVec polyVec2, KyberEngine kyberEngine) {
        Poly poly2 = new Poly(kyberEngine);
        Poly.baseMultMontgomery(poly, polyVec.getVectorIndex(0), polyVec2.getVectorIndex(0));
        for (int i = 1; i < kyberEngine.getKyberK(); i++) {
            Poly.baseMultMontgomery(poly2, polyVec.getVectorIndex(i), polyVec2.getVectorIndex(i));
            poly.addCoeffs(poly2);
        }
        poly.reduce();
    }

    public void addPoly(PolyVec polyVec) {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).addCoeffs(polyVec.getVectorIndex(i));
        }
    }

    public byte[] compressPolyVec() {
        conditionalSubQ();
        byte[] bArr = new byte[this.engine.getKyberPolyVecCompressedBytes()];
        char c = 3;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            short[] sArr = new short[4];
            int i = 0;
            for (int i2 = 0; i2 < this.kyberK; i2++) {
                for (int i3 = 0; i3 < 64; i3++) {
                    for (int i4 = 0; i4 < 4; i4++) {
                        sArr[i4] = (short) ((((getVectorIndex(i2).getCoeffIndex((i3 * 4) + i4) << 10) + 1664) / KyberEngine.KyberQ) & 1023);
                    }
                    short s = sArr[0];
                    bArr[i] = (byte) s;
                    short s2 = sArr[1];
                    bArr[i + 1] = (byte) ((s >> 8) | (s2 << 2));
                    int i5 = s2 >> 6;
                    short s3 = sArr[2];
                    bArr[i + 2] = (byte) (i5 | (s3 << 4));
                    int i6 = s3 >> 4;
                    short s4 = sArr[3];
                    bArr[i + 3] = (byte) (i6 | (s4 << 6));
                    bArr[i + 4] = (byte) (s4 >> 2);
                    i += 5;
                }
            }
        } else {
            if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
                throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
            }
            short[] sArr2 = new short[8];
            int i7 = 0;
            for (int i8 = 0; i8 < this.kyberK; i8++) {
                int i9 = 0;
                while (i9 < 32) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        sArr2[i10] = (short) ((((getVectorIndex(i8).getCoeffIndex((i9 * 8) + i10) << 11) + 1664) / KyberEngine.KyberQ) & 2047);
                    }
                    short s5 = sArr2[0];
                    bArr[i7] = (byte) s5;
                    short s6 = sArr2[1];
                    bArr[i7 + 1] = (byte) ((s5 >> 8) | (s6 << 3));
                    short s7 = sArr2[2];
                    bArr[i7 + 2] = (byte) ((s6 >> 5) | (s7 << 6));
                    bArr[i7 + 3] = (byte) (s7 >> 2);
                    int i11 = s7 >> 10;
                    short s8 = sArr2[c];
                    bArr[i7 + 4] = (byte) (i11 | (s8 << 1));
                    short s9 = sArr2[4];
                    bArr[i7 + 5] = (byte) ((s8 >> 7) | (s9 << 4));
                    short s10 = sArr2[5];
                    bArr[i7 + 6] = (byte) ((s9 >> 4) | (s10 << 7));
                    bArr[i7 + 7] = (byte) (s10 >> 1);
                    int i12 = s10 >> 9;
                    short s11 = sArr2[6];
                    bArr[i7 + 8] = (byte) (i12 | (s11 << 2));
                    int i13 = s11 >> 6;
                    short s12 = sArr2[7];
                    bArr[i7 + 9] = (byte) (i13 | (s12 << 5));
                    bArr[i7 + 10] = (byte) (s12 >> 3);
                    i7 += 11;
                    i9++;
                    c = c;
                }
            }
        }
        return bArr;
    }

    public void conditionalSubQ() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).conditionalSubQ();
        }
    }

    public void decompressPolyVec(byte[] bArr) {
        int i = 3;
        int i2 = 6;
        short s = 2;
        short s2 = 4;
        short s3 = 1;
        if (this.engine.getKyberPolyVecCompressedBytes() == this.kyberK * DilithiumEngine.DilithiumPolyT1PackedBytes) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.kyberK; i4++) {
                for (int i5 = 0; i5 < 64; i5++) {
                    int i6 = bArr[i3] & 255;
                    byte b = bArr[i3 + 1];
                    byte b2 = bArr[i3 + 2];
                    byte b3 = bArr[i3 + 3];
                    short[] sArr = {(short) (i6 | ((short) ((b & 255) << 8))), (short) (((b & 255) >> 2) | ((short) ((b2 & 255) << 6))), (short) (((b2 & 255) >> 4) | ((short) ((b3 & 255) << 4))), (short) (((b3 & 255) >> 6) | ((short) ((bArr[i3 + 4] & 255) << 2)))};
                    i3 += 5;
                    for (int i7 = 0; i7 < 4; i7++) {
                        this.vec[i4].setCoeffIndex((i5 * 4) + i7, (short) ((((sArr[i7] & 1023) * KyberEngine.KyberQ) + 512) >> 10));
                    }
                }
            }
            return;
        }
        if (this.engine.getKyberPolyVecCompressedBytes() != this.kyberK * 352) {
            throw new RuntimeException("Kyber PolyVecCompressedBytes neither 320 * KyberK or 352 * KyberK!");
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.kyberK; i9++) {
            int i10 = 0;
            while (i10 < 32) {
                int i11 = bArr[i8] & 255;
                byte b4 = bArr[i8 + 1];
                short s4 = (short) (i11 | (((short) (b4 & 255)) << 8));
                byte b5 = bArr[i8 + 2];
                short s5 = (short) (((b4 & 255) >> i) | (((short) (b5 & 255)) << 5));
                int i12 = ((b5 & 255) >> i2) | (((short) (bArr[i8 + 3] & 255)) << s);
                byte b6 = bArr[i8 + 4];
                int i13 = i;
                short s6 = (short) (((short) ((b6 & 255) << 10)) | i12);
                int i14 = (b6 & 255) >> s3;
                byte b7 = bArr[i8 + 5];
                int i15 = i2;
                short s7 = (short) ((((short) (b7 & 255)) << 7) | i14);
                int i16 = (b7 & 255) >> s2;
                byte b8 = bArr[i8 + 6];
                short s8 = s;
                short s9 = (short) ((((short) (b8 & 255)) << s2) | i16);
                int i17 = ((b8 & 255) >> 7) | (((short) (bArr[i8 + 7] & 255)) << s3);
                byte b9 = bArr[i8 + 8];
                short s10 = s2;
                short s11 = (short) (((short) ((b9 & 255) << 9)) | i17);
                int i18 = (b9 & 255) >> 2;
                byte b10 = bArr[i8 + 9];
                short s12 = s3;
                short s13 = (short) ((((short) (b10 & 255)) << 6) | i18);
                short s14 = (short) (((b10 & 255) >> 5) | (((short) (bArr[i8 + 10] & 255)) << 3));
                short[] sArr2 = new short[8];
                sArr2[0] = s4;
                sArr2[s12] = s5;
                sArr2[s8] = s6;
                sArr2[i13] = s7;
                sArr2[s10] = s9;
                sArr2[5] = s11;
                sArr2[i15] = s13;
                sArr2[7] = s14;
                i8 += 11;
                for (int i19 = 0; i19 < 8; i19++) {
                    this.vec[i9].setCoeffIndex((i10 * 8) + i19, (short) ((((sArr2[i19] & 2047) * KyberEngine.KyberQ) + 1024) >> 11));
                }
                i10++;
                i = i13;
                i2 = i15;
                s = s8;
                s2 = s10;
                s3 = s12;
            }
        }
    }

    public void fromBytes(byte[] bArr) {
        int i = 0;
        while (i < this.kyberK) {
            Poly vectorIndex = getVectorIndex(i);
            int i2 = i * KyberEngine.KyberPolyBytes;
            i++;
            vectorIndex.fromBytes(Arrays.copyOfRange(bArr, i2, i * KyberEngine.KyberPolyBytes));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.vec[i];
    }

    public void polyVecInverseNttToMont() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).polyInverseNttToMont();
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).polyNtt();
        }
    }

    public void reducePoly() {
        for (int i = 0; i < this.kyberK; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public byte[] toBytes() {
        byte[] bArr = new byte[this.polyVecBytes];
        for (int i = 0; i < this.kyberK; i++) {
            System.arraycopy(this.vec[i].toBytes(), 0, bArr, i * KyberEngine.KyberPolyBytes, KyberEngine.KyberPolyBytes);
        }
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < this.kyberK; i++) {
            stringBuffer.append(this.vec[i].toString());
            if (i != this.kyberK - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public PolyVec(KyberEngine kyberEngine) {
        this.engine = kyberEngine;
        this.kyberK = kyberEngine.getKyberK();
        this.polyVecBytes = kyberEngine.getKyberPolyVecBytes();
        this.vec = new Poly[this.kyberK];
        for (int i = 0; i < this.kyberK; i++) {
            this.vec[i] = new Poly(kyberEngine);
        }
    }
}
