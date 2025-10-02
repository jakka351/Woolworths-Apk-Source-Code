package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzeop implements zzhpx {
    private final zzhqg zza;

    private zzeop(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar2;
    }

    public static zzeop zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeop(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeon zzb() {
        return new zzeon(zzfgc.zzc(), ((zzchd) this.zza).zza());
    }
}
