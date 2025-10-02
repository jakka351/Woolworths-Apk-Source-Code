package org.bouncycastle.jcajce.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

/* loaded from: classes8.dex */
public interface XDHPublicKey extends XDHKey, PublicKey {
    BigInteger getU();

    byte[] getUEncoding();
}
