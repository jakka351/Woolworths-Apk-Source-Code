package au.com.woolworths.shop.product.details.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsRowAccordion;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsRowAccordion implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final CoreRowModel f12610a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final AnalyticsData e;
    public final AnalyticsData f;

    public ProductDetailsRowAccordion(CoreRowModel coreRowModel, boolean z, boolean z2, Object obj, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
        this.f12610a = coreRowModel;
        this.b = z;
        this.c = z2;
        this.d = obj;
        this.e = analyticsData;
        this.f = analyticsData2;
    }

    public static ProductDetailsRowAccordion a(ProductDetailsRowAccordion productDetailsRowAccordion, Object obj) {
        CoreRowModel coreRowModel = productDetailsRowAccordion.f12610a;
        boolean z = productDetailsRowAccordion.b;
        boolean z2 = productDetailsRowAccordion.c;
        AnalyticsData analyticsData = productDetailsRowAccordion.e;
        AnalyticsData analyticsData2 = productDetailsRowAccordion.f;
        productDetailsRowAccordion.getClass();
        return new ProductDetailsRowAccordion(coreRowModel, z, z2, obj, analyticsData, analyticsData2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsRowAccordion)) {
            return false;
        }
        ProductDetailsRowAccordion productDetailsRowAccordion = (ProductDetailsRowAccordion) obj;
        return Intrinsics.c(this.f12610a, productDetailsRowAccordion.f12610a) && this.b == productDetailsRowAccordion.b && this.c == productDetailsRowAccordion.c && Intrinsics.c(this.d, productDetailsRowAccordion.d) && Intrinsics.c(this.e, productDetailsRowAccordion.e) && Intrinsics.c(this.f, productDetailsRowAccordion.f);
    }

    public final int hashCode() {
        int iE = b.e(b.e(this.f12610a.hashCode() * 31, 31, this.b), 31, this.c);
        Object obj = this.d;
        int iHashCode = (iE + (obj == null ? 0 : obj.hashCode())) * 31;
        AnalyticsData analyticsData = this.e;
        int iHashCode2 = (iHashCode + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
        AnalyticsData analyticsData2 = this.f;
        return iHashCode2 + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
    }

    public final String toString() {
        return "ProductDetailsRowAccordion(rowUI=" + this.f12610a + ", isExpanded=" + this.b + ", hasTopSeparator=" + this.c + ", expandedContent=" + this.d + ", openActionAnalytics=" + this.e + ", closeActionAnalytics=" + this.f + ")";
    }
}
