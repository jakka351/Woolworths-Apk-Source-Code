package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbmu implements zzbjl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbno zzb;
    final /* synthetic */ zzbmk zzc;
    final /* synthetic */ zzbnp zzd;

    public zzbmu(zzbnp zzbnpVar, long j, zzbno zzbnoVar, zzbmk zzbmkVar) {
        this.zza = j;
        this.zzb = zzbnoVar;
        this.zzc = zzbmkVar;
        Objects.requireNonNull(zzbnpVar);
        this.zzd = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbnp zzbnpVar = this.zzd;
        synchronized (zzbnpVar.zzf()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbno zzbnoVar = this.zzb;
            if (zzbnoVar.zzi() != -1 && zzbnoVar.zzi() != 1) {
                zzbnpVar.zzk(0);
                zzbmk zzbmkVar = this.zzc;
                zzbmkVar.zzm("/log", zzbjk.zzg);
                zzbmkVar.zzm("/result", zzbjk.zzo);
                zzbnoVar.zzf(zzbmkVar);
                zzbnpVar.zzi(zzbnoVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
