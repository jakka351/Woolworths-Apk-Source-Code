package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsNoResultSection;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsDetailsItemEntry;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.RatingsDistributionUIKt;
import au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.ReviewsDetailsScreenKt;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsReviewDetails;
import au.com.woolworths.shop.ratingsandreviews.ui.RatingsAndReviewsPreviewUIKt;
import au.com.woolworths.shop.specials.SpecialsHomeViewModel;
import au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SimilarProductsScreenKt.h((AlternativeProductsNoResultSection) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                RatingsDistributionUIKt.a((RatingsAndReviewsRatingsDetails) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ReviewsDetailsScreenKt.f((RatingsAndReviewsDetailsItemEntry.ReviewItem) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                RatingsAndReviewsPreviewUIKt.c((RatingsAndReviewsReviewDetails) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ((Integer) obj2).getClass();
                SpecialsHomeScreenKt.f((SpecialsHomeViewModel) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
