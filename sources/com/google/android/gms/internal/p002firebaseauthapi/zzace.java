package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzace implements zzafv<zzahv> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzace(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zza.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzb.zza.zza(new zzagu(zzahvVar.zzc()), new zzacd(this, this.zza, this));
    }
}
