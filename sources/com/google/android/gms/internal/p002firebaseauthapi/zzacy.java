package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorAssertion;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzacy extends zzaff<AuthResult, zzl> {
    private final MultiFactorAssertion zzv;
    private final String zzw;

    @Nullable
    private final String zzx;

    public zzacy(MultiFactorAssertion multiFactorAssertion, String str, @Nullable String str2) {
        super(2);
        this.zzv = (MultiFactorAssertion) Preconditions.checkNotNull(multiFactorAssertion);
        this.zzw = Preconditions.checkNotEmpty(str);
        this.zzx = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zzafVarZza = zzacq.zza(this.zzc, this.zzk);
        FirebaseUser firebaseUser = this.zzd;
        if (firebaseUser != null && !firebaseUser.k0().equalsIgnoreCase(zzafVarZza.e.d)) {
            zza(new Status(17024));
        } else {
            ((zzl) this.zze).a(this.zzj, zzafVarZza);
            zzb(new zzz(zzafVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, this.zzv, this.zzx, this.zzb);
    }
}
