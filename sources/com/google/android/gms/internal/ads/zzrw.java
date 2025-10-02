package com.google.android.gms.internal.ads;

import android.os.Build;

/* loaded from: classes5.dex */
public final class zzrw {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        zza = z;
    }
}
