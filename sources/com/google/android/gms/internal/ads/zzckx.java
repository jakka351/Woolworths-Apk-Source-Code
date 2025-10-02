package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzckx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzckx(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzckx zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzckx(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzckw zzb() {
        return new zzckw(((zzhqb) this.zza).zzb(), ((zzhqb) this.zzb).zzb());
    }
}
