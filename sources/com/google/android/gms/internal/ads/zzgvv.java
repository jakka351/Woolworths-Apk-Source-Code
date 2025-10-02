package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzgvv extends ThreadLocal {
    @Nullable
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhfo.zza.zzb("ChaCha20-Poly1305");
            if (zzgvw.zzf(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
