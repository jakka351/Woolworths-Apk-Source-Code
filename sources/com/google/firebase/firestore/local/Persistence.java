package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Supplier;

/* loaded from: classes6.dex */
public abstract class Persistence {
    public abstract BundleCache a();

    public abstract DocumentOverlayCache b(User user);

    public abstract GlobalsCache c();

    public abstract IndexManager d(User user);

    public abstract MutationQueue e(User user, IndexManager indexManager);

    public abstract OverlayMigrationManager f();

    public abstract ReferenceDelegate g();

    public abstract RemoteDocumentCache h();

    public abstract TargetCache i();

    public abstract boolean j();

    public abstract Object k(String str, Supplier supplier);

    public abstract void l(Runnable runnable, String str);

    public abstract void m();
}
