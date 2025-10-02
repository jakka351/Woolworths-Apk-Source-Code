package au.com.woolworths.feature.shop.catalogue.di;

import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractor;
import au.com.woolworths.feature.shop.catalogue.CatalogueConfigInteractorImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueModule_ProvideCatalogueConfigInteractorFactory implements Factory<CatalogueConfigInteractor> {
    public static CatalogueConfigInteractorImpl a(CatalogueModule catalogueModule) {
        catalogueModule.getClass();
        return new CatalogueConfigInteractorImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
