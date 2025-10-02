package au.com.woolworths.foundation.advertising.data.di;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository;
import au.com.woolworths.foundation.advertising.data.google.model.GoogleAdLoadingTimeoutConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class AdvertisingAppModule_ProvidesGoogleAdManagerInteractorFactory implements Factory<GoogleAdManagerInteractor> {
    public static GoogleAdManagerInteractor a(AdvertisingAppModule advertisingAppModule, GoogleAdManagerRepository googleAdManagerRepository, DispatcherProvider dispatcherProvider, FirebasePerfMonitor firebasePerfMonitor, GoogleAdLoadingTimeoutConfig config) {
        advertisingAppModule.getClass();
        Intrinsics.h(googleAdManagerRepository, "googleAdManagerRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(config, "config");
        return new GoogleAdManagerInteractor(googleAdManagerRepository, dispatcherProvider, firebasePerfMonitor, config);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
