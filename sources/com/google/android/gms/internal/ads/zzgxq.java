package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class zzgxq {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgxq(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgxq zzd(zzgxp zzgxpVar, Class cls, Class cls2) {
        return new zzgxo(cls, cls2, zzgxpVar);
    }

    public abstract zzgzn zza(zzgqd zzgqdVar, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
