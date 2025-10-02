package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class zzy implements Runnable {
    public final /* synthetic */ FirebaseAuth d;

    public zzy(FirebaseAuth firebaseAuth) {
        this.d = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.d.c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.AuthStateListener) it.next()).a();
        }
    }
}
