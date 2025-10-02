package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzadk {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzeo.zza;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.zza = i;
            this.zzb = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzao zzaoVar) {
        for (int i = 0; i < zzaoVar.zza(); i++) {
            zzan zzanVarZzb = zzaoVar.zzb(i);
            if (zzanVarZzb instanceof zzagb) {
                zzagb zzagbVar = (zzagb) zzanVarZzb;
                if ("iTunSMPB".equals(zzagbVar.zzb) && zzc(zzagbVar.zzc)) {
                    return true;
                }
            } else if (zzanVarZzb instanceof zzagj) {
                zzagj zzagjVar = (zzagj) zzanVarZzb;
                if ("com.apple.iTunes".equals(zzagjVar.zza) && "iTunSMPB".equals(zzagjVar.zzb) && zzc(zzagjVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
