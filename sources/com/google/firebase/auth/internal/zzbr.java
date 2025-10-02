package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzbr implements Continuation {
    public /* synthetic */ RecaptchaAction d;
    public /* synthetic */ FirebaseAuth e;
    public /* synthetic */ String f;
    public /* synthetic */ zzbq g;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        RecaptchaAction recaptchaAction = this.d;
        FirebaseAuth firebaseAuth = this.e;
        String str = this.f;
        zzbq zzbqVar = this.g;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (!zzaen.zzd(exc)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exc.getMessage());
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        if (firebaseAuth.i() == null) {
            zzbx zzbxVar = new zzbx(firebaseAuth.f15191a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.j = zzbxVar;
            }
        }
        zzbx zzbxVarI = firebaseAuth.i();
        return zzbxVarI.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(zzbqVar).continueWithTask(new zzbt(str, zzbxVarI, recaptchaAction, zzbqVar));
    }
}
