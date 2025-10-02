package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsRepository", f = "ReviewsRepository.kt", l = {27}, m = "getRatingsAndReviewsDetails")
/* loaded from: classes4.dex */
final class ReviewsRepository$getRatingsAndReviewsDetails$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ReviewsRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsRepository$getRatingsAndReviewsDetails$1(ReviewsRepository reviewsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = reviewsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
