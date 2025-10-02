package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzewk implements zzeup {
    public zzewk(zzbyk zzbykVar, zzgpd zzgpdVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzgot.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgn)).booleanValue()) {
            listenableFutureZza = zzgot.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzgot.zza(null);
        return zzgot.zzn(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzewl((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzbzh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 47;
    }
}
