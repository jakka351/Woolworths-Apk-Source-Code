package au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/RatingsAndReviewsPageInfo;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsPageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12737a;

    public RatingsAndReviewsPageInfo(Integer num) {
        this.f12737a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingsAndReviewsPageInfo) && Intrinsics.c(this.f12737a, ((RatingsAndReviewsPageInfo) obj).f12737a);
    }

    public final int hashCode() {
        Integer num = this.f12737a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "RatingsAndReviewsPageInfo(nextPage=" + this.f12737a + ")";
    }
}
