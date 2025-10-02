package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzgli {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzb(objArr[i2], i2);
        }
        return objArr;
    }

    public static Object zzb(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(YU.a.n(new StringBuilder(String.valueOf(i).length() + 9), "at index ", i));
    }
}
