package au.com.woolworths.shop.buyagain.ui;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BuyAgainActivity_MembersInjector implements MembersInjector<BuyAgainActivity> {
    public static void a(BuyAgainActivity buyAgainActivity, CollectionModeInteractor collectionModeInteractor) {
        buyAgainActivity.y = collectionModeInteractor;
    }

    public static void b(BuyAgainActivity buyAgainActivity, FeatureToggleManager featureToggleManager) {
        buyAgainActivity.x = featureToggleManager;
    }

    public static void c(BuyAgainActivity buyAgainActivity, ShopAppNavigator shopAppNavigator) {
        buyAgainActivity.z = shopAppNavigator;
    }
}
