package au.com.woolworths.feature.shop.instore.navigation.di;

import au.com.woolworths.feature.shop.instore.navigation.onboarding.domain.ProductFinderOnboardingInteractor;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.domain.ProductFinderOnboardingInteractorImpl;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ProductFinderModule_ProvidesProductFinderOnboardingInteractorFactory implements Factory<ProductFinderOnboardingInteractor> {
    public static ProductFinderOnboardingInteractorImpl a(ProductFinderModule productFinderModule, ProductFinderRepositoryImpl productFinderRepositoryImpl) {
        ProductFinderOnboardingInteractorImpl productFinderOnboardingInteractorImpl = new ProductFinderOnboardingInteractorImpl();
        productFinderOnboardingInteractorImpl.f7424a = productFinderRepositoryImpl;
        return productFinderOnboardingInteractorImpl;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
