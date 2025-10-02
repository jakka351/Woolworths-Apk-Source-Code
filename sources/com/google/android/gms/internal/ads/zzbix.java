package com.google.android.gms.internal.ads;

import com.salesforce.marketingcloud.UrlHandler;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzbix implements zzbjl {
    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        String str = (String) map.get(UrlHandler.ACTION);
        if ("pause".equals(str)) {
            zzcekVar.zzdp();
        } else if ("resume".equals(str)) {
            zzcekVar.zzdq();
        }
    }
}
