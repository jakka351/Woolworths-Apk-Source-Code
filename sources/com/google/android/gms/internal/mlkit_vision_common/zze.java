package com.google.android.gms.internal.mlkit_vision_common;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class zze {
    private static final Logger zza = Logger.getLogger(zze.class.getName());
    private static final zzd zzb = new zzd(null);

    private zze() {
    }

    public static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
