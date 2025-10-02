package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdzi implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdzi(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
    }

    public static zzdzi zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzdzi(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzh zzb() {
        return new zzdzh(((zzhqe) this.zza).zzd(), zzfgc.zzc(), ((zzcyx) this.zzb).zzb());
    }
}
