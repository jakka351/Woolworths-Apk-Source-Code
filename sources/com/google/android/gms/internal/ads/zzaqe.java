package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class zzaqe {
    @Nullable
    public static zzaoq zza(zzapd zzapdVar) throws NumberFormatException {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long jZzb;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = zzapdVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jZzb2 = str != null ? zzb(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jZzb3 = str3 != null ? zzb(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = jCurrentTimeMillis;
            jZzb = zzb(str4);
        } else {
            j4 = jCurrentTimeMillis;
            jZzb = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j7 = (j3 * 1000) + j4;
            j6 = z ? j7 : (j2 * 1000) + j7;
            j5 = j7;
        } else {
            j5 = (jZzb2 <= j || jZzb3 < jZzb2) ? j : (jZzb3 - jZzb2) + j4;
            j6 = j5;
        }
        zzaoq zzaoqVar = new zzaoq();
        zzaoqVar.zza = zzapdVar.zzb;
        zzaoqVar.zzb = str5;
        zzaoqVar.zzf = j5;
        zzaoqVar.zze = j6;
        zzaoqVar.zzc = jZzb2;
        zzaoqVar.zzd = jZzb;
        zzaoqVar.zzg = map;
        zzaoqVar.zzh = zzapdVar.zzd;
        return zzaoqVar;
    }

    public static long zzb(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzapt.zza("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapt.zzd(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
