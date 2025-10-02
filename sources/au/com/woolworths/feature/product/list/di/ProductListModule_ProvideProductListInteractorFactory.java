package au.com.woolworths.feature.product.list.di;

import au.com.woolworths.android.onesite.analytics.FirebasePerfMonitor;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.feature.product.list.ProductListInteractor;
import au.com.woolworths.feature.product.list.ProductsListRepository;
import au.com.woolworths.foundation.advertising.data.google.GoogleAdManagerInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetRepository;
import au.com.woolworths.product.interactor.ProductsInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ProductListModule_ProvideProductListInteractorFactory implements Factory<ProductListInteractor> {
    public static ProductListInteractor a(ProductListModule productListModule, ProductsListRepository productsListRepository, ProductsInteractor productsInteractor, RepositoryManager repositoryManager, GoogleAdManagerInteractor googleAdManagerInteractor, TrolleyInteractor trolleyInteractor, EducationBottomSheetRepository educationBottomSheetRepository, FirebasePerfMonitor firebasePerfMonitor) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        Intrinsics.h(googleAdManagerInteractor, "googleAdManagerInteractor");
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(firebasePerfMonitor, "firebasePerfMonitor");
        return new ProductListInteractor(productsListRepository, productsInteractor, repositoryManager, googleAdManagerInteractor, trolleyInteractor, educationBottomSheetRepository, firebasePerfMonitor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
