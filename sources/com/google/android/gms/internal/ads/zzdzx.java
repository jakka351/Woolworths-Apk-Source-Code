package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdzx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzdzx(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
    }

    public static zzdzx zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzdzx(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdzw zzb() {
        return new zzdzw(zzfgc.zzc(), ((zzdzc) this.zza).zzb(), zzhpw.zzc(this.zzb));
    }
}
