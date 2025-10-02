package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzblg implements Runnable {
    final /* synthetic */ zzblj zza;

    public zzblg(zzblj zzbljVar) {
        Objects.requireNonNull(zzbljVar);
        this.zza = zzbljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
