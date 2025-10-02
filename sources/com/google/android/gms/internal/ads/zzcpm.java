package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.UrlHandler;

/* loaded from: classes5.dex */
public final class zzcpm implements zzcwm {

    @Nullable
    private final zzcek zza;
    private final zzdsm zzb;
    private final zzfcj zzc;

    public zzcpm(@Nullable zzcek zzcekVar, zzdsm zzdsmVar, zzfcj zzfcjVar) {
        this.zza = zzcekVar;
        this.zzb = zzdsmVar;
        this.zzc = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznK)).booleanValue() || (zzcekVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzcekVar.zzE()) ? "0" : "1";
        zzdsl zzdslVarZza = this.zzb.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "hcp");
        zzdslVarZza.zzc("hcp", str);
        zzdslVarZza.zzb(this.zzc);
        zzdslVarZza.zzd();
    }
}
