package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.impl.b;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(b.n(obj, "null value in entry: ", "=null"));
        }
    }
}
