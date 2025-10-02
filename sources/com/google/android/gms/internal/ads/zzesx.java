package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class zzesx implements zzeup {
    private final zzgpd zza;
    private final zzdtp zzb;

    public zzesx(zzgpd zzgpdVar, zzdtp zzdtpVar) {
        this.zza = zzgpdVar;
        this.zzb = zzdtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzesw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzesy zzc() {
        return new zzesy(this.zzb.zzb());
    }
}
