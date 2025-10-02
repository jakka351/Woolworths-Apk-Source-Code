package com.google.firebase.auth.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* loaded from: classes6.dex */
public class zzb {

    /* renamed from: a, reason: collision with root package name */
    public static final zzb f15199a = new zzb();

    public final void a(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException("ERROR_MISSING_ACTIVITY", "App verification failed - a valid Activity is required to complete the Recaptcha flow"));
    }
}
