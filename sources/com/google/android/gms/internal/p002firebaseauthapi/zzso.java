package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzso extends zzst {
    private final zzsr zza;
    private final zzaal zzb;

    private zzso(zzsr zzsrVar, zzaal zzaalVar) {
        this.zza = zzsrVar;
        this.zzb = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzst, com.google.android.gms.internal.p002firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzsr) zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbi
    @Nullable
    public final Integer zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzst
    /* renamed from: zzc */
    public final /* synthetic */ zzss zza() {
        return this.zza;
    }

    public final zzaal zzd() {
        return this.zzb;
    }

    public static zzso zza(zzsr zzsrVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzsrVar.zzb() == zzaalVar.zza()) {
            return new zzso(zzsrVar, zzaalVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
