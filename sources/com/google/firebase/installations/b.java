package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ FirebaseInstallations e;

    public /* synthetic */ b(FirebaseInstallations firebaseInstallations, int i) {
        this.d = i;
        this.e = firebaseInstallations;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        PersistedInstallationEntry persistedInstallationEntryC;
        PersistedInstallationEntry persistedInstallationEntryE;
        switch (this.d) {
            case 0:
                FirebaseInstallations firebaseInstallations = this.e;
                Object obj = FirebaseInstallations.m;
                synchronized (obj) {
                    try {
                        FirebaseApp firebaseApp = firebaseInstallations.f15612a;
                        firebaseApp.a();
                        CrossProcessLock crossProcessLockA = CrossProcessLock.a(firebaseApp.f15169a);
                        try {
                            persistedInstallationEntryC = firebaseInstallations.c.c();
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                        } catch (Throwable th) {
                            if (crossProcessLockA != null) {
                                crossProcessLockA.b();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.h) {
                        persistedInstallationEntryE = firebaseInstallations.e(persistedInstallationEntryC);
                    } else {
                        if (persistedInstallationEntryC.f() == PersistedInstallation.RegistrationStatus.f) {
                            persistedInstallationEntryE = firebaseInstallations.e(persistedInstallationEntryC);
                        } else if (!firebaseInstallations.d.a(persistedInstallationEntryC)) {
                            return;
                        } else {
                            persistedInstallationEntryE = firebaseInstallations.c(persistedInstallationEntryC);
                        }
                    }
                    synchronized (obj) {
                        try {
                            FirebaseApp firebaseApp2 = firebaseInstallations.f15612a;
                            firebaseApp2.a();
                            CrossProcessLock crossProcessLockA2 = CrossProcessLock.a(firebaseApp2.f15169a);
                            try {
                                firebaseInstallations.c.b(persistedInstallationEntryE);
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                            } catch (Throwable th2) {
                                if (crossProcessLockA2 != null) {
                                    crossProcessLockA2.b();
                                }
                                throw th2;
                            }
                        } finally {
                        }
                    }
                    synchronized (firebaseInstallations) {
                        if (firebaseInstallations.k.size() != 0 && !TextUtils.equals(persistedInstallationEntryC.c(), persistedInstallationEntryE.c())) {
                            Iterator it = firebaseInstallations.k.iterator();
                            while (it.hasNext()) {
                                ((FidListener) it.next()).a();
                            }
                        }
                    }
                    if (persistedInstallationEntryE.f() == PersistedInstallation.RegistrationStatus.g) {
                        String strC = persistedInstallationEntryE.c();
                        synchronized (firebaseInstallations) {
                            firebaseInstallations.j = strC;
                        }
                    }
                    if (persistedInstallationEntryE.f() == PersistedInstallation.RegistrationStatus.h) {
                        firebaseInstallations.f(new FirebaseInstallationsException());
                        return;
                    } else if (persistedInstallationEntryE.f() == PersistedInstallation.RegistrationStatus.e || persistedInstallationEntryE.f() == PersistedInstallation.RegistrationStatus.d) {
                        firebaseInstallations.f(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        firebaseInstallations.g(persistedInstallationEntryE);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    firebaseInstallations.f(e);
                    return;
                }
            case 1:
                FirebaseInstallations firebaseInstallations2 = this.e;
                Object obj2 = FirebaseInstallations.m;
                firebaseInstallations2.b();
                return;
            default:
                FirebaseInstallations firebaseInstallations3 = this.e;
                Object obj3 = FirebaseInstallations.m;
                firebaseInstallations3.b();
                return;
        }
    }
}
