package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class zzgzc {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgzc(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgzc zzd(zzgzb zzgzbVar, Class cls, Class cls2) {
        return new zzgza(cls, cls2, zzgzbVar);
    }

    public abstract Object zza(zzgqd zzgqdVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
