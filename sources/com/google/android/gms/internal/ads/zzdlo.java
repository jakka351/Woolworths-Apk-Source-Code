package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdlo implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzdlo(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzdlo zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdlo(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdln zzb() {
        return new zzdln(zzfgc.zzc(), ((zzdmd) this.zza).zzb(), ((zzdmi) this.zzb).zzb(), (zzdsg) this.zzc.zzb());
    }
}
