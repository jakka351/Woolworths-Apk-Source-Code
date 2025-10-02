package org.bouncycastle.pqc.jcajce.provider;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* loaded from: classes8.dex */
public class SPHINCSPlus {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.sphincsplus.";

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SPHINCS+", "SPHINCSPLUS");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SPHINCS+", "SPHINCSPLUS");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.sphincsPlus;
            addSignatureAlgorithm(configurableProvider, "SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SignatureSpi$Direct", aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier6);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier18);
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
            addSignatureAlias(configurableProvider, "SPHINCSPLUS", aSN1ObjectIdentifier19);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SPHINCS+", "SPHINCSPLUS");
            SPHINCSPlusKeyFactorySpi sPHINCSPlusKeyFactorySpi = new SPHINCSPlusKeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier6, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier7, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier8, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier9, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier10, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier11, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier12, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier13, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier14, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier15, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier16, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier17, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier18, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier19, "SPHINCSPLUS", sPHINCSPlusKeyFactorySpi);
        }
    }
}
