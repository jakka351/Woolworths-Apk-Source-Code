package com.auth0.android.provider;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.security.SignatureException;

/* loaded from: classes4.dex */
class AsymmetricSignatureVerifier extends SignatureVerifier {
    public Signature b;

    @Override // com.auth0.android.provider.SignatureVerifier
    public final void a(String[] strArr) throws SignatureException {
        boolean zVerify;
        Signature signature = this.b;
        byte[] bytes = (strArr[0] + "." + strArr[1]).getBytes(StandardCharsets.UTF_8);
        try {
            byte[] bArrDecode = Base64.decode(strArr[2], 10);
            signature.update(bytes);
            zVerify = signature.verify(bArrDecode);
        } catch (Exception unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new InvalidIdTokenSignatureException("Invalid ID token signature.", 0);
        }
    }
}
