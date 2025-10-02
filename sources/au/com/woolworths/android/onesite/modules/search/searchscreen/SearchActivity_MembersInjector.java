package au.com.woolworths.android.onesite.modules.search.searchscreen;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
    public static void a(SearchActivity searchActivity, ShopAccountInteractor shopAccountInteractor) {
        searchActivity.C = shopAccountInteractor;
    }

    public static void b(SearchActivity searchActivity, FeatureToggleManager featureToggleManager) {
        searchActivity.B = featureToggleManager;
    }

    public static void c(SearchActivity searchActivity, ShopAppNavigator shopAppNavigator) {
        searchActivity.E = shopAppNavigator;
    }

    public static void d(SearchActivity searchActivity, TrafficDriversInteractor trafficDriversInteractor) {
        searchActivity.D = trafficDriversInteractor;
    }

    public static void e(SearchActivity searchActivity, SearchViewModel.Factory factory) {
        searchActivity.F = factory;
    }
}
