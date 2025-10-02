package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzbxt {
    public static String zza(String str, Context context, boolean z, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strZzj;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaG)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().zza(context) || TextUtils.isEmpty(str) || (strZzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaz);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzay)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzj);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzj, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzj);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzax)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzj(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzj, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", strZzj).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strZzj;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(context) && (strZzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context)) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaz);
            String string = uri.toString();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzay)).booleanValue() && string.contains(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
                return zzd(string, context).replace(str, strZzj);
            }
            if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzax)).booleanValue()) {
                    String string2 = zzc(zzd(string, context), "fbs_aeid", strZzj).toString();
                    com.google.android.gms.ads.internal.zzt.zzD().zzk(context, strZzj, (Map) map.get("_ac"));
                    return string2;
                }
            }
            return string;
        }
        return uri.toString();
    }

    @VisibleForTesting
    public static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        androidx.constraintlayout.core.state.a.B(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    private static String zzd(String str, Context context) {
        String strZzh = com.google.android.gms.ads.internal.zzt.zzD().zzh(context);
        String strZzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzh)) {
            str = zzc(str, "gmp_app_id", strZzh).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzi)) ? str : zzc(str, "fbs_aiid", strZzi).toString();
    }
}
