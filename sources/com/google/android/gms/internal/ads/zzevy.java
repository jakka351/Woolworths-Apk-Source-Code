package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzevy implements zzeup {
    private final zzbyv zza;
    private final ScheduledExecutorService zzb;
    private final zzgpd zzc;

    public zzevy(String str, zzbak zzbakVar, zzbyv zzbyvVar, ScheduledExecutorService scheduledExecutorService, zzgpd zzgpdVar) {
        this.zza = zzbyvVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdo)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdt)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzftu.zza(Tasks.forResult(null), null);
                zzgpd zzgpdVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzgot.zzj(listenableFutureZza, zzevx.zza, zzgpdVar);
                if (((Boolean) zzbdv.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzgot.zzi(listenableFutureZzj, ((Long) zzbdv.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgot.zzg(listenableFutureZzj, Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzevw
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgpdVar);
            }
        }
        return zzgot.zza(new zzevz(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzevz zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevz(null, -1);
    }
}
