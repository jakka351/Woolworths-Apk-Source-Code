package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzejc implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzejc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzejc zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzejc(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejb zzb() {
        return new zzejb((zzfhh) this.zza.zzb(), (zzgpd) this.zzb.zzb(), (zzeeb) this.zzc.zzb(), (zzeef) this.zzd.zzb());
    }
}
