package au.com.woolworths.shop.cart.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.model.AnalyticsData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewAlternativeResponseData;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewAlternativeResponseData {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewCard f10441a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ProductReviewAlternativeResponseInfoData g;
    public final AnalyticsData h;

    public ProductReviewAlternativeResponseData(ProductReviewCard productReviewCard, List list, String str, String str2, String str3, String str4, ProductReviewAlternativeResponseInfoData productReviewAlternativeResponseInfoData, AnalyticsData analyticsData) {
        this.f10441a = productReviewCard;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = productReviewAlternativeResponseInfoData;
        this.h = analyticsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewAlternativeResponseData)) {
            return false;
        }
        ProductReviewAlternativeResponseData productReviewAlternativeResponseData = (ProductReviewAlternativeResponseData) obj;
        return Intrinsics.c(this.f10441a, productReviewAlternativeResponseData.f10441a) && Intrinsics.c(this.b, productReviewAlternativeResponseData.b) && Intrinsics.c(this.c, productReviewAlternativeResponseData.c) && Intrinsics.c(this.d, productReviewAlternativeResponseData.d) && Intrinsics.c(this.e, productReviewAlternativeResponseData.e) && Intrinsics.c(this.f, productReviewAlternativeResponseData.f) && Intrinsics.c(this.g, productReviewAlternativeResponseData.g) && Intrinsics.c(this.h, productReviewAlternativeResponseData.h);
    }

    public final int hashCode() {
        int iC = b.c(b.d(this.f10441a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductReviewAlternativeResponseData(product=");
        sb.append(this.f10441a);
        sb.append(", alternatives=");
        sb.append(this.b);
        sb.append(", searchHint=");
        a.B(sb, this.c, ", alternativesTitle=", this.d, ", errorMessage=");
        a.B(sb, this.e, ", errorActionTitle=", this.f, ", info=");
        sb.append(this.g);
        sb.append(", pageImpressionAnalytics=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
