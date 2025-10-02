package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabs implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;

    public zzabs(zzaar zzaarVar, String str, String str2, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzd.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zza.zza.zza(new zzaji(zzahvVar.zzc(), this.zzb, this.zzc), new zzabr(this, this.zzd));
    }
}
