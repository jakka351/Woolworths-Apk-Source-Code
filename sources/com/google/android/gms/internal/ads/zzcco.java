package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzcco implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzccq zzd;

    public zzcco(zzccq zzccqVar, String str, String str2, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        Objects.requireNonNull(zzccqVar);
        this.zzd = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("event", "precacheComplete");
        mapR.put("src", this.zza);
        mapR.put("cachedSrc", this.zzb);
        mapR.put("totalDuration", Long.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", mapR);
    }
}
