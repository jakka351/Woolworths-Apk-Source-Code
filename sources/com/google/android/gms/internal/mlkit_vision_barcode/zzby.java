package com.google.android.gms.internal.mlkit_vision_barcode;

import YU.a;

/* loaded from: classes5.dex */
final class zzby {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static void zzb(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.h("null value in entry: ", obj.toString(), "=null"));
        }
    }
}
