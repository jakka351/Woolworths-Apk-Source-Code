package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;

@VisibleForTesting
/* loaded from: classes5.dex */
final class zzadz extends zzaff<Void, PhoneAuthProvider.OnVerificationStateChangedCallbacks> {
    private final zzaaq zzv;

    public zzadz(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, @Nullable String str2, long j, boolean z, boolean z2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z3) {
        super(8);
        Preconditions.checkNotNull(phoneMultiFactorInfo);
        Preconditions.checkNotEmpty(str);
        this.zzv = new zzaaq(phoneMultiFactorInfo, str, str2, j, z, z2, str3, str4, str5, z3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
