package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzcus implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzcus(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
        this.zzd = zzhqgVar4;
        this.zze = zzhqgVar5;
    }

    public static zzcus zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4, zzhqg zzhqgVar5) {
        return new zzcus(zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4, zzhqgVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcur(((zzcrm) this.zza).zza(), ((zzcrj) this.zzb).zza(), (Clock) this.zzc.zzb(), (zzdsm) this.zzd.zzb(), (ScheduledExecutorService) this.zze.zzb());
    }
}
