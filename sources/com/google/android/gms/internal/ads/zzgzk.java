package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzgzk implements zzgzn {
    private final zzhgg zza;
    private final zzhdw zzb;

    private zzgzk(zzhdw zzhdwVar, zzhgg zzhggVar) {
        this.zzb = zzhdwVar;
        this.zza = zzhggVar;
    }

    public static zzgzk zza(zzhdw zzhdwVar) {
        return new zzgzk(zzhdwVar, zzgzu.zza(zzhdwVar.zza()));
    }

    public static zzgzk zzb(zzhdw zzhdwVar) throws GeneralSecurityException {
        return new zzgzk(zzhdwVar, zzgzu.zzb(zzhdwVar.zza()));
    }

    public final zzhdw zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzn
    public final zzhgg zzf() {
        return this.zza;
    }
}
