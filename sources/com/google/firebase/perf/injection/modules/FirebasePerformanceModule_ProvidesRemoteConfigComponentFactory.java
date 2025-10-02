package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements Factory<Provider<RemoteConfigComponent>> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15698a;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15698a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Provider provider = this.f15698a.c;
        Preconditions.d(provider);
        return provider;
    }
}
