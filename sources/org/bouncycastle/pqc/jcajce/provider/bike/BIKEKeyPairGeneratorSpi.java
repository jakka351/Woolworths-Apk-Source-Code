package org.bouncycastle.pqc.jcajce.provider.bike;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.crypto.bike.BIKEKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEKeyPairGenerator;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.BIKEParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: classes8.dex */
public class BIKEKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    BIKEKeyPairGenerator engine;
    boolean initialised;
    BIKEKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap map = new HashMap();
        parameters = map;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        map.put("bike128", bIKEParameters);
        Map map2 = parameters;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        map2.put("bike192", bIKEParameters2);
        Map map3 = parameters;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        map3.put("bike256", bIKEParameters3);
        parameters.put(BIKEParameterSpec.bike128.getName(), bIKEParameters);
        parameters.put(BIKEParameterSpec.bike192.getName(), bIKEParameters2);
        parameters.put(BIKEParameterSpec.bike256.getName(), bIKEParameters3);
    }

    public BIKEKeyPairGeneratorSpi() {
        super("BIKE");
        this.engine = new BIKEKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof BIKEParameterSpec ? ((BIKEParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            BIKEKeyGenerationParameters bIKEKeyGenerationParameters = new BIKEKeyGenerationParameters(this.random, BIKEParameters.bike128);
            this.param = bIKEKeyGenerationParameters;
            this.engine.init(bIKEKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCBIKEPublicKey((BIKEPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCBIKEPrivateKey((BIKEPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException("invalid ParameterSpec: " + algorithmParameterSpec);
        }
        BIKEKeyGenerationParameters bIKEKeyGenerationParameters = new BIKEKeyGenerationParameters(secureRandom, (BIKEParameters) parameters.get(nameFromParams));
        this.param = bIKEKeyGenerationParameters;
        this.engine.init(bIKEKeyGenerationParameters);
        this.initialised = true;
    }
}
