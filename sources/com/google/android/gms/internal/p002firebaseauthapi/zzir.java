package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzir extends ThreadLocal<Cipher> {
    @Nullable
    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
