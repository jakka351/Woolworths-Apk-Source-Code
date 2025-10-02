package au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.ratingsandreviews.data.Cta;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ProductRatingsAndReviewsDetailsData;", "", "Review", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviewsDetailsData {

    /* renamed from: a, reason: collision with root package name */
    public final RatingsAndReviewsRatingsDetails f12735a;
    public final ArrayList b;
    public final Cta c;
    public final RatingsAndReviewsPageInfo d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ProductRatingsAndReviewsDetailsData$Review;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Review {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12736a;

        public Review(ArrayList arrayList) {
            this.f12736a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Review) && this.f12736a.equals(((Review) obj).f12736a);
        }

        public final int hashCode() {
            return this.f12736a.hashCode();
        }

        public final String toString() {
            return a.k("Review(sections=", ")", this.f12736a);
        }
    }

    public ProductRatingsAndReviewsDetailsData(RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails, ArrayList arrayList, Cta cta, RatingsAndReviewsPageInfo ratingsAndReviewsPageInfo) {
        this.f12735a = ratingsAndReviewsRatingsDetails;
        this.b = arrayList;
        this.c = cta;
        this.d = ratingsAndReviewsPageInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRatingsAndReviewsDetailsData)) {
            return false;
        }
        ProductRatingsAndReviewsDetailsData productRatingsAndReviewsDetailsData = (ProductRatingsAndReviewsDetailsData) obj;
        return Intrinsics.c(this.f12735a, productRatingsAndReviewsDetailsData.f12735a) && this.b.equals(productRatingsAndReviewsDetailsData.b) && Intrinsics.c(this.c, productRatingsAndReviewsDetailsData.c) && Intrinsics.c(this.d, productRatingsAndReviewsDetailsData.d);
    }

    public final int hashCode() {
        RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails = this.f12735a;
        int iB = androidx.compose.ui.input.pointer.a.b((ratingsAndReviewsRatingsDetails == null ? 0 : ratingsAndReviewsRatingsDetails.d.hashCode()) * 31, 31, this.b);
        Cta cta = this.c;
        int iHashCode = (iB + (cta == null ? 0 : cta.hashCode())) * 31;
        RatingsAndReviewsPageInfo ratingsAndReviewsPageInfo = this.d;
        return iHashCode + (ratingsAndReviewsPageInfo != null ? ratingsAndReviewsPageInfo.hashCode() : 0);
    }

    public final String toString() {
        return "ProductRatingsAndReviewsDetailsData(ratings=" + this.f12735a + ", reviews=" + this.b + ", cta=" + this.c + ", pageInfo=" + this.d + ")";
    }
}
