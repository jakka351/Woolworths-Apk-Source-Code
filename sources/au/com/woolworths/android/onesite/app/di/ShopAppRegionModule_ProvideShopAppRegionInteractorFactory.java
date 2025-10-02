package au.com.woolworths.android.onesite.app.di;

import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractorImpl;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class ShopAppRegionModule_ProvideShopAppRegionInteractorFactory implements Factory<ShopAppRegionInteractor> {
    public static ShopAppRegionInteractorImpl a(ShopAppRegionModule shopAppRegionModule, ShopAppRegionRepository shopAppRegionRepository) {
        shopAppRegionModule.getClass();
        return new ShopAppRegionInteractorImpl(shopAppRegionRepository);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
