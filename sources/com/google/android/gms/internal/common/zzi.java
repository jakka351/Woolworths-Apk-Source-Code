package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public class zzi {
    private final Class zza;

    @Nullable
    private final Object zzb;

    private zzi(Class cls, @Nullable Object obj) {
        this.zza = cls;
        this.zzb = obj;
    }

    public static zzi zzb(Class cls, @Nullable Object obj) {
        return new zzi(cls, obj);
    }

    public final Class zzc() {
        return this.zza;
    }

    @Nullable
    public final Object zzd() {
        return this.zzb;
    }

    public /* synthetic */ zzi(Class cls, Object obj, byte[] bArr) {
        this(cls, obj);
    }
}
