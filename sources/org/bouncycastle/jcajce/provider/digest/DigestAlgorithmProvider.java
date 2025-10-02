package org.bouncycastle.jcajce.provider.digest;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* loaded from: classes2.dex */
abstract class DigestAlgorithmProvider extends AlgorithmProvider {
    public void addHMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strA = a.A("HMAC", str);
        configurableProvider.addAlgorithm("Mac." + strA, str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-" + str, strA);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/" + str, strA);
        configurableProvider.addAlgorithm("KeyGenerator." + strA, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-" + str, strA);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/" + str, strA);
    }

    public void addHMACAlias(ConfigurableProvider configurableProvider, String str, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String strA = a.A("HMAC", str);
        configurableProvider.addAlgorithm("Alg.Alias.Mac." + aSN1ObjectIdentifier, strA);
        c.y(new StringBuilder("Alg.Alias.KeyGenerator."), aSN1ObjectIdentifier, configurableProvider, strA);
    }

    public void addKMACAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
        String strA = a.A("KMAC", str);
        configurableProvider.addAlgorithm("Mac." + strA, str2);
        configurableProvider.addAlgorithm("KeyGenerator." + strA, str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.KMAC" + str, strA);
    }
}
