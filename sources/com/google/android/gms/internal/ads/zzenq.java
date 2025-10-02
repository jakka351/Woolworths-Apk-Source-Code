package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzenq implements zzhpx {
    private final zzhqg zza;

    private zzenq(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzenq zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzenq(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeno zzb() {
        return new zzeno(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
