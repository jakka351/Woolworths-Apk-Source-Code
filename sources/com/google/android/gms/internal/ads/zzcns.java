package com.google.android.gms.internal.ads;

import com.salesforce.marketingcloud.UrlHandler;

/* loaded from: classes5.dex */
public final class zzcns {
    private final zzdsm zza;
    private final zzfcu zzb;

    public zzcns(zzdsm zzdsmVar, zzfcu zzfcuVar) {
        this.zza = zzdsmVar;
        this.zzb = zzfcuVar;
    }

    public final void zza(long j, int i) {
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zza(this.zzb.zzb.zzb);
        zzdslVarZza.zzc(UrlHandler.ACTION, "ad_closed");
        zzdslVarZza.zzc("show_time", String.valueOf(j));
        zzdslVarZza.zzc("ad_format", "app_open_ad");
        int i2 = i - 1;
        zzdslVarZza.zzc("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h");
        zzdslVarZza.zzd();
    }
}
