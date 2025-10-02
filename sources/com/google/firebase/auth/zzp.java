package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.zzbo;

/* loaded from: classes6.dex */
final class zzp extends zzbo<Void> {
    @Override // com.google.firebase.auth.internal.zzbo
    public final Task b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link sign in for null with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for null");
        }
        throw null;
    }
}
