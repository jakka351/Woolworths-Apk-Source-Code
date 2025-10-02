package org.bouncycastle.crypto.digests;

import YU.a;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return McElieceCCA2KeyGenParameterSpec.SHA1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.X[i2], bArr, (i2 * 4) + 40);
        }
        bArr[i + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iB = this.H1;
        int iB2 = this.H2;
        int i3 = this.H3;
        int i4 = this.H4;
        int i5 = this.H5;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int iB3 = a.b(((iB << 5) | (iB >>> 27)) + f(iB2, i3, i4), this.X[i6], Y1, i5);
            int i8 = (iB2 >>> 2) | (iB2 << 30);
            int iB4 = a.b(((iB3 << 5) | (iB3 >>> 27)) + f(iB, i8, i3), this.X[i6 + 1], Y1, i4);
            int i9 = (iB >>> 2) | (iB << 30);
            int iB5 = a.b(((iB4 << 5) | (iB4 >>> 27)) + f(iB3, i9, i8), this.X[i6 + 2], Y1, i3);
            i5 = (iB3 >>> 2) | (iB3 << 30);
            int i10 = i6 + 4;
            iB2 = a.b(((iB5 << 5) | (iB5 >>> 27)) + f(iB4, i5, i9), this.X[i6 + 3], Y1, i8);
            i4 = (iB4 >>> 2) | (iB4 << 30);
            i6 += 5;
            iB = a.b(((iB2 << 5) | (iB2 >>> 27)) + f(iB5, i4, i5), this.X[i10], Y1, i9);
            i3 = (iB5 >>> 2) | (iB5 << 30);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int iB6 = a.b(((iB << 5) | (iB >>> 27)) + h(iB2, i3, i4), this.X[i6], Y2, i5);
            int i12 = (iB2 >>> 2) | (iB2 << 30);
            int iB7 = a.b(((iB6 << 5) | (iB6 >>> 27)) + h(iB, i12, i3), this.X[i6 + 1], Y2, i4);
            int i13 = (iB >>> 2) | (iB << 30);
            int iB8 = a.b(((iB7 << 5) | (iB7 >>> 27)) + h(iB6, i13, i12), this.X[i6 + 2], Y2, i3);
            i5 = (iB6 >>> 2) | (iB6 << 30);
            int i14 = i6 + 4;
            iB2 = a.b(((iB8 << 5) | (iB8 >>> 27)) + h(iB7, i5, i13), this.X[i6 + 3], Y2, i12);
            i4 = (iB7 >>> 2) | (iB7 << 30);
            i6 += 5;
            iB = a.b(((iB2 << 5) | (iB2 >>> 27)) + h(iB8, i4, i5), this.X[i14], Y2, i13);
            i3 = (iB8 >>> 2) | (iB8 << 30);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int iB9 = a.b(((iB << 5) | (iB >>> 27)) + g(iB2, i3, i4), this.X[i6], Y3, i5);
            int i16 = (iB2 >>> 2) | (iB2 << 30);
            int iB10 = a.b(((iB9 << 5) | (iB9 >>> 27)) + g(iB, i16, i3), this.X[i6 + 1], Y3, i4);
            int i17 = (iB >>> 2) | (iB << 30);
            int iB11 = a.b(((iB10 << 5) | (iB10 >>> 27)) + g(iB9, i17, i16), this.X[i6 + 2], Y3, i3);
            i5 = (iB9 >>> 2) | (iB9 << 30);
            int i18 = i6 + 4;
            iB2 = a.b(((iB11 << 5) | (iB11 >>> 27)) + g(iB10, i5, i17), this.X[i6 + 3], Y3, i16);
            i4 = (iB10 >>> 2) | (iB10 << 30);
            i6 += 5;
            iB = a.b(((iB2 << 5) | (iB2 >>> 27)) + g(iB11, i4, i5), this.X[i18], Y3, i17);
            i3 = (iB11 >>> 2) | (iB11 << 30);
        }
        for (int i19 = 0; i19 <= 3; i19++) {
            int iB12 = a.b(((iB << 5) | (iB >>> 27)) + h(iB2, i3, i4), this.X[i6], Y4, i5);
            int i20 = (iB2 >>> 2) | (iB2 << 30);
            int iB13 = a.b(((iB12 << 5) | (iB12 >>> 27)) + h(iB, i20, i3), this.X[i6 + 1], Y4, i4);
            int i21 = (iB >>> 2) | (iB << 30);
            int iB14 = a.b(((iB13 << 5) | (iB13 >>> 27)) + h(iB12, i21, i20), this.X[i6 + 2], Y4, i3);
            i5 = (iB12 >>> 2) | (iB12 << 30);
            int i22 = i6 + 4;
            iB2 = a.b(((iB14 << 5) | (iB14 >>> 27)) + h(iB13, i5, i21), this.X[i6 + 3], Y4, i20);
            i4 = (iB13 >>> 2) | (iB13 << 30);
            i6 += 5;
            iB = a.b(((iB2 << 5) | (iB2 >>> 27)) + h(iB14, i4, i5), this.X[i22], Y4, i21);
            i3 = (iB14 >>> 2) | (iB14 << 30);
        }
        this.H1 += iB;
        this.H2 += iB2;
        this.H3 += i3;
        this.H4 += i4;
        this.H5 += i5;
        this.xOff = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.X[i23] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }
}
