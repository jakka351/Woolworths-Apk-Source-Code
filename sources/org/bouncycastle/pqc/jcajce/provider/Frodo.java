package org.bouncycastle.pqc.jcajce.provider;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyFactorySpi;

/* loaded from: classes8.dex */
public class Frodo {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.frodo.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyGeneratorSpi");
            FrodoKeyFactorySpi frodoKeyFactorySpi = new FrodoKeyFactorySpi();
            StringBuilder sbR = c.r(configurableProvider, "Cipher.FRODO", "org.bouncycastle.pqc.jcajce.provider.frodo.FrodoCipherSpi$Base", "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_frodo;
            c.y(sbR, aSN1ObjectIdentifier, configurableProvider, "FRODO");
            registerOid(configurableProvider, aSN1ObjectIdentifier, "Frodo", frodoKeyFactorySpi);
        }
    }
}
