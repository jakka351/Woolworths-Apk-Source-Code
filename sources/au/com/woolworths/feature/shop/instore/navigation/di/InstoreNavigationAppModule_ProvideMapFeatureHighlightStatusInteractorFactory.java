package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.featurehighlight.domain.MapFeatureHighlightStatusInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepositoryImpl;
import au.com.woolworths.foundation.shop.instore.navigation.featurehighlight.MapFeatureHighlightStatusInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvideMapFeatureHighlightStatusInteractorFactory implements Factory<MapFeatureHighlightStatusInteractor> {
    public static MapFeatureHighlightStatusInteractorImpl a(InstoreNavigationAppModule instoreNavigationAppModule, ProductFinderRepositoryImpl productFinderRepositoryImpl, InstoreNavigationInteractor instoreNavigationInteractor) {
        instoreNavigationAppModule.getClass();
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        return new MapFeatureHighlightStatusInteractorImpl(productFinderRepositoryImpl, instoreNavigationInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
