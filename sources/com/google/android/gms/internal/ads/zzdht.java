package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdht implements zzhpx {
    private final zzhqg zza;

    private zzdht(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdht zzc(zzdhq zzdhqVar, zzhqg zzhqgVar) {
        return new zzdht(zzdhqVar, zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdiz zzb() {
        zzdiy zzdiyVar = (zzdiy) this.zza.zzb();
        zzhqf.zzb(zzdiyVar);
        return zzdiyVar;
    }
}
