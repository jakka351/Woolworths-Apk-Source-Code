package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzkv implements Runnable {
    final /* synthetic */ zzjl zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzlj zzd;

    public zzkv(zzlj zzljVar, zzjl zzjlVar, long j, boolean z) {
        this.zza = zzjlVar;
        this.zzb = j;
        this.zzc = z;
        Objects.requireNonNull(zzljVar);
        this.zzd = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzd;
        zzjl zzjlVar = this.zza;
        zzljVar.zzA(zzjlVar);
        zzljVar.zzak(zzjlVar, this.zzb, false, this.zzc);
    }
}
