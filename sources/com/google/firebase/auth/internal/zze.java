package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* loaded from: classes6.dex */
final class zze implements Continuation<zzahr, Task<IntegrityTokenResponse>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<IntegrityTokenResponse> then(Task<zzahr> task) {
        if (task.isSuccessful()) {
            task.getResult().zza();
            throw null;
        }
        Log.e("zzb", "Problem retrieving Play Integrity producer project:  " + task.getException().getMessage());
        return Tasks.forException(task.getException());
    }
}
