package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes6.dex */
final class zzat implements Runnable {
    public final String d;
    public final /* synthetic */ zzaq e;

    public zzat(zzaq zzaqVar, String str) {
        this.e = zzaqVar;
        this.d = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(FirebaseApp.e(this.d));
        if (firebaseAuth.f != null) {
            Task taskC = firebaseAuth.c(true);
            zzaq.f.v("Token refreshing started", new Object[0]);
            taskC.addOnFailureListener(new zzas(this));
        }
    }
}
