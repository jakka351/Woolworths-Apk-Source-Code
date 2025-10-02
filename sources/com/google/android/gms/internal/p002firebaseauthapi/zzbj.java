package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzbj {

    @Nullable
    private final zzcb zza;

    private zzbj(zzcb zzcbVar) {
        this.zza = zzcbVar;
    }

    public static zzbj zza(zzcb zzcbVar) throws GeneralSecurityException {
        return new zzbj(zzcbVar);
    }

    private final zzxb zzb() {
        try {
            zzcb zzcbVar = this.zza;
            return zzcbVar instanceof zzoi ? ((zzoi) zzcbVar).zzb().zza() : ((zzqe) zzoz.zza().zza((zzoz) this.zza, zzqe.class)).zza();
        } catch (GeneralSecurityException e) {
            throw new zzql("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(this.zza)), e);
        }
    }

    public final zzcb zza() throws GeneralSecurityException {
        zzcb zzcbVar = this.zza;
        return zzcbVar != null ? zzcbVar : zzcj.zza(zzb().zzk());
    }
}
