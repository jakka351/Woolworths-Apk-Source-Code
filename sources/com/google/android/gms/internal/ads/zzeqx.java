package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class zzeqx implements zzhpx {
    private final zzhqg zza;
    private final zzhqg zzb;

    private zzeqx(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        this.zza = zzhqgVar;
        this.zzb = zzhqgVar2;
    }

    public static zzeqx zza(zzhqg zzhqgVar, zzhqg zzhqgVar2) {
        return new zzeqx(zzhqgVar, zzhqgVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzetb(((zzesv) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmW)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
