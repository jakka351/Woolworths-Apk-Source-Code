package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzss {

    @Nullable
    private static zzsr zza;

    public static synchronized zzsh zza(zzsb zzsbVar) {
        try {
            if (zza == null) {
                zza = new zzsr(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzsh) zza.get(zzsbVar);
    }

    public static synchronized zzsh zzb(String str) {
        return zza(zzsb.zzd("common").zzd());
    }
}
