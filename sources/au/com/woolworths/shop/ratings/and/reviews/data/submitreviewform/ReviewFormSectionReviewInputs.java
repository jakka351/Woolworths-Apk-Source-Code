package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.ArrayList;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSectionReviewInputs;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewFormSectionReviewInputs implements ReviewFormSection {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12743a;

    public ReviewFormSectionReviewInputs(ArrayList arrayList) {
        this.f12743a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewFormSectionReviewInputs) && this.f12743a.equals(((ReviewFormSectionReviewInputs) obj).f12743a);
    }

    public final int hashCode() {
        return this.f12743a.hashCode();
    }

    public final String toString() {
        return a.k("ReviewFormSectionReviewInputs(items=", ")", this.f12743a);
    }
}
