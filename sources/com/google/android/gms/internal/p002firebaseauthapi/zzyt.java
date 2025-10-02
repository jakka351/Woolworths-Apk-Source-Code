package com.google.android.gms.internal.p002firebaseauthapi;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqql;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
final class zzyt extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            return zzzj.zza.zza(lqlqqql.c0063cccc0063);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
