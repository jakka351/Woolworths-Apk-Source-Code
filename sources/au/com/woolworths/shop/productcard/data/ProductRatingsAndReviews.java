package au.com.woolworths.shop.productcard.data;

import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductRatingsAndReviews;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductRatingsAndReviews {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12655a;
    public final TextWithAltData b;

    public ProductRatingsAndReviews(Integer num, TextWithAltData textWithAltData) {
        this.f12655a = num;
        this.b = textWithAltData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductRatingsAndReviews)) {
            return false;
        }
        ProductRatingsAndReviews productRatingsAndReviews = (ProductRatingsAndReviews) obj;
        return Intrinsics.c(this.f12655a, productRatingsAndReviews.f12655a) && this.b.equals(productRatingsAndReviews.b);
    }

    public final int hashCode() {
        Integer num = this.f12655a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ProductRatingsAndReviews(ratingVal=null, reviewsCount=" + this.f12655a + ", displayText=" + this.b + ")";
    }
}
