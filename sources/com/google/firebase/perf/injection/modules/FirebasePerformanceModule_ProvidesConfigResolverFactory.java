package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements Factory<ConfigResolver> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule f15695a;

    public FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.f15695a = firebasePerformanceModule;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f15695a.getClass();
        ConfigResolver configResolverE = ConfigResolver.e();
        Preconditions.d(configResolverE);
        return configResolverE;
    }
}
