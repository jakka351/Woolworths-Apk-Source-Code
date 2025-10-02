package au.com.woolworths.shop.ratings.and.reviews.data.submitreviewform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSectionTargetProduct;", "Lau/com/woolworths/shop/ratings/and/reviews/data/submitreviewform/ReviewFormSection;", "ratings-and-reviews_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReviewFormSectionTargetProduct implements ReviewFormSection {

    /* renamed from: a, reason: collision with root package name */
    public final ReviewsProductCardInfo f12744a;
    public final String b;

    public ReviewFormSectionTargetProduct(ReviewsProductCardInfo reviewsProductCardInfo, String str) {
        this.f12744a = reviewsProductCardInfo;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFormSectionTargetProduct)) {
            return false;
        }
        ReviewFormSectionTargetProduct reviewFormSectionTargetProduct = (ReviewFormSectionTargetProduct) obj;
        return Intrinsics.c(this.f12744a, reviewFormSectionTargetProduct.f12744a) && Intrinsics.c(this.b, reviewFormSectionTargetProduct.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12744a.hashCode() * 31);
    }

    public final String toString() {
        return "ReviewFormSectionTargetProduct(product=" + this.f12744a + ", altText=" + this.b + ")";
    }
}
