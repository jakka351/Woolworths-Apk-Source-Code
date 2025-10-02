package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzccm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ zzccq zzj;

    public zzccm(zzccq zzccqVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        Objects.requireNonNull(zzccqVar);
        this.zzj = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("event", "precacheProgress");
        mapR.put("src", this.zza);
        mapR.put("cachedSrc", this.zzb);
        mapR.put("bytesLoaded", Integer.toString(this.zzc));
        mapR.put("totalBytes", Integer.toString(this.zzd));
        mapR.put("bufferedDuration", Long.toString(this.zze));
        mapR.put("totalDuration", Long.toString(this.zzf));
        mapR.put("cacheReady", true != this.zzg ? "0" : "1");
        mapR.put("playerCount", Integer.toString(this.zzh));
        mapR.put("playerPreparedCount", Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", mapR);
    }
}
