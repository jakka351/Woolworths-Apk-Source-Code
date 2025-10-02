package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi;

/* loaded from: classes8.dex */
public class SPHINCSPlus {
    private static final String PREFIX = "org.bouncycastle.pqc.jcajce.provider.sphincsplus.";

    /* loaded from: classes.dex */
    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("KeyFactory.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SPHINCSPlusKeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.SPHINCS+", "SPHINCSPLUS");
            configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.SPHINCS+", "SPHINCSPLUS");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.sphincsPlus;
            addSignatureAlgorithm(configurableProvider, "SPHINCSPLUS", "org.bouncycastle.pqc.jcajce.provider.sphincsplus.SignatureSpi$Direct", aSN1ObjectIdentifier);
            StringBuilder sb = new StringBuilder("Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
            StringBuilder sbF = a.f(aSN1ObjectIdentifier2, sb, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
            StringBuilder sbF2 = a.f(aSN1ObjectIdentifier3, sbF, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
            StringBuilder sbF3 = a.f(aSN1ObjectIdentifier4, sbF2, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
            StringBuilder sbF4 = a.f(aSN1ObjectIdentifier5, sbF3, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
            StringBuilder sbF5 = a.f(aSN1ObjectIdentifier6, sbF4, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
            StringBuilder sbF6 = a.f(aSN1ObjectIdentifier7, sbF5, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
            StringBuilder sbF7 = a.f(aSN1ObjectIdentifier8, sbF6, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
            StringBuilder sbF8 = a.f(aSN1ObjectIdentifier9, sbF7, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
            StringBuilder sbF9 = a.f(aSN1ObjectIdentifier10, sbF8, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
            StringBuilder sbF10 = a.f(aSN1ObjectIdentifier11, sbF9, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
            StringBuilder sbF11 = a.f(aSN1ObjectIdentifier12, sbF10, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
            StringBuilder sbF12 = a.f(aSN1ObjectIdentifier13, sbF11, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
            StringBuilder sbF13 = a.f(aSN1ObjectIdentifier14, sbF12, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
            StringBuilder sbF14 = a.f(aSN1ObjectIdentifier15, sbF13, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
            StringBuilder sbF15 = a.f(aSN1ObjectIdentifier16, sbF14, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
            StringBuilder sbF16 = a.f(aSN1ObjectIdentifier17, sbF15, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
            StringBuilder sbF17 = a.f(aSN1ObjectIdentifier18, sbF16, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
            StringBuilder sbF18 = a.f(aSN1ObjectIdentifier18, a.f(aSN1ObjectIdentifier17, a.f(aSN1ObjectIdentifier16, a.f(aSN1ObjectIdentifier15, a.f(aSN1ObjectIdentifier14, a.f(aSN1ObjectIdentifier13, a.f(aSN1ObjectIdentifier12, a.f(aSN1ObjectIdentifier11, a.f(aSN1ObjectIdentifier10, a.f(aSN1ObjectIdentifier9, a.f(aSN1ObjectIdentifier8, a.f(aSN1ObjectIdentifier7, a.f(aSN1ObjectIdentifier6, a.f(aSN1ObjectIdentifier5, a.f(aSN1ObjectIdentifier4, a.f(aSN1ObjectIdentifier3, a.f(aSN1ObjectIdentifier2, a.f(aSN1ObjectIdentifier19, sbF17, configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID."), configurableProvider, "SPHINCSPLUS", "Alg.Alias.Signature.OID.");
            sbF18.append(aSN1ObjectIdentifier19.getId());
            configurableProvider.addAlgorithm(sbF18.toString(), "SPHINCSPLUS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.SPHINCS+", "SPHINCSPLUS");
            SPHINCSPlusKeyFactorySpi sPHINCSPlusKeyFactorySpi = new SPHINCSPlusKeyFactorySpi();
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
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, "SPHINCSPLUS");
        }
    }
}
