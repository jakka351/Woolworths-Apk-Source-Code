package au.com.woolworths.feature.shop.barcode.scanner;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BarcodeScannerLegacyActivity_MembersInjector implements MembersInjector<BarcodeScannerLegacyActivity> {
    public static void a(BarcodeScannerLegacyActivity barcodeScannerLegacyActivity, AnalyticsManager analyticsManager) {
        barcodeScannerLegacyActivity.x = analyticsManager;
    }

    public static void b(BarcodeScannerLegacyActivity barcodeScannerLegacyActivity, ShopAppNavigator shopAppNavigator) {
        barcodeScannerLegacyActivity.y = shopAppNavigator;
    }
}
