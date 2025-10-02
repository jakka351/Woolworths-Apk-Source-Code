package org.bouncycastle.pqc.jcajce.provider;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.ntru.NTRUKeyFactorySpi;

/* loaded from: classes8.dex */
public class NTRUPrime {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.ntruprime.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeKeyGeneratorSpi");
            NTRUKeyFactorySpi nTRUKeyFactorySpi = new NTRUKeyFactorySpi();
            c.y(c.r(configurableProvider, "Cipher.NTRULPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.NTRULPRimeCipherSpi$Base", "Alg.Alias.Cipher."), BCObjectIdentifiers.pqc_kem_ntrulprime, configurableProvider, "NTRU");
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr653, "NTRULPRIME", nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr761, "NTRULPRIME", nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr857, "NTRULPRIME", nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr953, "NTRULPRIME", nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr1013, "NTRULPRIME", nTRUKeyFactorySpi);
            registerOid(configurableProvider, BCObjectIdentifiers.ntrulpr1277, "NTRULPRIME", nTRUKeyFactorySpi);
            configurableProvider.addAlgorithm("KeyFactory.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyGenerator.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeKeyGeneratorSpi");
            NTRUKeyFactorySpi nTRUKeyFactorySpi2 = new NTRUKeyFactorySpi();
            c.y(c.r(configurableProvider, "Cipher.SNTRUPRIME", "org.bouncycastle.pqc.jcajce.provider.ntruprime.SNTRUPrimeCipherSpi$Base", "Alg.Alias.Cipher."), BCObjectIdentifiers.pqc_kem_sntruprime, configurableProvider, "NTRU");
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup653, "SNTRUPRIME", nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup761, "SNTRUPRIME", nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup857, "SNTRUPRIME", nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup953, "SNTRUPRIME", nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup1013, "SNTRUPRIME", nTRUKeyFactorySpi2);
            registerOid(configurableProvider, BCObjectIdentifiers.sntrup1277, "SNTRUPRIME", nTRUKeyFactorySpi2);
        }
    }
}
