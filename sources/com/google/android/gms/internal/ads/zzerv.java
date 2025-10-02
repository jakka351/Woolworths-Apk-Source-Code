package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzerv implements zzhpx {
    private final zzhqg zza;

    private zzerv(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzerv zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzerv(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzert zzb() {
        return new zzert(zzfgc.zzc(), ((zzcvj) this.zza).zza());
    }
}
