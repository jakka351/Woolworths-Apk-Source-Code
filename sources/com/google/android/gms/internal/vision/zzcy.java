package com.google.android.gms.internal.vision;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class zzcy<T> implements Serializable {
    public static <T> zzcy<T> zza(T t) {
        return new zzdd(zzde.zza(t));
    }

    public static <T> zzcy<T> zzc() {
        return zzcv.zza;
    }

    public abstract boolean zza();

    public abstract T zzb();
}
