package au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.pagination;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.ratingsandreviews.data.CtaLinkAction;
import au.com.woolworths.shop.ratingsandreviews.data.CtaText;
import au.com.woolworths.shop.ratingsandreviews.data.RatingsAndReviewsRatingsDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry;", "", "RatingsDetails", "ReviewItem", "Cta", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$Cta;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$RatingsDetails;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$ReviewItem;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RatingsAndReviewsDetailsItemEntry {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$Cta;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta implements RatingsAndReviewsDetailsItemEntry {

        /* renamed from: a, reason: collision with root package name */
        public final CtaLinkAction f12761a;
        public final CtaText b;

        public Cta(CtaLinkAction linkAction, CtaText linkTextWithAlt) {
            Intrinsics.h(linkAction, "linkAction");
            Intrinsics.h(linkTextWithAlt, "linkTextWithAlt");
            this.f12761a = linkAction;
            this.b = linkTextWithAlt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f12761a, cta.f12761a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12761a.hashCode() * 31);
        }

        public final String toString() {
            return "Cta(linkAction=" + this.f12761a + ", linkTextWithAlt=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$RatingsDetails;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingsDetails implements RatingsAndReviewsDetailsItemEntry {

        /* renamed from: a, reason: collision with root package name */
        public final RatingsAndReviewsRatingsDetails f12762a;

        public RatingsDetails(RatingsAndReviewsRatingsDetails ratings) {
            Intrinsics.h(ratings, "ratings");
            this.f12762a = ratings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RatingsDetails) && Intrinsics.c(this.f12762a, ((RatingsDetails) obj).f12762a);
        }

        public final int hashCode() {
            return this.f12762a.d.hashCode();
        }

        public final String toString() {
            return "RatingsDetails(ratings=" + this.f12762a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry$ReviewItem;", "Lau/com/woolworths/shop/ratings/and/reviews/reviewsdetails/pagination/RatingsAndReviewsDetailsItemEntry;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReviewItem implements RatingsAndReviewsDetailsItemEntry {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12763a;

        public ReviewItem(ArrayList arrayList) {
            this.f12763a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewItem) && this.f12763a.equals(((ReviewItem) obj).f12763a);
        }

        public final int hashCode() {
            return this.f12763a.hashCode();
        }

        public final String toString() {
            return a.k("ReviewItem(sections=", ")", this.f12763a);
        }
    }
}
