package org.bouncycastle.pqc.jcajce.provider;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;

/* loaded from: classes8.dex */
public class CMCE {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.cmce.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyGeneratorSpi");
            CMCEKeyFactorySpi cMCEKeyFactorySpi = new CMCEKeyFactorySpi();
            StringBuilder sbR = c.r(configurableProvider, "Cipher.CMCE", "org.bouncycastle.pqc.jcajce.provider.cmce.CMCECipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_mceliece;
            c.y(sbR, aSN1ObjectIdentifier, configurableProvider, "CMCE");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "CMCE", cMCEKeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, "CMCE");
        }
    }
}
