package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdvt implements zzhpx {
    private final zzhqg zza;

    private zzdvt(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdvt zza(zzhqg zzhqgVar) {
        return new zzdvt(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdve(((zzchd) this.zza).zza());
    }
}
