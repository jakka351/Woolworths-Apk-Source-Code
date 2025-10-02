package au.com.woolworths.shop.product.details.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/ProductRatingsAndReviewsSummaryData;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsSummaryData {

    /* renamed from: a, reason: collision with root package name */
    public final double f12616a;
    public final double b;
    public final int c;
    public final RatingTextData d;
    public final CtaData e;

    public ProductRatingsAndReviewsSummaryData(double d, double d2, int i, RatingTextData ratingTextData, CtaData ctaData) {
        this.f12616a = d;
        this.b = d2;
        this.c = i;
        this.d = ratingTextData;
        this.e = ctaData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRatingsAndReviewsSummaryData)) {
            return false;
        }
        ProductRatingsAndReviewsSummaryData productRatingsAndReviewsSummaryData = (ProductRatingsAndReviewsSummaryData) obj;
        return Double.compare(this.f12616a, productRatingsAndReviewsSummaryData.f12616a) == 0 && Double.compare(this.b, productRatingsAndReviewsSummaryData.b) == 0 && this.c == productRatingsAndReviewsSummaryData.c && Intrinsics.c(this.d, productRatingsAndReviewsSummaryData.d) && Intrinsics.c(this.e, productRatingsAndReviewsSummaryData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + b.a(this.c, a.a(this.b, Double.hashCode(this.f12616a) * 31, 31), 31)) * 31;
        CtaData ctaData = this.e;
        return iHashCode + (ctaData == null ? 0 : ctaData.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f12616a, "ProductRatingsAndReviewsSummaryData(averageRatings=", ", displayRatings=");
        sbN.append(this.b);
        sbN.append(", maximumRating=");
        sbN.append(this.c);
        sbN.append(", ratingText=");
        sbN.append(this.d);
        sbN.append(", cta=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
