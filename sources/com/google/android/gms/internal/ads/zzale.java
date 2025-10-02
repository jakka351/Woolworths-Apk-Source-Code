package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zzale {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzef zzc = new zzef();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzef zzefVar) {
        while (true) {
            for (boolean z = true; zzefVar.zzd() > 0 && z; z = false) {
                char c = (char) zzefVar.zzi()[zzefVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzefVar.zzk(1);
                } else {
                    int iZzg = zzefVar.zzg();
                    int iZze = zzefVar.zze();
                    byte[] bArrZzi = zzefVar.zzi();
                    if (iZzg + 2 <= iZze) {
                        int i = iZzg + 1;
                        if (bArrZzi[iZzg] == 47) {
                            int i2 = iZzg + 2;
                            if (bArrZzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzi[i2]) == '*' && ((char) bArrZzi[i3]) == '/') {
                                        iZze = i2 + 2;
                                        i2 = iZze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzefVar.zzk(iZze - zzefVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    @Nullable
    public static String zzc(zzef zzefVar, StringBuilder sb) {
        zzb(zzefVar);
        if (zzefVar.zzd() == 0) {
            return null;
        }
        String strZzd = zzd(zzefVar, sb);
        if (!strZzd.isEmpty()) {
            return strZzd;
        }
        char cZzs = (char) zzefVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(cZzs).length());
        sb2.append(cZzs);
        return sb2.toString();
    }

    private static String zzd(zzef zzefVar, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int iZzg = zzefVar.zzg();
        int iZze = zzefVar.zze();
        loop0: while (true) {
            for (false; iZzg < iZze && !z; true) {
                c = (char) zzefVar.zzi()[iZzg];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            iZzg++;
        }
        zzefVar.zzk(iZzg - zzefVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fd, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzef r18) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzale.zza(com.google.android.gms.internal.ads.zzef):java.util.List");
    }
}
