package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzir implements Runnable {
    final /* synthetic */ zzbg zza;
    final /* synthetic */ zzr zzb;
    final /* synthetic */ zzjd zzc;

    public zzir(zzjd zzjdVar, zzbg zzbgVar, zzr zzrVar) {
        this.zza = zzbgVar;
        this.zzb = zzrVar;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar = this.zza;
        zzr zzrVar = this.zzb;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzb(zzjdVar.zzc(zzbgVar, zzrVar), zzrVar);
    }
}
