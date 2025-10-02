package org.bouncycastle.pqc.jcajce.provider.kyber;

import YU.a;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

/* loaded from: classes8.dex */
class KyberCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private KyberKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private KyberParameters kyberParameters;
    private BCKyberPrivateKey unwrapKey;
    private BCKyberPublicKey wrapKey;

    public static class Base extends KyberCipherSpi {
        public Base() throws NoSuchAlgorithmException {
            super("KYBER");
        }
    }

    public static class Kyber1024 extends KyberCipherSpi {
        public Kyber1024() {
            super(KyberParameters.kyber1024);
        }
    }

    public static class Kyber1024_AES extends KyberCipherSpi {
        public Kyber1024_AES() {
            super(KyberParameters.kyber1024_aes);
        }
    }

    public static class Kyber512 extends KyberCipherSpi {
        public Kyber512() {
            super(KyberParameters.kyber512);
        }
    }

    public static class Kyber512_AES extends KyberCipherSpi {
        public Kyber512_AES() {
            super(KyberParameters.kyber512_aes);
        }
    }

    public static class Kyber768 extends KyberCipherSpi {
        public Kyber768() {
            super(KyberParameters.kyber768);
        }
    }

    public static class Kyber768_AES extends KyberCipherSpi {
        public Kyber768_AES() {
            super(KyberParameters.kyber768_aes);
        }
    }

    public KyberCipherSpi(String str) {
        this.algorithmName = str;
        this.kyberParameters = null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e) {
                throw Exceptions.illegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(a.A("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(a.h("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i != 3) {
            throw new InvalidKeyException("only SECRET_KEY supported");
        }
        try {
            KyberKEMExtractor kyberKEMExtractor = new KyberKEMExtractor(this.unwrapKey.getKeyParams());
            byte[] bArrExtractSecret = kyberKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, kyberKEMExtractor.getEncapsulationLength()));
            Wrapper keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArrExtractSecret);
            Arrays.clear(bArrExtractSecret);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, kyberKEMExtractor.getEncapsulationLength(), bArr.length);
            return new SecretKeySpec(keyUnwrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
        } catch (IllegalArgumentException e) {
            throw new NoSuchAlgorithmException(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.l(e, new StringBuilder("unable to extract KTS secret: ")));
        } catch (InvalidCipherTextException e2) {
            throw new InvalidKeyException("unable to extract KTS secret: " + e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) throws DestroyFailedException, IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
            Wrapper keyWrapper = WrapUtil.getKeyWrapper(this.kemParameterSpec, secretWithEncapsulationGenerateEncapsulated.getSecret());
            byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
            secretWithEncapsulationGenerateEncapsulated.destroy();
            byte[] encoded = key.getEncoded();
            byte[] bArrConcatenate = Arrays.concatenate(encapsulation, keyWrapper.wrap(encoded, 0, encoded.length));
            Arrays.clear(encoded);
            return bArrConcatenate;
        } catch (IllegalArgumentException e) {
            throw new IllegalBlockSizeException(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.l(e, new StringBuilder("unable to generate KTS secret: ")));
        } catch (DestroyFailedException e2) {
            throw new IllegalBlockSizeException("unable to destroy interim values: " + e2.getMessage());
        }
    }

    public KyberCipherSpi(KyberParameters kyberParameters) {
        this.kyberParameters = kyberParameters;
        this.algorithmName = Strings.toUpperCase(kyberParameters.getName());
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw Exceptions.illegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(a.o(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i == 3) {
            if (!(key instanceof BCKyberPublicKey)) {
                throw new InvalidKeyException(a.o(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCKyberPublicKey) key;
            this.kemGen = new KyberKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else {
            if (i != 4) {
                throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
            }
            if (!(key instanceof BCKyberPrivateKey)) {
                throw new InvalidKeyException(a.o(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCKyberPrivateKey) key;
        }
        KyberParameters kyberParameters = this.kyberParameters;
        if (kyberParameters != null) {
            String upperCase = Strings.toUpperCase(kyberParameters.getName());
            if (!upperCase.equals(key.getAlgorithm())) {
                throw new InvalidKeyException("cipher locked to ".concat(upperCase));
            }
        }
    }
}
