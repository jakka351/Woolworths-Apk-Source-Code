package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzcv {

    @Nullable
    private static Executor zza;

    public static synchronized Executor zza() {
        try {
            if (zza == null) {
                zza = zzeo.zzf("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }
}
