package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzcck implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzccq zze;

    public zzcck(zzccq zzccqVar, String str, String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        Objects.requireNonNull(zzccqVar);
        this.zze = zzccqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap mapR = androidx.constraintlayout.core.state.a.r("event", "precacheProgress");
        mapR.put("src", this.zza);
        mapR.put("cachedSrc", this.zzb);
        mapR.put("bytesLoaded", Integer.toString(this.zzc));
        mapR.put("totalBytes", Integer.toString(this.zzd));
        mapR.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", mapR);
    }
}
