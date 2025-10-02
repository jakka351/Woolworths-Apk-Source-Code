package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public abstract class zzfgz {
    private static final ListenableFuture zza = zzgot.zza(null);
    private final zzgpd zzb;
    private final ScheduledExecutorService zzc;
    private final zzfha zzd;

    public zzfgz(zzgpd zzgpdVar, ScheduledExecutorService scheduledExecutorService, zzfha zzfhaVar) {
        this.zzb = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfhaVar;
    }

    public final zzfgy zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfgy(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfgq zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfgq(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgpd zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfha zzg() {
        return this.zzd;
    }
}
