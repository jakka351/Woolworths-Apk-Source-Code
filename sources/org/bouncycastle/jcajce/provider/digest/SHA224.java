package org.bouncycastle.jcajce.provider.digest;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public class SHA224 {

    /* loaded from: classes8.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA224Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA224Digest((SHA224Digest) this.digest);
            return digest;
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA224Digest()));
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.h(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-224");
            StringBuilder sbC = a.c(a.e(c.r(configurableProvider, "Alg.Alias.MessageDigest.SHA224", McElieceCCA2KeyGenParameterSpec.SHA224, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha224, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA224, str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA224", str);
            sbC.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA224", sbC.toString(), YU.a.g(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA224", PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }

    private SHA224() {
    }
}
