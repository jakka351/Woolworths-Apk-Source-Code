package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.VisibleForTesting;
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
final class zzadb extends zzaff<AuthResult, zzl> {
    private final zzajb zzv;

    public zzadb(AuthCredential authCredential) {
        super(2);
        Preconditions.checkNotNull(authCredential, "credential cannot be null");
        this.zzv = zzk.a(authCredential, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzaf zzafVarZza = zzacq.zza(this.zzc, this.zzk);
        ((zzl) this.zze).a(this.zzj, zzafVarZza);
        zzb(new zzz(zzafVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzd.zze(), this.zzv, this.zzb);
    }
}
