package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class zzar {
    private static final zzbb zza;

    static {
        zzbb zzaqVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            zzaqVar = new zzap();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zzaqVar = new zzaq();
        }
        zza = zzaqVar;
    }

    public static zzbb zza() {
        return zza;
    }
}
