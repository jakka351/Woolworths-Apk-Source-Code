package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public final class zzmz {
    public static zzba zza(String str) throws GeneralSecurityException {
        return new zznc(str, zza());
    }

    public static boolean zzb(String str) throws GeneralSecurityException {
        return zza().containsAlias(str);
    }

    private static KeyStore zza() throws GeneralSecurityException, IOException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
