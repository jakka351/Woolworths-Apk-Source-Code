package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdee implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdee(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdee zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdee(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzded(((zzcrj) this.zza).zza(), (zzfjv) this.zzb.zzb());
    }
}
