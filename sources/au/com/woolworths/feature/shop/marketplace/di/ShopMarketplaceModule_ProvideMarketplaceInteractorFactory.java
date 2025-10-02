package au.com.woolworths.feature.shop.marketplace.di;

import au.com.woolworths.feature.shop.marketplace.data.source.MarketplaceRepositoryImpl;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ShopMarketplaceModule_ProvideMarketplaceInteractorFactory implements Factory<MarketplaceInteractor> {
    public static MarketplaceInteractor a(ShopMarketplaceModule shopMarketplaceModule, MarketplaceRepositoryImpl marketplaceRepositoryImpl) {
        return new MarketplaceInteractor(marketplaceRepositoryImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
