package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdgn implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;

    private zzdgn(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
    }

    public static zzdgn zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzdgn(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejb((zzfhh) this.zza.zzb(), (zzgpd) this.zzb.zzb(), ((zzeiv) this.zzd).zzb(), ((zzegd) this.zzc).zzb());
    }
}
