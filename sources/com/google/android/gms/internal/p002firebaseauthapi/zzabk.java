package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabk implements zzafv<zzaip> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafs zzb;
    private final /* synthetic */ zzaar zzc;

    public zzabk(zzaar zzaarVar, zzael zzaelVar, zzafs zzafsVar) {
        this.zza = zzaelVar;
        this.zzb = zzafsVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzaip zzaipVar) {
        zzaip zzaipVar2 = zzaipVar;
        this.zzc.zza(new zzahv(zzaipVar2.zzc(), zzaipVar2.zzb(), Long.valueOf(zzaipVar2.zza()), "Bearer"), null, "password", Boolean.FALSE, null, this.zza, this);
    }
}
