package com.google.firebase.auth.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.FirebaseAuthException;

/* loaded from: classes6.dex */
final class zzh implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("zzb", "Failed to get reCAPTCHA token with error [" + exc.getMessage() + "]- calling backend without app verification");
        if (!(exc instanceof FirebaseAuthException) || !((FirebaseAuthException) exc).d.endsWith("UNAUTHORIZED_DOMAIN")) {
            throw null;
        }
        throw null;
    }
}
