package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzetm implements zzeup {
    private final String zza;
    private final int zzb;

    public zzetm(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzetn(this.zza, this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 31;
    }
}
