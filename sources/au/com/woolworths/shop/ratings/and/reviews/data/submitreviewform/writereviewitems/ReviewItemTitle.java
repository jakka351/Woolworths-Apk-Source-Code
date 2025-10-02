package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform.writereviewitems;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewItemTitle;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/writereviewitems/ReviewInputItems;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewItemTitle implements ReviewInputItems {

    /* renamed from: a, reason: collision with root package name */
    public final String f12752a;

    public ReviewItemTitle(String str) {
        this.f12752a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewItemTitle) && Intrinsics.c(this.f12752a, ((ReviewItemTitle) obj).f12752a);
    }

    public final int hashCode() {
        return this.f12752a.hashCode();
    }

    public final String toString() {
        return a.h("ReviewItemTitle(title=", this.f12752a, ")");
    }
}
