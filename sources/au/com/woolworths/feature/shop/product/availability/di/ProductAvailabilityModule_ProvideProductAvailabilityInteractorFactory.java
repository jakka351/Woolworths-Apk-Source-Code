package au.com.woolworths.feature.shop.product.availability.di;

import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityInteractor;
import au.com.woolworths.feature.shop.product.availability.ProductAvailabilityRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ProductAvailabilityModule_ProvideProductAvailabilityInteractorFactory implements Factory<ProductAvailabilityInteractor> {
    public static ProductAvailabilityInteractor a(ProductAvailabilityModule productAvailabilityModule, ProductAvailabilityRepository productAvailabilityRepository) {
        productAvailabilityModule.getClass();
        return new ProductAvailabilityInteractor(productAvailabilityRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
