package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzid implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ zzjd zzb;

    public zzid(zzjd zzjdVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzjdVar);
        this.zzb = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjd zzjdVar = this.zzb;
        zzjdVar.zzL().zzZ();
        return zzjdVar.zzL().zzj().zzn(this.zza);
    }
}
