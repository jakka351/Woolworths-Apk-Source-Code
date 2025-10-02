package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
public class Haraka256Digest extends HarakaBase {
    private final byte[] buffer;
    private int off;
    private final CryptoServicePurpose purpose;

    public Haraka256Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int haraka256256(byte[] bArr, byte[] bArr2, int i) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, 2, 16);
        System.arraycopy(bArr, 0, bArr3[0], 0, 16);
        System.arraycopy(bArr, 16, bArr3[1], 0, 16);
        byte[] bArr5 = bArr3[0];
        byte[][] bArr6 = HarakaBase.RC;
        bArr3[0] = HarakaBase.aesEnc(bArr5, bArr6[0]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[1]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], bArr6[2]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[3]);
        mix256(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], bArr6[4]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], bArr6[5]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], bArr6[6]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[7]);
        mix256(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], bArr6[8]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], bArr6[9]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], bArr6[10]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[11]);
        mix256(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], bArr6[12]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], bArr6[13]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], bArr6[14]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[15]);
        mix256(bArr3, bArr4);
        bArr3[0] = HarakaBase.aesEnc(bArr4[0], bArr6[16]);
        bArr3[1] = HarakaBase.aesEnc(bArr4[1], bArr6[17]);
        bArr3[0] = HarakaBase.aesEnc(bArr3[0], bArr6[18]);
        bArr3[1] = HarakaBase.aesEnc(bArr3[1], bArr6[19]);
        mix256(bArr3, bArr4);
        bArr3[0] = HarakaBase.xor(bArr4[0], bArr, 0);
        bArr3[1] = HarakaBase.xor(bArr4[1], bArr, 16);
        System.arraycopy(bArr3[0], 0, bArr2, i, 16);
        System.arraycopy(bArr3[1], 0, bArr2, i + 16, 16);
        return 32;
    }

    private void mix256(byte[][] bArr, byte[][] bArr2) {
        System.arraycopy(bArr[0], 0, bArr2[0], 0, 4);
        System.arraycopy(bArr[1], 0, bArr2[0], 4, 4);
        System.arraycopy(bArr[0], 4, bArr2[0], 8, 4);
        System.arraycopy(bArr[1], 4, bArr2[0], 12, 4);
        System.arraycopy(bArr[0], 8, bArr2[1], 0, 4);
        System.arraycopy(bArr[1], 8, bArr2[1], 4, 4);
        System.arraycopy(bArr[0], 12, bArr2[1], 8, 4);
        System.arraycopy(bArr[1], 12, bArr2[1], 12, 4);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        if (this.off != 32) {
            throw new IllegalStateException("input must be exactly 32 bytes");
        }
        if (bArr.length - i < 32) {
            throw new IllegalArgumentException("output too short to receive digest");
        }
        int iHaraka256256 = haraka256256(this.buffer, bArr, i);
        reset();
        return iHaraka256256;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Haraka-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        int i = this.off;
        if (i > 31) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        byte[] bArr = this.buffer;
        this.off = i + 1;
        bArr[i] = b;
    }

    public Haraka256Digest(CryptoServicePurpose cryptoServicePurpose) {
        this.purpose = cryptoServicePurpose;
        this.buffer = new byte[32];
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize() * 4, cryptoServicePurpose));
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = this.off;
        if (i3 > 32 - i2) {
            throw new IllegalArgumentException("total input cannot be more than 32 bytes");
        }
        System.arraycopy(bArr, i, this.buffer, i3, i2);
        this.off += i2;
    }

    public Haraka256Digest(Haraka256Digest haraka256Digest) {
        CryptoServicePurpose cryptoServicePurpose = haraka256Digest.purpose;
        this.purpose = cryptoServicePurpose;
        this.buffer = Arrays.clone(haraka256Digest.buffer);
        this.off = haraka256Digest.off;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize() * 4, cryptoServicePurpose));
    }
}
