package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdhu implements zzhpx {
    private final zzhqg zza;

    private zzdhu(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdhu zzc(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        return new zzdhu(zzdhqVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdjc zzb() {
        zzdho zzdhoVar = (zzdho) this.zza.zzb();
        zzhqf.zzb(zzdhoVar);
        return zzdhoVar;
    }
}
