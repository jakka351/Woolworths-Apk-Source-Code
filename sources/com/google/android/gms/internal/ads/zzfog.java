package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
final /* synthetic */ class zzfog implements Continuation {
    static final /* synthetic */ zzfog zza = new zzfog();

    private /* synthetic */ zzfog() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}
