package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsDetailsInput;
import au.com.woolworths.shop.ratings.and.reviews.ProductRatingsAndReviewsDetailsQuery;
import au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ProductRatingsAndReviewsDetailsData;
import au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.RatingsAndReviewsPageInfo;
import au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ReviewSection;
import au.com.woolworths.shop.ratingsandreviews.data.Cta;
import au.com.woolworths.shop.ratingsandreviews.data.CtaLinkAction;
import au.com.woolworths.shop.ratingsandreviews.data.CtaText;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetailsExtKt;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/ratings/and/reviews/data/reviewsdetails/ProductRatingsAndReviewsDetailsData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsRepository$getRatingsAndReviewsDetails$2$1", f = "ReviewsRepository.kt", l = {32}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ReviewsRepository$getRatingsAndReviewsDetails$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ProductRatingsAndReviewsDetailsData>, Object> {
    public int p;
    public final /* synthetic */ ReviewsRepository q;
    public final /* synthetic */ ProductRatingsAndReviewsDetailsInput r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewsRepository$getRatingsAndReviewsDetails$2$1(ReviewsRepository reviewsRepository, ProductRatingsAndReviewsDetailsInput productRatingsAndReviewsDetailsInput, Continuation continuation) {
        super(2, continuation);
        this.q = reviewsRepository;
        this.r = productRatingsAndReviewsDetailsInput;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewsRepository$getRatingsAndReviewsDetails$2$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewsRepository$getRatingsAndReviewsDetails$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ProductRatingsAndReviewsDetailsData] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Cta cta;
        Object body;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ApolloClient apolloClient = this.q.f12758a;
            ProductRatingsAndReviewsDetailsQuery productRatingsAndReviewsDetailsQuery = new ProductRatingsAndReviewsDetailsQuery(this.r);
            apolloClient.getClass();
            ApolloCall apolloCall = new ApolloCall(apolloClient, productRatingsAndReviewsDetailsQuery);
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
        ApolloResponse apolloResponse = (ApolloResponse) obj;
        ProductRatingsAndReviewsDetailsQuery.ProductRatingsAndReviewsDetails productRatingsAndReviewsDetails = ((ProductRatingsAndReviewsDetailsQuery.Data) ExceptionExtKt.k(apolloResponse)).f12670a;
        if (productRatingsAndReviewsDetails != null) {
            ProductRatingsAndReviewsDetailsQuery.Ratings ratings = productRatingsAndReviewsDetails.f12679a;
            RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetailsA = ratings != null ? RatingsAndReviewsRatingsDetailsExtKt.a(ratings.b) : null;
            ArrayList<ProductRatingsAndReviewsDetailsQuery.Review> arrayList = productRatingsAndReviewsDetails.b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            for (ProductRatingsAndReviewsDetailsQuery.Review review : arrayList) {
                Intrinsics.h(review, "<this>");
                ArrayList<ProductRatingsAndReviewsDetailsQuery.Section> arrayList3 = review.f12681a;
                ArrayList arrayList4 = new ArrayList();
                for (ProductRatingsAndReviewsDetailsQuery.Section section : arrayList3) {
                    ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRating onRatingsAndReviewsReviewItemRating = section.b;
                    if (onRatingsAndReviewsReviewItemRating != null) {
                        body = new ReviewSection.Rating(onRatingsAndReviewsReviewItemRating.f12675a, onRatingsAndReviewsReviewItemRating.b, onRatingsAndReviewsReviewItemRating.c);
                    } else {
                        ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemReviewTitle onRatingsAndReviewsReviewItemReviewTitle = section.c;
                        if (onRatingsAndReviewsReviewItemReviewTitle != null) {
                            body = new ReviewSection.Title(onRatingsAndReviewsReviewItemReviewTitle.f12677a);
                        } else {
                            ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemRecommendation onRatingsAndReviewsReviewItemRecommendation = section.d;
                            if (onRatingsAndReviewsReviewItemRecommendation != null) {
                                body = new ReviewSection.Recommendation(onRatingsAndReviewsReviewItemRecommendation.f12676a);
                            } else {
                                ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemInfo onRatingsAndReviewsReviewItemInfo = section.e;
                                if (onRatingsAndReviewsReviewItemInfo != null) {
                                    body = new ReviewSection.Info(onRatingsAndReviewsReviewItemInfo.f12674a, onRatingsAndReviewsReviewItemInfo.b);
                                } else {
                                    ProductRatingsAndReviewsDetailsQuery.OnRatingsAndReviewsReviewItemBody onRatingsAndReviewsReviewItemBody = section.f;
                                    body = onRatingsAndReviewsReviewItemBody != null ? new ReviewSection.Body(onRatingsAndReviewsReviewItemBody.f12673a) : null;
                                }
                            }
                        }
                    }
                    if (body != null) {
                        arrayList4.add(body);
                    }
                }
                arrayList2.add(new ProductRatingsAndReviewsDetailsData.Review(arrayList4));
            }
            ProductRatingsAndReviewsDetailsQuery.Cta cta2 = productRatingsAndReviewsDetails.c;
            if (cta2 != null) {
                ProductRatingsAndReviewsDetailsQuery.LinkAction linkAction = cta2.b;
                CtaLinkAction ctaLinkAction = new CtaLinkAction(linkAction.f12671a, linkAction.b, linkAction.c);
                ProductRatingsAndReviewsDetailsQuery.LinkTextWithAlt linkTextWithAlt = cta2.c;
                cta = new Cta(ctaLinkAction, new CtaText(linkTextWithAlt.f12672a, linkTextWithAlt.b));
            } else {
                cta = null;
            }
            ProductRatingsAndReviewsDetailsQuery.PageInfo pageInfo = productRatingsAndReviewsDetails.d;
            productRatingsAndReviewsDetailsData = new ProductRatingsAndReviewsDetailsData(ratingsAndReviewsRatingsDetailsA, arrayList2, cta, pageInfo != null ? new RatingsAndReviewsPageInfo(pageInfo.f12678a) : null);
        }
        if (productRatingsAndReviewsDetailsData != null) {
            return productRatingsAndReviewsDetailsData;
        }
        throw ExceptionExtKt.i(apolloResponse.d);
    }
}
