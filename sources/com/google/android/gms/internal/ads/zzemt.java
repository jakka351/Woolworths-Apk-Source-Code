package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzemt implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzemt(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzemt zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzemt(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemr zzb() {
        return new zzemr(zzfgc.zzc(), ((zzcvj) this.zza).zza(), (zzfds) this.zzb.zzb(), ((Integer) this.zzc.zzb()).intValue());
    }
}
