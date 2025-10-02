package androidx.navigation.internal;

import android.content.Intent;
import androidx.navigation.NavDeepLink;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLinkDispatchDefinition;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import me.oriient.ipssdk.ips.IPSCore;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;

    public /* synthetic */ h(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws UnsupportedEncodingException {
        switch (this.d) {
            case 0:
                NavDeepLink.Builder builder = new NavDeepLink.Builder();
                builder.f3479a = this.e;
                return new NavDeepLink(builder.f3479a, builder.b, builder.c);
            case 1:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.l, this.e, null);
            case 2:
                Intent intentA = ActivityNavigatorKt.a(Activities.ShopRewardsActivity.f4534a, ApplicationType.e);
                intentA.putExtra("EXTRA_OFFER_INFO", new Activities.ShopRewardsActivity.Extras(this.e));
                return intentA;
            case 3:
                String strDecode = URLDecoder.decode(this.e, Charsets.f24671a.name());
                Intrinsics.e(strDecode);
                return Activities.ComposeProductListLegacy.f4460a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(strDecode, null), new Activities.ProductList.ExtrasByFacet(null, strDecode, "Marketplace", "Vendor", null), (Activities.ProductList.ExtrasConfig) null, 12));
            case 4:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.m, this.e, null);
            case 5:
                String str = this.e;
                return str != null ? Activities.AskOliveActivity.b(6, str, null, null) : Activities.AskOliveActivity.b(7, null, null, null);
            case 6:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.o, this.e, null);
            case 7:
                ApplicationType applicationType = ApplicationType.e;
                String id = this.e;
                Intrinsics.h(id, "id");
                Intent intentA2 = ActivityNavigatorKt.a(Activities.SharedEReceiptDetails.f4527a, applicationType);
                intentA2.putExtra("EXTRA_DATA", new Activities.SharedEReceiptDetails.ReceiptDetailsExtras(id));
                return intentA2;
            case 8:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.p, this.e, null);
            case 9:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.r, this.e, null);
            case 10:
                Activities.RecipeSearch.Extras extras = new Activities.RecipeSearch.Extras(null, this.e, 1);
                Intent intentA3 = ActivityNavigatorKt.a(Activities.RecipeSearch.f4513a, ApplicationType.e);
                intentA3.putExtra("RECIPE_SEARCH_EXTRAS", extras);
                return intentA3;
            case 11:
                String voucherCode = this.e;
                Intrinsics.h(voucherCode, "voucherCode");
                Intent intentA4 = ActivityNavigatorKt.a(Activities.SngParkingVoucherActivity.f4539a, ApplicationType.e);
                intentA4.putExtra("EXTRA_VOUCHER_INFO", new Activities.SngParkingVoucherActivity.Extras(voucherCode));
                return intentA4;
            case 12:
                String productId = this.e;
                Intrinsics.h(productId, "productId");
                Intent intentPutExtra = ActivityNavigatorKt.a(Activities.SubmitReviewActivity.f4549a, ApplicationType.e).putExtra("id", productId);
                Intrinsics.g(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 13:
                return Activities.ProductList.f4505a.b(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData("My Boosted Offers", null), new Activities.ProductList.ExtrasByBoostedOffers(this.e), (Activities.ProductList.ExtrasConfig) null, 12), false);
            case 14:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.g, this.e, null);
            case 15:
                String productId2 = this.e;
                Intrinsics.h(productId2, "productId");
                Intent intentPutExtra2 = ActivityNavigatorKt.a(Activities.RatingsAndReviewsActivity.f4510a, ApplicationType.e).putExtra("id", productId2);
                Intrinsics.g(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            case 16:
                return Activities.RecipeDetails.b(this.e);
            case 17:
                Activities.BundlesActivity.Extras extras2 = new Activities.BundlesActivity.Extras(true, URLDecoder.decode(this.e, Charsets.f24671a.name()));
                Intent intentA5 = ActivityNavigatorKt.a(Activities.BundlesActivity.f4452a, ApplicationType.e);
                intentA5.putExtra("EXTRA_DATA", extras2);
                return intentA5;
            case 18:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.n, this.e, null);
            case 19:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.f, this.e, null);
            case 20:
                return ShopAppDeepLinkDispatchDefinition.c(Activities.ContentPage.ContentPageType.i, this.e, null);
            default:
                return IPSCore.lambda$userDidEngageWithFeature$0(this.e);
        }
    }
}
