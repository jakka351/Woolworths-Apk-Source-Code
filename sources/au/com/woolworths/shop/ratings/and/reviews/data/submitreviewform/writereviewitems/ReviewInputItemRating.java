package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewInputItemRating;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewInputItems;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewInputItemRating implements ReviewInputItems {

    /* renamed from: a, reason: collision with root package name */
    public final String f12750a;
    public final Integer b;
    public final String c;

    public ReviewInputItemRating(Integer num, String str, String str2) {
        this.f12750a = str;
        this.b = num;
        this.c = str2;
    }

    public static ReviewInputItemRating a(ReviewInputItemRating reviewInputItemRating, Integer num, String str, int i) {
        String str2 = reviewInputItemRating.f12750a;
        if ((i & 2) != 0) {
            num = reviewInputItemRating.b;
        }
        return new ReviewInputItemRating(num, str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewInputItemRating)) {
            return false;
        }
        ReviewInputItemRating reviewInputItemRating = (ReviewInputItemRating) obj;
        return Intrinsics.c(this.f12750a, reviewInputItemRating.f12750a) && Intrinsics.c(this.b, reviewInputItemRating.b) && Intrinsics.c(this.c, reviewInputItemRating.c);
    }

    public final int hashCode() {
        int iHashCode = this.f12750a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewInputItemRating(title=");
        sb.append(this.f12750a);
        sb.append(", rating=");
        sb.append(this.b);
        sb.append(", errorText=");
        return a.o(sb, this.c, ")");
    }
}
