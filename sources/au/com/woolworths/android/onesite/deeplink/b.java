package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.os.Bundle;
import au.com.woolworths.android.onesite.analytics.DeepLinkAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import com.woolworths.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;

    public /* synthetic */ b(int i, Bundle bundle) {
        this.d = i;
        this.e = bundle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.d;
        Activities.StoreLocator storeLocator = Activities.StoreLocator.f4547a;
        Bundle bundle = this.e;
        switch (i) {
            case 0:
                String string = bundle.getString("url");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("title");
                return Activities.WebViewActivity.f4554a.b(new Activities.WebViewActivity.Extras(56, string, string2 != null ? string2 : "", bundle.getString("ShopAppDeepLink.Extras.screenName")));
            case 1:
                Intent intentC = Activities.MainActivity.f4487a.c(Activities.MainActivity.Tab.g, null);
                intentC.putExtra("ShopAppDeepLink.Extras.specialTitle", bundle.getString("specialTitle"));
                return intentC;
            case 2:
                ApplicationType applicationType = ApplicationType.e;
                String string3 = bundle.getString("content");
                String string4 = bundle.getString("id");
                Intent intentA = ActivityNavigatorKt.a(Activities.RewardsBottomSheet.f4515a, applicationType);
                intentA.putExtra("EXTRA_DATA", new Activities.RewardsBottomSheet.Extras(string3, string4));
                return intentA;
            case 3:
                String string5 = bundle.getString("id");
                String str = string5 != null ? string5 : "";
                Intent intentA2 = ActivityNavigatorKt.a(Activities.DynamicPageActivity.f4470a, ApplicationType.e);
                intentA2.putExtra("EXTRA_PAGE_ID", str);
                return intentA2;
            case 4:
                String string6 = bundle.getString("ft_referral_code");
                Intent intentA3 = ActivityNavigatorKt.a(Activities.ShopHealthyLifeFoodTrackerActivity.f4531a, ApplicationType.e);
                intentA3.putExtra("EXTRA_DATA", new Activities.ShopHealthyLifeFoodTrackerActivity.FoodTrackerExtras(string6));
                return intentA3;
            case 5:
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig != null) {
                    z = deepLinkConfig.u;
                } else {
                    BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.d;
                }
                if (z) {
                    Intent intentPutExtra = ActivityNavigatorKt.a(storeLocator, ApplicationType.e).putExtra("EXTRA_STORE_LOCATOR_DATA", new Activities.StoreLocator.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.e));
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    return intentPutExtra;
                }
                Intent intentPutExtra2 = ActivityNavigatorKt.a(Activities.StoreLocatorLegacy.f4548a, ApplicationType.e).putExtra("EXTRA_STORE_LOCATOR_DATA", new Activities.StoreLocatorLegacy.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocatorLegacy.StoreLocatorEntryPoint.e));
                Intrinsics.g(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            case 6:
                if (!ShopAppDeepLinkDispatchDefinition.d(bundle)) {
                    DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                    return Activities.RewardsSetupMoreActivity.f4522a.b(null, deepLinkConfig2 != null ? deepLinkConfig2.j : false);
                }
                String string7 = bundle.getString("magicLinkPage");
                Activities.EverydayExtraNativeSignUpActivity.InitialScreen initialScreen = Activities.EverydayExtraNativeSignUpActivity.InitialScreen.d;
                String string8 = bundle.getString("acquisitionOfferName");
                Intent intentA4 = ActivityNavigatorKt.a(Activities.EverydayExtraNativeSignUpActivity.f4472a, ApplicationType.e);
                intentA4.putExtra("EXTRA_INITIAL_INFO", new Activities.EverydayExtraNativeSignUpActivity.InitialInfo(string7, Activities.MagicLinkActivity.PreferredLaunchMode.e, true, initialScreen, string8));
                return intentA4;
            case 7:
                DeepLinkConfig deepLinkConfig3 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig3 != null) {
                    z = deepLinkConfig3.q;
                } else {
                    BaseShopAppFeature baseShopAppFeature2 = BaseShopAppFeature.d;
                }
                if (z) {
                    return ActivityNavigatorKt.a(Activities.ShippingCalculator.f4528a, ApplicationType.e);
                }
                throw new IllegalStateException("not implemented!");
            case 8:
                DeepLinkConfig deepLinkConfig4 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig4 != null) {
                    z = deepLinkConfig4.t;
                } else {
                    BaseShopAppFeature baseShopAppFeature3 = BaseShopAppFeature.d;
                    z = true;
                }
                return z ? Activities.TimeSelectorActivity.b() : ActivityNavigatorKt.a(Activities.FulfilmentWindowSelectionActivity.f4476a, ApplicationType.e);
            case 9:
                String string9 = bundle.getString("linkId");
                return Activities.WebLinkActivity.f4553a.b(string9 != null ? string9 : "");
            case 10:
                DeepLinkConfig deepLinkConfig5 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig5 != null) {
                    z = deepLinkConfig5.r;
                } else {
                    BaseShopAppFeature baseShopAppFeature4 = BaseShopAppFeature.d;
                }
                return z ? ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.s, "saved-recipes-app", null) : ActivityNavigatorKt.a(Activities.SavedRecipes.f4524a, ApplicationType.e);
            case 11:
                DeepLinkConfig deepLinkConfig6 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig6 != null) {
                    z = deepLinkConfig6.u;
                } else {
                    BaseShopAppFeature baseShopAppFeature5 = BaseShopAppFeature.d;
                }
                if (!z) {
                    return ActivityNavigatorKt.a(Activities.PickUpLocatorActivity.f4500a, ApplicationType.e);
                }
                Intent intentPutExtra3 = ActivityNavigatorKt.a(storeLocator, ApplicationType.e).putExtra("EXTRA_STORE_LOCATOR_DATA", new Activities.StoreLocator.ExtraStoreLocatorData(R.string.select_your_store, 33673, false, true, false, Activities.StoreLocator.StoreLocatorEntryPoint.e));
                Intrinsics.g(intentPutExtra3, "putExtra(...)");
                return intentPutExtra3;
            default:
                String string10 = bundle.getString("deep_link_uri");
                Intent intentA5 = ActivityNavigatorKt.a(Activities.CatalogueHome.f4455a, ApplicationType.e);
                intentA5.putExtra("extra_catalogue_home", new Activities.CatalogueHome.Extras(string10 != null ? DeepLinkAnalytics.i(string10) : null));
                return intentA5;
        }
    }
}
