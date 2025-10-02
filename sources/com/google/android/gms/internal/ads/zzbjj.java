package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class zzbjj implements zzbjl {
    static final /* synthetic */ zzbjj zza = new zzbjj();

    private /* synthetic */ zzbjj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcfw zzcfwVar = (zzcfw) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcfwVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            map2.put(str2, boolValueOf);
            StringBuilder sb = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        ((zzbmh) zzcfwVar).zze("openableURLs", map2);
    }
}
