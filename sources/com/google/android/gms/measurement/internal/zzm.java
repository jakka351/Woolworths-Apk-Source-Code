package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzm implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcu zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcu zzcuVar, String str, String str2) {
        this.zza = zzcuVar;
        this.zzb = str;
        this.zzc = str2;
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzd = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzd.zza.zzt().zzs(this.zza, this.zzb, this.zzc);
    }
}
