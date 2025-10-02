package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class zzre implements zzqj {
    public zzre(zzrd zzrdVar) {
    }

    public static int zza(int i, int i2, int i3) {
        return zzgne.zza(((i * i2) * i3) / 1000000);
    }

    public static final int zzb(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 250000;
        if (i3 == 0) {
            int iZza = zza(250000, i5, i4);
            int iZza2 = zza(750000, i5, i4);
            String str = zzeo.zza;
            return Math.max(iZza, Math.min(i * 4, iZza2));
        }
        if (i3 == 1) {
            return zzgne.zza((zzc(i2) * 50000000) / 1000000);
        }
        if (i2 == 5) {
            i7 = 500000;
        } else if (i2 == 8) {
            i7 = 1000000;
            i2 = 8;
        }
        return zzgne.zza((i7 * (i6 != -1 ? zzgmx.zzb(i6, 8, RoundingMode.CEILING) : zzc(i2))) / 1000000);
    }

    private static int zzc(int i) {
        int iZzf = zzacy.zzf(i);
        zzghc.zzh(iZzf != -2147483647);
        return iZzf;
    }
}
