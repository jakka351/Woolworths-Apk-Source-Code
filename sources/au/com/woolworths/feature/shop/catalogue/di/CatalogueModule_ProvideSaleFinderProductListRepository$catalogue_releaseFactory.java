package au.com.woolworths.feature.shop.catalogue.di;

import au.com.woolworths.feature.shop.catalogue.CatalogueApiInterface;
import au.com.woolworths.feature.shop.catalogue.productlist.interactor.SaleFinderProductListRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueModule_ProvideSaleFinderProductListRepository$catalogue_releaseFactory implements Factory<SaleFinderProductListRepository> {
    public static SaleFinderProductListRepository a(CatalogueModule catalogueModule, CatalogueApiInterface catalogueApiInterface) {
        return new SaleFinderProductListRepository(catalogueApiInterface);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
