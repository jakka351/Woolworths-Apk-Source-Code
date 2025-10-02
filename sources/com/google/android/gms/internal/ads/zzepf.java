package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzepf implements zzeup {
    private final zzgpd zza;

    public zzepf(zzgpd zzgpdVar) {
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzepe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzepg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzb());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 55;
    }
}
