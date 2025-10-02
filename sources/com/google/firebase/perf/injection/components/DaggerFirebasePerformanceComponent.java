package com.google.firebase.perf.injection.components;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

@DaggerGenerated
/* loaded from: classes.dex */
public final class DaggerFirebasePerformanceComponent {

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public FirebasePerformanceModule f15692a;

        public final FirebasePerformanceComponent a() {
            Preconditions.a(FirebasePerformanceModule.class, this.f15692a);
            FirebasePerformanceModule firebasePerformanceModule = this.f15692a;
            FirebasePerformanceComponentImpl firebasePerformanceComponentImpl = new FirebasePerformanceComponentImpl();
            firebasePerformanceComponentImpl.f15693a = DoubleCheck.b(new FirebasePerformance_Factory(new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule), new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule)));
            return firebasePerformanceComponentImpl;
        }
    }

    public static final class FirebasePerformanceComponentImpl implements FirebasePerformanceComponent {

        /* renamed from: a, reason: collision with root package name */
        public Provider f15693a;

        @Override // com.google.firebase.perf.injection.components.FirebasePerformanceComponent
        public final FirebasePerformance a() {
            return (FirebasePerformance) this.f15693a.get();
        }
    }
}
