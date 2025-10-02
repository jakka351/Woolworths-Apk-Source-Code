package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzd implements OnCompleteListener {
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            ((IntegrityTokenResponse) task.getResult()).token();
            throw null;
        }
        Log.e("zzb", "Play Integrity Token fetch failed, falling back to Recaptcha" + (task.getException() == null ? "" : task.getException().getMessage()));
        throw null;
    }
}
