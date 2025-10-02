package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzevb implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzevb(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
    }

    public static zzevb zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzevb(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeva zzb() {
        return new zzeva(zzfgc.zzc(), ((zzchd) this.zza).zza(), (zzdwx) this.zzb.zzb());
    }
}
