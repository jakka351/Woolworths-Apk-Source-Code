package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzk;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzadf extends zzaff<AuthResult, zzl> {
    private final zzajb zzv;

    public zzadf(AuthCredential authCredential, @Nullable String str) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        this.zzv = zzk.a(authCredential, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zzafVarZza = zzacq.zza(this.zzc, this.zzk);
        if (!this.zzd.k0().equalsIgnoreCase(zzafVarZza.e.d)) {
            zza(new Status(17024));
        } else {
            ((zzl) this.zze).a(this.zzj, zzafVarZza);
            zzb(new zzz(zzafVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
