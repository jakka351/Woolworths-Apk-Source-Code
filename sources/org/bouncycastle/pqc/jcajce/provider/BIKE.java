package org.bouncycastle.pqc.jcajce.provider;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;

/* loaded from: classes8.dex */
public class BIKE {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.bike.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyGeneratorSpi");
            BIKEKeyFactorySpi bIKEKeyFactorySpi = new BIKEKeyFactorySpi();
            StringBuilder sbR = c.r(configurableProvider, "Cipher.BIKE", "org.bouncycastle.pqc.jcajce.provider.bike.BIKECipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_bike;
            c.y(sbR, aSN1ObjectIdentifier, configurableProvider, "BIKE");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "BIKE", bIKEKeyFactorySpi);
        }
    }
}
