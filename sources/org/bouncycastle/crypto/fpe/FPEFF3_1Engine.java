package org.bouncycastle.crypto.fpe;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.FPEParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes8.dex */
public class FPEFF3_1Engine extends FPEEngine {
    public FPEFF3_1Engine() {
        this(AESEngine.newInstance());
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int decryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] bArrDecryptFF3_1;
        if (this.fpeParameters.getRadix() > 256) {
            bArrDecryptFF3_1 = FPEEngine.toByteArray(SP80038G.decryptFF3_1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            bArrDecryptFF3_1 = SP80038G.decryptFF3_1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(bArrDecryptFF3_1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public int encryptBlock(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        byte[] bArrEncryptFF3_1;
        if (this.fpeParameters.getRadix() > 256) {
            bArrEncryptFF3_1 = FPEEngine.toByteArray(SP80038G.encryptFF3_1w(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), FPEEngine.toShortArray(bArr), i, i2 / 2));
            i4 = i2;
        } else {
            i4 = i2;
            bArrEncryptFF3_1 = SP80038G.encryptFF3_1(this.baseCipher, this.fpeParameters.getRadixConverter(), this.fpeParameters.getTweak(), bArr, i, i4);
        }
        System.arraycopy(bArrEncryptFF3_1, 0, bArr2, i3, i4);
        return i4;
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public String getAlgorithmName() {
        return "FF3-1";
    }

    @Override // org.bouncycastle.crypto.fpe.FPEEngine
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        this.forEncryption = z;
        this.fpeParameters = (FPEParameters) cipherParameters;
        this.baseCipher.init(!r3.isUsingInverseFunction(), this.fpeParameters.getKey().reverse());
        if (this.fpeParameters.getTweak().length != 7) {
            throw new IllegalArgumentException("tweak should be 56 bits");
        }
    }

    public FPEFF3_1Engine(BlockCipher blockCipher) {
        super(blockCipher);
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("base cipher needs to be 128 bits");
        }
        if (Properties.isOverrideSet("org.bouncycastle.fpe.disable")) {
            throw new UnsupportedOperationException("FPE disabled");
        }
    }
}
