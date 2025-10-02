package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements Factory<RemoteConfigManager> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15699a;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15699a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f15699a.getClass();
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        Preconditions.d(remoteConfigManager);
        return remoteConfigManager;
    }
}
