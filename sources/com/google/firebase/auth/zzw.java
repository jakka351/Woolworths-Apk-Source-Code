package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes6.dex */
final class zzw implements Continuation<GetTokenResult, Task<Void>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<Void> then(Task<GetTokenResult> task) {
        if (task.isSuccessful()) {
            throw null;
        }
        return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
    }
}
