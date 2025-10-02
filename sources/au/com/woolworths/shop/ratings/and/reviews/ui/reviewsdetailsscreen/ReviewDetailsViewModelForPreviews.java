package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.RatingsReviewSortType;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ui/reviewsdetailsscreen/ReviewDetailsViewModelForPreviews;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/RatingReviewHandler;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReviewDetailsViewModelForPreviews implements RatingReviewHandler {
    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void m4(String buttonTitle) {
        Intrinsics.h(buttonTitle, "buttonTitle");
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void r5(String errorMessage) {
        Intrinsics.h(errorMessage, "errorMessage");
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void w3(RatingsReviewSortType ratingsReviewSortType) {
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void z4() {
    }
}
