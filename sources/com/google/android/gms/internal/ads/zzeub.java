package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzeub implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeub(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
    }

    public static zzeub zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzeub(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetz zzb() {
        return new zzetz((zzbxr) this.zza.zzb(), zzfgc.zzc(), ((zzchd) this.zzb).zza());
    }
}
