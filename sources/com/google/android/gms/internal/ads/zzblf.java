package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzblf implements zzgob {
    final /* synthetic */ zzbkx zza;

    public zzblf(zzblj zzbljVar, zzbkx zzbkxVar) {
        this.zza = zzbkxVar;
        Objects.requireNonNull(zzbljVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzbzm zzbzmVar = new zzbzm();
        ((zzbld) obj).zze(this.zza, new zzble(this, zzbzmVar));
        return zzbzmVar;
    }
}
