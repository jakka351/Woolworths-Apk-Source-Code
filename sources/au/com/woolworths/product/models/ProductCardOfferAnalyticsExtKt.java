package au.com.woolworths.product.models;

import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toUiModel", "Lau/com/woolworths/android/onesite/analytics/RewardsOfferAnalyticsData;", "Lau/com/woolworths/graphql/common/fragment/ProductCard$OfferAnalytics;", "shop-product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCardOfferAnalyticsExtKt {
    @NotNull
    public static final RewardsOfferAnalyticsData toUiModel(@NotNull ProductCard.OfferAnalytics offerAnalytics) {
        Intrinsics.h(offerAnalytics, "<this>");
        return new RewardsOfferAnalyticsData(offerAnalytics.f8967a, null, null, null, offerAnalytics.b, offerAnalytics.c, offerAnalytics.d, offerAnalytics.e, offerAnalytics.f, null, offerAnalytics.g, offerAnalytics.h, offerAnalytics.i, null, null, 16384, null);
    }
}
