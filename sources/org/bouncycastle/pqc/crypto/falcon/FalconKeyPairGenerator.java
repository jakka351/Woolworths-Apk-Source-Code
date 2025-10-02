package org.bouncycastle.pqc.crypto.falcon;

import androidx.constraintlayout.core.state.a;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes8.dex */
public class FalconKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private int logn;
    private FalconNIST nist;
    private int noncelen;
    private FalconKeyGenerationParameters params;
    private int pk_size;
    private SecureRandom random;
    private int sk_size;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        byte[][] bArrCrypto_sign_keypair = this.nist.crypto_sign_keypair(new byte[this.pk_size], 0, new byte[this.sk_size], 0);
        FalconParameters parameters = this.params.getParameters();
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new FalconPublicKeyParameters(parameters, bArrCrypto_sign_keypair[0]), (AsymmetricKeyParameter) new FalconPrivateKeyParameters(parameters, bArrCrypto_sign_keypair[1], bArrCrypto_sign_keypair[2], bArrCrypto_sign_keypair[3], bArrCrypto_sign_keypair[0]));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (FalconKeyGenerationParameters) keyGenerationParameters;
        this.random = keyGenerationParameters.getRandom();
        FalconKeyGenerationParameters falconKeyGenerationParameters = (FalconKeyGenerationParameters) keyGenerationParameters;
        this.logn = falconKeyGenerationParameters.getParameters().getLogN();
        int nonceLength = falconKeyGenerationParameters.getParameters().getNonceLength();
        this.noncelen = nonceLength;
        this.nist = new FalconNIST(this.logn, nonceLength, this.random);
        int i = 1 << this.logn;
        int i2 = i == 1024 ? 5 : (i == 256 || i == 512) ? 6 : (i == 64 || i == 128) ? 7 : 8;
        this.pk_size = a.a(i, 14, 8, 1);
        this.sk_size = (((i2 * 2) * i) / 8) + 1 + i;
    }
}
