package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzabq implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;

    public zzabq(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzc.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        this.zza.zza.zza(new zzahi(zzahvVar2.zzc()), new zzabp(this, this, zzahvVar2, this.zzb, this.zzc));
    }
}
