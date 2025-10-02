package au.com.woolworths.feature.shop.catalogue.di;

import au.com.woolworths.feature.shop.catalogue.productlist.interactor.ProductsForStoreInteractor;
import au.com.woolworths.foundation.shop.collectionmode.RepositoryManager;
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
public final class CatalogueModule_ProvideProductsForStoreInteractor$catalogue_releaseFactory implements Factory<ProductsForStoreInteractor> {
    public static ProductsForStoreInteractor a(CatalogueModule catalogueModule, RepositoryManager repositoryManager, ProductsInteractor productsInteractor) {
        Intrinsics.h(repositoryManager, "repositoryManager");
        return new ProductsForStoreInteractor(repositoryManager, productsInteractor);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
