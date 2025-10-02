package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbz implements Continuation<RecaptchaTasksClient, Task<String>> {
    public final /* synthetic */ RecaptchaAction d;

    public zzbz(zzbx zzbxVar, RecaptchaAction recaptchaAction) {
        this.d = recaptchaAction;
        Objects.requireNonNull(zzbxVar);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<String> then(Task<RecaptchaTasksClient> task) {
        if (task.isSuccessful()) {
            return task.getResult().executeTask(this.d);
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (!(exc instanceof zzbu)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }
}
