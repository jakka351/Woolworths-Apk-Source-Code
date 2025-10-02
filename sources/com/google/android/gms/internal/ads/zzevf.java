package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzevf implements zzhpx {
    private final zzhqg zza;

    private zzevf(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzevf zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzevf(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeve zzb() {
        return new zzeve(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
