package com.google.firebase.firestore.auth;

import au.com.woolworths.android.onesite.modules.checkout.digitalpay.m;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.util.Executors;
import com.google.firebase.firestore.util.Listener;
import com.google.firebase.inject.Deferred;

/* loaded from: classes6.dex */
public final class FirebaseAuthCredentialsProvider extends CredentialsProvider<User> {

    /* renamed from: a, reason: collision with root package name */
    public final a f15435a = new IdTokenListener() { // from class: com.google.firebase.firestore.auth.a
        @Override // com.google.firebase.auth.internal.IdTokenListener
        public final void a() {
            this.f15437a.c();
        }
    };
    public InternalAuthProvider b;
    public Listener c;
    public int d;
    public boolean e;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.firestore.auth.a] */
    public FirebaseAuthCredentialsProvider(Deferred deferred) {
        deferred.a(new au.com.woolworths.product.details.epoxy.a(this, 20));
    }

    public final synchronized Task a() {
        InternalAuthProvider internalAuthProvider = this.b;
        if (internalAuthProvider == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("auth is not available"));
        }
        Task taskC = internalAuthProvider.c(this.e);
        this.e = false;
        return taskC.continueWithTask(Executors.b, new m(this, this.d));
    }

    public final synchronized User b() {
        String strA;
        try {
            InternalAuthProvider internalAuthProvider = this.b;
            strA = internalAuthProvider == null ? null : internalAuthProvider.a();
        } catch (Throwable th) {
            throw th;
        }
        return strA != null ? new User(strA) : User.b;
    }

    public final synchronized void c() {
        this.d++;
        Listener listener = this.c;
        if (listener != null) {
            listener.c(b());
        }
    }
}
