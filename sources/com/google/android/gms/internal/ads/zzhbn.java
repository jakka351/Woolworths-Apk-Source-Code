package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzhbn implements zzhae {
    public zzhbn(zzhai zzhaiVar) throws GeneralSecurityException {
        if (!zzgxd.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
