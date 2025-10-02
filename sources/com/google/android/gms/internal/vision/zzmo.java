package com.google.android.gms.internal.vision;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public enum zzmo {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzht.zza),
    ENUM(null),
    MESSAGE(null);

    private final Object zzj;

    zzmo(Object obj) {
        this.zzj = obj;
    }
}
