package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes5.dex */
public final class zzepy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzepy(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzhqgVar2;
        this.zzb = zzhqgVar4;
    }

    public static zzepy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzepy(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepd(zzesk.zzc(), ((Long) zzbdx.zzf.zze()).longValue(), (Clock) this.zza.zzb(), zzfgc.zzc(), (zzdsm) this.zzb.zzb());
    }
}
