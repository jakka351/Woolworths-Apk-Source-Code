package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaav implements zzafv<zzahv> {
    private final /* synthetic */ EmailAuthCredential zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    public zzaav(zzaar zzaarVar, EmailAuthCredential emailAuthCredential, String str, zzael zzaelVar) {
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzc.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzd.zza(new zzagx(this.zza, zzahvVar.zzc(), this.zzb), this.zzc);
    }
}
