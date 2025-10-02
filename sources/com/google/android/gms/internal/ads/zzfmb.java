package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfmb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfmc zzb;

    public zzfmb(zzfmc zzfmcVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfmcVar);
        this.zzb = zzfmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
