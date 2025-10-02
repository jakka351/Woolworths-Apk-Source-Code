package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzlv implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzlu zzb;
    final /* synthetic */ zzlu zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzmb zze;

    public zzlv(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j) {
        this.zza = bundle;
        this.zzb = zzluVar;
        this.zzc = zzluVar2;
        this.zzd = j;
        Objects.requireNonNull(zzmbVar);
        this.zze = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.zze.zzt(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
