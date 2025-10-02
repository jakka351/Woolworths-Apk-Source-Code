package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* loaded from: classes2.dex */
public class Zuc {

    /* loaded from: classes8.dex */
    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Zuc IV";
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new CipherKeyGenerator());
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.h(a.b(a.b(a.b(a.b(a.b(a.b(a.b(sb, str, "$Zuc128", configurableProvider, "Cipher.ZUC-128"), str, "$KeyGen128", configurableProvider, "KeyGenerator.ZUC-128"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.ZUC-128"), str, "$Zuc256", configurableProvider, "Cipher.ZUC-256"), str, "$KeyGen256", configurableProvider, "KeyGenerator.ZUC-256"), str, "$AlgParams", configurableProvider, "AlgorithmParameters.ZUC-256"), str, "$ZucMac128", configurableProvider, "Mac.ZUC-128"), str, "$ZucMac256", configurableProvider, "Mac.ZUC-256");
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", a.a("Mac.ZUC-256-64", a.a("Alg.Alias.Mac.ZUC-256-128", "ZUC-256", str, "$ZucMac256_64", configurableProvider), str, "$ZucMac256_32", configurableProvider));
        }
    }

    /* loaded from: classes8.dex */
    public static class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new Zuc128Engine(), 16, 128);
        }
    }

    /* loaded from: classes8.dex */
    public static class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new Zuc256Engine(), 25, 256);
        }
    }

    /* loaded from: classes8.dex */
    public static class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new Zuc128Mac());
        }
    }

    /* loaded from: classes8.dex */
    public static class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new Zuc256Mac(128));
        }
    }

    /* loaded from: classes8.dex */
    public static class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new Zuc256Mac(32));
        }
    }

    /* loaded from: classes8.dex */
    public static class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new Zuc256Mac(64));
        }
    }

    private Zuc() {
    }
}
