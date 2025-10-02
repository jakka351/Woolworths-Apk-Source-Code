package com.google.firebase.auth.internal;

import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes6.dex */
public final /* synthetic */ class zza implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (!task.isSuccessful()) {
            a.v("Failed to initialize reCAPTCHA config: ", task.getException().getMessage(), "zzb");
        }
        throw null;
    }
}
