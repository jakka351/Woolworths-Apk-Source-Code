package au.com.woolworths.shop.product.details.di;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.product.details.ProductDetailsPageInteractor;
import au.com.woolworths.shop.product.details.ProductDetailsPageInteractorImpl;
import au.com.woolworths.shop.product.details.ProductDetailsPageRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ProductDetailsAppModule_ProvidesProductDetailsInteractorFactory implements Factory<ProductDetailsPageInteractor> {
    public static ProductDetailsPageInteractorImpl a(ProductDetailsAppModule productDetailsAppModule, ProductDetailsPageRepository productDetailsPageRepository, CollectionModeInteractor collectionModeInteractor, FeatureToggleManager featureToggleManager) {
        productDetailsAppModule.getClass();
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        return new ProductDetailsPageInteractorImpl(productDetailsPageRepository, collectionModeInteractor, featureToggleManager);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
