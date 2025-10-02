package au.com.woolworths.android.onesite.modules.checkout.ui;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CheckoutActivity_MembersInjector implements MembersInjector<CheckoutActivity> {
    public static void a(CheckoutActivity checkoutActivity, ShopAccountInteractor shopAccountInteractor) {
        checkoutActivity.C = shopAccountInteractor;
    }

    public static void b(CheckoutActivity checkoutActivity, FeatureToggleManager featureToggleManager) {
        checkoutActivity.D = featureToggleManager;
    }
}
