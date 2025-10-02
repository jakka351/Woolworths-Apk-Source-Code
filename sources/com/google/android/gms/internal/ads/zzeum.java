package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzeum implements zzhpx {
    private final zzhqg zza;

    private zzeum(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeum zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeum(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeul zzb() {
        return new zzeul(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
