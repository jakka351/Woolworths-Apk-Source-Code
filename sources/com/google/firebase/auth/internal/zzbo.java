package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes6.dex */
public abstract class zzbo<T> {
    public final Task a(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z;
        zzbq zzbqVar = new zzbq();
        zzbqVar.d = this;
        zzbx zzbxVarI = firebaseAuth.i();
        if (zzbxVarI != null) {
            synchronized (zzbxVarI.f15203a) {
                try {
                    zzahs zzahsVar = zzbxVarI.c;
                    z = zzahsVar != null && zzahsVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                return zzbxVarI.a(str, Boolean.FALSE, recaptchaAction).continueWithTask(zzbqVar).continueWithTask(new zzbt(str, zzbxVarI, recaptchaAction, zzbqVar));
            }
        }
        Task taskB = b(null);
        zzbr zzbrVar = new zzbr();
        zzbrVar.d = recaptchaAction;
        zzbrVar.e = firebaseAuth;
        zzbrVar.f = str;
        zzbrVar.g = zzbqVar;
        return taskB.continueWithTask(zzbrVar);
    }

    public abstract Task b(String str);
}
