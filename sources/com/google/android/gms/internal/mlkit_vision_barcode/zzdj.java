package com.google.android.gms.internal.mlkit_vision_barcode;

import YU.a;

/* loaded from: classes.dex */
public final class zzdj {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(a.d(i2, "at index "));
            }
        }
        return objArr;
    }
}
