package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzlw implements Runnable {
    final /* synthetic */ zzlu zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzmb zze;

    public zzlw(zzmb zzmbVar, zzlu zzluVar, zzlu zzluVar2, long j, boolean z) {
        this.zza = zzluVar;
        this.zzb = zzluVar2;
        this.zzc = j;
        this.zzd = z;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzu(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
