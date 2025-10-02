package com.google.android.gms.internal.ads;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqql;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzhfc extends ThreadLocal {
    public static final Cipher zza() {
        try {
            return (Cipher) zzhfo.zza.zzb(lqlqqql.c0063cccc0063);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
