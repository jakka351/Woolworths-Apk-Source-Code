package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzxa {

    @Nullable
    private static zzwz zza;

    public static synchronized zzwp zza(zzwh zzwhVar) {
        try {
            if (zza == null) {
                zza = new zzwz(null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzwp) zza.get(zzwhVar);
    }

    public static synchronized zzwp zzb(String str) {
        return zza(zzwh.zzd(str).zzd());
    }
}
