package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaaw implements zzafv<zzajh> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaaw(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajh zzajhVar) {
        zzajh zzajhVar2 = zzajhVar;
        if (zzajhVar2.zzf()) {
            this.zza.zza(new zzaas(zzajhVar2.zzc(), zzajhVar2.zze(), null));
        } else {
            this.zzb.zza(new zzahv(zzajhVar2.zzd(), zzajhVar2.zzb(), Long.valueOf(zzajhVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
