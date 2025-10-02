package au.com.woolworths.shop.product.details.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductDetailsRowLink;", "Lau/com/woolworths/shop/product/details/data/ProductDetailsItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductDetailsRowLink implements ProductDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public final CoreRowModel f12613a;
    public final Object b;
    public final boolean c;
    public final AnalyticsData d;

    public ProductDetailsRowLink(CoreRowModel coreRowModel, Object obj, boolean z, AnalyticsData analyticsData) {
        this.f12613a = coreRowModel;
        this.b = obj;
        this.c = z;
        this.d = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsRowLink)) {
            return false;
        }
        ProductDetailsRowLink productDetailsRowLink = (ProductDetailsRowLink) obj;
        return Intrinsics.c(this.f12613a, productDetailsRowLink.f12613a) && Intrinsics.c(this.b, productDetailsRowLink.b) && this.c == productDetailsRowLink.c && Intrinsics.c(this.d, productDetailsRowLink.d);
    }

    public final int hashCode() {
        int iE = b.e(a.e(this.f12613a.hashCode() * 31, 31, this.b), 31, this.c);
        AnalyticsData analyticsData = this.d;
        return iE + (analyticsData == null ? 0 : analyticsData.hashCode());
    }

    public final String toString() {
        return "ProductDetailsRowLink(rowUI=" + this.f12613a + ", linkContent=" + this.b + ", hasTopSeparator=" + this.c + ", openActionAnalytics=" + this.d + ")";
    }
}
