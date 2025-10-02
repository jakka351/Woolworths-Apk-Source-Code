package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzqe implements zzqf {
    private final zzaaj zza;
    private final zzxb zzb;

    private zzqe(zzxb zzxbVar, zzaaj zzaajVar) {
        this.zzb = zzxbVar;
        this.zza = zzaajVar;
    }

    public static zzqe zza(zzxb zzxbVar) throws GeneralSecurityException {
        return new zzqe(zzxbVar, zzqn.zza(zzxbVar.zzf()));
    }

    public static zzqe zzb(zzxb zzxbVar) {
        return new zzqe(zzxbVar, zzqn.zzb(zzxbVar.zzf()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzqf
    public final zzaaj zzc() {
        return this.zza;
    }

    public final zzxb zza() {
        return this.zzb;
    }
}
