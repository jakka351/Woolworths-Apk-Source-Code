package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzdos implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzdos(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzdos zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzdos(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        int i = ((zzcvj) this.zzc).zza().zzp.zza;
        if (i != 0) {
            return i + (-1) != 0 ? ((zzejc) this.zzb).zzb() : ((zzejc) this.zza).zzb();
        }
        throw null;
    }
}
