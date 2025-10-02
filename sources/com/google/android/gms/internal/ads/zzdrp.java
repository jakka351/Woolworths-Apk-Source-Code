package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdrp implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdrp(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzdrp zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzdrp(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdro zzb() {
        return new zzdro((zzbbh) this.zza.zzb(), ((zzhqb) this.zzb).zzb());
    }
}
