package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzms {

    @Nullable
    private static zzmr zza;

    public static synchronized zzmj zza(zzme zzmeVar) {
        try {
            if (zza == null) {
                zza = new zzmr(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzmj) zza.get(zzmeVar);
    }

    public static synchronized zzmj zzb(String str) {
        return zza(zzme.zzd("vision-common").zzd());
    }
}
