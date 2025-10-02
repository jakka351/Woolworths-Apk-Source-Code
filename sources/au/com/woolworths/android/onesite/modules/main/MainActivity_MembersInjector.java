package au.com.woolworths.android.onesite.modules.main;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import okhttp3.OkHttpClient;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
    public static void a(MainActivity mainActivity, ShopAccountInteractor shopAccountInteractor) {
        mainActivity.F = shopAccountInteractor;
    }

    public static void b(MainActivity mainActivity, CollectionModeInteractor collectionModeInteractor) {
        mainActivity.D = collectionModeInteractor;
    }

    public static void c(MainActivity mainActivity, FeatureToggleManager featureToggleManager) {
        mainActivity.H = featureToggleManager;
    }

    public static void d(MainActivity mainActivity, ListsUtils listsUtils) {
        mainActivity.I = listsUtils;
    }

    public static void e(MainActivity mainActivity, OkHttpClient okHttpClient) {
        mainActivity.J = okHttpClient;
    }

    public static void f(MainActivity mainActivity, ShopAppNavigator shopAppNavigator) {
        mainActivity.G = shopAppNavigator;
    }

    public static void g(MainActivity mainActivity, TrolleyInteractor trolleyInteractor) {
        mainActivity.E = trolleyInteractor;
    }
}
