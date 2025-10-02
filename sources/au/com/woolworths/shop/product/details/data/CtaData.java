package au.com.woolworths.shop.product.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.ratingsandreviews.data.CtaText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/CtaData;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CtaData {

    /* renamed from: a, reason: collision with root package name */
    public final CtaText f12599a;
    public final RatingsAndReviewsCtaAction b;

    public CtaData(CtaText ctaText, RatingsAndReviewsCtaAction ratingsAndReviewsCtaAction) {
        this.f12599a = ctaText;
        this.b = ratingsAndReviewsCtaAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CtaData)) {
            return false;
        }
        CtaData ctaData = (CtaData) obj;
        return Intrinsics.c(this.f12599a, ctaData.f12599a) && Intrinsics.c(this.b, ctaData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12599a.hashCode() * 31);
    }

    public final String toString() {
        return "CtaData(ctaText=" + this.f12599a + ", action=" + this.b + ")";
    }
}
