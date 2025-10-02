package au.com.woolworths.shop.ratings.and.reviews.submitreviews;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.shop.graphql.type.WriteReviewFormInput;
import au.com.woolworths.shop.ratings.and.reviews.WriteReviewFormQuery;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormData;
import au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.WriteReviewFormQueryWriteReviewFormExtKt;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/WriteReviewFormData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewRepository$getSubmitRatingForm$2", f = "SubmitReviewRepository.kt", l = {41}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class SubmitReviewRepository$getSubmitRatingForm$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WriteReviewFormData>, Object> {
    public int p;
    public final /* synthetic */ SubmitReviewRepository q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitReviewRepository$getSubmitRatingForm$2(SubmitReviewRepository submitReviewRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.q = submitReviewRepository;
        this.r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SubmitReviewRepository$getSubmitRatingForm$2(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SubmitReviewRepository$getSubmitRatingForm$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                SubmitReviewRepository submitReviewRepository = this.q;
                String str = this.r;
                ApolloClient apolloClient = submitReviewRepository.f12777a;
                WriteReviewFormQuery writeReviewFormQuery = new WriteReviewFormQuery(new WriteReviewFormInput(Optional.Absent.f13523a, str));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, writeReviewFormQuery);
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
            return WriteReviewFormQueryWriteReviewFormExtKt.a(((WriteReviewFormQuery.Data) ExceptionExtKt.k((ApolloResponse) obj)).f12688a);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
