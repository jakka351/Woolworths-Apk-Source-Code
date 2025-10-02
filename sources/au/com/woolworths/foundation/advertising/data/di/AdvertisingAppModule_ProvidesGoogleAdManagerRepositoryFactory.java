package au.com.woolworths.foundation.advertising.data.di;

import android.app.Application;
import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerRepository;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class AdvertisingAppModule_ProvidesGoogleAdManagerRepositoryFactory implements Factory<GoogleAdManagerRepository> {
    public static GoogleAdManagerRepository a(AdvertisingAppModule advertisingAppModule, Application application, Gson gson, DispatcherProvider dispatchers, FirebasePerfMonitor firebasePerfMonitor, FeatureToggleManager featureToggleManager) {
        advertisingAppModule.getClass();
        Intrinsics.h(gson, "gson");
        Intrinsics.h(dispatchers, "dispatchers");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new GoogleAdManagerRepository(application, gson, dispatchers, firebasePerfMonitor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
