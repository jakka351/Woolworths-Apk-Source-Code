package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper;
import au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ProductRatingsAndReviewsDetailsData;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsInteractor;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsDetailsItemEntry;
import au.com.woolworths.shop.ratingsandreviews.data.Cta;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsPaginationAdapter;", "", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RatingsAndReviewsPaginationAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ReviewsInteractor f12764a;
    public final SupportedLinksHelper b;
    public Integer c;
    public final LinkedHashMap d = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsPaginationAdapter$Companion;", "", "", "PAGE_SIZE", "I", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RatingsAndReviewsPaginationAdapter(ReviewsInteractor reviewsInteractor, SupportedLinksHelper supportedLinksHelper) {
        this.f12764a = reviewsInteractor;
        this.b = supportedLinksHelper;
    }

    public static List a(ProductRatingsAndReviewsDetailsData productRatingsAndReviewsDetailsData) {
        ArrayList arrayList = new ArrayList();
        RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails = productRatingsAndReviewsDetailsData.f12735a;
        if (ratingsAndReviewsRatingsDetails != null) {
            arrayList.add(new RatingsAndReviewsDetailsItemEntry.RatingsDetails(ratingsAndReviewsRatingsDetails));
        }
        Cta cta = productRatingsAndReviewsDetailsData.c;
        if (cta != null) {
            arrayList.add(new RatingsAndReviewsDetailsItemEntry.Cta(cta.d, cta.e));
        }
        int i = 0;
        for (Object obj : productRatingsAndReviewsDetailsData.b) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            arrayList.add(new RatingsAndReviewsDetailsItemEntry.ReviewItem(((ProductRatingsAndReviewsDetailsData.Review) obj).f12736a));
            i = i2;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Integer r12, au.com.woolworths.shop.graphql.type.RatingsReviewSortType r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Exception {
        /*
            r11 = this;
            java.util.LinkedHashMap r0 = r11.d
            boolean r1 = r15 instanceof au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter$load$1
            if (r1 == 0) goto L15
            r1 = r15
            au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter$load$1 r1 = (au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter$load$1) r1
            int r2 = r1.s
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s = r2
            goto L1a
        L15:
            au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter$load$1 r1 = new au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter$load$1
            r1.<init>(r11, r15)
        L1a:
            java.lang.Object r15 = r1.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r1.s
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Integer r12 = r1.p
            kotlin.ResultKt.b(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            goto L74
        L2b:
            r0 = move-exception
            r12 = r0
            goto Lb1
        L2f:
            r0 = move-exception
            r12 = r0
            goto Lb7
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3b:
            kotlin.ResultKt.b(r15)
            au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsInteractor r15 = r11.f12764a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            com.apollographql.apollo.api.Optional$Present r9 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r9.<init>(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            com.apollographql.apollo.api.Optional$Present r7 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r7.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            java.lang.Integer r13 = new java.lang.Integer     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r3 = 15
            r13.<init>(r3)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            com.apollographql.apollo.api.Optional$Present r8 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r8.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.android.onesite.deeplink.SupportedLinksHelper r13 = r11.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            java.util.List r13 = r13.a()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            com.apollographql.apollo.api.Optional$Present r10 = new com.apollographql.apollo.api.Optional$Present     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r10.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsDetailsInput r5 = new au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsDetailsInput     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r1.p = r12     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r1.s = r4     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsRepository r13 = r15.f12757a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            java.lang.Object r15 = r13.a(r5, r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            if (r15 != r2) goto L74
            return r2
        L74:
            au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ProductRatingsAndReviewsDetailsData r15 = (au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.ProductRatingsAndReviewsDetailsData) r15     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.RatingsAndReviewsPageInfo r13 = r15.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r14 = 0
            if (r13 == 0) goto L7e
            java.lang.Integer r13 = r13.f12737a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            goto L7f
        L7e:
            r13 = r14
        L7f:
            java.lang.Integer r1 = r11.c     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r0.put(r13, r1)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r11.c = r13     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            if (r12 != 0) goto L9b
            java.util.ArrayList r13 = r15.b     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            boolean r13 = r13.isEmpty()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            if (r13 == 0) goto L9b
            androidx.paging.PagingSource$LoadResult$Error r12 = new androidx.paging.PagingSource$LoadResult$Error     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.android.onesite.network.ServerErrorException r13 = new au.com.woolworths.android.onesite.network.ServerErrorException     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r13.<init>()     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r12.<init>(r13)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            return r12
        L9b:
            java.lang.Object r12 = r0.get(r12)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            au.com.woolworths.shop.ratings.and.reviews.data.reviewsdetails.RatingsAndReviewsPageInfo r13 = r15.d     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            if (r13 == 0) goto La7
            java.lang.Integer r14 = r13.f12737a     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
        La7:
            java.util.List r13 = a(r15)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            androidx.paging.PagingSource$LoadResult$Page r15 = new androidx.paging.PagingSource$LoadResult$Page     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            r15.<init>(r13, r12, r14)     // Catch: au.com.woolworths.android.onesite.network.ServerErrorException -> L2b au.com.woolworths.android.onesite.network.NoConnectivityException -> L2f
            return r15
        Lb1:
            androidx.paging.PagingSource$LoadResult$Error r13 = new androidx.paging.PagingSource$LoadResult$Error
            r13.<init>(r12)
            goto Lbc
        Lb7:
            androidx.paging.PagingSource$LoadResult$Error r13 = new androidx.paging.PagingSource$LoadResult$Error
            r13.<init>(r12)
        Lbc:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter.b(java.lang.Integer, au.com.woolworths.shop.graphql.type.RatingsReviewSortType, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
