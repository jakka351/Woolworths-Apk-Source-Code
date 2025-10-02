package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes6.dex */
public final class EcdsaVerifyJce implements PublicKeyVerify {
    public EcdsaVerifyJce(ECPublicKey eCPublicKey, Enums.HashType hashType) throws GeneralSecurityException {
        EllipticCurves.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        Validators.d(hashType);
        hashType.toString();
    }
}
