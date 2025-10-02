package com.google.android.gms.internal.fido;

import YU.a;

/* loaded from: classes5.dex */
public final class zzap {
    public static int zza(int i, int i2, String str) {
        String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = zzaq.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(a.d(i2, "negative size: "));
            }
            strZza = zzaq.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzf(i, i2, "index"));
        }
        return i;
    }

    public static void zzc(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(zzaq.zza(str, Character.valueOf(c)));
        }
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzf(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzaq.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private static String zzf(int i, int i2, String str) {
        if (i < 0) {
            return zzaq.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzaq.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.d(i2, "negative size: "));
    }
}
