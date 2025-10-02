package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes5.dex */
public enum zzflw {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);

    private final String zzd;

    zzflw(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
