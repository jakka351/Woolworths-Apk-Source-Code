package org.bouncycastle.jcajce.provider.digest;

import YU.a;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.ParallelHash;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.digests.TupleHash;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.KMAC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes2.dex */
public class SHA3 {

    /* loaded from: classes8.dex */
    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    /* loaded from: classes8.dex */
    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestParallelHash extends BCMessageDigest implements Cloneable {
        public DigestParallelHash(int i, int i2) {
            super(new ParallelHash(i, null, 128, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new ParallelHash((ParallelHash) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestParallelHash128_256 extends DigestParallelHash {
        public DigestParallelHash128_256() {
            super(128, 256);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestParallelHash256_512 extends DigestParallelHash {
        public DigestParallelHash256_512() {
            super(256, 512);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new SHA3Digest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i, int i2) {
            super(new SHAKEDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHAKEDigest((SHAKEDigest) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestTupleHash extends BCMessageDigest implements Cloneable {
        public DigestTupleHash(int i, int i2) {
            super(new TupleHash(i, null, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new TupleHash((TupleHash) this.digest);
            return bCMessageDigest;
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestTupleHash128_256 extends DigestTupleHash {
        public DigestTupleHash128_256() {
            super(128, 256);
        }
    }

    /* loaded from: classes8.dex */
    public static class DigestTupleHash256_512 extends DigestTupleHash {
        public DigestTupleHash256_512() {
            super(256, 512);
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(BERTags.FLAGS);
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    /* loaded from: classes8.dex */
    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new HMac(new SHA3Digest(i)));
        }
    }

    /* loaded from: classes8.dex */
    public static class KMac128 extends BaseMac {
        public KMac128() {
            super(new KMAC(128, new byte[0]));
        }
    }

    /* loaded from: classes8.dex */
    public static class KMac256 extends BaseMac {
        public KMac256() {
            super(new KMAC(256, new byte[0]));
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(BERTags.FLAGS);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(KyberEngine.KyberPolyBytes);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super(a.d(i, "HMACSHA3-"), i, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            org.bouncycastle.jcajce.provider.asymmetric.a.h(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(org.bouncycastle.jcajce.provider.asymmetric.a.b(sb, str, "$Digest224", configurableProvider, "MessageDigest.SHA3-224"), str, "$Digest256", configurableProvider, "MessageDigest.SHA3-256"), str, "$Digest384", configurableProvider, "MessageDigest.SHA3-384"), str, "$Digest512", configurableProvider, "MessageDigest.SHA3-512");
            org.bouncycastle.jcajce.provider.asymmetric.a.j(configurableProvider, str, "$Digest224", "MessageDigest", NISTObjectIdentifiers.id_sha3_224);
            org.bouncycastle.jcajce.provider.asymmetric.a.j(configurableProvider, str, "$Digest256", "MessageDigest", NISTObjectIdentifiers.id_sha3_256);
            org.bouncycastle.jcajce.provider.asymmetric.a.j(configurableProvider, str, "$Digest384", "MessageDigest", NISTObjectIdentifiers.id_sha3_384);
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, str + "$Digest512");
            org.bouncycastle.jcajce.provider.asymmetric.a.h(org.bouncycastle.jcajce.provider.asymmetric.a.b(new StringBuilder(), str, "$DigestShake256_512", configurableProvider, "MessageDigest.SHAKE256-512"), str, "$DigestShake128_256", configurableProvider, "MessageDigest.SHAKE128-256");
            org.bouncycastle.jcajce.provider.asymmetric.a.j(configurableProvider, str, "$DigestShake256_512", "MessageDigest", NISTObjectIdentifiers.id_shake256);
            org.bouncycastle.jcajce.provider.asymmetric.a.j(configurableProvider, str, "$DigestShake128_256", "MessageDigest", NISTObjectIdentifiers.id_shake128);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256");
            addHMACAlgorithm(configurableProvider, "SHA3-224", a.o(new StringBuilder(), str, "$HashMac224"), a.g(str, "$KeyGenerator224"));
            addHMACAlias(configurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
            addHMACAlgorithm(configurableProvider, "SHA3-256", a.g(str, "$HashMac256"), a.g(str, "$KeyGenerator256"));
            addHMACAlias(configurableProvider, "SHA3-256", NISTObjectIdentifiers.id_hmacWithSHA3_256);
            addHMACAlgorithm(configurableProvider, "SHA3-384", a.g(str, "$HashMac384"), a.g(str, "$KeyGenerator384"));
            addHMACAlias(configurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
            addHMACAlgorithm(configurableProvider, "SHA3-512", a.g(str, "$HashMac512"), a.g(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
            addKMACAlgorithm(configurableProvider, "128", a.g(str, "$KMac128"), a.g(str, "$KeyGenerator256"));
            addKMACAlgorithm(configurableProvider, "256", a.g(str, "$KMac256"), a.g(str, "$KeyGenerator512"));
            configurableProvider.addAlgorithm("MessageDigest.TUPLEHASH256-512", str + "$DigestTupleHash256_512");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            org.bouncycastle.jcajce.provider.asymmetric.a.i(sb2, "$DigestTupleHash128_256", configurableProvider, "MessageDigest.TUPLEHASH128-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.TUPLEHASH256", "TUPLEHASH256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.TUPLEHASH128", "TUPLEHASH128-256");
            org.bouncycastle.jcajce.provider.asymmetric.a.h(org.bouncycastle.jcajce.provider.asymmetric.a.b(new StringBuilder(), str, "$DigestParallelHash256_512", configurableProvider, "MessageDigest.PARALLELHASH256-512"), str, "$DigestParallelHash128_256", configurableProvider, "MessageDigest.PARALLELHASH128-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH256", "PARALLELHASH256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH128", "PARALLELHASH128-256");
        }
    }

    private SHA3() {
    }
}
