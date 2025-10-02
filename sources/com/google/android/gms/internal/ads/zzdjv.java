package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.UrlHandler;

/* loaded from: classes5.dex */
public final class zzdjv {
    private final zzdsm zza;

    public zzdjv(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final void zza(@Nullable View view, zzfcj zzfcjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? "0" : "1";
        zzdsl zzdslVarZza = this.zza.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzd();
    }
}
