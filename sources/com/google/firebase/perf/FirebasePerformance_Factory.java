package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import com.google.firebase.perf.session.SessionManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class FirebasePerformance_Factory implements Factory<FirebasePerformance> {

    /* renamed from: a, reason: collision with root package name */
    public final FirebasePerformanceModule_ProvidesFirebaseAppFactory f15667a;
    public final FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory b;
    public final FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory c;
    public final FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory d;
    public final FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory e;
    public final FirebasePerformanceModule_ProvidesConfigResolverFactory f;
    public final FirebasePerformanceModule_ProvidesSessionManagerFactory g;

    public FirebasePerformance_Factory(FirebasePerformanceModule_ProvidesFirebaseAppFactory firebasePerformanceModule_ProvidesFirebaseAppFactory, FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory firebasePerformanceModule_ProvidesRemoteConfigComponentFactory, FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory firebasePerformanceModule_ProvidesFirebaseInstallationsFactory, FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory firebasePerformanceModule_ProvidesTransportFactoryProviderFactory, FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory firebasePerformanceModule_ProvidesRemoteConfigManagerFactory, FirebasePerformanceModule_ProvidesConfigResolverFactory firebasePerformanceModule_ProvidesConfigResolverFactory, FirebasePerformanceModule_ProvidesSessionManagerFactory firebasePerformanceModule_ProvidesSessionManagerFactory) {
        this.f15667a = firebasePerformanceModule_ProvidesFirebaseAppFactory;
        this.b = firebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
        this.c = firebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
        this.d = firebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
        this.e = firebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
        this.f = firebasePerformanceModule_ProvidesConfigResolverFactory;
        this.g = firebasePerformanceModule_ProvidesSessionManagerFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new FirebasePerformance((FirebaseApp) this.f15667a.get(), (Provider) this.b.get(), (FirebaseInstallationsApi) this.c.get(), (Provider) this.d.get(), (RemoteConfigManager) this.e.get(), (ConfigResolver) this.f.get(), (SessionManager) this.g.get());
    }
}
