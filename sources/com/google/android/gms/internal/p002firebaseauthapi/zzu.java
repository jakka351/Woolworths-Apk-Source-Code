package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;

/* loaded from: classes5.dex */
public final class zzu {
    public static int zza(int i, int i2) {
        String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = zzac.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(a.d(i2, "negative size: "));
            }
            strZza = zzac.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, "index"));
        }
        return i;
    }

    private static String zzb(int i, int i2, String str) {
        if (i < 0) {
            return zzac.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzac.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.d(i2, "negative size: "));
    }

    public static int zza(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, str));
        }
        return i;
    }

    public static <T> T zza(T t) {
        t.getClass();
        return t;
    }

    public static void zza(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzp.zza(obj));
        }
    }

    public static void zza(int i, int i2, int i3) {
        String strZzb;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzb = zzb(i, i3, "start index");
            } else if (i2 >= 0 && i2 <= i3) {
                strZzb = zzac.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                strZzb = zzb(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
