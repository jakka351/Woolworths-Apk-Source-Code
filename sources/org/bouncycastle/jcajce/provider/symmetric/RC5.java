package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.RC532Engine;
import org.bouncycastle.crypto.engines.RC564Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes2.dex */
public final class RC5 {

    /* loaded from: classes8.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() throws InvalidParameterSpecException {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("RC5");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    /* loaded from: classes8.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "RC5 IV";
        }
    }

    /* loaded from: classes8.dex */
    public static class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super(new CBCBlockCipher(new RC532Engine()), 64);
        }
    }

    /* loaded from: classes8.dex */
    public static class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new CFBBlockCipherMac(new RC532Engine()));
        }
    }

    /* loaded from: classes8.dex */
    public static class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super(new RC532Engine());
        }
    }

    /* loaded from: classes8.dex */
    public static class ECB64 extends BaseBlockCipher {
        public ECB64() {
            super(new RC564Engine());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class Mac32 extends BaseMac {
        public Mac32() {
            super(new CBCBlockCipherMac(new RC532Engine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.h(sb, str, "$ECB32", configurableProvider, "Cipher.RC5");
            configurableProvider.addAlgorithm("KeyGenerator.RC5", a.a("Cipher.RC5-64", a.a("Alg.Alias.Cipher.RC5-32", "RC5", str, "$ECB64", configurableProvider), str, "$KeyGen32", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            a.h(a.b(a.b(a.b(new StringBuilder(), str, "$KeyGen64", configurableProvider, "KeyGenerator.RC5-64"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.RC5"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.RC5-64"), str, "$Mac32", configurableProvider, "Mac.RC5MAC");
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", a.a("Alg.Alias.Mac.RC5", "RC5MAC", str, "$CFB8Mac32", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    private RC5() {
    }
}
