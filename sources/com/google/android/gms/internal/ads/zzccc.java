package com.google.android.gms.internal.ads;

import com.salesforce.marketingcloud.UrlHandler;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzccc implements zzbjl {
    private final zzccb zza;

    public zzccc(zzccb zzccbVar) {
        this.zza = zzccbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get(UrlHandler.ACTION);
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 != null) {
                this.zza.zza(str2);
            } else {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("src missing from video GMSG.");
            }
        }
    }
}
