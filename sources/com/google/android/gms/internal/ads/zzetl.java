package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzetl implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzetl(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
        this.zzc = zzhqgVar4;
    }

    public static zzetl zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzetl(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzetj zzb() {
        return new zzetj(((zzchd) this.zza).zza(), zzfgc.zzc(), ((zzcvj) this.zzb).zza(), ((zzchs) this.zzc).zza());
    }
}
