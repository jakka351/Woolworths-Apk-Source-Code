package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes5.dex */
final class zzfls extends TimerTask {
    final /* synthetic */ zzflu zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzflv zzc;

    public zzfls(zzflv zzflvVar, zzflu zzfluVar, Timer timer) {
        this.zza = zzfluVar;
        this.zzb = timer;
        Objects.requireNonNull(zzflvVar);
        this.zzc = zzflvVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
