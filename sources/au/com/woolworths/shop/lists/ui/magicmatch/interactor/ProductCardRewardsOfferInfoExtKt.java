package au.com.woolworths.shop.lists.ui.magicmatch.interactor;

import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardRewardsOfferInfoExtKt {
    public static final RewardsOfferInfo a(ProductCard.RewardsOfferInfo rewardsOfferInfo) {
        ButtonApiData buttonApiData;
        Intrinsics.h(rewardsOfferInfo, "<this>");
        String str = rewardsOfferInfo.f8972a;
        String str2 = rewardsOfferInfo.c;
        String str3 = rewardsOfferInfo.d;
        String str4 = rewardsOfferInfo.e;
        RewardsOfferStatus rewardsOfferStatus = rewardsOfferInfo.b;
        Intrinsics.h(rewardsOfferStatus, "<this>");
        int iOrdinal = rewardsOfferStatus.ordinal();
        au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus rewardsOfferStatus2 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.d : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.PENDING : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ENDED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.COMPLETED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.MISSED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.ACTIVATED : au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus.NOT_ACTIVATED;
        ProductCard.OfferAnalytics offerAnalytics = rewardsOfferInfo.f;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = offerAnalytics != null ? new RewardsOfferAnalyticsData(offerAnalytics.f8967a, null, null, null, offerAnalytics.b, offerAnalytics.c, offerAnalytics.d, offerAnalytics.e, offerAnalytics.f, null, offerAnalytics.g, offerAnalytics.h, offerAnalytics.i, null, null, 16384, null) : null;
        ProductCard.BoostButton boostButton = rewardsOfferInfo.g;
        if (boostButton != null) {
            String str5 = boostButton.f8951a;
            ButtonStyle buttonStyle = boostButton.b;
            buttonApiData = new ButtonApiData(str5, null, buttonStyle != null ? ButtonStyleExtKt.a(buttonStyle) : null, boostButton.c, null, null, null, null, null, 498, null);
        } else {
            buttonApiData = null;
        }
        return new RewardsOfferInfo(str, str2, str3, str4, rewardsOfferStatus2, rewardsOfferAnalyticsData, buttonApiData);
    }
}
