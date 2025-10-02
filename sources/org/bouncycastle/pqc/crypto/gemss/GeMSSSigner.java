package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;

/* loaded from: classes8.dex */
public class GeMSSSigner implements MessageSigner {
    private GeMSSPrivateKeyParameters privKey;
    private GeMSSPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        GeMSSEngine engine = this.privKey.getParameters().getEngine();
        int i = engine.HFEnv;
        int i2 = ((((i - engine.HFEm) * (engine.NB_ITE - 1)) + i) + 7) >>> 3;
        byte[] bArr2 = new byte[bArr.length + i2];
        System.arraycopy(bArr, 0, bArr2, i2, bArr.length);
        engine.signHFE_FeistelPatarin(this.random, bArr2, bArr, 0, bArr.length, this.privKey.sk);
        return bArr2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!z) {
            this.pubKey = (GeMSSPublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.privKey = (GeMSSPrivateKeyParameters) cipherParameters;
            this.random = CryptoServicesRegistrar.getSecureRandom();
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (GeMSSPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return this.pubKey.getParameters().getEngine().crypto_sign_open(this.pubKey.getPK(), bArr, bArr2) != 0;
    }
}
