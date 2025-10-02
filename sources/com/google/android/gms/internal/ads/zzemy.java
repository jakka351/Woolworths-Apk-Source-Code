package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzemy implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzemy(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar3;
    }

    public static zzemy zza(zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3) {
        return new zzemy(zzhqgVar, zzhqgVar2, zzhqgVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemw((ListenableFuture) this.zza.zzb(), zzfgc.zzc(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
