package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabd implements zzafv<zzajf> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabd(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzajf zzajfVar) {
        zzajf zzajfVar2 = zzajfVar;
        this.zzb.zza(new zzahv(zzajfVar2.zzc(), zzajfVar2.zzb(), Long.valueOf(zzajfVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzajfVar2.zzd()), null, this.zza, this);
    }
}
