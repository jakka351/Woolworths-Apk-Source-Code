package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzmw {

    @Nullable
    private static zzmw zza;

    private zzmw() {
    }

    public static synchronized zzmw zza() {
        try {
            if (zza == null) {
                zza = new zzmw();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static final boolean zzb() {
        return zzmv.zza("mlkit-dev-profiling");
    }
}
