package org.bouncycastle.pqc.crypto.gemss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes8.dex */
public class GeMSSKeyParameters extends AsymmetricKeyParameter {
    final GeMSSParameters parameters;

    public GeMSSKeyParameters(boolean z, GeMSSParameters geMSSParameters) {
        super(z);
        this.parameters = geMSSParameters;
    }

    public GeMSSParameters getParameters() {
        return this.parameters;
    }
}
