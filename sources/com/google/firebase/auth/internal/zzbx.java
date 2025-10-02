package com.google.firebase.auth.internal;

import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class zzbx {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15203a;
    public final HashMap b;
    public zzahs c;
    public final FirebaseApp d;
    public final FirebaseAuth e;
    public final zzbs f;

    public zzbx(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        zzbv zzbvVar = new zzbv();
        this.f15203a = new Object();
        this.b = new HashMap();
        this.d = firebaseApp;
        this.e = firebaseAuth;
        this.f = zzbvVar;
    }

    public final Task a(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        Task taskB;
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(str)) {
            str = "*";
        }
        Task taskB2 = b(str);
        if (bool.booleanValue() || taskB2 == null) {
            if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(str)) {
                str = "*";
            }
            if (bool.booleanValue() || (taskB = b(str)) == null) {
                FirebaseAuth firebaseAuth = this.e;
                taskB2 = firebaseAuth.e.zza(firebaseAuth.i, "RECAPTCHA_ENTERPRISE").continueWithTask(new zzbw(this, str));
            } else {
                taskB2 = taskB;
            }
        }
        return taskB2.continueWithTask(new zzbz(this, recaptchaAction));
    }

    public final Task b(String str) {
        Task task;
        synchronized (this.f15203a) {
            task = (Task) this.b.get(str);
        }
        return task;
    }
}
