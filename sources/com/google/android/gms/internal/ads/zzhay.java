package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzhay implements zzgzi {
    private static final zzhay zza = new zzhay();
    private static final zzgzc zzb = zzgzc.zzd(zzhav.zza, zzgxv.class, zzgqr.class);

    public static void zzc() throws GeneralSecurityException {
        zzgyl.zza().zzc(zza);
        zzgyl.zza().zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zza() {
        return zzgqr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final Class zzb() {
        return zzgqr.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgzi
    public final /* bridge */ /* synthetic */ Object zze(zzgxr zzgxrVar, zzgxy zzgxyVar, zzgzh zzgzhVar) throws GeneralSecurityException {
        zzgxz zzgxzVar;
        zzgxz zzgxzVarZza;
        zzhgg zzhggVarZzd;
        zzgyx zzgyxVar = new zzgyx();
        for (int i = 0; i < zzgxrVar.zzd(); i++) {
            zzgqm zzgqmVarZze = ((zzgqo) zzgxrVar).zze(i);
            if (zzgqmVarZze.zzb().equals(zzgqf.zza)) {
                zzgqr zzgqrVar = (zzgqr) zzgzhVar.zza(zzgqmVarZze);
                zzgqd zzgqdVarZza = zzgqmVarZze.zza();
                if (zzgqdVarZza instanceof zzhat) {
                    zzhggVarZzd = ((zzhat) zzgqdVarZza).zzd();
                } else {
                    if (!(zzgqdVarZza instanceof zzgxv)) {
                        String name = zzgqdVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzgqdVarZza.zza());
                        throw new GeneralSecurityException(androidx.constraintlayout.core.state.a.l(new StringBuilder(name.length() + 59 + strValueOf.length()), "Cannot get output prefix for key of class ", name, " with parameters ", strValueOf));
                    }
                    zzhggVarZzd = ((zzgxv) zzgqdVarZza).zzd();
                }
                zzgyxVar.zza(zzhggVarZzd, new zzhaw(zzgqrVar, zzgqmVarZze.zzc()));
            }
        }
        if (zzgxyVar.zza()) {
            zzgxzVar = zzgyc.zza;
            zzgxzVarZza = zzgxzVar;
        } else {
            zzgya zzgyaVarZzb = zzgyj.zza().zzb();
            zzgxz zzgxzVarZza2 = zzgyaVarZzb.zza(zzgxrVar, zzgxyVar, "mac", "compute");
            zzgxzVarZza = zzgyaVarZzb.zza(zzgxrVar, zzgxyVar, "mac", "verify");
            zzgxzVar = zzgxzVarZza2;
        }
        zzgqo zzgqoVar = (zzgqo) zzgxrVar;
        return new zzhax(new zzhaw((zzgqr) zzgzhVar.zza(zzgqoVar.zzc()), zzgqoVar.zzc().zzc()), zzgyxVar.zzb(), zzgxzVar, zzgxzVarZza, null);
    }
}
