package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.internal.zzl;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzadp extends zzaff<Void, zzl> {

    @NonNull
    private final zzahm zzv;
    private final String zzw;

    public zzadp(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, @Nullable String str3, String str4) {
        super(4);
        Preconditions.checkNotEmpty(str, "email cannot be null or empty");
        zzahm zzahmVar = new zzahm(actionCodeSettings.l);
        this.zzv = zzahmVar;
        zzahmVar.zzb(str);
        zzahmVar.zza(actionCodeSettings);
        zzahmVar.zzc(str2);
        zzahmVar.zza(str3);
        this.zzw = str4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zzb(this.zzv, this.zzb);
    }
}
