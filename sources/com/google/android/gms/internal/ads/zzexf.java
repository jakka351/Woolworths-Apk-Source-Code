package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzexf implements zzeup {
    private final zzbyv zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgpd zzd;
    private final int zze;
    private final int zzf;

    public zzexf(zzbyv zzbyvVar, boolean z, zzbyl zzbylVar, zzgpd zzgpdVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.zza = zzbyvVar;
        this.zzb = z;
        this.zzd = zzgpdVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
        this.zzf = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhu)).booleanValue() || !this.zzb) && this.zzf != 2) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhw)).split(",")).contains(String.valueOf(this.zze))) {
                return zzgot.zza(new zzexg(null));
            }
            ListenableFuture listenableFutureZza = zzgot.zza(null);
            zzgpd zzgpdVar = this.zzd;
            return zzgot.zzg(zzgot.zzi(zzgot.zzk(listenableFutureZza, zzexe.zza, zzgpdVar), ((Long) zzbex.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzggr() { // from class: com.google.android.gms.internal.ads.zzexd
                @Override // com.google.android.gms.internal.ads.zzggr
                public final /* synthetic */ Object apply(Object obj) {
                    return this.zza.zzc((Exception) obj);
                }
            }, zzgpdVar);
        }
        return zzgot.zza(new zzexg(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzexg zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzexg(null);
    }
}
