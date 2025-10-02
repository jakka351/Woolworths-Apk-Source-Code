package org.bouncycastle.pqc.math.ntru;

import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;

/* loaded from: classes8.dex */
public class HPS4096Polynomial extends HPSPolynomial {
    public HPS4096Polynomial(NTRUHPSParameterSet nTRUHPSParameterSet) {
        super(nTRUHPSParameterSet);
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public void sqFromBytes(byte[] bArr) {
        for (int i = 0; i < this.params.packDegree() / 2; i++) {
            short[] sArr = this.coeffs;
            int i2 = i * 2;
            int i3 = i * 3;
            int i4 = bArr[i3] & 255;
            byte b = bArr[i3 + 1];
            sArr[i2] = (short) (i4 | ((((short) (b & 255)) & 15) << 8));
            sArr[i2 + 1] = (short) (((((short) (bArr[i3 + 2] & 255)) & 255) << 4) | ((b & 255) >>> 4));
        }
        this.coeffs[this.params.n() - 1] = 0;
    }

    @Override // org.bouncycastle.pqc.math.ntru.HPSPolynomial, org.bouncycastle.pqc.math.ntru.Polynomial
    public byte[] sqToBytes(int i) {
        byte[] bArr = new byte[i];
        int iQ = this.params.q();
        for (int i2 = 0; i2 < this.params.packDegree() / 2; i2++) {
            int i3 = i2 * 3;
            int i4 = i2 * 2;
            bArr[i3] = (byte) (Polynomial.modQ(this.coeffs[i4] & HPKE.aead_EXPORT_ONLY, iQ) & 255);
            int iModQ = Polynomial.modQ(this.coeffs[i4] & HPKE.aead_EXPORT_ONLY, iQ) >>> 8;
            int i5 = i4 + 1;
            bArr[i3 + 1] = (byte) (iModQ | ((Polynomial.modQ(this.coeffs[i5] & HPKE.aead_EXPORT_ONLY, iQ) & 15) << 4));
            bArr[i3 + 2] = (byte) (Polynomial.modQ(this.coeffs[i5] & HPKE.aead_EXPORT_ONLY, iQ) >>> 4);
        }
        return bArr;
    }
}
