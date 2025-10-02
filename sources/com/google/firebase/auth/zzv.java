package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.internal.InternalTokenResult;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class zzv implements Runnable {
    public final /* synthetic */ FirebaseAuth d;

    public zzv(FirebaseAuth firebaseAuth, InternalTokenResult internalTokenResult) {
        this.d = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = this.d;
        Iterator it = firebaseAuth.d.iterator();
        while (it.hasNext()) {
            ((IdTokenListener) it.next()).a();
        }
        Iterator it2 = firebaseAuth.b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.IdTokenListener) it2.next()).a();
        }
    }
}
