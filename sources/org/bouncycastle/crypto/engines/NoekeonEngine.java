package org.bouncycastle.crypto.engines;

import kotlin.reflect.jvm.internal.impl.types.checker.a;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: classes8.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int SIZE = 16;
    private static final byte[] roundConstants = {-128, 27, 54, 108, -40, -85, 77, -102, 47, 94, PSSSigner.TRAILER_IMPLICIT, 99, -58, -105, 53, 106, -44};
    private boolean _forEncryption;
    private final int[] k = new int[4];
    private boolean _initialised = false;

    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.k;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = 16;
        while (true) {
            int i8 = iBigEndianToInt ^ iBigEndianToInt3;
            int iRotateLeft = i8 ^ (Integers.rotateLeft(i8, 8) ^ Integers.rotateLeft(i8, 24));
            int i9 = iBigEndianToInt2 ^ i4;
            int i10 = iBigEndianToInt4 ^ i6;
            int i11 = i9 ^ i10;
            int iRotateLeft2 = i11 ^ (Integers.rotateLeft(i11, 24) ^ Integers.rotateLeft(i11, 8));
            int i12 = i9 ^ iRotateLeft;
            int i13 = (iBigEndianToInt3 ^ i5) ^ iRotateLeft2;
            int i14 = i10 ^ iRotateLeft;
            int i15 = ((iBigEndianToInt ^ i3) ^ iRotateLeft2) ^ (roundConstants[i7] & 255);
            i7--;
            if (i7 < 0) {
                Pack.intToBigEndian(i15, bArr2, i2);
                Pack.intToBigEndian(i12, bArr2, i2 + 4);
                Pack.intToBigEndian(i13, bArr2, i2 + 8);
                Pack.intToBigEndian(i14, bArr2, i2 + 12);
                return 16;
            }
            int iRotateLeft3 = Integers.rotateLeft(i12, 1);
            int iRotateLeft4 = Integers.rotateLeft(i13, 5);
            int iRotateLeft5 = Integers.rotateLeft(i14, 2);
            int i16 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i17 = ~i16;
            int i18 = i15 ^ (iRotateLeft4 & i17);
            int i19 = (iRotateLeft4 ^ (i17 ^ iRotateLeft5)) ^ i18;
            int i20 = i16 ^ (i18 | i19);
            int i21 = iRotateLeft5 ^ (i19 & i20);
            iBigEndianToInt2 = Integers.rotateLeft(i20, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i19, 27);
            int iRotateLeft6 = Integers.rotateLeft(i18, 30);
            iBigEndianToInt = i21;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, i);
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i + 4);
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, i + 8);
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i + 12);
        int[] iArr = this.k;
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        while (true) {
            int i9 = iBigEndianToInt ^ (roundConstants[i3] & 255);
            int i10 = i9 ^ iBigEndianToInt3;
            int iRotateLeft = i10 ^ (Integers.rotateLeft(i10, 8) ^ Integers.rotateLeft(i10, 24));
            int i11 = iBigEndianToInt2 ^ i6;
            int i12 = iBigEndianToInt4 ^ i8;
            int i13 = i5;
            int i14 = i11 ^ i12;
            int iRotateLeft2 = i14 ^ (Integers.rotateLeft(i14, 24) ^ Integers.rotateLeft(i14, 8));
            int i15 = (i9 ^ i4) ^ iRotateLeft2;
            int i16 = i11 ^ iRotateLeft;
            int i17 = (iBigEndianToInt3 ^ i7) ^ iRotateLeft2;
            int i18 = i12 ^ iRotateLeft;
            i3++;
            if (i3 > 16) {
                Pack.intToBigEndian(i15, bArr2, i2);
                Pack.intToBigEndian(i16, bArr2, i2 + 4);
                Pack.intToBigEndian(i17, bArr2, i2 + 8);
                Pack.intToBigEndian(i18, bArr2, i2 + 12);
                return 16;
            }
            i5 = i13;
            int iRotateLeft3 = Integers.rotateLeft(i16, i5);
            int iRotateLeft4 = Integers.rotateLeft(i17, 5);
            int iRotateLeft5 = Integers.rotateLeft(i18, 2);
            int i19 = iRotateLeft3 ^ (iRotateLeft5 | iRotateLeft4);
            int i20 = ~i19;
            int i21 = i15 ^ (iRotateLeft4 & i20);
            int i22 = (iRotateLeft4 ^ (i20 ^ iRotateLeft5)) ^ i21;
            int i23 = i19 ^ (i21 | i22);
            int i24 = iRotateLeft5 ^ (i22 & i23);
            iBigEndianToInt2 = Integers.rotateLeft(i23, 31);
            iBigEndianToInt3 = Integers.rotateLeft(i22, 27);
            int iRotateLeft6 = Integers.rotateLeft(i21, 30);
            iBigEndianToInt = i24;
            iBigEndianToInt4 = iRotateLeft6;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.h("invalid parameter passed to Noekeon init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Key length not 128 bits.");
        }
        Pack.bigEndianToInt(key, 0, this.k, 0, 4);
        if (!z) {
            int[] iArr = this.k;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            int i5 = i ^ i3;
            int iRotateLeft = i5 ^ (Integers.rotateLeft(i5, 8) ^ Integers.rotateLeft(i5, 24));
            int i6 = i2 ^ i4;
            int iRotateLeft2 = (Integers.rotateLeft(i6, 8) ^ Integers.rotateLeft(i6, 24)) ^ i6;
            int i7 = i2 ^ iRotateLeft;
            int i8 = i4 ^ iRotateLeft;
            int[] iArr2 = this.k;
            iArr2[0] = i ^ iRotateLeft2;
            iArr2[1] = i7;
            iArr2[2] = i3 ^ iRotateLeft2;
            iArr2[3] = i8;
        }
        this._forEncryption = z;
        this._initialised = true;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i > bArr.length - 16) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 <= bArr2.length - 16) {
            return this._forEncryption ? encryptBlock(bArr, i, bArr2, i2) : decryptBlock(bArr, i, bArr2, i2);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
