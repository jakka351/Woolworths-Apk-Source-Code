package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzerl implements zzeup {
    private final zzgpd zza;

    public zzerl(zzgpd zzgpdVar) {
        this.zza = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zza.submit(zzerk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 20;
    }
}
