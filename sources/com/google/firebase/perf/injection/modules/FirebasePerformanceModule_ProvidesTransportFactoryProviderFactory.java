package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements Factory<Provider<TransportFactory>> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15701a;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15701a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Provider provider = this.f15701a.d;
        Preconditions.d(provider);
        return provider;
    }
}
