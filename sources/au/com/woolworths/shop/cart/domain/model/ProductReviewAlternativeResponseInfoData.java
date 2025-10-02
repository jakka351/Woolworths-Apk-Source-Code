package au.com.woolworths.shop.cart.domain.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewAlternativeResponseInfoData;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewAlternativeResponseInfoData {

    /* renamed from: a, reason: collision with root package name */
    public final String f10443a;
    public final String b;
    public final ProductReviewAlternativeResponseInfoCta c;
    public final AnalyticsData d;

    public ProductReviewAlternativeResponseInfoData(String str, String str2, ProductReviewAlternativeResponseInfoCta productReviewAlternativeResponseInfoCta, AnalyticsData analyticsData) {
        this.f10443a = str;
        this.b = str2;
        this.c = productReviewAlternativeResponseInfoCta;
        this.d = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewAlternativeResponseInfoData)) {
            return false;
        }
        ProductReviewAlternativeResponseInfoData productReviewAlternativeResponseInfoData = (ProductReviewAlternativeResponseInfoData) obj;
        return Intrinsics.c(this.f10443a, productReviewAlternativeResponseInfoData.f10443a) && Intrinsics.c(this.b, productReviewAlternativeResponseInfoData.b) && Intrinsics.c(this.c, productReviewAlternativeResponseInfoData.c) && Intrinsics.c(this.d, productReviewAlternativeResponseInfoData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + b.c(this.f10443a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductReviewAlternativeResponseInfoData(bottomSheetTitle=", this.f10443a, ", bottomSheetBody=", this.b, ", primaryCta=");
        sbV.append(this.c);
        sbV.append(", infoClickAnalytics=");
        sbV.append(this.d);
        sbV.append(")");
        return sbV.toString();
    }
}
