package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzsg implements zzqw {
    private static final zziv.zza zza = zziv.zza.zzb;

    public zzsg(zzra zzraVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
