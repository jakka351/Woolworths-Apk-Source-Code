package au.com.woolworths.shop.cart.domain.model;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewAlternativeResponseInfoCta;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewAlternativeResponseInfoCta {

    /* renamed from: a, reason: collision with root package name */
    public final String f10442a;
    public final AnalyticsData b;

    public ProductReviewAlternativeResponseInfoCta(String str, AnalyticsData analyticsData) {
        this.f10442a = str;
        this.b = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewAlternativeResponseInfoCta)) {
            return false;
        }
        ProductReviewAlternativeResponseInfoCta productReviewAlternativeResponseInfoCta = (ProductReviewAlternativeResponseInfoCta) obj;
        return Intrinsics.c(this.f10442a, productReviewAlternativeResponseInfoCta.f10442a) && Intrinsics.c(this.b, productReviewAlternativeResponseInfoCta.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10442a.hashCode() * 31;
        AnalyticsData analyticsData = this.b;
        return iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        return "ProductReviewAlternativeResponseInfoCta(label=" + this.f10442a + ", onCtaClickAnalytics=" + this.b + ")";
    }
}
