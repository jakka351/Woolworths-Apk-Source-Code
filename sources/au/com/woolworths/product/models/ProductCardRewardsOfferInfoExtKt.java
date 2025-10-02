package au.com.woolworths.product.models;

import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/product/models/RewardsOfferInfo;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$RewardsOfferInfo;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardRewardsOfferInfoExtKt {
    @NotNull
    public static final RewardsOfferInfo toUiModel(@NotNull ProductCard.RewardsOfferInfo rewardsOfferInfo) {
        Intrinsics.h(rewardsOfferInfo, "<this>");
        String str = rewardsOfferInfo.f8972a;
        String str2 = rewardsOfferInfo.c;
        String str3 = rewardsOfferInfo.d;
        String str4 = rewardsOfferInfo.e;
        RewardsOfferStatus uiModel = RewardsOfferStatusExtKt.toUiModel(rewardsOfferInfo.b);
        ProductCard.OfferAnalytics offerAnalytics = rewardsOfferInfo.f;
        RewardsOfferAnalyticsData uiModel2 = offerAnalytics != null ? ProductCardOfferAnalyticsExtKt.toUiModel(offerAnalytics) : null;
        ProductCard.BoostButton boostButton = rewardsOfferInfo.g;
        return new RewardsOfferInfo(str, str2, str3, str4, uiModel, uiModel2, boostButton != null ? ProductCardBoostButtonExtKt.toUiModel(boostButton) : null);
    }
}
