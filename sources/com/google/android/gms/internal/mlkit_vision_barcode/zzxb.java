package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzxb {

    @Nullable
    private static zzxb zza;

    private zzxb() {
    }

    public static synchronized zzxb zza() {
        try {
            if (zza == null) {
                zza = new zzxb();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
