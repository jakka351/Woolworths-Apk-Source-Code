package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzdyh implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;
    private final zzhqg zzf;

    private zzdyh(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar5;
        this.zze = zzhqgVar6;
        this.zzf = zzhqgVar7;
    }

    public static zzdyh zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5, zzhqg zzhqgVar6, zzhqg zzhqgVar7) {
        return new zzdyh(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5, zzhqgVar6, zzhqgVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdyg(((zzchd) this.zza).zza(), ((zzcvj) this.zzb).zza(), ((zzdxi) this.zzc).zzb(), zzfgc.zzc(), (ScheduledExecutorService) this.zzd.zzb(), (zzebk) this.zze.zzb(), (zzfib) this.zzf.zzb());
    }
}
