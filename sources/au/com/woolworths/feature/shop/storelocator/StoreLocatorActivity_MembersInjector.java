package au.com.woolworths.feature.shop.storelocator;

import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.geolocation.location.LocationInteractor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;

@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class StoreLocatorActivity_MembersInjector implements MembersInjector<StoreLocatorActivity> {
    public static void a(StoreLocatorActivity storeLocatorActivity, LegacyShopAnalyticsManager legacyShopAnalyticsManager) {
        storeLocatorActivity.z = legacyShopAnalyticsManager;
    }

    public static void b(StoreLocatorActivity storeLocatorActivity, FeatureToggleManager featureToggleManager) {
        storeLocatorActivity.B = featureToggleManager;
    }

    public static void c(StoreLocatorActivity storeLocatorActivity, LaunchManager launchManager) {
        storeLocatorActivity.y = launchManager;
    }

    public static void d(StoreLocatorActivity storeLocatorActivity, LocationInteractor locationInteractor) {
        storeLocatorActivity.x = locationInteractor;
    }

    public static void e(StoreLocatorActivity storeLocatorActivity, PermissionFlagInteractorImpl permissionFlagInteractorImpl) {
        storeLocatorActivity.A = permissionFlagInteractorImpl;
    }
}
