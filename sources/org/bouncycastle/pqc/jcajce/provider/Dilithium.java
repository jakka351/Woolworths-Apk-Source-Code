package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;

/* loaded from: classes8.dex */
public class Dilithium {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.dilithium.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.dilithium2;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base2", aSN1ObjectIdentifier, new DilithiumKeyFactorySpi.Base2());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.dilithium3;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base3", aSN1ObjectIdentifier2, new DilithiumKeyFactorySpi.Base3());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.dilithium5;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base5", aSN1ObjectIdentifier3, new DilithiumKeyFactorySpi.Base5());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.dilithium2_aes;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM2-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base2_AES", aSN1ObjectIdentifier4, new DilithiumKeyFactorySpi.Base2());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.dilithium3_aes;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM3-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base3_AES", aSN1ObjectIdentifier5, new DilithiumKeyFactorySpi.Base3());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.dilithium5_aes;
            addKeyFactoryAlgorithm(configurableProvider, "DILITHIUM5-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi$Base5_AES", aSN1ObjectIdentifier6, new DilithiumKeyFactorySpi.Base5());
            configurableProvider.addAlgorithm("KeyPairGenerator.DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base2", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base3", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base5", aSN1ObjectIdentifier3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM2-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base2_AES", aSN1ObjectIdentifier4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM3-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base3_AES", aSN1ObjectIdentifier5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "DILITHIUM5-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyPairGeneratorSpi$Base5_AES", aSN1ObjectIdentifier6);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base", BCObjectIdentifiers.dilithium);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM2", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base2", aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM3", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base3", aSN1ObjectIdentifier2);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM5", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base5", aSN1ObjectIdentifier3);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM2-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base2_AES", aSN1ObjectIdentifier4);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM3-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base3_AES", aSN1ObjectIdentifier5);
            addSignatureAlgorithm(configurableProvider, "DILITHIUM5-AES", "org.bouncycastle.pqc.jcajce.provider.dilithium.SignatureSpi$Base5_AES", aSN1ObjectIdentifier6);
        }
    }
}
