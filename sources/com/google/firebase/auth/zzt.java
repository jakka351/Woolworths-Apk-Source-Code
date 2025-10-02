package com.google.firebase.auth;

import YU.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzair;
import com.google.android.gms.internal.p002firebaseauthapi.zzaix;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.internal.zzcc;

/* loaded from: classes6.dex */
final class zzt implements Continuation<zzair, Task<TotpSecret>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<TotpSecret> then(Task<zzair> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzair result = task.getResult();
        if (!(result instanceof zzaix)) {
            throw new IllegalArgumentException(a.h("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", result.getClass().getName(), "."));
        }
        zzaix zzaixVar = (zzaix) result;
        String strCheckNotEmpty = Preconditions.checkNotEmpty(zzaixVar.zzf());
        String strCheckNotEmpty2 = Preconditions.checkNotEmpty(zzaixVar.zze());
        zzaixVar.zzc();
        zzaixVar.zzb();
        zzaixVar.zzd();
        String strCheckNotEmpty3 = Preconditions.checkNotEmpty(zzaixVar.zza());
        zzcc zzccVar = new zzcc();
        Preconditions.checkNotEmpty(strCheckNotEmpty3, "sessionInfo cannot be empty.");
        Preconditions.checkNotNull(null, "firebaseAuth cannot be null.");
        Preconditions.checkNotEmpty(strCheckNotEmpty, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        Preconditions.checkNotEmpty(strCheckNotEmpty2, "hashAlgorithm cannot be empty.");
        zzccVar.f15207a = strCheckNotEmpty3;
        return Tasks.forResult(zzccVar);
    }
}
