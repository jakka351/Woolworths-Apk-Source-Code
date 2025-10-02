package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.RatingsReviewSortType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract;", "", "ViewState", "Actions", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReviewsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions;", "", "OnNavigateUp", "OnDeepLinkClicked", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions$OnDeepLinkClicked;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions$OnNavigateUp;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions$OnDeepLinkClicked;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnDeepLinkClicked extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12754a;

            public OnDeepLinkClicked(String link) {
                Intrinsics.h(link, "link");
                this.f12754a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnDeepLinkClicked) && Intrinsics.c(this.f12754a, ((OnDeepLinkClicked) obj).f12754a);
            }

            public final int hashCode() {
                return this.f12754a.hashCode();
            }

            public final String toString() {
                return a.h("OnDeepLinkClicked(link=", this.f12754a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions$OnNavigateUp;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$Actions;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnNavigateUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OnNavigateUp f12755a = new OnNavigateUp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OnNavigateUp);
            }

            public final int hashCode() {
                return 860767735;
            }

            public final String toString() {
                return "OnNavigateUp";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$ViewState;", "", "Companion", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState b;

        /* renamed from: a, reason: collision with root package name */
        public RatingsReviewSortType f12756a = RatingsReviewSortType.f;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/ReviewsContract$ViewState$Companion;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            RatingsReviewSortType.Companion companion = RatingsReviewSortType.e;
            b = new ViewState();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f12756a == ((ViewState) obj).f12756a;
        }

        public final int hashCode() {
            return this.f12756a.hashCode();
        }

        public final String toString() {
            return "ViewState(sortingOption=" + this.f12756a + ")";
        }
    }
}
