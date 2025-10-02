package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewRepository", f = "SubmitReviewRepository.kt", l = {50}, m = "postSubmitRating")
/* loaded from: classes4.dex */
final class SubmitReviewRepository$postSubmitRating$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubmitReviewRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewRepository$postSubmitRating$1(SubmitReviewRepository submitReviewRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = submitReviewRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
