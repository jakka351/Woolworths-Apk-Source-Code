package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzii implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ zzjd zzb;

    public zzii(zzjd zzjdVar, zzah zzahVar) {
        this.zza = zzahVar;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        zzah zzahVar = this.zza;
        if (zzahVar.zzc.zza() == null) {
            zzjdVar.zzL().zzal(zzahVar);
        } else {
            zzjdVar.zzL().zzaj(zzahVar);
        }
    }
}
