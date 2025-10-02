package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaat implements zzafv<zzaip> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaat(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzaip zzaipVar) {
        zzaip zzaipVar2 = zzaipVar;
        this.zzb.zza(new zzahv(zzaipVar2.zzc(), zzaipVar2.zzb(), Long.valueOf(zzaipVar2.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }
}
