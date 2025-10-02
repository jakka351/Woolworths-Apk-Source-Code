package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;

/* loaded from: classes6.dex */
final class zzbt implements Continuation {
    public final /* synthetic */ String d;
    public final /* synthetic */ zzbx e;
    public final /* synthetic */ RecaptchaAction f;
    public final /* synthetic */ Continuation g;

    public zzbt(String str, zzbx zzbxVar, RecaptchaAction recaptchaAction, Continuation continuation) {
        this.d = str;
        this.e = zzbxVar;
        this.f = recaptchaAction;
        this.g = continuation;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful() || !zzaen.zzc((Exception) Preconditions.checkNotNull(task.getException()))) {
            return task;
        }
        boolean zIsLoggable = Log.isLoggable("RecaptchaCallWrapper", 4);
        String str = this.d;
        if (zIsLoggable) {
            Log.i("RecaptchaCallWrapper", "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant " + str);
        }
        return this.e.a(str, Boolean.TRUE, this.f).continueWithTask(this.g);
    }
}
