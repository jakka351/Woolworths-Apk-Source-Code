package au.com.woolworths.shop.product.navigation.di;

import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
import au.com.woolworths.shop.product.navigation.ProductCategoryNavigationInteractor;
import au.com.woolworths.shop.product.navigation.ProductCategoryNavigationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlin.jvm.internal.Intrinsics;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShopProductNavigationModule_ProvideProductNavigationInteractorFactory implements Factory<ProductCategoryNavigationInteractor> {
    public static ProductCategoryNavigationInteractor a(ShopProductNavigationModule shopProductNavigationModule, RepositoryManager repositoryManager, ProductCategoryNavigationRepository productCategoryNavigationRepository) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        return new ProductCategoryNavigationInteractor(repositoryManager, productCategoryNavigationRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
