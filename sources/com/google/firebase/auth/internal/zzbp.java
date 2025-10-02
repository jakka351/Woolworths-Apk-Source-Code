package com.google.firebase.auth.internal;

import android.net.Uri;
import android.util.Log;
import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.AppCheckTokenResult;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzbp implements Continuation {
    public /* synthetic */ Uri d;

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Uri uri = this.d;
        zzcg zzcgVar = RecaptchaActivity.v;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
            if (appCheckTokenResult.a() != null) {
                Log.w("RecaptchaActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.a())));
            }
            builderBuildUpon.fragment("fac=" + appCheckTokenResult.b());
        } else {
            a.v("Unexpected error getting App Check token: ", task.getException().getMessage(), "RecaptchaActivity");
        }
        return builderBuildUpon.build();
    }
}
