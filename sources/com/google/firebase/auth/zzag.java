package com.google.firebase.auth;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
final class zzag implements Continuation<GetTokenResult, Task<Void>> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Task<Void> then(Task<GetTokenResult> task) {
        task.getResult();
        throw null;
    }
}
