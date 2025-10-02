package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactorSession;

/* loaded from: classes6.dex */
final class zzai implements Continuation<GetTokenResult, Task<MultiFactorSession>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<MultiFactorSession> then(Task<GetTokenResult> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        String str = task.getResult().f15194a;
        throw null;
    }
}
