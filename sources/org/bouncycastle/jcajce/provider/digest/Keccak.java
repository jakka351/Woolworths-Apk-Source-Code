package org.bouncycastle.jcajce.provider.digest;

import YU.a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes2.dex */
public class Keccak {

    /* loaded from: classes8.dex */
    public static class Digest224 extends DigestKeccak {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest384 extends DigestKeccak {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new KeccakDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new KeccakDigest((KeccakDigest) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new HMac(new KeccakDigest(BERTags.FLAGS)));
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new HMac(new KeccakDigest(256)));
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new HMac(new KeccakDigest(288)));
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new HMac(new KeccakDigest(KyberEngine.KyberPolyBytes)));
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new HMac(new KeccakDigest(512)));
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", KyberEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "KECCAK224", a.o(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(sb, str, "$Digest224", configurableProvider, "MessageDigest.KECCAK-224"), str, "$Digest288", configurableProvider, "MessageDigest.KECCAK-288"), str, "$Digest256", configurableProvider, "MessageDigest.KECCAK-256"), str, "$Digest384", configurableProvider, "MessageDigest.KECCAK-384"), str, "$Digest512", configurableProvider, "MessageDigest.KECCAK-512"), str, "$HashMac224"), a.g(str, "$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", a.g(str, "$HashMac256"), a.g(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", a.g(str, "$HashMac288"), a.g(str, "$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", a.g(str, "$HashMac384"), a.g(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", a.g(str, "$HashMac512"), a.g(str, "$KeyGenerator512"));
        }
    }

    private Keccak() {
    }
}
