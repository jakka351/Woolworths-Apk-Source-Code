package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel", f = "SubmitReviewViewModel.kt", l = {365}, m = "onSubmitReviewSuccess$ratings_and_reviews_release")
/* loaded from: classes4.dex */
final class SubmitReviewViewModel$onSubmitReviewSuccess$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ SubmitReviewViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewViewModel$onSubmitReviewSuccess$1(SubmitReviewViewModel submitReviewViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = submitReviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.r6(this);
    }
}
