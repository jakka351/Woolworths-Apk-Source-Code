package com.google.android.gms.internal.fido;

import YU.a;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
public final class zzbq {
    public static Object zza(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.d(i, "at index "));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
