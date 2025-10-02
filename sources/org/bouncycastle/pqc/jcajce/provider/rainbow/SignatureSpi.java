package org.bouncycastle.pqc.jcajce.provider.rainbow;

import YU.a;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowSigner;
import org.bouncycastle.util.Strings;

/* loaded from: classes8.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private RainbowParameters parameters;
    private SecureRandom random;
    private RainbowSigner signer;

    public static class Base extends SignatureSpi {
        public Base() {
            super(new RainbowSigner());
        }
    }

    public static class RainbowIIIcircum extends SignatureSpi {
        public RainbowIIIcircum() {
            super(new RainbowSigner(), RainbowParameters.rainbowIIIcircumzenithal);
        }
    }

    public static class RainbowIIIclassic extends SignatureSpi {
        public RainbowIIIclassic() {
            super(new RainbowSigner(), RainbowParameters.rainbowIIIclassic);
        }
    }

    public static class RainbowIIIcomp extends SignatureSpi {
        public RainbowIIIcomp() {
            super(new RainbowSigner(), RainbowParameters.rainbowIIIcompressed);
        }
    }

    public static class RainbowVcircum extends SignatureSpi {
        public RainbowVcircum() {
            super(new RainbowSigner(), RainbowParameters.rainbowVcircumzenithal);
        }
    }

    public static class RainbowVclassic extends SignatureSpi {
        public RainbowVclassic() {
            super(new RainbowSigner(), RainbowParameters.rainbowVclassic);
        }
    }

    public static class RainbowVcomp extends SignatureSpi {
        public RainbowVcomp() {
            super(new RainbowSigner(), RainbowParameters.rainbowVcompressed);
        }
    }

    public SignatureSpi(RainbowSigner rainbowSigner) {
        super("RAINBOW");
        this.bOut = new ByteArrayOutputStream();
        this.signer = rainbowSigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCRainbowPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to Rainbow");
        }
        BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) privateKey;
        RainbowPrivateKeyParameters keyParams = bCRainbowPrivateKey.getKeyParams();
        RainbowParameters rainbowParameters = this.parameters;
        if (rainbowParameters != null) {
            String upperCase = Strings.toUpperCase(rainbowParameters.getName());
            if (!upperCase.equals(bCRainbowPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            this.signer.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            this.signer.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCRainbowPublicKey)) {
            try {
                publicKey = new BCRainbowPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(a.f(e, new StringBuilder("unknown public key passed to Rainbow: ")), e);
            }
        }
        BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) publicKey;
        RainbowParameters rainbowParameters = this.parameters;
        if (rainbowParameters != null) {
            String upperCase = Strings.toUpperCase(rainbowParameters.getName());
            if (!upperCase.equals(bCRainbowPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCRainbowPublicKey.getKeyParams());
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.bOut.write(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
    }

    public SignatureSpi(RainbowSigner rainbowSigner, RainbowParameters rainbowParameters) {
        super(Strings.toUpperCase(rainbowParameters.getName()));
        this.parameters = rainbowParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = rainbowSigner;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.bOut.write(bArr, i, i2);
    }
}
