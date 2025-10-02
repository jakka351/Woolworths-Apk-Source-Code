package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsPage;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsPage {

    /* renamed from: a, reason: collision with root package name */
    public final List f12608a;
    public final AnalyticsData b;
    public final AnalyticsData c;
    public final FooterData d;

    public ProductDetailsPage(List list, AnalyticsData analyticsData, AnalyticsData analyticsData2, FooterData footerData) {
        this.f12608a = list;
        this.b = analyticsData;
        this.c = analyticsData2;
        this.d = footerData;
    }

    public static ProductDetailsPage a(ProductDetailsPage productDetailsPage, List items, FooterData footerData, int i) {
        AnalyticsData analyticsData = productDetailsPage.b;
        AnalyticsData analyticsData2 = productDetailsPage.c;
        if ((i & 8) != 0) {
            footerData = productDetailsPage.d;
        }
        productDetailsPage.getClass();
        Intrinsics.h(items, "items");
        return new ProductDetailsPage(items, analyticsData, analyticsData2, footerData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsPage)) {
            return false;
        }
        ProductDetailsPage productDetailsPage = (ProductDetailsPage) obj;
        return Intrinsics.c(this.f12608a, productDetailsPage.f12608a) && Intrinsics.c(this.b, productDetailsPage.b) && Intrinsics.c(this.c, productDetailsPage.c) && Intrinsics.c(this.d, productDetailsPage.d);
    }

    public final int hashCode() {
        int iHashCode = this.f12608a.hashCode() * 31;
        AnalyticsData analyticsData = this.b;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.c;
        int iHashCode3 = (iHashCode2 + (analyticsData2 == null ? 0 : analyticsData2.hashCode())) * 31;
        FooterData footerData = this.d;
        return iHashCode3 + (footerData != null ? footerData.hashCode() : 0);
    }

    public final String toString() {
        return "ProductDetailsPage(items=" + this.f12608a + ", analytics=" + this.b + ", impressionAnalytics=" + this.c + ", footer=" + this.d + ")";
    }
}
