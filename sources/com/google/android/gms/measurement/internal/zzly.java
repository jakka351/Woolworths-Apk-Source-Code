package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzly implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzmb zzb;

    public zzly(zzmb zzmbVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzmbVar);
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmb zzmbVar = this.zzb;
        zzmbVar.zzu.zzw().zzc(this.zza);
        zzmbVar.zza = null;
    }
}
