package au.com.woolworths.feature.shop.catalogue.di;

import android.content.SharedPreferences;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepository;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreRepositoryImpl;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatalogueAppModule_ProvidesCatalogueRepositoryFactory implements Factory<CatalogueStoreRepository> {
    public static CatalogueStoreRepositoryImpl a(CatalogueAppModule catalogueAppModule, SharedPreferences sharedPreferences, Gson gson) {
        catalogueAppModule.getClass();
        return new CatalogueStoreRepositoryImpl(sharedPreferences, gson);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
