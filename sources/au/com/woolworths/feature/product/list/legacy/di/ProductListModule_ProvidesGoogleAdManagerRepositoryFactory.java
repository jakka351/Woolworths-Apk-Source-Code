package au.com.woolworths.feature.product.list.legacy.di;

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
/* loaded from: classes3.dex */
public final class ProductListModule_ProvidesGoogleAdManagerRepositoryFactory implements Factory<GoogleAdManagerRepository> {
    public static GoogleAdManagerRepository a(ProductListModule productListModule, Application application, Gson gson, DispatcherProvider dispatchers, FirebasePerfMonitor firebasePerfMonitor, FeatureToggleManager featureToggleManager) {
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
