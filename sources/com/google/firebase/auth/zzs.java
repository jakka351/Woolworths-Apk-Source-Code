package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes6.dex */
final class zzs implements Continuation<Void, Task<Void>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<Void> then(Task<Void> task) {
        return (!task.isSuccessful() && (task.getException() instanceof FirebaseAuthException) && ((FirebaseAuthException) task.getException()).d.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) ? Tasks.forResult(null) : task;
    }
}
