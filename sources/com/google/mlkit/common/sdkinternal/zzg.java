package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzg implements Continuation {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return (Task) task.getResult();
    }
}
