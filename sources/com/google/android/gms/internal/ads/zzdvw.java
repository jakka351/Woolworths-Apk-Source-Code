package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdvw implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdvw(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdvw zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdvw(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwd(((zzchd) this.zza).zza(), ((zzchs) this.zzb).zza());
    }
}
