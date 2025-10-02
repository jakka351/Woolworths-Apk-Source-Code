package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements Factory<FirebaseInstallationsApi> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15697a;

    public FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15697a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        FirebaseInstallationsApi firebaseInstallationsApi = this.f15697a.b;
        Preconditions.d(firebaseInstallationsApi);
        return firebaseInstallationsApi;
    }
}
