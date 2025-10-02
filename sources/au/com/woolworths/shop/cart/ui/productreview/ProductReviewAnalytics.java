package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.cart.domain.model.ProductReviewCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAnalytics {

    /* renamed from: a, reason: collision with root package name */
    public final AnalyticsManager f10512a;

    public ProductReviewAnalytics(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.f10512a = analyticsManager;
    }

    public static String a(ProductReviewCard productReviewCard) {
        String strValueOf;
        Integer num = productReviewCard.g;
        return (num == null || (strValueOf = String.valueOf(((double) num.intValue()) * productReviewCard.c)) == null) ? "" : strValueOf;
    }
}
