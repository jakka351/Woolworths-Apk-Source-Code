package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzexj implements zzeup {
    private final zzgpd zza;

    public zzexj(zzgpd zzgpdVar) {
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(zzexi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 51;
    }
}
