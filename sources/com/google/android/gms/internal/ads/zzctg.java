package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzctg implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzctg(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzctg zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzctg(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddr((zzdaj) this.zza.zzb(), (Executor) this.zzb.zzb());
    }
}
