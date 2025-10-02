package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzeax {
    private final zzbup zza;

    public zzeax(zzbup zzbupVar) {
        this.zza = zzbupVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
            zzbzk.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzbzk.zza(listenableFutureZza, "persistFlags");
        }
    }
}
