package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements Factory<FirebaseApp> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15696a;

    public FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15696a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FirebaseApp firebaseApp = this.f15696a.f15694a;
        Preconditions.d(firebaseApp);
        return firebaseApp;
    }
}
