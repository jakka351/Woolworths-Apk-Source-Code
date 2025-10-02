package org.bouncycastle.jcajce.provider.digest;

import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public class SHA384 {

    /* loaded from: classes8.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.h(sb, str, "$Digest", configurableProvider, "MessageDigest.SHA-384");
            StringBuilder sbC = a.c(a.c(a.e(c.r(configurableProvider, "Alg.Alias.MessageDigest.SHA384", McElieceCCA2KeyGenParameterSpec.SHA384, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha384, configurableProvider, McElieceCCA2KeyGenParameterSpec.SHA384, str), "$OldSHA384", configurableProvider, "Mac.OLDHMACSHA384", str), "$HashMac", configurableProvider, "Mac.PBEWITHHMACSHA384", str);
            sbC.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", sbC.toString(), YU.a.g(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "SHA384", PKCSObjectIdentifiers.id_hmacWithSHA384);
        }
    }

    /* loaded from: classes8.dex */
    public static class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new OldHMac(new SHA384Digest()));
        }
    }

    private SHA384() {
    }
}
