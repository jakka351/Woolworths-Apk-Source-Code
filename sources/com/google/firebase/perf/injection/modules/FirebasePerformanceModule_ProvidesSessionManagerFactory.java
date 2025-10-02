package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements Factory<SessionManager> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15700a;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15700a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f15700a.getClass();
        SessionManager sessionManager = SessionManager.getInstance();
        Preconditions.d(sessionManager);
        return sessionManager;
    }
}
