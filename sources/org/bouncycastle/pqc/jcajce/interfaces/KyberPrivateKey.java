package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.PrivateKey;

/* loaded from: classes8.dex */
public interface KyberPrivateKey extends PrivateKey, KyberKey {
    KyberPublicKey getPublicKey();
}
