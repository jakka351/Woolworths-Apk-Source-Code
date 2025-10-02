package org.bouncycastle.pqc.jcajce.provider;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;

/* loaded from: classes8.dex */
public class Kyber {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.kyber.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.kyber512;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber512", aSN1ObjectIdentifier, new KyberKeyFactorySpi.Kyber512());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.kyber768;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber768", aSN1ObjectIdentifier2, new KyberKeyFactorySpi.Kyber768());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.kyber1024;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber1024", aSN1ObjectIdentifier3, new KyberKeyFactorySpi.Kyber1024());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.kyber512_aes;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER512-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber512_AES", aSN1ObjectIdentifier4, new KyberKeyFactorySpi.Kyber512_AES());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.kyber768_aes;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER768-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber768_AES", aSN1ObjectIdentifier5, new KyberKeyFactorySpi.Kyber768_AES());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.kyber1024_aes;
            addKeyFactoryAlgorithm(configurableProvider, "KYBER1024-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi$Kyber1024_AES", aSN1ObjectIdentifier6, new KyberKeyFactorySpi.Kyber1024_AES());
            configurableProvider.addAlgorithm("KeyPairGenerator.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi");
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber512", aSN1ObjectIdentifier);
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber768", aSN1ObjectIdentifier2);
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber1024", aSN1ObjectIdentifier3);
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER512-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber512_AES", aSN1ObjectIdentifier4);
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER768-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber768_AES", aSN1ObjectIdentifier5);
            addKeyPairGeneratorAlgorithm(configurableProvider, "KYBER1024-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyPairGeneratorSpi$Kyber1024_AES", aSN1ObjectIdentifier6);
            configurableProvider.addAlgorithm("KeyGenerator.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi");
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber512", aSN1ObjectIdentifier);
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber768", aSN1ObjectIdentifier2);
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber1024", aSN1ObjectIdentifier3);
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER512-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber512_AES", aSN1ObjectIdentifier4);
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER768-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber768_AES", aSN1ObjectIdentifier5);
            addKeyGeneratorAlgorithm(configurableProvider, "KYBER1024-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyGeneratorSpi$Kyber1024_AES", aSN1ObjectIdentifier6);
            KyberKeyFactorySpi kyberKeyFactorySpi = new KyberKeyFactorySpi();
            StringBuilder sbR = c.r(configurableProvider, "Cipher.KYBER", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.pqc_kem_kyber;
            c.y(sbR, aSN1ObjectIdentifier7, configurableProvider, "KYBER");
            addCipherAlgorithm(configurableProvider, "KYBER512", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber512", aSN1ObjectIdentifier);
            addCipherAlgorithm(configurableProvider, "KYBER768", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber768", aSN1ObjectIdentifier2);
            addCipherAlgorithm(configurableProvider, "KYBER1024", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber1024", aSN1ObjectIdentifier3);
            addCipherAlgorithm(configurableProvider, "KYBER512-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber512_AES", aSN1ObjectIdentifier4);
            addCipherAlgorithm(configurableProvider, "KYBER768-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber768_AES", aSN1ObjectIdentifier5);
            addCipherAlgorithm(configurableProvider, "KYBER1024-AES", "org.bouncycastle.pqc.jcajce.provider.kyber.KyberCipherSpi$Kyber1024_AES", aSN1ObjectIdentifier6);
            registerOid(configurableProvider, aSN1ObjectIdentifier7, "KYBER", kyberKeyFactorySpi);
        }
    }
}
