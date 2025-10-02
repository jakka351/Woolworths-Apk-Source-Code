package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.graphql.type.RatingsReviewSortType;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.ReviewsContract;
import au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination.RatingsAndReviewsPaginationAdapter;
import dagger.assisted.AssistedFactory;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/RatingReviewHandler;", "Factory", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ReviewsViewModel extends ViewModel implements RatingReviewHandler {
    public final String e;
    public final RatingsAndReviewsPaginationAdapter f;
    public final AnalyticsManager g;
    public final SharedFlowImpl h;
    public final Flow i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final Flow l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsViewModel$Companion;", "", "", "PAGE_SIZE", "I", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @AssistedFactory
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsViewModel$Factory;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        ReviewsViewModel a(String str);
    }

    public ReviewsViewModel(String productId, RatingsAndReviewsPaginationAdapter ratingsAndReviewsPaginationAdapter, AnalyticsManager analyticsManager) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = productId;
        this.f = ratingsAndReviewsPaginationAdapter;
        this.g = analyticsManager;
        SharedFlowImpl sharedFlowImplA = SharedFlowKt.a(1, 1, BufferOverflow.e);
        this.h = sharedFlowImplA;
        this.i = FlowKt.a(sharedFlowImplA);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ReviewsContract.ViewState.b);
        this.j = mutableStateFlowA;
        this.k = mutableStateFlowA;
        this.l = CachedPagingDataKt.a(new Pager(new PagingConfig(15, 7, 15, 52, false), new c(this, 29)).f3571a, ViewModelKt.a(this));
        RatingsReviewSortType.Companion companion = RatingsReviewSortType.e;
        mutableStateFlowA.setValue(new ReviewsContract.ViewState());
        analyticsManager.f(new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(productId)));
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void m4(final String buttonTitle) {
        Intrinsics.h(buttonTitle, "buttonTitle");
        final ReviewsDetailsAnalytics.ReviewsDetails.Action action = new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(this.e)).f;
        action.getClass();
        this.g.g(new Event(action, buttonTitle) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics$ReviewsDetails$Action$loadMoreButtonClicked$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4049a.e);
                a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "button_click");
                a.y("event.Label", String.valueOf(buttonTitle), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "loadmorereviews_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "loadmorereviews_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void r5(final String errorMessage) {
        Intrinsics.h(errorMessage, "errorMessage");
        final ReviewsDetailsAnalytics.ReviewsDetails.Action action = new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(this.e)).f;
        action.getClass();
        this.g.g(new Event(action, errorMessage) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics$ReviewsDetails$Action$fetchError$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4049a.e);
                a.z("event.Category", "Product Ratings and Reviews", spreadBuilder, "event.Action", "error_impression");
                a.y("event.Label", String.valueOf(errorMessage), spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "reviewsscreen_errorimpression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "reviewsscreen_errorimpression".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void w3(RatingsReviewSortType ratingsReviewSortType) {
        ReviewsContract.ViewState viewState = (ReviewsContract.ViewState) this.k.getValue();
        viewState.getClass();
        viewState.f12756a = ratingsReviewSortType;
        ReviewsDetailsAnalytics.ReviewsDetails reviewsDetails = new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(this.e));
        final String str = ratingsReviewSortType.d;
        final ReviewsDetailsAnalytics.ReviewsDetails.Action action = reviewsDetails.f;
        action.getClass();
        this.g.g(new Event(action, str) { // from class: au.com.woolworths.analytics.supers.ratingsandreviews.ReviewsDetailsAnalytics$ReviewsDetails$Action$sortOptionClicked$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                spreadBuilder.b(action.f4049a.e);
                spreadBuilder.a(new Pair("event.Category", "Product Ratings and Reviews"));
                spreadBuilder.a(new Pair("event.Action", "button_click"));
                a.y("event.Label", str, spreadBuilder);
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getD() {
                return "sort_buttonclick";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "sort_buttonclick".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        });
    }

    @Override // au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingReviewHandler
    public final void z4() {
        this.g.g((Event) new ReviewsDetailsAnalytics.ReviewsDetails(CollectionsKt.Q(this.e)).f.b.getD());
    }
}
