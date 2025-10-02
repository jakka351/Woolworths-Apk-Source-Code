package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzcoj implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;
    private final zzhqg zzc;

    private zzcoj(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
        this.zzc = zzhqgVar3;
    }

    public static zzcoj zzc(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzcoj(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    public static zzcyt zzd(ScheduledExecutorService scheduledExecutorService, Clock clock, zzdsm zzdsmVar) {
        return new zzcyt(scheduledExecutorService, clock, zzdsmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcyt zzb() {
        return zzd((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb(), (zzdsm) this.zzc.zzb());
    }
}
