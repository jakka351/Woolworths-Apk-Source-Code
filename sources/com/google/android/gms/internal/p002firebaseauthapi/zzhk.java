package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzhk extends ThreadLocal<Cipher> {
    @Nullable
    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("ChaCha20-Poly1305");
            if (zzhh.zzb(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
