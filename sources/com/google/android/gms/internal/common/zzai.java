package com.google.android.gms.internal.common;

import YU.a;

/* loaded from: classes5.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(a.n(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
            }
        }
        return objArr;
    }
}
