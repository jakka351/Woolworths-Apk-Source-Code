package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class zzftw implements zzhpx {
    private final zzhqg zza;

    private zzftw(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzftw zza(zzhqg zzhqgVar) {
        return new zzftw(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgpd zzgpdVarZzb = zzgpk.zzb((ExecutorService) this.zza.zzb());
        zzhqf.zzb(zzgpdVarZzb);
        return zzgpdVarZzb;
    }
}
