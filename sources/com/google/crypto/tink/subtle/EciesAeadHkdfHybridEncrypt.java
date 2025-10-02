package com.google.crypto.tink.subtle;

import com.google.crypto.tink.HybridEncrypt;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes6.dex */
public final class EciesAeadHkdfHybridEncrypt implements HybridEncrypt {

    /* renamed from: a, reason: collision with root package name */
    public final EciesAeadHkdfDemHelper f15145a;

    public EciesAeadHkdfHybridEncrypt(ECPublicKey eCPublicKey, EciesAeadHkdfDemHelper eciesAeadHkdfDemHelper) throws GeneralSecurityException {
        EllipticCurves.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f15145a = eciesAeadHkdfDemHelper;
    }
}
