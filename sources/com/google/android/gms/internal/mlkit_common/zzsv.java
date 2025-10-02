package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzsv {

    @Nullable
    private static zzsv zza;

    private zzsv() {
    }

    public static synchronized zzsv zza() {
        try {
            if (zza == null) {
                zza = new zzsv();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public static void zzb() {
        zzsu.zza();
    }
}
