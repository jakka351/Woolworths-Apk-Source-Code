package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxh;
import java.security.GeneralSecurityException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes5.dex */
public final class zzbw {

    @GuardedBy
    private final zzxh.zza zza;

    private zzbw(zzxh.zza zzaVar) {
        this.zza = zzaVar;
    }

    public final synchronized zzbm zza() throws GeneralSecurityException {
        return zzbm.zza((zzxh) ((zzalf) this.zza.zze()));
    }

    public static zzbw zza(zzbm zzbmVar) {
        return new zzbw(zzbmVar.zzd().zzn());
    }
}
