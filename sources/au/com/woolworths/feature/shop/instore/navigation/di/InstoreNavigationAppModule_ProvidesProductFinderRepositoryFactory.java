package au.com.woolworths.feature.shop.instore.navigation.di;

import android.content.SharedPreferences;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepository;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InstoreNavigationAppModule_ProvidesProductFinderRepositoryFactory implements Factory<ProductFinderRepository> {
    public static ProductFinderRepositoryImpl a(InstoreNavigationAppModule instoreNavigationAppModule, SharedPreferences sharedPreferences) {
        instoreNavigationAppModule.getClass();
        return new ProductFinderRepositoryImpl(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
