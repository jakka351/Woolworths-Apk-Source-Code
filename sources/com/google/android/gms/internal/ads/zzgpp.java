package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zzgpp extends zzgok {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzgpp(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgpp zzgppVar = new zzgpp(listenableFuture);
        zzgpn zzgpnVar = new zzgpn(zzgppVar);
        zzgppVar.zzb = scheduledExecutorService.schedule(zzgpnVar, j, timeUnit);
        listenableFuture.addListener(zzgpnVar, zzgoi.INSTANCE);
        return zzgppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final String zzd() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strP = YU.a.p(new StringBuilder(string.length() + 14), "inputFuture=[", string, "]");
        if (scheduledFuture == null) {
            return strP;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strP;
        }
        int length = strP.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(strP);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final /* synthetic */ ListenableFuture zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
