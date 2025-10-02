package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.shop.graphql.type.SubmitProductReviewInput;
import au.com.woolworths.shop.ratings.and.reviews.SubmitProductReviewMutation;
import au.com.woolworths.shop.ratings.and.reviews.data.Error;
import au.com.woolworths.shop.ratings.and.reviews.data.SubmitReviewResponse;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/ratings/and/reviews/data/SubmitReviewResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewRepository$postSubmitRating$2$1", f = "SubmitReviewRepository.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SubmitReviewRepository$postSubmitRating$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SubmitReviewResponse>, Object> {
    public int p;
    public final /* synthetic */ SubmitReviewRepository q;
    public final /* synthetic */ SubmitProductReviewInput r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewRepository$postSubmitRating$2$1(SubmitReviewRepository submitReviewRepository, SubmitProductReviewInput submitProductReviewInput, Continuation continuation) {
        super(2, continuation);
        this.q = submitReviewRepository;
        this.r = submitProductReviewInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewRepository$postSubmitRating$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewRepository$postSubmitRating$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f12777a;
            SubmitProductReviewMutation submitProductReviewMutation = new SubmitProductReviewMutation(this.r);
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, submitProductReviewMutation);
            this.p = 1;
            obj = apolloCall.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SubmitProductReviewMutation.SubmitProductReview submitProductReview = ((SubmitProductReviewMutation.Data) ExceptionExtKt.k((ApolloResponse) obj)).f12684a;
        boolean z = submitProductReview.f12686a;
        String str = submitProductReview.b;
        SubmitProductReviewMutation.Error error = submitProductReview.c;
        return new SubmitReviewResponse(z, str, error != null ? new Error(error.f12685a, error.b) : null);
    }
}
