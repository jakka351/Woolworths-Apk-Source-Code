package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class zzgxn {
    private final zzhgg zza;
    private final Class zzb;

    public /* synthetic */ zzgxn(zzhgg zzhggVar, Class cls, byte[] bArr) {
        this.zza = zzhggVar;
        this.zzb = cls;
    }

    public static zzgxn zzd(zzgxm zzgxmVar, zzhgg zzhggVar, Class cls) {
        return new zzgxl(zzhggVar, cls, zzgxmVar);
    }

    public abstract zzgqd zza(zzgzn zzgznVar, @Nullable zzgqt zzgqtVar) throws GeneralSecurityException;

    public final zzhgg zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
