package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public final class zzbcp {
    public static boolean zza(@Nullable zzbcx zzbcxVar, @Nullable zzbcu zzbcuVar, String... strArr) {
        if (zzbcuVar == null) {
            return false;
        }
        zzbcxVar.zzb(zzbcuVar, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), strArr);
        return true;
    }
}
