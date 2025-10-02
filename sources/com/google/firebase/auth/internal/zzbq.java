package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzbq implements Continuation {
    public /* synthetic */ zzbo d;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zzbo zzboVar = this.d;
        if (task.isSuccessful()) {
            return zzboVar.b((String) task.getResult());
        }
        Log.e("RecaptchaCallWrapper", "Failed to get Recaptcha token, error - " + ((Exception) Preconditions.checkNotNull(task.getException())).getMessage() + "\n\n Failing open with a fake token.");
        return zzboVar.b("NO_RECAPTCHA");
    }
}
