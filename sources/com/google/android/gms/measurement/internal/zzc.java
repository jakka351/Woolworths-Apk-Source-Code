package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzc implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzd zzb;

    public zzc(zzd zzdVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf(this.zza);
    }
}
