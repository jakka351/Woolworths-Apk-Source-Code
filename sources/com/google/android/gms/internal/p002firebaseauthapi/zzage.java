package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(@NonNull Exception exc) {
        zzagc.zza.e(a.A("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
