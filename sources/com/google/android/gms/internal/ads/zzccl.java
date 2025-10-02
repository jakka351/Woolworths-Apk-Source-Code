package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzccl implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzccq zzk;

    public zzccl(zzccq zzccqVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
        Objects.requireNonNull(zzccqVar);
        this.zzk = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("event", "precacheProgress");
        mapR.put("src", this.zza);
        mapR.put("cachedSrc", this.zzb);
        mapR.put("bufferedDuration", Long.toString(this.zzc));
        mapR.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue()) {
            mapR.put("qoeLoadedBytes", Long.toString(this.zze));
            mapR.put("qoeCachedBytes", Long.toString(this.zzf));
            mapR.put("totalBytes", Long.toString(this.zzg));
            mapR.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        mapR.put("cacheReady", true != this.zzh ? "0" : "1");
        mapR.put("playerCount", Integer.toString(this.zzi));
        mapR.put("playerPreparedCount", Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", mapR);
    }
}
