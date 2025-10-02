package org.bouncycastle.jcajce.provider.asymmetric;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* loaded from: classes.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    public static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.getPrivateKey().getOctets());
            PrivateKey[] privateKeyArr = new PrivateKey[aSN1Sequence.size()];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                PrivateKeyInfo privateKeyInfo2 = PrivateKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
                privateKeyArr[i] = this.provider.getKeyInfoConverter(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm()).generatePrivate(privateKeyInfo2);
            }
            return new CompositePrivateKey(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            PublicKey[] publicKeyArr = new PublicKey[aSN1Sequence.size()];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
                publicKeyArr[i] = this.provider.getKeyInfoConverter(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm()).generatePublic(subjectPublicKeyInfo2);
            }
            return new CompositePublicKey(publicKeyArr);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) throws InvalidKeyException {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                throw new InvalidKeyException("key not recognized");
            } catch (IOException e) {
                throw new InvalidKeyException(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.k(e, new StringBuilder("key could not be parsed: ")));
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) throws IOException {
            return COMPOSITE.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
            return COMPOSITE.baseConverter.generatePublic(subjectPublicKeyInfo);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sbR = c.r(configurableProvider, "KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_alg_composite;
            StringBuilder sbQ = c.q(c.q(sbR, aSN1ObjectIdentifier, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_composite_key;
            StringBuilder sbQ2 = c.q(sbQ, aSN1ObjectIdentifier2, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.");
            sbQ2.append(aSN1ObjectIdentifier2);
            configurableProvider.addAlgorithm(sbQ2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, COMPOSITE.baseConverter);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap map = new HashMap();
        compositeAttributes = map;
        map.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        map.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
