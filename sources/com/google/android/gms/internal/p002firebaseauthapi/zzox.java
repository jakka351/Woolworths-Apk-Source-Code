package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzox {
    private static final zzox zza = new zzox();
    private final Map<String, zzcb> zzb = new HashMap();

    public static zzox zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzcb zzcbVar) throws GeneralSecurityException {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzcbVar);
                return;
            }
            if (this.zzb.get(str).equals(zzcbVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzcbVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza(Map<String, zzcb> map) throws GeneralSecurityException {
        for (Map.Entry<String, zzcb> entry : map.entrySet()) {
            zza(entry.getKey(), entry.getValue());
        }
    }
}
