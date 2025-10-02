package au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/ui/reviewsdetailsscreen/RatingsAndReviewsScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RatingsAndReviewsScreens implements Screen {
    public static final RatingsAndReviewsScreens d;
    public static final /* synthetic */ RatingsAndReviewsScreens[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        RatingsAndReviewsScreens ratingsAndReviewsScreens = new RatingsAndReviewsScreens() { // from class: au.com.woolworths.shop.ratings.and.reviews.ui.reviewsdetailsscreen.RatingsAndReviewsScreens.REVIEW_DETAILS
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Reviews Details";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Ratings and Reviews Details Screen";
            }
        };
        d = ratingsAndReviewsScreens;
        RatingsAndReviewsScreens[] ratingsAndReviewsScreensArr = {ratingsAndReviewsScreens};
        e = ratingsAndReviewsScreensArr;
        f = EnumEntriesKt.a(ratingsAndReviewsScreensArr);
    }

    public static RatingsAndReviewsScreens valueOf(String str) {
        return (RatingsAndReviewsScreens) Enum.valueOf(RatingsAndReviewsScreens.class, str);
    }

    public static RatingsAndReviewsScreens[] values() {
        return (RatingsAndReviewsScreens[]) e.clone();
    }
}
