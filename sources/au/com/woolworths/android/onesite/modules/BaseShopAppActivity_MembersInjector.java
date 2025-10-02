package au.com.woolworths.android.onesite.modules;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BaseShopAppActivity_MembersInjector implements MembersInjector<BaseShopAppActivity> {
    public static void a(BaseShopAppActivity baseShopAppActivity, AnalyticsManager analyticsManager) {
        baseShopAppActivity.v = analyticsManager;
    }

    public static void b(BaseShopAppActivity baseShopAppActivity, LegacyShopAnalyticsManager legacyShopAnalyticsManager) {
        baseShopAppActivity.w = legacyShopAnalyticsManager;
    }
}
