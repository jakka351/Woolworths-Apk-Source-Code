package au.com.woolworths.feature.shop.barcode.scanner;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class BarcodeScannerActivity_MembersInjector implements MembersInjector<BarcodeScannerActivity> {
    public static void a(BarcodeScannerActivity barcodeScannerActivity, AnalyticsManager analyticsManager) {
        barcodeScannerActivity.x = analyticsManager;
    }

    public static void b(BarcodeScannerActivity barcodeScannerActivity, AppConfig appConfig) {
        barcodeScannerActivity.y = appConfig;
    }

    public static void c(BarcodeScannerActivity barcodeScannerActivity, FeatureToggleManager featureToggleManager) {
        barcodeScannerActivity.A = featureToggleManager;
    }

    public static void d(BarcodeScannerActivity barcodeScannerActivity, ShopAppNavigator shopAppNavigator) {
        barcodeScannerActivity.z = shopAppNavigator;
    }
}
