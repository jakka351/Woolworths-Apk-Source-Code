package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    public zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Object... objArr) {
        onVerificationStateChangedCallbacks.onVerificationFailed(zzaen.zza(this.zza));
    }
}
