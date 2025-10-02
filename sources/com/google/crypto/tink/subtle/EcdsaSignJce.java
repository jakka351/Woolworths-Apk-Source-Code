package com.google.crypto.tink.subtle;

import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.subtle.Enums;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class EcdsaSignJce implements PublicKeySign {
    public EcdsaSignJce(Enums.HashType hashType) throws GeneralSecurityException {
        Validators.d(hashType);
        hashType.toString();
    }
}
