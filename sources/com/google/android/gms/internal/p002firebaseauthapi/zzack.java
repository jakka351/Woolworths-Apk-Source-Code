package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzao;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzack implements zzafv<zzahv> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzack(zzaar zzaarVar, UserProfileChangeRequest userProfileChangeRequest, zzael zzaelVar) {
        this.zza = userProfileChangeRequest;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(@Nullable String str) {
        this.zzb.zza(zzao.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc());
        UserProfileChangeRequest userProfileChangeRequest = this.zza;
        if (userProfileChangeRequest.f || userProfileChangeRequest.d != null) {
            zzailVar.zzb(userProfileChangeRequest.d);
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.zza;
        if (userProfileChangeRequest2.g || userProfileChangeRequest2.h != null) {
            zzailVar.zzg(userProfileChangeRequest2.e);
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }
}
