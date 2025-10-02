package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzgwx extends ThreadLocal {
    @Nullable
    public static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhfo.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzgvp.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    @Nullable
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
