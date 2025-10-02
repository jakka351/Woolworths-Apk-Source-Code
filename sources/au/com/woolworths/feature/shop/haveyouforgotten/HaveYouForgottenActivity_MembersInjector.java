package au.com.woolworths.feature.shop.haveyouforgotten;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class HaveYouForgottenActivity_MembersInjector implements MembersInjector<HaveYouForgottenActivity> {
    public static void a(HaveYouForgottenActivity haveYouForgottenActivity, AnalyticsManager analyticsManager) {
        haveYouForgottenActivity.y = analyticsManager;
    }

    public static void b(HaveYouForgottenActivity haveYouForgottenActivity, ShopAppNavigator shopAppNavigator) {
        haveYouForgottenActivity.x = shopAppNavigator;
    }
}
