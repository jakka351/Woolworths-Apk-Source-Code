package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzov implements Runnable {
    final /* synthetic */ zzph zza;
    final /* synthetic */ zzpg zzb;

    public zzov(zzpg zzpgVar, zzph zzphVar) {
        this.zza = zzphVar;
        Objects.requireNonNull(zzpgVar);
        this.zzb = zzpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpg zzpgVar = this.zzb;
        zzpgVar.zzau(this.zza);
        zzpgVar.zzc();
    }
}
