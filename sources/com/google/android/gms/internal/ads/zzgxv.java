package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgxv extends zzgqd {
    private final zzgzj zza;

    public zzgxv(zzgzj zzgzjVar, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException {
        zze(zzgzjVar, zzgqtVar);
        this.zza = zzgzjVar;
    }

    private static void zze(zzgzj zzgzjVar, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException {
        int i = zzgxt.zzb[zzgzjVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgqd
    public final zzgqs zza() {
        zzgzj zzgzjVar = this.zza;
        return new zzgxu(zzgzjVar.zzg(), zzgzjVar.zzd(), null);
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzgzj zzc(@Nullable zzgqt zzgqtVar) throws GeneralSecurityException {
        zzgzj zzgzjVar = this.zza;
        zze(zzgzjVar, zzgqtVar);
        return zzgzjVar;
    }

    public final zzhgg zzd() throws GeneralSecurityException {
        zzgzj zzgzjVar = this.zza;
        if (zzgzjVar.zzd().equals(zzhep.RAW)) {
            return zzhgg.zza(new byte[0]);
        }
        if (zzgzjVar.zzd().equals(zzhep.TINK)) {
            return zzgyp.zzb(zzgzjVar.zze().intValue());
        }
        if (zzgzjVar.zzd().equals(zzhep.LEGACY) || zzgzjVar.zzd().equals(zzhep.CRUNCHY)) {
            return zzgyp.zza(zzgzjVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
