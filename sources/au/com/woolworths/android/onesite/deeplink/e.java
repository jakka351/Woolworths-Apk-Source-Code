package au.com.woolworths.android.onesite.deeplink;

import android.content.Intent;
import android.os.Bundle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Bundle f;

    public /* synthetic */ e(Bundle bundle, String str, int i) {
        this.d = i;
        this.f = bundle;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        String str = this.e;
        Bundle bundle = this.f;
        switch (i) {
            case 0:
                Intent intentPutExtra = ActivityNavigatorKt.a(Activities.StoreDetails.f4545a, ApplicationType.e).putExtra("EXTRA_STORE_DETAILS_DATA", new Activities.StoreDetails.Extras(new Activities.StoreDetails.ExtrasByStoreNumber(str), false));
                Intrinsics.g(intentPutExtra, "putExtra(...)");
                DeepLinkConfig deepLinkConfig = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig != null) {
                    z = deepLinkConfig.u;
                } else {
                    BaseShopAppFeature baseShopAppFeature = BaseShopAppFeature.d;
                }
                Intent intent = z ? intentPutExtra : null;
                return intent == null ? Activities.StoreDetailsLegacy.c(str) : intent;
            case 1:
                Activities.FeedbackForm.Extras extras = new Activities.FeedbackForm.Extras(this.e, bundle.getString("interactionId"), bundle.getString("brand"), bundle.getString("customerName"), bundle.getString("sessionId"), bundle.getString("agentPlatform"), bundle.getString("firstIntent"), bundle.getString("lastIntent"));
                Intent intentA = ActivityNavigatorKt.a(Activities.FeedbackForm.f4474a, ApplicationType.e);
                intentA.putExtra("FEEDBACK_FORM_EXTRA", extras);
                return intentA;
            case 2:
                DeepLinkConfig deepLinkConfig2 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                if (deepLinkConfig2 != null && deepLinkConfig2.s) {
                    return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.u, str, null);
                }
                Intent intentA2 = ActivityNavigatorKt.a(Activities.BrandedShopActivity.f4451a, ApplicationType.e);
                intentA2.putExtra("EXTRA_CONTENT_ID", new Activities.BrandedShopActivity.Extras(str));
                return intentA2;
            default:
                DeepLinkConfig deepLinkConfig3 = (DeepLinkConfig) bundle.getParcelable("ShopAppDeepLink.Extras.config");
                return deepLinkConfig3 != null ? deepLinkConfig3.k : false ? ActivityNavigatorKt.a(Activities.FreshMagHome.f4475a, ApplicationType.e) : ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.h, str, null);
        }
    }

    public /* synthetic */ e(String str, Bundle bundle, int i) {
        this.d = i;
        this.e = str;
        this.f = bundle;
    }
}
