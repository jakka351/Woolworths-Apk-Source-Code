package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.lists.data.utils.ListsInMemoryRepository;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class ShoppingListDetailsActivity_MembersInjector implements MembersInjector<ShoppingListDetailsActivity> {
    public static void a(ShoppingListDetailsActivity shoppingListDetailsActivity, AnalyticsManager analyticsManager) {
        shoppingListDetailsActivity.z = analyticsManager;
    }

    public static void b(ShoppingListDetailsActivity shoppingListDetailsActivity, CartUpdateInteractor cartUpdateInteractor) {
        shoppingListDetailsActivity.y = cartUpdateInteractor;
    }

    public static void c(ShoppingListDetailsActivity shoppingListDetailsActivity, FeatureToggleManager featureToggleManager) {
        shoppingListDetailsActivity.B = featureToggleManager;
    }

    public static void d(ShoppingListDetailsActivity shoppingListDetailsActivity, InstoreNavigationInteractor instoreNavigationInteractor) {
        shoppingListDetailsActivity.D = instoreNavigationInteractor;
    }

    public static void e(ShoppingListDetailsActivity shoppingListDetailsActivity, ListsInMemoryRepository listsInMemoryRepository) {
        shoppingListDetailsActivity.A = listsInMemoryRepository;
    }

    public static void f(ShoppingListDetailsActivity shoppingListDetailsActivity, ListsUtils listsUtils) {
        shoppingListDetailsActivity.C = listsUtils;
    }

    public static void g(ShoppingListDetailsActivity shoppingListDetailsActivity, ShopAppNavigator shopAppNavigator) {
        shoppingListDetailsActivity.x = shopAppNavigator;
    }
}
