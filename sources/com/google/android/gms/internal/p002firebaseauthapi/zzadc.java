package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzl;
import com.google.firebase.auth.internal.zzz;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzadc extends zzaff<AuthResult, zzl> {
    private final EmailAuthCredential zzv;

    @Nullable
    private final String zzw;

    public zzadc(EmailAuthCredential emailAuthCredential, @Nullable String str) {
        super(2);
        this.zzv = (EmailAuthCredential) Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null");
        Preconditions.checkNotEmpty(emailAuthCredential.d, "email cannot be null");
        Preconditions.checkNotEmpty(emailAuthCredential.e, "password cannot be null");
        this.zzw = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
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
        EmailAuthCredential emailAuthCredential = this.zzv;
        zzaeoVar.zza(emailAuthCredential.d, Preconditions.checkNotEmpty(emailAuthCredential.e), this.zzd.zze(), this.zzd.A(), this.zzw, this.zzb);
    }
}
