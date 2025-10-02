package au.com.woolworths.feature.product.list.di;

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
/* loaded from: classes3.dex */
public final class ProductListModule_ProvidesGoogleAdManagerInteractorFactory implements Factory<GoogleAdManagerInteractor> {
    public static GoogleAdManagerInteractor a(ProductListModule productListModule, GoogleAdManagerRepository googleAdManagerRepository, DispatcherProvider dispatcherProvider, GoogleAdLoadingTimeoutConfig config, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(googleAdManagerRepository, "googleAdManagerRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        Intrinsics.h(config, "config");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        return new GoogleAdManagerInteractor(googleAdManagerRepository, dispatcherProvider, firebasePerfMonitor, config);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
