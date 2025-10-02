package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.android.onesite.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsRowAccordionProductListCta;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsRowAccordionProductListCta {

    /* renamed from: a, reason: collision with root package name */
    public final String f12612a;
    public final String b;
    public final AnalyticsData c;

    public ProductDetailsRowAccordionProductListCta(String str, String str2, AnalyticsData analyticsData) {
        this.f12612a = str;
        this.b = str2;
        this.c = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsRowAccordionProductListCta)) {
            return false;
        }
        ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta = (ProductDetailsRowAccordionProductListCta) obj;
        return Intrinsics.c(this.f12612a, productDetailsRowAccordionProductListCta.f12612a) && Intrinsics.c(this.b, productDetailsRowAccordionProductListCta.b) && Intrinsics.c(this.c, productDetailsRowAccordionProductListCta.c);
    }

    public final int hashCode() {
        int iHashCode = this.f12612a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsData analyticsData = this.c;
        return iHashCode2 + (analyticsData != null ? analyticsData.hashCode() : 0);
    }

    public final String toString() {
        return a.n(YU.a.v("ProductDetailsRowAccordionProductListCta(label=", this.f12612a, ", url=", this.b, ", onCtaClickAnalytics="), this.c, ")");
    }
}
