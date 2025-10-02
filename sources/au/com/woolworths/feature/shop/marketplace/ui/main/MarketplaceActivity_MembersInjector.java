package au.com.woolworths.feature.shop.marketplace.ui.main;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MarketplaceActivity_MembersInjector implements MembersInjector<MarketplaceActivity> {
    public static void a(MarketplaceActivity marketplaceActivity, AnalyticsManager analyticsManager) {
        marketplaceActivity.y = analyticsManager;
    }

    public static void b(MarketplaceActivity marketplaceActivity, CartUpdateInteractor cartUpdateInteractor) {
        marketplaceActivity.x = cartUpdateInteractor;
    }

    public static void c(MarketplaceActivity marketplaceActivity, FeatureToggleManager featureToggleManager) {
        marketplaceActivity.z = featureToggleManager;
    }
}
